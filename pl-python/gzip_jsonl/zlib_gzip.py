import gzip
import io
import zlib
from dataclasses import dataclass
from typing import Generator

PAYLOAD_DELIMITER = b'\n'

GZIP_WBITS = zlib.MAX_WBITS | 16

@dataclass
class CompressionResult:
    compressed_data: bytes
    final_raw_data_size: int

class BatchCompressor:

    def add_to_compressed_data(self, data: bytes) -> bool:
        raise NotImplementedError

    def finish_compressing(self) -> CompressionResult:
        raise NotImplementedError

class GZipFileBatchCompressor(BatchCompressor):

    def __init__(self, max_compress_size_in_bytes: int, payload_delimiter: bytes = PAYLOAD_DELIMITER,
                 compression_level: int = zlib.Z_BEST_COMPRESSION):
        self.max_compress_size_in_bytes = max_compress_size_in_bytes
        self.payload_delimiter = payload_delimiter
        self.compression_level = compression_level
        self.buffer = io.BytesIO()

    def add_to_compressed_data(self, data: bytes) -> bool:
        gzip_file = gzip.GzipFile(fileobj=self.buffer, mode='wb', compresslevel=self.compression_level)

    def finish_compressing(self) -> CompressionResult:
        pass


class Decompressor:

    def decompress_stream(self, compressed_data: bytes) -> Generator[bytes]:
        raise NotImplementedError


class ZLibGZipDecompressor(Decompressor):
    def __init__(self):
        self._decompressor = zlib.decompressobj(wbits=GZIP_WBITS)

    def decompress_by_chunks(self, compressed_data: bytes, chunk_size: int) -> Generator[bytes]:
        new_chunks = self._decompressor.decompress(compressed_data, chunk_size)
        unconsumed_data = self._decompressor.unconsumed_tail
        yield new_chunks
        while len(unconsumed_data) > 0:
            new_chunks = self._decompressor.decompress(unconsumed_data, chunk_size)
            unconsumed_data = self._decompressor.unconsumed_tail
            yield new_chunks

class GzipFileDecompressor(Decompressor):

    def decompress_stream(self, compressed_data: bytes) -> Generator[bytes]:
        with gzip.GzipFile(fileobj=io.BytesIO(compressed_data), mode='rb') as gz:
            for line in gz:
                yield line
