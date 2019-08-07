package com.hankcs.hanlp.model.crf;

import com.hankcs.hanlp.model.crf.FeatureTemplate;
import com.hankcs.hanlp.model.crf.Table;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class FeatureTemplateTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: FeatureTemplate */
  // Test written by Diffblue Cover.

  @Test
  public void generateParameterInputNotNullNegativeOutput23() throws InvocationTargetException {

    // Arrange
    final FeatureTemplate objectUnderTest = new FeatureTemplate();
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("1a 2b 3c");
    objectUnderTest.delimiterList = arrayList;
    objectUnderTest.template = null;
    final ArrayList<int[]> arrayList1 = new ArrayList<int[]>();
    final int[] myIntArray = {-268_730_308, 14};
    arrayList1.add(myIntArray);
    objectUnderTest.offsetList = arrayList1;
    final Table table = new Table();
    final int current = -1_083_408_445;

    // Act
    final char[] actual = objectUnderTest.generateParameter(table, current);

    // Assert result
    Assert.assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                                         '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                                         '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000',
                                         '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'},
                             actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void generateParameterInputNotNullPositiveOutput0() throws InvocationTargetException {

    // Arrange
    final FeatureTemplate objectUnderTest = new FeatureTemplate();
    final ArrayList<String> arrayList = new ArrayList<String>();
    objectUnderTest.delimiterList = arrayList;
    objectUnderTest.template = null;
    final ArrayList<int[]> arrayList1 = new ArrayList<int[]>();
    objectUnderTest.offsetList = arrayList1;
    final Table table = new Table();
    final int current = 1_064_075_203;

    // Act
    final char[] actual = objectUnderTest.generateParameter(table, current);

    // Assert result
    Assert.assertArrayEquals(new char[] {}, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void generateParameterInputNotNullPositiveOutputIndexOutOfBoundsException()
      throws InvocationTargetException {

    // Arrange
    final FeatureTemplate objectUnderTest = new FeatureTemplate();
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("1a 2b 3c");
    objectUnderTest.delimiterList = arrayList;
    objectUnderTest.template = null;
    final ArrayList<int[]> arrayList1 = new ArrayList<int[]>();
    objectUnderTest.offsetList = arrayList1;
    final Table table = new Table();
    final int current = 1_064_075_203;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    objectUnderTest.generateParameter(table, current);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getTemplateOutputNull() {

    // Arrange
    final FeatureTemplate objectUnderTest = new FeatureTemplate();

    // Act
    final String actual = objectUnderTest.getTemplate();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull() throws InvocationTargetException {

    // Arrange
    final FeatureTemplate objectUnderTest = new FeatureTemplate();
    objectUnderTest.delimiterList = null;
    objectUnderTest.template = "foo";
    objectUnderTest.offsetList = null;

    // Act
    final String actual = objectUnderTest.toString();

    // Assert result
    Assert.assertEquals("FeatureTemplate{template=\'foo\', delimiterList=null}", actual);
  }
}
