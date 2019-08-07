package com.hankcs.hanlp.corpus.io;

import com.hankcs.hanlp.corpus.io.ByteArrayOtherStream;
import com.hankcs.hanlp.corpus.io.IIOAdapter;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;

@RunWith(PowerMockRunner.class)
public class ByteArrayOtherStreamTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: ByteArrayOtherStream */
  // Test written by Diffblue Cover.

  @Test
  public void constructorInput0ZeroOutputVoid() {

    // Arrange
    final byte[] bytes = {};
    final int bufferSize = 0;

    // Act, creating object to test constructor
    final ByteArrayOtherStream objectUnderTest = new ByteArrayOtherStream(bytes, bufferSize);

    // Assert side effects
    Assert.assertNull(objectUnderTest.bytes);
  }

  // Test written by Diffblue Cover.

  @Test
  public void constructorInputNullZeroNullOutputVoid() {

    // Arrange
    final byte[] bytes = null;
    final int bufferSize = 0;
    final InputStream is = null;

    // Act, creating object to test constructor
    final ByteArrayOtherStream objectUnderTest = new ByteArrayOtherStream(bytes, bufferSize, is);

    // Assert side effects
    Assert.assertNull(objectUnderTest.bytes);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(IIOAdapter.class)
  @Test
  public void createByteArrayOtherStreamInputNotNullOutputNull() throws Exception {

    // Arrange
    final String path = "a\'b\'c";

    // Act
    final ByteArrayOtherStream actual = ByteArrayOtherStream.createByteArrayOtherStream(path);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void createByteArrayOtherStreamInputNullOutputNull() throws IOException {

    // Arrange
    final InputStream is = null;

    // Act
    final ByteArrayOtherStream actual = ByteArrayOtherStream.createByteArrayOtherStream(is);

    // Assert result
    Assert.assertNull(actual);
  }
}
