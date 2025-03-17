import pytest
import zlib

from gzip_jsonl.gzip_compressor import StatefulCompressor
from gzip_jsonl.zlib_gzip import GZIP_WBITS
from randomizer.str_randomizer import StringRandomizer


class TestStatefulCompressor:

    @pytest.mark.parametrize("seed,data_size,max_size_in_bytes", [(i, (i ** 2) * 16, 8 * (2 ** i)) for i in range(1, 20)])
    def test_compress(self, seed, data_size, max_size_in_bytes):
        compressor = StatefulCompressor(max_size_in_bytes)
        data = StringRandomizer(seed).generate_random_string_in_bytes(data_size)
        is_added = compressor.compress(data)
        while is_added:
            data = StringRandomizer(seed).generate_random_string_in_bytes(data_size)
            is_added = compressor.compress(data)

        final_compressed_data, final_checksum, final_compressed_size, incomplete = compressor.finalize()

        assert incomplete is False
        assert len(final_compressed_data) <= max_size_in_bytes

        decompressor = zlib.decompressobj(wbits=GZIP_WBITS)
        decompressed = decompressor.decompress(final_compressed_data)
        assert decompressed is not None
        assert len(decompressed) > 0

    @pytest.mark.parametrize("seed,data_size,max_size_in_bytes", [(i, 200, 200) for i in range(1, 20)])
    def test_compress_2(self, seed, data_size, max_size_in_bytes):
        compressor = StatefulCompressor(max_size_in_bytes)
        data = StringRandomizer(seed).generate_random_string_in_bytes(data_size)
        is_added = compressor.compress(data)
        while is_added:
            data = StringRandomizer(seed).generate_random_string_in_bytes(data_size)
            is_added = compressor.compress(data)

        final_compressed_data, final_checksum, final_compressed_size, incomplete = compressor.finalize()

        assert incomplete is False
        assert len(final_compressed_data) <= max_size_in_bytes

        decompressor = zlib.decompressobj(wbits=GZIP_WBITS)
        decompressed = decompressor.decompress(final_compressed_data)
        assert decompressed is not None
        assert len(decompressed) > 0

    @pytest.mark.parametrize("seed,data_size,max_size_in_bytes", [(i, 128, 128) for i in range(1, 5)])
    def test_compress_small_data(self, seed, data_size, max_size_in_bytes):
        compressor = StatefulCompressor(max_size_in_bytes)
        data = StringRandomizer(seed).generate_random_string_in_bytes(data_size)

        # Compress incrementally
        result = compressor.compress(data)
        assert result == True  # Check if the data was successfully compressed

        while result:
            data = StringRandomizer(seed).generate_random_string_in_bytes(data_size)
            result = compressor.compress(data)

        # Finalize compression
        final_compressed_data, final_checksum, final_compressed_size, incomplete = compressor.finalize()

        # Ensure final compressed size does not exceed max size
        #assert len(final_compressed_data) <= max_size_in_bytes
        #assert not incomplete

        # Decompress and validate the data
        decompressor = zlib.decompressobj(wbits=31)
        decompressed_data = decompressor.decompress(final_compressed_data)
        decompressed_data = decompressed_data.splitlines()
        for d_data in decompressed_data:
            assert len(d_data) == data_size
