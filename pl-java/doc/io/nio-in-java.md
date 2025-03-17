# NIO in Java

<!-- TOC -->
* [NIO in Java](#nio-in-java)
  * [Literature and Resource](#literature-and-resource)
  * [Packages](#packages)
    * [java.nio](#javanio)
    * [java.nio.channels](#javaniochannels)
    * [java.nio.channels.spi](#javaniochannelsspi)
    * [java.nio.charset](#javaniocharset)
    * [java.nio.charset.spi](#javaniocharsetspi)
    * [java.nio.file](#javaniofile)
    * [java.nio.file.attribute](#javaniofileattribute)
    * [java.nio.file.spi](#javaniofilespi)
  * [Classes](#classes)
    * [Buffer](#buffer)
    * [ByteBuffer](#bytebuffer)
    * [ByteOrder](#byteorder)
    * [CharBuffer](#charbuffer)
    * [DoubleBuffer](#doublebuffer)
    * [FloatBuffer](#floatbuffer)
    * [IntBuffer](#intbuffer)
    * [LongBuffer](#longbuffer)
    * [MappedByteBuffer](#mappedbytebuffer)
    * [ShortBuffer](#shortbuffer)
  * [Exceptions](#exceptions)
    * [BufferOverflowException](#bufferoverflowexception)
    * [BufferUnderflowException](#bufferunderflowexception)
    * [InvalidMarkException](#invalidmarkexception)
    * [ReadOnlyBufferException](#readonlybufferexception)
<!-- TOC -->

## Literature and Resource

## Packages

### java.nio

- Defines buffers, which are containers for data, and provides an overview of the other NIO packages.

### java.nio.channels

- Defines channels, which represent connections to entities that are capable of performing I/O operations, such as files
  and sockets; defines selectors, for multiplexed, non-blocking I/O operations.

### java.nio.channels.spi

- Service-provider classes for the `java.nio.channels package.`

### java.nio.charset

- Defines charsets, decoders, and encoders, for translating between bytes and Unicode characters.

### java.nio.charset.spi

- Service-provider classes for the java.nio.charset package.

### java.nio.file

- Defines interfaces and classes for the Java virtual machine to access files, file attributes, and file systems.

### java.nio.file.attribute

- Interfaces and classes providing access to file and file system attributes.

### java.nio.file.spi

- Service-provider classes for the java.nio.file package.

## Classes

### Buffer

- A container for data of a specific primitive type.

### ByteBuffer

- A byte buffer.

### ByteOrder

- A typesafe enumeration for byte orders.

### CharBuffer

- A char buffer.

### DoubleBuffer

- A double buffer.

### FloatBuffer

- A float buffer.

### IntBuffer

- An int buffer.

### LongBuffer

- A long buffer.

### MappedByteBuffer

- A direct byte buffer whose content is a memory-mapped region of a file.

### ShortBuffer

- A short buffer.

## Exceptions

### BufferOverflowException

- Unchecked exception thrown when a relative put operation reaches the target buffer's limit.

### BufferUnderflowException

- Unchecked exception thrown when a relative get operation reaches the source buffer's limit.

### InvalidMarkException

- Unchecked exception thrown when an attempt is made to reset a buffer when its mark is not defined.

### ReadOnlyBufferException

- Unchecked exception thrown when a content-mutation method such as put or compact is invoked upon a read-only buffer.
