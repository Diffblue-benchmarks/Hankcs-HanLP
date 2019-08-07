package com.hankcs.hanlp.algorithm;

import com.hankcs.hanlp.algorithm.EditDistance;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class EditDistanceTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: EditDistance */
  // Test written by Diffblue Cover.
  @Test
  public void computeInput00OutputPositive() {

    // Arrange
    final long[] arrayA = {};
    final long[] arrayB = {};

    // Act
    final long actual = EditDistance.compute(arrayA, arrayB);

    // Assert result
    Assert.assertEquals(3_074_457_345_618_258_602L, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void computeInput00OutputPositive2() {

    // Arrange
    final int[] arrayA = {};
    final int[] arrayB = {};

    // Act
    final int actual = EditDistance.compute(arrayA, arrayB);

    // Assert result
    Assert.assertEquals(715_827_882, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void computeInput00OutputZero() {

    // Arrange
    final char[] wrongWord = {};
    final char[] rightWord = {};

    // Act
    final int actual = EditDistance.compute(wrongWord, rightWord);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void computeInput10OutputPositive() {

    // Arrange
    final int[] arrayA = {66_274_931};
    final int[] arrayB = {};

    // Act
    final int actual = EditDistance.compute(arrayA, arrayB);

    // Assert result
    Assert.assertEquals(715_827_882, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void computeInput10OutputPositive3() {

    // Arrange
    final char[] wrongWord = {'\u0000'};
    final char[] rightWord = {};

    // Act
    final int actual = EditDistance.compute(wrongWord, rightWord);

    // Assert result
    Assert.assertEquals(1, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void computeInput11OutputZero() {

    // Arrange
    final char[] wrongWord = {'\u0000'};
    final char[] rightWord = {'\u0000'};

    // Act
    final int actual = EditDistance.compute(wrongWord, rightWord);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void computeInput11OutputZero2() {

    // Arrange
    final int[] arrayA = {0};
    final int[] arrayB = {0};

    // Act
    final int actual = EditDistance.compute(arrayA, arrayB);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void computeInput11OutputZero3() {

    // Arrange
    final long[] arrayA = {0L};
    final long[] arrayB = {0L};

    // Act
    final long actual = EditDistance.compute(arrayA, arrayB);

    // Assert result
    Assert.assertEquals(0L, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void computeInput80OutputPositive() {

    // Arrange
    final long[] arrayA = {-9_222_561_147_029_291_008L, 0L, 0L, 0L, 0L, 0L, 0L, 0L};
    final long[] arrayB = {};

    // Act
    final long actual = EditDistance.compute(arrayA, arrayB);

    // Assert result
    Assert.assertEquals(3_074_457_345_618_258_602L, actual);
  }
}
