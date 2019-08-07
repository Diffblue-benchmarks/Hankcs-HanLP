package com.hankcs.hanlp.algorithm;

import com.hankcs.hanlp.algorithm.LongestCommonSubsequence;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class LongestCommonSubsequenceTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: LongestCommonSubsequence */
  // Test written by Diffblue Cover.

  @Test
  public void computeInput010OutputZero() {

    // Arrange
    final char[] str1 = {};
    final char[] str2 = {'\u0080', '\u0000', '\u8000', '\u0000', '\u0002',
                         '\u0000', '\u8000', '\u8080', '\u8000', '\u0000'};

    // Act
    final int actual = LongestCommonSubsequence.compute(str1, str2);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void computeInput10OutputZero() {

    // Arrange
    final char[] str1 = {'\u0000'};
    final char[] str2 = {};

    // Act
    final int actual = LongestCommonSubsequence.compute(str1, str2);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void computeInput11OutputPositive() {

    // Arrange
    final char[] str1 = {'\u0000'};
    final char[] str2 = {'\u0000'};

    // Act
    final int actual = LongestCommonSubsequence.compute(str1, str2);

    // Assert result
    Assert.assertEquals(1, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void computeInput11OutputZero() {

    // Arrange
    final char[] str1 = {'@'};
    final char[] str2 = {'\u0001'};

    // Act
    final int actual = LongestCommonSubsequence.compute(str1, str2);

    // Assert result
    Assert.assertEquals(0, actual);
  }
}
