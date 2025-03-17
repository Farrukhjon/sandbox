# Inputs & Outputs in Java (I/O Java)

## Literature and Resources

- [The Java Tutorial, Basic I/O](https://docs.oracle.com/javase/tutorial/essential/io/index.html)
- [Getting started with new I/O (NIO)](https://www.ibm.com/developerworks/java/tutorials/j-nio/j-nio.html)
- [Java NIO Tutorial](http://tutorials.jenkov.com/java-nio/index.html)
- [Java NIO vs. IO](https://dzone.com/articles/java-nio-vs-io)[Netty in Action](https://www.safaribooksonline.com/library/view/netty-in-action/9781617291470/)

## Category of I/O API

- Bytes I/O
    - Streams oriented
    - Binary data operations
    - InputStream and OutputStream
    - Writing Bytes to Output Streams
    - Writing Arrays of Bytes
    - Closing Output Streams
    - Flushing Output Streams
- Characters I/O
    - Readers and Writers
- Buffered I/O
    - BufferedReader and BufferedWriter
- NIO and NIO.2
    - Channels
    - Buffers (buffer-oriented
    - Non-Blocking I/O
    - Selectors
- Data Compression I/O
    - java.util.zip package

## Bytes I/O (byte streams)

### Input Streams

Functionality provided by an input stream:

    Read bytes of data from a stream
    Close an opened streams
    Check how many bytes of data are available to be read
    Skip over input
    Mark a position in a stream and resetting back to that position
    Determin whether marking and resetting are supported

- InputStream
    - AudioInputStream
    - ByteArrayInputStream
    - FileInputStream
    - FilterInputStream
        - BufferedInputStream
        - CheckedInputStream
        - CipherInputStream
        - DataInputStream
        - DeflaterInputStream
        - DigestInputStream
        - InflaterInputStream
        - LineNumberInputStream
        - ProgressMonitorInputStream
        - PushbackInputStream
    - ObjectInputStream
    - PipedInputStream
    - SequenceInputStream
    - StringBufferInputStream

### Output Streams

      An output stream accepts output bytes and sends them to some sink

- OutputStream
    - ByteArrayOutputStream
    - FileOutputStream
    - FilterOutputStream
        - BufferedOutputStream
        - CheckedOutputStream
        - CipherOutputStream
        - DataOutputStream
        - DeflaterOutputStream
        - DigestOutputStream
        - InflaterOutputStream
        - PrintStream
    - ObjectOutputStream
    - PipedOutputStream

## Buffer I/O

### Buffered byte streams

- BufferedInputStream
- BufferedOutputStream

### Buffered character streams

- BufferedReader
- BufferedWriter

## Array I/O

### Byte array stream I/O

- ByteArrayInputStream
- ByteArrayOutputStream

### Character array I/O

- CharArrayReader
- CharArrayWriter

## I/O Exceptions

CharConversionException

Closeable
Console
DataInput
DataInputStream
DataOutput
DataOutputStream
DefaultFileSystem
DeleteOnExitHook
EOFException
ExpiringCache

- File
- FileDescriptor
- FileFilter
- FileInputStream
- FilenameFilter
- FileNotFoundException
- FileOutputStream
- FilePermission
- FilePermissionCollection
- FileReader
- FileSystem
- FileWriter

## Filters I/O

### Filtered byte streams

- FilterInputStream
- FilterOutputStream

### Filtered character streams

- FilterReader
- FilterWriter

## Readers and Writers (character streams)

### Readers

Reading data from character streams

- BufferedReader
- CharArrayReader
- FilterReader
- InputStreamReader
- PipedReader
- StringReader

### Writers

Writing data to character streams

- BufferedWriter
- CharArrayWriter
- FilterWriter
- OutputStreamWriter
- PipedWriter
- PrintWriter
- StringWriter

## Data Sources Streams

- File Streams
    - Reading files
    - Writing files
    - File viewer
- Network Streams
    - URLs
    - URL Connections
    - URLViewer
    - Sockets
    - Server Sockets

## Bridging between byte streams and character streams

- InputStreamReader
    - Bridge from byte streams to character streams
- OutputStreamWriter
    - Bridge from character streams to byte streams
    - Characters written to it are encoded into bytes using a specified charset

## Charsets (Encodings)

- Charset
- StandardCharsets

### The Standard Charsets (Encodings)

The StandardCharsets class defines constants for each of the standard charsets.

| Charset/Encoding | Description                                                                                  | Type    |
|------------------|----------------------------------------------------------------------------------------------|---------|
| US-ASCII         | Seven-bit ASCII, a.k.a. ISO646-US, a.k.a. the Basic Latin block of the Unicode character set | Charset |
| ISO-8859-1       | ISO Latin Alphabet No. 1, a.k.a. ISO-LATIN-1                                                 | Charset |
| UTF-8            | Eight-bit UCS Transformation Format                                                          | Charset |
| UTF-16BE         | Sixteen-bit UCS Transformation Format, big-endian byte order                                 | Charset |
| UTF-16LE         | Sixteen-bit UCS Transformation Format, little-endian byte order                              | Charset |
| UTF-16           | Sixteen-bit UCS Transformation Format, byte order identified by an optional byte-order mark  | Charset |

Flushable

InputStream
InputStreamReader

InterruptedIOException

InvalidClassException
InvalidObjectException

IOError
IOException

LineNumberInputStream
LineNumberReader

NotActiveException
NotSerializableException

ObjectInput
ObjectInputStream
ObjectInputValidation
ObjectOutput
ObjectOutputStream
ObjectStreamClass
ObjectStreamConstants
ObjectStreamException
ObjectStreamField

OptionalDataException

OutputStream
OutputStreamWriter

PipedInputStream
PipedOutputStream
PipedReader
PipedWriter

PrintStream
PrintWriter

PushbackInputStream
PushbackReader

RandomAccessFile

Reader

SequenceInputStream

SerialCallbackContext

Serializable
SerializablePermission

StreamCorruptedException
StreamTokenizer

StringBufferInputStream
StringReader
StringWriter

SyncFailedException

UncheckedIOException

UnixFileSystem

UnsupportedEncodingException

UTFDataFormatException

WriteAbortedException

Writer
