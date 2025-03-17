import deflate
import pytest


class TestDeflate:

    def test_deflate_gzip_compress_decompress(self):
        data = "Hello world".encode()
        compressed = deflate.gzip_compress(data)

        decompressed = deflate.gzip_decompress(compressed)

        assert decompressed == data

    @pytest.mark.parametrize("compress_level", range(1, 12 + 1))
    def test_shorter(self, compress_level):
        """tests whether compressed data is actually shorter than original data and
        also uses all supported compress_level"""
        data = b"foobar" * 123
        len_original = len(data)
        len_compressed = len(deflate.gzip_compress(data, compress_level))
        assert len_compressed < len_original
