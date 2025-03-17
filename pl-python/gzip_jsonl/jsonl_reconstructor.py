import json
from typing import Generator

PAYLOAD_DELIMITER = b'\n'
class JsonlReconstructor:

    def recover_jsonl(self, chunks: Generator[bytes]):
        not_yield_chunks = bytearray()
        for chunk in chunks:
            if self.is_jsonl(chunk):
                yield chunk
            else:
                not_yield_chunks += chunk
                while PAYLOAD_DELIMITER not in not_yield_chunks:
                    try:
                        not_yield_chunks += next(chunks)
                    except StopIteration:
                        break
                while PAYLOAD_DELIMITER in not_yield_chunks:
                    delimiter_idx = not_yield_chunks.find(PAYLOAD_DELIMITER)
                    if delimiter_idx > -1:
                        up_to = delimiter_idx + 1
                        chunk = not_yield_chunks[0:up_to]
                        del not_yield_chunks[0:up_to]
                        if self.is_jsonl(chunk):
                            yield chunk
                        else:
                            not_yield_chunks += chunk

    def is_jsonl(self, data: bytes) -> bool:
        try:
            json.loads(data)
        except Exception:
            return False
        else:
            return data.endswith(PAYLOAD_DELIMITER)
