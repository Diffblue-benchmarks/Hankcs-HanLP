package com.hankcs.hanlp.mining.word2vec;

import com.hankcs.hanlp.mining.word2vec.Preconditions;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Method;

public class PreconditionsTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: Preconditions */
  // Test written by Diffblue Cover.
  @Test
  public void checkArgumentInputFalseNullOutputIllegalArgumentException() {

    // Arrange
    final boolean expression = false;
    final Object errorMessage = null;

    // Act
    thrown.expect(IllegalArgumentException.class);
    Preconditions.checkArgument(expression, errorMessage);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkArgumentInputFalseOutputIllegalArgumentException() {

    // Arrange
    final boolean expression = false;

    // Act
    thrown.expect(IllegalArgumentException.class);
    Preconditions.checkArgument(expression);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void checkElementIndexInputPositiveNegativeNotNullOutputIllegalArgumentException() {

    // Arrange
    final int index = 345_542_656;
    final int size = -2_147_483_646;
    final String desc = "a/b/c";

    // Act
    thrown.expect(IllegalArgumentException.class);
    Preconditions.checkElementIndex(index, size, desc);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void checkElementIndexInputPositivePositiveNotNullOutputPositive() {

    // Arrange
    final int index = 345_542_656;
    final int size = 345_544_320;
    final String desc = "a/b/c";

    // Act
    final int actual = Preconditions.checkElementIndex(index, size, desc);

    // Assert result
    Assert.assertEquals(345_542_656, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkElementIndexInputZeroNegativeOutputIllegalArgumentException() {

    // Arrange
    final int index = 0;
    final int size = -536_970_229;

    // Act
    thrown.expect(IllegalArgumentException.class);
    Preconditions.checkElementIndex(index, size);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkElementIndexInputZeroPositiveOutputZero() {

    // Arrange
    final int index = 0;
    final int size = 8_388_608;

    // Act
    final int actual = Preconditions.checkElementIndex(index, size);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkNotNullInputNullNotNullNullOutputNullPointerException() {

    // Arrange
    final Object reference = null;
    final String errorMessageTemplate = "?";
    final Object[] errorMessageArgs = null;

    // Act
    thrown.expect(NullPointerException.class);
    Preconditions.checkNotNull(reference, errorMessageTemplate, errorMessageArgs);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkNotNullInputNullNullOutputNullPointerException() {

    // Arrange
    final Object reference = null;
    final Object errorMessage = null;

    // Act
    thrown.expect(NullPointerException.class);
    Preconditions.checkNotNull(reference, errorMessage);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkNotNullInputNullOutputNullPointerException() {

    // Arrange
    final Object reference = null;

    // Act
    thrown.expect(NullPointerException.class);
    Preconditions.checkNotNull(reference);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void checkNotNullInputZeroNotNull0OutputZero() {

    // Arrange
    final Object reference = 0;
    final String errorMessageTemplate = "A1B2C3";
    final Object[] errorMessageArgs = {};

    // Act
    final Object actual =
        Preconditions.checkNotNull(reference, errorMessageTemplate, errorMessageArgs);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkNotNullInputZeroOutputZero() {

    // Arrange
    final Object reference = 0;

    // Act
    final Object actual = Preconditions.checkNotNull(reference);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkNotNullInputZeroZeroOutputZero() {

    // Arrange
    final Object reference = 0;
    final Object errorMessage = 0;

    // Act
    final Object actual = Preconditions.checkNotNull(reference, errorMessage);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkPositionIndexesInputPositivePositiveNegativeOutputIllegalArgumentException() {

    // Arrange
    final int start = 1_073_676_289;
    final int end = 8193;
    final int size = -2_147_483_648;

    // Act
    thrown.expect(IllegalArgumentException.class);
    Preconditions.checkPositionIndexes(start, end, size);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkPositionIndexesInputPositivePositiveNegativeOutputIllegalArgumentException2() {

    // Arrange
    final int start = 1_073_676_289;
    final int end = 1_073_676_289;
    final int size = -2_147_483_648;

    // Act
    thrown.expect(IllegalArgumentException.class);
    Preconditions.checkPositionIndexes(start, end, size);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkPositionIndexInputPositivePositiveOutputPositive() {

    // Arrange
    final int index = 1_073_741_824;
    final int size = 1_073_750_016;

    // Act
    final int actual = Preconditions.checkPositionIndex(index, size);

    // Assert result
    Assert.assertEquals(1_073_741_824, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void checkPositionIndexInputZeroNegativeNotNullOutputIllegalArgumentException() {

    // Arrange
    final int index = 0;
    final int size = -2_147_483_648;
    final String desc = "1";

    // Act
    thrown.expect(IllegalArgumentException.class);
    Preconditions.checkPositionIndex(index, size, desc);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkPositionIndexInputZeroNegativeOutputIllegalArgumentException() {

    // Arrange
    final int index = 0;
    final int size = -2_147_483_645;

    // Act
    thrown.expect(IllegalArgumentException.class);
    Preconditions.checkPositionIndex(index, size);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void checkPositionIndexInputZeroPositiveNotNullOutputZero() {

    // Arrange
    final int index = 0;
    final int size = 345_544_320;
    final String desc = "1";

    // Act
    final int actual = Preconditions.checkPositionIndex(index, size, desc);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkStateInputFalseNullOutputIllegalStateException() {

    // Arrange
    final boolean expression = false;
    final Object errorMessage = null;

    // Act
    thrown.expect(IllegalStateException.class);
    Preconditions.checkState(expression, errorMessage);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkStateInputFalseOutputIllegalStateException() {

    // Arrange
    final boolean expression = false;

    // Act
    thrown.expect(IllegalStateException.class);
    Preconditions.checkState(expression);

    // Method is not expected to return due to exception thrown
  }
}
