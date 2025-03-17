import pytest
import zlib

CHUCK_DELIMITER = b'\n'
GZIP_WBITS = zlib.MAX_WBITS | 16

from randomizer.str_randomizer import StringRandomizer


def compress_with_crc32(data_stream):
    # Initialize CRC32 checksum

    checksum = 0

    # Initialize a compress object for streaming compression
    compressor = zlib.compressobj(wbits=GZIP_WBITS)

    # Compress the data
    compressed_buffer = bytearray()
    for data in data_stream:
        data_with_delimiter = data + CHUCK_DELIMITER

        compressed = compressor.compress(data_with_delimiter)

        flushed = compressor.flush(zlib.Z_SYNC_FLUSH)
        combined = compressed + flushed
        compressed_buffer += combined

        # Update CRC32 with the compressed chunk
        checksum = zlib.crc32(combined, checksum)

    # Finalize compression and get any remaining compressed data
    remaining_compressed = compressor.flush(zlib.Z_FINISH)

    # Append the CRC32 checksum (4 bytes)
    remaining_compressed += struct.pack('!I', checksum)  # 'I' is for unsigned int (4 bytes)
    compressed_buffer += remaining_compressed
    return compressed_buffer, checksum


import zlib
import struct


def compress_with_crc32(data_stream, max_size_in_bytes):
    # Initialize CRC32 checksum
    checksum = 0

    # Initialize the compressor object for streaming compression with GZIP headers (or raw deflate)
    GZIP_WBITS = 31  # For GZIP with headers, 15 for raw deflate
    compressor = zlib.compressobj(wbits=GZIP_WBITS)

    # Compressed data buffer
    compressed_buffer = bytearray()

    # Variable to track the total size of the compressed data
    total_compressed_size = 0

    # Process each chunk of data and compress it
    for data in data_stream:
        # Add a newline byte as part of the data (intentional)
        data_with_newline = data + b'\n'

        # Compress the chunk
        compressed = compressor.compress(data_with_newline)
        compressed_size = len(compressed)

        # If adding this chunk would exceed the size limit, stop compressing
        if total_compressed_size + compressed_size > max_size_in_bytes:
            remaining_space = max_size_in_bytes - total_compressed_size
            # Compress only the amount that fits into the remaining space
            compressed = compressed[:remaining_space]
            compressed_size = len(compressed)
            compressed_buffer += compressed
            # Update CRC32 checksum with the compressed chunk
            checksum = zlib.crc32(compressed, checksum)
            break

        # If not exceeding, add the compressed chunk
        compressed_buffer += compressed
        total_compressed_size += compressed_size

        # Update CRC32 checksum with the compressed chunk
        checksum = zlib.crc32(compressed, checksum)

    # Finalize compression and get any remaining compressed data
    remaining_compressed = compressor.flush(zlib.Z_FINISH)
    compressed_buffer += remaining_compressed
    total_compressed_size += len(remaining_compressed)

    # Append the CRC32 checksum (4 bytes) at the end of the compressed data
    compressed_buffer += struct.pack('!I', checksum)  # 'I' is for unsigned int (4 bytes)

    return compressed_buffer, checksum, total_compressed_size


def decompress_with_crc32(compressed_data):
    # Extract the last 4 bytes as the CRC32 checksum
    checksum_from_data = struct.unpack('!I', compressed_data[-4:])[0]
    # Remove the checksum from the compressed data (data minus last 4 bytes)
    compressed_data_without_checksum = compressed_data[:-4]
    # Initialize the decompressor
    decompressor = zlib.decompressobj(wbits=GZIP_WBITS)
    # Decompress the data
    decompressed_data = decompressor.decompress(compressed_data_without_checksum)
    # Verify the checksum by recalculating the CRC32 of the decompressed data
    checksum_calculated = zlib.crc32(compressed_data_without_checksum)
    if checksum_from_data != checksum_calculated:
        print(f"Warning: Checksum mismatch! Calculated: {checksum_calculated}, Expected: {checksum_from_data}")
    else:
        print("Checksum matches! Data integrity verified.")
    return decompressed_data, checksum_from_data


class TestCompressDecompressWithTheCRC32Checksum:

    @pytest.mark.parametrize("seed,data_size", [(i, i ** 3) for i in range(1, 100)])
    def test_compress_decompress_with_checksum(self, seed, data_size):
        # Could also read from a file or stream.
        data_stream = [StringRandomizer(seed).generate_random_string_in_bytes(data_size)]

        # Compress and append CRC32
        compressed_data, checksum = compress_with_crc32(data_stream)

        # Decompress and verify CRC32
        decompressed_data, checksum_from_data = decompress_with_crc32(compressed_data)
        assert checksum == checksum_from_data
        recovered_data = decompressed_data.splitlines()
        assert len(recovered_data) == len(data_stream)
        assert recovered_data == data_stream

    @pytest.mark.parametrize("seed,data_size", [(i, i ** 3) for i in range(1, 100)])
    def test_compress_with_checksum_but_decompress_without(self, seed, data_size):
        # Could also read from a file or stream.
        data_stream = [StringRandomizer(seed).generate_random_string_in_bytes(data_size)]

        # Compress and append CRC32
        compressed_data, checksum = compress_with_crc32(data_stream)

        # Decompress
        decompressed_data = zlib.decompressobj(wbits=GZIP_WBITS).decompress(compressed_data)
        recovered_data = decompressed_data.splitlines()
        assert len(recovered_data) == len(data_stream)
        assert recovered_data == data_stream
