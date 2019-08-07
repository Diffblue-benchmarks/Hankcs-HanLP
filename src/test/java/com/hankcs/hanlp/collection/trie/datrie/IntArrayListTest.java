package com.hankcs.hanlp.collection.trie.datrie;

import com.hankcs.hanlp.collection.trie.datrie.IntArrayList;
import com.hankcs.hanlp.corpus.io.ByteArray;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;

public class IntArrayListTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: IntArrayList */
  // Test written by Diffblue Cover.
  @Test
  public void getExponentialExpandFactorOutputPositive() {

    // Arrange
    final IntArrayList objectUnderTest = new IntArrayList();

    // Act
    final double actual = objectUnderTest.getExponentialExpandFactor();

    // Assert result
    Assert.assertEquals(1.5, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getInputZeroOutputZero() {

    // Arrange
    final IntArrayList objectUnderTest = new IntArrayList();
    final int index = 0;

    // Act
    final int actual = objectUnderTest.get(index);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLinearExpandFactorOutputPositive() {

    // Arrange
    final IntArrayList objectUnderTest = new IntArrayList();

    // Act
    final int actual = objectUnderTest.getLinearExpandFactor();

    // Assert result
    Assert.assertEquals(10_240, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isExponentialExpandingOutputFalse() {

    // Arrange
    final IntArrayList objectUnderTest = new IntArrayList();

    // Act
    final boolean actual = objectUnderTest.isExponentialExpanding();

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void loadInputNullOutputFalse() {

    // Arrange
    final IntArrayList objectUnderTest = new IntArrayList();
    final ByteArray byteArray = null;

    // Act
    final boolean actual = objectUnderTest.load(byteArray);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void setExponentialExpandFactorInputZeroOutputVoid() {

    // Arrange
    final IntArrayList objectUnderTest = new IntArrayList();
    final double exponentialExpandFactor = 0.0;

    // Act
    objectUnderTest.setExponentialExpandFactor(exponentialExpandFactor);

    // Assert side effects
    Assert.assertEquals(0.0, objectUnderTest.getExponentialExpandFactor(), 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void setLinearExpandFactorInputZeroOutputVoid() {

    // Arrange
    final IntArrayList objectUnderTest = new IntArrayList();
    final int linearExpandFactor = 0;

    // Act
    objectUnderTest.setLinearExpandFactor(linearExpandFactor);

    // Assert side effects
    Assert.assertEquals(0, objectUnderTest.getLinearExpandFactor());
  }

  // Test written by Diffblue Cover.
  @Test
  public void sizeOutputZero() {

    // Arrange
    final IntArrayList objectUnderTest = new IntArrayList();

    // Act
    final int actual = objectUnderTest.size();

    // Assert result
    Assert.assertEquals(0, actual);
  }
}
