package com.hankcs.hanlp.corpus.io;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import com.hankcs.hanlp.corpus.io.ByteArray;
import com.hankcs.hanlp.corpus.io.IOUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.Array;
import java.lang.reflect.Method;

@RunWith(PowerMockRunner.class)
public class ByteArrayTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: ByteArray */
  // Test written by Diffblue Cover.
  @Test
  public void closeOutputVoid() {

    // Arrange
    final byte[] myByteArray = {};
    final ByteArray objectUnderTest = new ByteArray(myByteArray);

    // Act
    objectUnderTest.close();

    // Assert side effects
    Assert.assertNull(objectUnderTest.bytes);
  }

  // Test written by Diffblue Cover.

  @Test
  public void constructorInput0OutputVoid() {

    // Arrange
    final byte[] bytes = {};

    // Act, creating object to test constructor
    final ByteArray objectUnderTest = new ByteArray(bytes);

    // Assert side effects
    Assert.assertNull(objectUnderTest.bytes);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(IOUtil.class)
  @Test
  public void createByteArrayInputNotNullOutputNotNull() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(IOUtil.class);

    // Arrange
    final String path = "3";
    final byte[] myByteArray = {};
    final Method readBytesMethod = DTUMemberMatcher.method(IOUtil.class, "readBytes", String.class);
    PowerMockito.doReturn(myByteArray)
        .when(IOUtil.class, readBytesMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    final ByteArray actual = ByteArray.createByteArray(path);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(0, actual.getOffset());
    Assert.assertArrayEquals(new byte[] {}, actual.bytes);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(IOUtil.class)
  @Test
  public void createByteArrayInputNotNullOutputNull() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(IOUtil.class);

    // Arrange
    final String path = "3";
    final Method readBytesMethod = DTUMemberMatcher.method(IOUtil.class, "readBytes", String.class);
    PowerMockito.doReturn(null)
        .when(IOUtil.class, readBytesMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    final ByteArray actual = ByteArray.createByteArray(path);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void finalizeOutputVoid() throws Throwable {

    // Arrange
    final byte[] myByteArray = {};
    final ByteArray objectUnderTest = new ByteArray(myByteArray);

    // Act
    objectUnderTest.finalize();

    // Assert side effects
    Assert.assertNull(objectUnderTest.bytes);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBytesOutput0() {

    // Arrange
    final byte[] myByteArray = {};
    final ByteArray objectUnderTest = new ByteArray(myByteArray);

    // Act
    final byte[] actual = objectUnderTest.getBytes();

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLengthOutputZero() {

    // Arrange
    final byte[] myByteArray = {};
    final ByteArray objectUnderTest = new ByteArray(myByteArray);

    // Act
    final int actual = objectUnderTest.getLength();

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getOffsetOutputZero() {

    // Arrange
    final byte[] myByteArray = {};
    final ByteArray objectUnderTest = new ByteArray(myByteArray);

    // Act
    final int actual = objectUnderTest.getOffset();

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasMoreOutputFalse() {

    // Arrange
    final byte[] myByteArray = {};
    final ByteArray objectUnderTest = new ByteArray(myByteArray);

    // Act
    final boolean actual = objectUnderTest.hasMore();

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void hasMoreOutputTrue() {

    // Arrange
    final byte[] myByteArray = {(byte)0};
    final ByteArray objectUnderTest = new ByteArray(myByteArray);

    // Act
    final boolean actual = objectUnderTest.hasMore();

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void nextBooleanOutputFalse() {

    // Arrange
    final byte[] myByteArray = {(byte)0};
    final ByteArray objectUnderTest = new ByteArray(myByteArray);

    // Act
    final boolean actual = objectUnderTest.nextBoolean();

    // Assert side effects
    Assert.assertEquals(1, objectUnderTest.getOffset());

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void nextBooleanOutputTrue() {

    // Arrange
    final byte[] myByteArray = {(byte)1};
    final ByteArray objectUnderTest = new ByteArray(myByteArray);

    // Act
    final boolean actual = objectUnderTest.nextBoolean();

    // Assert side effects
    Assert.assertEquals(1, objectUnderTest.getOffset());

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void nextByteOutputZero() {

    // Arrange
    final byte[] myByteArray = {(byte)0};
    final ByteArray objectUnderTest = new ByteArray(myByteArray);

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
    final ByteArray objectUnderTest = new ByteArray(myByteArray);

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
    final ByteArray objectUnderTest = new ByteArray(myByteArray);

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
    final ByteArray objectUnderTest = new ByteArray(myByteArray);

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
    final ByteArray objectUnderTest = new ByteArray(myByteArray);

    // Act
    final int actual = objectUnderTest.nextInt();

    // Assert side effects
    Assert.assertEquals(4, objectUnderTest.getOffset());

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void nextStringOutputNotNull() {

    // Arrange
    final byte[] myByteArray = {(byte)0, (byte)0, (byte)0, (byte)0,
                                (byte)0, (byte)1, (byte)0, (byte)0};
    final ByteArray objectUnderTest = new ByteArray(myByteArray);

    // Act
    final String actual = objectUnderTest.nextString();

    // Assert side effects
    Assert.assertEquals(4, objectUnderTest.getOffset());

    // Assert result
    Assert.assertEquals("1a 2b 3c", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void nextUnsignedShortOutputZero() {

    // Arrange
    final byte[] myByteArray = {(byte)0, (byte)0};
    final ByteArray objectUnderTest = new ByteArray(myByteArray);

    // Act
    final int actual = objectUnderTest.nextUnsignedShort();

    // Assert side effects
    Assert.assertEquals(2, objectUnderTest.getOffset());

    // Assert result
    Assert.assertEquals(0, actual);
  }
}
