from gzip import GzipFile

from gzip_jsonl.zlib_gzip import CompressionResult


class GzipCustomized(GzipFile):

    def add(self, data) -> bool:

        return True

    def finish(self):
        return CompressionResult()

    def close(self):
        super().close()


