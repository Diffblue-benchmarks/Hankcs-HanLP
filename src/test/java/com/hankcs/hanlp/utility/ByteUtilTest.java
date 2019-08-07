package com.hankcs.hanlp.utility;

import com.hankcs.hanlp.utility.ByteUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;

public class ByteUtilTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: ByteUtil */
  // Test written by Diffblue Cover.
  @Test
  public void bytesHighFirstToCharInput2ZeroOutputNotNull() {

    // Arrange
    final byte[] bytes = {(byte)0, (byte)0};
    final int start = 0;

    // Act
    final char actual = ByteUtil.bytesHighFirstToChar(bytes, start);

    // Assert result
    Assert.assertEquals('\u0000', actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void bytesHighFirstToDoubleInput10ZeroOutputZero() {

    // Arrange
    final byte[] bytes = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0,
                          (byte)0, (byte)0, (byte)0, (byte)1, (byte)1};
    final int start = 0;

    // Act
    final double actual = ByteUtil.bytesHighFirstToDouble(bytes, start);

    // Assert result
    Assert.assertEquals(0.0, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void bytesHighFirstToFloatInput6ZeroOutputZero() {

    // Arrange
    final byte[] bytes = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)1};
    final int start = 0;

    // Act
    final float actual = ByteUtil.bytesHighFirstToFloat(bytes, start);

    // Assert result
    Assert.assertEquals(0.0f, actual, 0.0f);
  }

  // Test written by Diffblue Cover.
  @Test
  public void bytesHighFirstToIntInput6ZeroOutputZero() {

    // Arrange
    final byte[] bytes = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)1};
    final int start = 0;

    // Act
    final int actual = ByteUtil.bytesHighFirstToInt(bytes, start);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void bytesHighFirstToLongInput8OutputZero() {

    // Arrange
    final byte[] b = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    final long actual = ByteUtil.bytesHighFirstToLong(b);

    // Assert result
    Assert.assertEquals(0L, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void bytesToCharInput2OutputNotNull() {

    // Arrange
    final byte[] b = {(byte)0, (byte)0};

    // Act
    final char actual = ByteUtil.bytesToChar(b);

    // Assert result
    Assert.assertEquals('\u0000', actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void bytesToDoubleInput8OutputZero() {

    // Arrange
    final byte[] b = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    final double actual = ByteUtil.bytesToDouble(b);

    // Assert result
    Assert.assertEquals(0.0, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void bytesToFloatInput7OutputZero() {

    // Arrange
    final byte[] b = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    final float actual = ByteUtil.bytesToFloat(b);

    // Assert result
    Assert.assertEquals(0.0f, actual, 0.0f);
  }

  // Test written by Diffblue Cover.
  @Test
  public void bytesToIntInput6ZeroOutputZero() {

    // Arrange
    final byte[] bytes = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)1, (byte)1};
    final int start = 0;

    // Act
    final int actual = ByteUtil.bytesToInt(bytes, start);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void bytesToIntInput7OutputZero() {

    // Arrange
    final byte[] b = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    final int actual = ByteUtil.bytesToInt(b);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void bytesToLongInput8OutputZero() {

    // Arrange
    final byte[] b = {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};

    // Act
    final long actual = ByteUtil.bytesToLong(b);

    // Assert result
    Assert.assertEquals(0L, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void charToBytesInputNotNullOutput8() {

    // Arrange
    final char c = '\u0000';

    // Act
    final byte[] actual = ByteUtil.charToBytes(c);

    // Assert result
    Assert.assertArrayEquals(
        new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0},
        actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void convertIntToTwoCharInputZeroOutput2() {

    // Arrange
    final int n = 0;

    // Act
    final char[] actual = ByteUtil.convertIntToTwoChar(n);

    // Assert result
    Assert.assertArrayEquals(new char[] {'\u0000', '\u0000'}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void convertTwoCharToIntInputNotNullNotNullOutputZero() {

    // Arrange
    final char high = '\u0000';
    final char low = '\u0000';

    // Act
    final int actual = ByteUtil.convertTwoCharToInt(high, low);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void doubleToBytesInputZeroOutput8() {

    // Arrange
    final double d = 0.0;

    // Act
    final byte[] actual = ByteUtil.doubleToBytes(d);

    // Assert result
    Assert.assertArrayEquals(
        new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0},
        actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void floatToBytesInputZeroOutput4() {

    // Arrange
    final float f = 0.0f;

    // Act
    final byte[] actual = ByteUtil.floatToBytes(f);

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void intToBytesInputZeroOutput4() {

    // Arrange
    final int i = 0;

    // Act
    final byte[] actual = ByteUtil.intToBytes(i);

    // Assert result
    Assert.assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void longToBytesInputZeroOutput8() {

    // Arrange
    final long l = 0L;

    // Act
    final byte[] actual = ByteUtil.longToBytes(l);

    // Assert result
    Assert.assertArrayEquals(
        new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0},
        actual);
  }
}
