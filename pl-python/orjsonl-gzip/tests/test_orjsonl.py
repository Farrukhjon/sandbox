import zlib

import orjsonl
import pytest

from tests.utils.string_randomizer import StringRandomizer


class TestORJsonl:

    @pytest.mark.parametrize("data_size,num_data,seed", [(32 * (2 ** i), 1024 - (2 ** i), i * i) for i in range(1, 10)])
    def test_stream_decompress(self, seed, num_data, data_size):
        randomizer = StringRandomizer(seed)
        data_list = [randomizer.generate_random_string(data_size) + "\n" for _ in range(num_data)]
        compressed_data = bytearray()
        compressor = zlib.compressobj()
        for data in data_list:
            compressed_data += compressor.compress(data.encode())
        compressed_data += compressor.flush()

        gen = orjsonl.stream(path=compressed_data, compression_format='gz')

        decompressed_data = bytearray()
        for decompressed_chunk in gen:
            decompressed_data += decompressed_chunk
        assert len(decompressed_data) == len(data_list)
