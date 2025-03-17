package io.github.farrukhjon.experiment.java.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author fsattorov
 */
public class ByteArrayInputStreamTests {

  private static final int EOF = -1;

  @Test
  void testWhileBytesAvailableRead() {
    // given:
    var inputStr = "Hello World";
    byte[] data = inputStr.getBytes();

    var bais = new ByteArrayInputStream(data);

    // when:
    var result = new StringBuilder();
    while (bais.available() > 0) {
      int aByte = bais.read();
      char aChar = (char) aByte;
      result.append(aChar);
    }

    //then:
    Assertions.assertEquals(inputStr, result.toString());

  }

  @Test
  void testReadInputInBuffer() throws IOException {
    // given:
    var inputStr = "Hello World";
    byte[] data = inputStr.getBytes();

    var bais = new ByteArrayInputStream(data);

    // when:
    var buffer = new byte[inputStr.length()];
    var result = new StringBuilder();
    while (bais.read(buffer) != EOF) {
      var str = new String(buffer, StandardCharsets.US_ASCII);
      result.append(str);
    }

    //then:
    Assertions.assertEquals(inputStr, result.toString());

  }
}
