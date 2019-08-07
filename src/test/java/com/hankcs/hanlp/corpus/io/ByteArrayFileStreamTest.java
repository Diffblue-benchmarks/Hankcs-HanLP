package com.hankcs.hanlp.corpus.io;

import com.hankcs.hanlp.corpus.io.ByteArrayFileStream;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.nio.channels.FileChannel;

public class ByteArrayFileStreamTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: ByteArrayFileStream */
  // Test written by Diffblue Cover.

  @Test
  public void constructorInput0ZeroNullOutputVoid() {

    // Arrange
    final byte[] bytes = {};
    final int bufferSize = 0;
    final FileChannel fileChannel = null;

    // Act, creating object to test constructor
    final ByteArrayFileStream objectUnderTest =
        new ByteArrayFileStream(bytes, bufferSize, fileChannel);

    // Assert side effects
    Assert.assertNull(objectUnderTest.bytes);
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasMoreOutputFalse() {

    // Arrange
    final byte[] myByteArray = {};
    final ByteArrayFileStream objectUnderTest = new ByteArrayFileStream(myByteArray, 0, null);

    // Act
    final boolean actual = objectUnderTest.hasMore();

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasMoreOutputTrue() {

    // Arrange
    final byte[] myByteArray = {};
    final ByteArrayFileStream objectUnderTest = new ByteArrayFileStream(myByteArray, 1, null);

    // Act
    final boolean actual = objectUnderTest.hasMore();

    // Assert result
    Assert.assertTrue(actual);
  }
}
