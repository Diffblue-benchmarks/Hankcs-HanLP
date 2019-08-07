package com.hankcs.hanlp.model.crf;

import com.hankcs.hanlp.model.crf.Table;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;

public class TableTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: Table */
  // Test written by Diffblue Cover.
  @Test
  public void getInputNegativePositiveOutputNotNull() {

    // Arrange
    final Table objectUnderTest = new Table();
    final int x = -2_147_483_648;
    final int y = 1;

    // Act
    final String actual = objectUnderTest.get(x, y);

    // Assert result
    Assert.assertEquals("_B-2147483648", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getInputZeroPositiveOutputNotNull() throws InvocationTargetException {

    // Arrange
    final Table objectUnderTest = new Table();
    final String[][] string2DArray = {};
    objectUnderTest.v = string2DArray;
    final int x = 0;
    final int y = 1;

    // Act
    final String actual = objectUnderTest.get(x, y);

    // Assert result
    Assert.assertEquals("_B+1", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getInputZeroZeroOutputNull() throws InvocationTargetException {

    // Arrange
    final Table objectUnderTest = new Table();
    final String[] stringArray = {null};
    final String[][] string2DArray = {stringArray};
    objectUnderTest.v = string2DArray;
    final int x = 0;
    final int y = 0;

    // Act
    final String actual = objectUnderTest.get(x, y);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void setLastInputZeroNotNullOutputVoid() throws InvocationTargetException {

    // Arrange
    final Table objectUnderTest = new Table();
    final String[] stringArray = {null};
    final String[][] string2DArray = {stringArray};
    objectUnderTest.v = string2DArray;
    final int x = 0;
    final String t = "foo";

    // Act
    objectUnderTest.setLast(x, t);

    // Assert side effects
    Assert.assertNotNull(objectUnderTest.v);
    Assert.assertEquals(1, ((String[])objectUnderTest.v).length);
    Assert.assertArrayEquals(new String[] {"foo"}, ((String[])((String[])objectUnderTest.v)[0]));
  }

  // Test written by Diffblue Cover.
  @Test
  public void sizeOutputZero() throws InvocationTargetException {

    // Arrange
    final Table objectUnderTest = new Table();
    final String[][] string2DArray = {};
    objectUnderTest.v = string2DArray;

    // Act
    final int actual = objectUnderTest.size();

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull() {

    // Arrange
    final Table objectUnderTest = new Table();

    // Act
    final String actual = objectUnderTest.toString();

    // Assert result
    Assert.assertEquals("null", actual);
  }
}
