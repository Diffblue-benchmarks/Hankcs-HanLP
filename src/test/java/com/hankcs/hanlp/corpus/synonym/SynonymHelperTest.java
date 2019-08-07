package com.hankcs.hanlp.corpus.synonym;

import com.hankcs.hanlp.corpus.synonym.SynonymHelper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Method;

public class SynonymHelperTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: SynonymHelper */
  // Test written by Diffblue Cover.
  @Test
  public void convertString2IdInputNotNullOutputNegative() {

    // Arrange
    final String idString = "1a 2b 3c";

    // Act
    final long actual = SynonymHelper.convertString2Id(idString);

    // Assert result
    Assert.assertEquals(-108_567_657L, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void convertString2IdInputNotNullOutputStringIndexOutOfBoundsException() {

    // Arrange
    final String idString = "foo";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    SynonymHelper.convertString2Id(idString);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void convertString2IdInputNotNullOutputStringIndexOutOfBoundsException2() {

    // Arrange
    final String idString = "a/b/c";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    SynonymHelper.convertString2Id(idString);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void convertString2IdWithIndexInputNotNullNegativeOutputNegative() {

    // Arrange
    final String idString = "1a 2b 3c";
    final long index = -204_008_250_982L;

    // Act
    final long actual = SynonymHelper.convertString2IdWithIndex(idString, index);

    // Assert result
    Assert.assertEquals(-312_467_340_325L, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void convertString2IdWithIndexInputNotNullNegativeOutputStringIndexOutOfBoundsException() {

    // Arrange
    final String idString = "foo";
    final long index = -255_013_552_128L;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    SynonymHelper.convertString2IdWithIndex(idString, index);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void
  convertString2IdWithIndexInputNotNullNegativeOutputStringIndexOutOfBoundsException2() {

    // Arrange
    final String idString = "A1B2C3";
    final long index = -447_076_490_550L;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    SynonymHelper.convertString2IdWithIndex(idString, index);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void convertString2IdWithIndexInputNotNullPositiveOutputNegative() {

    // Arrange
    final String idString = "1a 2b 3c";
    final int index = 547_950_624;

    // Act
    final long actual = SynonymHelper.convertString2IdWithIndex(idString, index);

    // Assert result
    Assert.assertEquals(-107_911_138_719L, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void convertString2IdWithIndexInputNotNullZeroOutputStringIndexOutOfBoundsException() {

    // Arrange
    final String idString = "foo";
    final int index = 0;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    SynonymHelper.convertString2IdWithIndex(idString, index);

    // Method is not expected to return due to exception thrown
  }
}
