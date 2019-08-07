package com.hankcs.hanlp.corpus.io;

import static org.mockito.AdditionalMatchers.or;

import com.hankcs.hanlp.corpus.io.ByteArrayFileStream;
import com.hankcs.hanlp.corpus.io.ByteArrayStream;
import com.hankcs.hanlp.corpus.io.IIOAdapter;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.Array;

@RunWith(PowerMockRunner.class)
public class ByteArrayStreamTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: ByteArrayStream */
  // Test written by Diffblue Cover.

  @Test
  public void constructorInput0ZeroOutputVoid() {

    // Arrange
    final byte[] bytes = {};
    final int bufferSize = 0;

    // Act, creating object to test constructor
    final ByteArrayStream objectUnderTest = new ByteArrayStream(bytes, bufferSize);

    // Assert side effects
    Assert.assertNull(((ByteArrayFileStream)objectUnderTest).bytes);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(IIOAdapter.class)
  @Test
  public void createByteArrayStreamInputNotNullOutputNull() throws Exception {

    // Arrange
    final String path = "a/b/c";

    // Act
    final ByteArrayStream actual = ByteArrayStream.createByteArrayStream(path);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void nextByteOutputZero() {

    // Arrange
    final byte[] myByteArray = {(byte)0};
    final ByteArrayFileStream objectUnderTest = new ByteArrayFileStream(myByteArray, 1, null);

    // Act
    final byte actual = objectUnderTest.nextByte();

    // Assert side effects
    Assert.assertEquals(1, objectUnderTest.getOffset());

    // Assert result
    Assert.assertEquals((byte)0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void nextCharOutputNotNull() {

    // Arrange
    final byte[] myByteArray = {(byte)0, (byte)0};
    final ByteArrayFileStream objectUnderTest = new ByteArrayFileStream(myByteArray, 2, null);

    // Act
    final char actual = objectUnderTest.nextChar();

    // Assert side effects
    Assert.assertEquals(2, objectUnderTest.getOffset());

    // Assert result
    Assert.assertEquals('\u0000', actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void nextDoubleOutputZero() {

    // Arrange
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)0, (byte)0, (byte)0};
    final ByteArrayFileStream objectUnderTest = new ByteArrayFileStream(myByteArray, 8, null);

    // Act
    final double actual = objectUnderTest.nextDouble();

    // Assert side effects
    Assert.assertEquals(8, objectUnderTest.getOffset());

    // Assert result
    Assert.assertEquals(0.0, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void nextFloatOutputZero() {

    // Arrange
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    final ByteArrayFileStream objectUnderTest = new ByteArrayFileStream(myByteArray, 5, null);

    // Act
    final float actual = objectUnderTest.nextFloat();

    // Assert side effects
    Assert.assertEquals(4, objectUnderTest.getOffset());

    // Assert result
    Assert.assertEquals(0.0f, actual, 0.0f);
  }

  // Test written by Diffblue Cover.
  @Test
  public void nextIntOutputZero() {

    // Arrange
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
    final ByteArrayFileStream objectUnderTest = new ByteArrayFileStream(myByteArray, 5, null);

    // Act
    final int actual = objectUnderTest.nextInt();

    // Assert side effects
    Assert.assertEquals(4, objectUnderTest.getOffset());

    // Assert result
    Assert.assertEquals(0, actual);
  }
}
