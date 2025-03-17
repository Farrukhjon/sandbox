import gzip
import io

def compress_stream(stream, limit_bytes):
    """
    Compresses a data stream using gzip, limiting the compressed size.

    Args:
        stream: The input data stream.
        limit_bytes: The maximum allowed size of the compressed data.

    Returns:
        A tuple containing the compressed data and a boolean indicating if the compression was successful.
    """

    compressed_data = io.BytesIO()
    with gzip.GzipFile(fileobj=compressed_data, mode='wb') as f:
        while True:
            chunk = stream.read(4096)
            if not chunk:
                break
            f.write(chunk)

            # Check if the compressed size exceeds the limit
            if compressed_data.tell() > limit_bytes:
                return None, False

    return compressed_data.getvalue(), True

# Example usage:
data_stream = io.BytesIO(b"This is a long string of data to be compressed.")
limit = 100  # Limit the compressed size to 100 bytes

compressed_data, success = compress_stream(data_stream, limit)

if success:
    print("Compressed data:", compressed_data)
else:
    print("Compression failed: Compressed size exceeded the limit.")