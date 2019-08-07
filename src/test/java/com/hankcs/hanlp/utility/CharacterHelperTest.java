package com.hankcs.hanlp.utility;

import com.hankcs.hanlp.utility.CharacterHelper;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CharacterHelperTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: CharacterHelper */
  // Test written by Diffblue Cover.
  @Test
  public void isArabicNumberInput8OutputTrue() {

    // Arrange
    final char input = '8';

    // Act
    final boolean actual = CharacterHelper.isArabicNumber(input);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isArabicNumberInputNotNullOutputFalse() {

    // Arrange
    final char input = '\u0000';

    // Act
    final boolean actual = CharacterHelper.isArabicNumber(input);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isArabicNumberInputNotNullOutputFalse2() {

    // Arrange
    final char input = ':';

    // Act
    final boolean actual = CharacterHelper.isArabicNumber(input);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isEnglishLetterInputNotNullOutputFalse() {

    // Arrange
    final char input = '\u0000';

    // Act
    final boolean actual = CharacterHelper.isEnglishLetter(input);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isEnglishLetterInputNotNullOutputFalse2() {

    // Arrange
    final char input = '\\';

    // Act
    final boolean actual = CharacterHelper.isEnglishLetter(input);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isEnglishLetterInputNotNullOutputFalse3() {

    // Arrange
    final char input = '\u805d';

    // Act
    final boolean actual = CharacterHelper.isEnglishLetter(input);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isEnglishLetterInputZOutputTrue() {

    // Arrange
    final char input = 'Z';

    // Act
    final boolean actual = CharacterHelper.isEnglishLetter(input);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isSpaceLetterInputNotNullOutputFalse() {

    // Arrange
    final char input = '\u0000';

    // Act
    final boolean actual = CharacterHelper.isSpaceLetter(input);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isSpaceLetterInputNotNullOutputTrue() {

    // Arrange
    final char input = '\u00a0';

    // Act
    final boolean actual = CharacterHelper.isSpaceLetter(input);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputEOutpute() {

    // Arrange
    final char input = 'E';

    // Act
    final char actual = CharacterHelper.regularize(input);

    // Assert result
    Assert.assertEquals('e', actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputNotNullOutputNotNull() {

    // Arrange
    final char input = '\u0000';

    // Act
    final char actual = CharacterHelper.regularize(input);

    // Assert result
    Assert.assertEquals('\u0000', actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputNotNullOutputNotNull2() {

    // Arrange
    final char input = '\u3000';

    // Act
    final char actual = CharacterHelper.regularize(input);

    // Assert result
    Assert.assertEquals(' ', actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputNotNullOutputNotNull3() {

    // Arrange
    final char input = '\u3004';

    // Act
    final char actual = CharacterHelper.regularize(input);

    // Assert result
    Assert.assertEquals('\u3004', actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputNotNullOutputNotNull4() {

    // Arrange
    final char input = '\uff84';

    // Act
    final char actual = CharacterHelper.regularize(input);

    // Assert result
    Assert.assertEquals('\uff84', actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void regularizeInputNotNullOutputNotNull5() {

    // Arrange
    final char input = '\uff05';

    // Act
    final char actual = CharacterHelper.regularize(input);

    // Assert result
    Assert.assertEquals('%', actual);
  }
}
