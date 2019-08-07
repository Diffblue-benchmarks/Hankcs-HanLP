package com.hankcs.hanlp.seg.CRF;

import com.hankcs.hanlp.corpus.tag.Nature;
import com.hankcs.hanlp.seg.CRF.CRFSegment;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CRFSegmentTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: CRFSegment */
  // Test written by Diffblue Cover.
  @Test
  public void atomSegmentInput0Output0() {

    // Arrange
    final char[] sentence = {};

    // Act
    final List<String> actual = CRFSegment.atomSegment(sentence);

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void atomSegmentInput1Output1() {

    // Arrange
    final char[] sentence = {'0'};

    // Act
    final List<String> actual = CRFSegment.atomSegment(sentence);

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("0");
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void atomSegmentInput1Output12() {

    // Arrange
    final char[] sentence = {'a'};

    // Act
    final List<String> actual = CRFSegment.atomSegment(sentence);

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("a");
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void atomSegmentInput1Output13() {

    // Arrange
    final char[] sentence = {'\u0000'};

    // Act
    final List<String> actual = CRFSegment.atomSegment(sentence);

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("\u0000");
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void atomSegmentInput2Output1() {

    // Arrange
    final char[] sentence = {'0', '.'};

    // Act
    final List<String> actual = CRFSegment.atomSegment(sentence);

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("0.");
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void atomSegmentInput2Output12() {

    // Arrange
    final char[] sentence = {'0', '%'};

    // Act
    final List<String> actual = CRFSegment.atomSegment(sentence);

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("0%");
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void atomSegmentInput2Output13() {

    // Arrange
    final char[] sentence = {'0', '0'};

    // Act
    final List<String> actual = CRFSegment.atomSegment(sentence);

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("00");
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void atomSegmentInput2Output14() {

    // Arrange
    final char[] sentence = {'a', 'p'};

    // Act
    final List<String> actual = CRFSegment.atomSegment(sentence);

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("ap");
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void atomSegmentInput3Output1() {

    // Arrange
    final char[] sentence = {'9', '%', '9'};

    // Act
    final List<String> actual = CRFSegment.atomSegment(sentence);

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("9%9");
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void atomSegmentInput3Output2() {

    // Arrange
    final char[] sentence = {'8', 'L', 'l'};

    // Act
    final List<String> actual = CRFSegment.atomSegment(sentence);

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("8");
    arrayList.add("Ll");
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void atomSegmentInput4Output2() {

    // Arrange
    final char[] sentence = {'<', 'l', 'l', 'a'};

    // Act
    final List<String> actual = CRFSegment.atomSegment(sentence);

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("<");
    arrayList.add("lla");
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void atomSegmentInput4Output22() {

    // Arrange
    final char[] sentence = {'Q', 'a', '9', '8'};

    // Act
    final List<String> actual = CRFSegment.atomSegment(sentence);

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("Qa");
    arrayList.add("98");
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void atomSegmentToTableInput0Output0() {

    // Arrange
    final char[] sentence = {};

    // Act
    final String[][] actual = CRFSegment.atomSegmentToTable(sentence);

    // Assert result
    Assert.assertArrayEquals(new String[][] {}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void atomSegmentToTableInput1Output1() {

    // Arrange
    final char[] sentence = {'\u0000'};

    // Act
    final String[][] actual = CRFSegment.atomSegmentToTable(sentence);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.length);
    Assert.assertArrayEquals(new String[] {"\u0000", "\u0000", null}, actual[0]);
  }

  // Test written by Diffblue Cover.
  @Test
  public void atomSegmentToTableInput1Output12() {

    // Arrange
    final char[] sentence = {'0'};

    // Act
    final String[][] actual = CRFSegment.atomSegmentToTable(sentence);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.length);
    Assert.assertArrayEquals(new String[] {"M", "0", null}, actual[0]);
  }

  // Test written by Diffblue Cover.
  @Test
  public void atomSegmentToTableInput1Output13() {

    // Arrange
    final char[] sentence = {'p'};

    // Act
    final String[][] actual = CRFSegment.atomSegmentToTable(sentence);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.length);
    Assert.assertArrayEquals(new String[] {"W", "p", null}, actual[0]);
  }

  // Test written by Diffblue Cover.
  @Test
  public void toDefaultNatureInputNotNullOutputNull() {

    // Arrange
    final String compiledChar = ",";

    // Act
    final Nature actual = CRFSegment.toDefaultNature(compiledChar);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void toDefaultNatureInputNotNullOutputNull2() {

    // Arrange
    final String compiledChar = "W";

    // Act
    final Nature actual = CRFSegment.toDefaultNature(compiledChar);

    // Assert result
    Assert.assertNull(actual);
  }
}
