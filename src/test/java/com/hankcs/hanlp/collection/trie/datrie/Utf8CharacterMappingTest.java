package com.hankcs.hanlp.collection.trie.datrie;

import com.hankcs.hanlp.collection.trie.datrie.Utf8CharacterMapping;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;

public class Utf8CharacterMappingTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: Utf8CharacterMapping */
  // Test written by Diffblue Cover.
  @Test
  public void getCharsetSizeOutputPositive() {

    // Arrange
    final Utf8CharacterMapping objectUnderTest = new Utf8CharacterMapping();

    // Act
    final int actual = objectUnderTest.getCharsetSize();

    // Assert result
    Assert.assertEquals(256, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getInitSizeOutputPositive() {

    // Arrange
    final Utf8CharacterMapping objectUnderTest = new Utf8CharacterMapping();

    // Act
    final int actual = objectUnderTest.getInitSize();

    // Assert result
    Assert.assertEquals(256, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void toIdListInputNotNullOutput0() {

    // Arrange
    final Utf8CharacterMapping objectUnderTest = new Utf8CharacterMapping();
    final String key = "\u0000";

    // Act
    final int[] actual = objectUnderTest.toIdList(key);

    // Assert result
    Assert.assertArrayEquals(new int[] {}, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void toIdListInputNotNullOutput1() {

    // Arrange
    final Utf8CharacterMapping objectUnderTest = new Utf8CharacterMapping();
    final String key = "3";

    // Act
    final int[] actual = objectUnderTest.toIdList(key);

    // Assert result
    Assert.assertArrayEquals(new int[] {51}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void toIdListInputPositiveOutput2() {

    // Arrange
    final Utf8CharacterMapping objectUnderTest = new Utf8CharacterMapping();
    final int codePoint = 128;

    // Act
    final int[] actual = objectUnderTest.toIdList(codePoint);

    // Assert result
    Assert.assertArrayEquals(new int[] {194, 128}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void toIdListInputPositiveOutput3() {

    // Arrange
    final Utf8CharacterMapping objectUnderTest = new Utf8CharacterMapping();
    final int codePoint = 2048;

    // Act
    final int[] actual = objectUnderTest.toIdList(codePoint);

    // Assert result
    Assert.assertArrayEquals(new int[] {224, 160, 128}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void toIdListInputPositiveOutput4() {

    // Arrange
    final Utf8CharacterMapping objectUnderTest = new Utf8CharacterMapping();
    final int codePoint = 1_050_624;

    // Act
    final int[] actual = objectUnderTest.toIdList(codePoint);

    // Assert result
    Assert.assertArrayEquals(new int[] {244, 128, 160, 128}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void toIdListInputPositiveOutput5() {

    // Arrange
    final Utf8CharacterMapping objectUnderTest = new Utf8CharacterMapping();
    final int codePoint = 34_605_056;

    // Act
    final int[] actual = objectUnderTest.toIdList(codePoint);

    // Assert result
    Assert.assertArrayEquals(new int[] {250, 132, 128, 160, 128}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void toIdListInputPositiveOutput6() {

    // Arrange
    final Utf8CharacterMapping objectUnderTest = new Utf8CharacterMapping();
    final int codePoint = 1_073_741_824;

    // Act
    final int[] actual = objectUnderTest.toIdList(codePoint);

    // Assert result
    Assert.assertArrayEquals(new int[] {253, 128, 128, 128, 128, 128}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void toIdListInputZeroOutput1() {

    // Arrange
    final Utf8CharacterMapping objectUnderTest = new Utf8CharacterMapping();
    final int codePoint = 0;

    // Act
    final int[] actual = objectUnderTest.toIdList(codePoint);

    // Assert result
    Assert.assertArrayEquals(new int[] {0}, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void toStringInput1OutputNotNull() {

    // Arrange
    final Utf8CharacterMapping objectUnderTest = new Utf8CharacterMapping();
    final int[] ids = {47};

    // Act
    final String actual = objectUnderTest.toString(ids);

    // Assert result
    Assert.assertEquals("/", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void zeroIdOutputZero() {

    // Arrange
    final Utf8CharacterMapping objectUnderTest = new Utf8CharacterMapping();

    // Act
    final int actual = objectUnderTest.zeroId();

    // Assert result
    Assert.assertEquals(0, actual);
  }
}
