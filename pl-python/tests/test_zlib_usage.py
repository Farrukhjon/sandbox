import zlib
from typing import Generator

import pytest

PAYLOAD_DELIMITER = b'\n'
from tests.utils.jsonl_utils import create_random_meta_data_jsonl_list, is_jsonl

"""
https://docs.python.org/3.13/library/zlib.html
https://www.zlib.net/manual.html

"""
from cloud_sink_lib_python.nats.nats_to_eventhub import ONE_MB_IN_BYTES
from tests.utils.string_randomizer import StringRandomizer

"""
Choosing windowBits for zlib to co/dec/ompress in these formats:
 - 'deflate' format, wbits = -zlib.MAX_WBITS
 - 'zlib' format, wbits = zlib.MAX_WBITS
 - 'gzip' format, wbits = zlib.MAX_WBITS | 16
"""
GZIP_WBITS = zlib.MAX_WBITS | 16


def compress_data_per_limit_generator(data_list, limit) -> Generator[bytes]:
    finish_flush_overhead = 10
    idx = 0
    data_list_size = len(data_list)
    while idx < data_list_size:
        compressed_data = bytearray()
        compressor = zlib.compressobj(wbits=GZIP_WBITS)
        while idx < data_list_size:
            data = data_list[idx].encode() + PAYLOAD_DELIMITER
            compressor_tmp = zlib.compressobj(wbits=GZIP_WBITS)
            curr_com_data = compressor_tmp.compress(data)
            curr_com_data += compressor_tmp.flush()
            limit_not_exceed = len(curr_com_data) + len(compressed_data) <= (limit - finish_flush_overhead)
            if limit_not_exceed:
                compressed_data += compressor.compress(data)
                compressed_data += compressor.flush(zlib.Z_FULL_FLUSH)
                idx += 1
            else:
                break
        finish_flush = compressor.flush()
        assert len(finish_flush) == finish_flush_overhead
        compressed_data += finish_flush
        yield compressed_data


class TestZLib:

    def test_zlib_compress_and_zlib_decompress_methods(self):
        string_randomizer = StringRandomizer()
        raw_data = string_randomizer.generate_random_string_in_bytes(1024)
        compressed_data = zlib.compress(raw_data)
        decompressed_data = zlib.decompress(compressed_data)
        assert len(decompressed_data) == len(raw_data)
        assert decompressed_data == raw_data
        compression_ratio = round(len(raw_data) / len(compressed_data), 2)
        assert 1.28 <= compression_ratio < 1.30

    def test_compressobj_and_decompressobj_with_z_finish(self):
        """
        Z_FINISH (default) - finishes the compressed stream and prevents compressing any more data.
        All pending input is processed, pending output is flushed and deflate returns with Z_STREAM_END if there was enough output space.
        """
        # given:
        compressor = zlib.compressobj(wbits=GZIP_WBITS)
        decompressor = zlib.decompressobj(wbits=GZIP_WBITS)

        randomizer = StringRandomizer(100)

        # and:
        compressed_data = bytearray()
        raw_data_size = 0
        data_list = []
        while len(compressed_data) <= ONE_MB_IN_BYTES:
            data = (randomizer.generate_random_string(1024) + "\n").encode()
            compressed_data += compressor.compress(data)

            raw_data_size += len(data)
            data_list.append(data)

        remaining_compress_data = compressor.flush()

        # then:
        assert len(remaining_compress_data) > 300  # It's varies from ~300 up to 800 bytes

        all_compressed_data = compressed_data + remaining_compress_data
        decompressed_data = decompressor.decompress(all_compressed_data)
        decompressed_data_list = decompressed_data.splitlines()
        assert len(data_list) == len(decompressed_data_list)

    def test_compressobj_and_decompressobj_with_z_sync_flush(self):
        """ Z_SYNC_FLUSH - all pending output is flushed to the output buffer
        and the output is aligned on a byte boundary, so that the decompressor can get all input data available so far.
        This completes the current deflate block and follows it with an empty stored block that is three bits plus filler bits to the next byte,
        followed by four bytes (00 00 ff ff).
        """

        # given:
        compressor = zlib.compressobj(wbits=GZIP_WBITS)
        decompressor = zlib.decompressobj(wbits=GZIP_WBITS)

        randomizer = StringRandomizer(100)

        compressed_data = bytearray()
        raw_data_size = 0
        data_list = []
        while len(compressed_data) <= ONE_MB_IN_BYTES:
            data = (randomizer.generate_random_string(1024) + "\n").encode()
            compressed_data += compressor.compress(data)
            remaining_compressed_data = compressor.flush(zlib.Z_SYNC_FLUSH)
            assert len(remaining_compressed_data) > 0
            compressed_data += remaining_compressed_data

            raw_data_size += len(data)
            data_list.append(data)

        finish_flush = compressor.flush()
        assert len(finish_flush) == 10
        all_compressed_data = compressed_data + finish_flush
        compressed_data_size = len(all_compressed_data)
        compression_ratio = round(raw_data_size / compressed_data_size, 2)
        assert 1.27 <= compression_ratio < 1.35
        # and:
        decompressed_data = decompressor.decompress(all_compressed_data)
        decompressed_data_list = decompressed_data.splitlines()
        assert len(data_list) == len(decompressed_data_list)

    def test_compressobj_and_decompressobj_with_z_full_flush(self):
        """
        Z_FULL_FLUSH - all output is flushed as with Z_SYNC_FLUSH,
        and the compression state is reset so that decompression can restart from this point
        Using Z_FULL_FLUSH too often can seriously degrade compression.
        """
        # given:
        compressor = zlib.compressobj(wbits=GZIP_WBITS)
        decompressor = zlib.decompressobj(wbits=GZIP_WBITS)

        randomizer = StringRandomizer(100)

        compressed_data = bytearray()
        raw_data_size = 0
        data_list = []
        while len(compressed_data) <= ONE_MB_IN_BYTES:
            data = (randomizer.generate_random_string(1024) + "\n").encode()
            compressed_data += compressor.compress(data)
            remaining_compressed_data = compressor.flush(zlib.Z_FULL_FLUSH)
            assert len(remaining_compressed_data) > 0
            compressed_data += remaining_compressed_data

            raw_data_size += len(data)
            data_list.append(data)

        finish_flush = compressor.flush()
        assert len(finish_flush) == 10

        all_compressed_data = compressed_data + finish_flush

        compressed_data_size = len(all_compressed_data)
        compression_ratio = round(raw_data_size / compressed_data_size, 2)
        assert 1.28 <= compression_ratio < 1.35
        # and:
        decompressed_data = decompressor.decompress(all_compressed_data)
        decompressed_data_list = decompressed_data.splitlines()
        assert len(data_list) == len(decompressed_data_list)

    @pytest.mark.parametrize('num_data,data_size',
                             [(32 * (2 ** i), 1024 - (i ** 2)) for i in range(1, 8)])
    def test_compress_data_per_limit_and_decompress(self, num_data, data_size):
        limit = 1024 * 100
        data_list = [StringRandomizer(seed).generate_random_string(data_size) for seed in
                     range(num_data)]

        decompressed_data = bytearray()

        for compressed_data in compress_data_per_limit_generator(data_list, limit):
            assert len(compressed_data) <= limit
            decompressor = zlib.decompressobj(wbits=GZIP_WBITS)
            decompressed_data += decompressor.decompress(compressed_data)

        recovered_data = decompressed_data.splitlines()
        assert len(recovered_data) == len(data_list)

    @pytest.mark.parametrize('num_data,data_size,chunk_size',
                             [(32 * (2 ** i), 1024 - (i ** 2), i * 64) for i in range(1, 8)])
    def test_compress_data_per_limit_and_decompress_by_chunks(self, num_data, data_size, chunk_size):
        limit = 1024 * 100
        data_list = [StringRandomizer(seed).generate_random_string(data_size) for seed in
                     range(num_data)]

        decompressed_data = bytearray()
        for compressed_data in compress_data_per_limit_generator(data_list, limit):
            assert len(compressed_data) <= limit
            decompressor = zlib.decompressobj(wbits=GZIP_WBITS)

            decompressed_chunk = decompressor.decompress(compressed_data, chunk_size)
            unconsumed_tail = decompressor.unconsumed_tail
            assert len(unconsumed_tail) > 0
            while len(unconsumed_tail) > 0:
                decompressed_chunk += decompressor.decompress(unconsumed_tail, chunk_size)
                unconsumed_tail = decompressor.unconsumed_tail
            decompressed_data += decompressed_chunk
        recovered_data = decompressed_data.splitlines()
        assert len(recovered_data) == len(data_list)

    @pytest.mark.parametrize('num_data,data_size,chunk_size',
                             [(32 * (2 ** i), 1024 - (i ** 2), i * 64) for i in range(1, 8)])
    def test_compress_jsonl_data_per_limit_and_decompress_by_chunks(self, num_data, data_size, chunk_size):
        # given a list of JSONL metadata items
        data_list = create_random_meta_data_jsonl_list(num_data, data_size)
        # and a limit size (in bytes) for a compressed data:
        limit_size_in_bytes = (num_data * data_size) / 4
        # when the list of the JSONL items are compressed up to the limit size one by one:
        compressed_data_per_limit_iter = compress_data_per_limit_generator(data_list, limit_size_in_bytes)
        # and for each compressed data from the limit iterator (one compressed data set per limit):
        decompressed_data = bytearray()
        for compressed_data_for_limit in compressed_data_per_limit_iter:
            # a compressed data is less than or equal to the limit size:
            assert len(compressed_data_for_limit) <= limit_size_in_bytes
            # given gzip decompressor:
            decompressor = zlib.decompressobj(wbits=GZIP_WBITS)
            # let's decompress a compressed data by a given chunk size (in bytes)
            decompressed_chunk = decompressor.decompress(compressed_data_for_limit, chunk_size)
            unconsumed_tail = decompressor.unconsumed_tail
            assert len(unconsumed_tail) > 0
            while len(unconsumed_tail) > 0:
                decompressed_chunk += decompressor.decompress(unconsumed_tail, chunk_size)
                unconsumed_tail = decompressor.unconsumed_tail
            decompressed_data += decompressed_chunk
        recovered_data = decompressed_data.splitlines()
        assert len(recovered_data) == len(data_list)

    @pytest.mark.skip(reason='This test is slaw because of its inefficient solution')
    @pytest.mark.parametrize('num_data,data_size,chunk_size',
                             [(32 * (2 ** i), 1024 - (i ** 2), i * 64) for i in range(1, 8)])
    def test_compress_jsonl_data_per_limit_and_decompress_by_chunks_recover_original(self, num_data, data_size,
                                                                                     chunk_size):
        # given a list of JSONL metadata items
        data_list = create_random_meta_data_jsonl_list(num_data, data_size)
        # and a limit size (in bytes) for a compressed data:
        limit_size_in_bytes = (num_data * data_size) / 4
        # when the list of the JSONL items are compressed up to the limit size one by one:
        compressed_data_per_limit_iter = compress_data_per_limit_generator(data_list, limit_size_in_bytes)
        # and for each compressed data from the limit iterator (one compressed data set per limit):
        recovered_data = []
        for compressed_data_for_limit in compressed_data_per_limit_iter:
            # a compressed data is less than or equal to the limit size:
            assert len(compressed_data_for_limit) <= limit_size_in_bytes
            # given gzip decompressor:
            decompressor = zlib.decompressobj(wbits=GZIP_WBITS)
            # let's decompress a compressed data by a given chunk size (in bytes)
            decompressed_chunk = decompressor.decompress(compressed_data_for_limit, chunk_size)
            unconsumed_tail = decompressor.unconsumed_tail
            assert len(unconsumed_tail) > 0
            while len(unconsumed_tail) > 0:
                decompressed_chunk += decompressor.decompress(unconsumed_tail, chunk_size)
                while not is_jsonl(decompressed_chunk):
                    if decompressed_chunk == b'\n':
                        break
                    decompressed_chunk += decompressor.decompress(decompressor.unconsumed_tail, 1)
                if is_jsonl(decompressed_chunk):
                    recovered_data.append(decompressed_chunk.decode())
                    decompressed_chunk = bytes()
                unconsumed_tail = decompressor.unconsumed_tail
        assert len(recovered_data) == len(data_list)
