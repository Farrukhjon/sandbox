import zlib
import struct

class StatefulCompressor:
    def __init__(self, max_size_in_bytes):
        self.max_size_in_bytes = max_size_in_bytes
        self.checksum = 0
        self.total_compressed_size = 0
        self.compressor = zlib.compressobj(wbits=31)  # GZIP with headers
        self.compressed_buffer = bytearray()

    def compress(self, data):
        # Add a newline byte to data (intentional for chunked processing)
        data_with_newline = data + b'\n'

        # Calculate remaining space in the buffer
        remaining_space = self.max_size_in_bytes - self.total_compressed_size

        # The space we need to account for:
        # 1. 4 bytes for the checksum (CRC32)
        # 2. Space for the Z_FINISH flush (this is tricky, but we need to account for the worst-case scenario).
        required_space_for_checksum = 4  # 4 bytes for the checksum
        required_space_for_finalize = 0  # We'll calculate this

        # To ensure we don't exceed the limit, we need to account for space required by the final flush and checksum
        # For simplicity, we assume that `Z_FINISH` will return a small amount of data
        estimated_flush_size = 10

        # Check if there's enough space for the checksum and finalize (Z_FINISH + checksum)
        if remaining_space <= required_space_for_checksum + estimated_flush_size:
            return False  # Not enough space to add any more data

        # Compress the chunk
        compressed = self.compressor.compress(data_with_newline)
        compressed_size = len(compressed)

        # Check if adding this compressed chunk would exceed the remaining space
        estimated_flush_size = self._estimated_flush()
        if self.total_compressed_size + compressed_size + required_space_for_checksum + estimated_flush_size > self.max_size_in_bytes:
            return False  # Not enough space for this chunk + finalize (flush + checksum)

        # Add the compressed chunk to the buffer
        self.compressed_buffer += compressed
        self.total_compressed_size += compressed_size

        # Update CRC32 checksum with the compressed chunk (but don't append it yet)
        self.checksum = zlib.crc32(compressed, self.checksum)

        # Perform a sync flush if there's enough space
        estimated_flush_size = self._estimated_flush()
        if self.total_compressed_size + required_space_for_checksum + estimated_flush_size <= self.max_size_in_bytes:
            flushed = self.compressor.flush(zlib.Z_SYNC_FLUSH)
            self.compressed_buffer += flushed
            self.total_compressed_size += len(flushed)

        return True  # Successfully added data without exceeding max size

    def finalize(self):
        # Final flush (Z_FINISH) to get the remaining compressed data
        remaining_compressed = self.compressor.flush(zlib.Z_FINISH)
        remaining_compressed_size = len(remaining_compressed)

        # Add the flush output to the buffer
        self.compressed_buffer += remaining_compressed
        self.total_compressed_size += remaining_compressed_size

        # Finalize: ensure that there's enough space for both the compressed data and the checksum
        if self.total_compressed_size + 4 <= self.max_size_in_bytes:
            # Append the final CRC32 checksum (4 bytes) at the end of the compressed data
            self.compressed_buffer += struct.pack('!I', self.checksum)
            self.total_compressed_size += 4  # Add the 4 bytes for the checksum

        return self.compressed_buffer, self.checksum, self.total_compressed_size, False

    def _estimated_flush(self):
        flushed = self.compressor.flush(zlib.Z_SYNC_FLUSH)
        return len(flushed)
