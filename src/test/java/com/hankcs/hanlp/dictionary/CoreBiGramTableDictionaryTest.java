package com.hankcs.hanlp.dictionary;

import com.hankcs.hanlp.dictionary.CoreBiGramTableDictionary;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CoreBiGramTableDictionaryTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: CoreBiGramTableDictionary */
  // Test written by Diffblue Cover.
  @Test
  public void getBiFrequencyInputNegativeNegativeOutputNegative() {

    // Arrange
    final int idA = -2_147_483_648;
    final int idB = -1;

    // Act
    final int actual = CoreBiGramTableDictionary.getBiFrequency(idA, idB);

    // Assert result
    Assert.assertEquals(-2_147_483_648, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBiFrequencyInputNotNullNotNullOutputZero() {

    // Arrange
    final String a = "2";
    final String b = "1234";

    // Act
    final int actual = CoreBiGramTableDictionary.getBiFrequency(a, b);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBiFrequencyInputPositiveNegativeOutputPositive() {

    // Arrange
    final int idA = 2_097_152;
    final int idB = -1;

    // Act
    final int actual = CoreBiGramTableDictionary.getBiFrequency(idA, idB);

    // Assert result
    Assert.assertEquals(1, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getWordIDInputNotNullOutputNegative() {

    // Arrange
    final String a = "\'";

    // Act
    final int actual = CoreBiGramTableDictionary.getWordID(a);

    // Assert result
    Assert.assertEquals(-1, actual);
  }
}
