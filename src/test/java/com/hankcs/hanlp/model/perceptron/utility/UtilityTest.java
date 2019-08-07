package com.hankcs.hanlp.model.perceptron.utility;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import com.hankcs.hanlp.corpus.document.sentence.word.Word;
import com.hankcs.hanlp.dictionary.other.CharTable;
import com.hankcs.hanlp.model.perceptron.utility.Utility;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;

@RunWith(PowerMockRunner.class)
public class UtilityTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: Utility */
  // Test written by Diffblue Cover.
  @PrepareForTest(CharTable.class)
  @Test
  public void normalizeInputNotNullOutputNotNull() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(CharTable.class);

    // Arrange
    final String text = "?";
    final Method convertMethod = DTUMemberMatcher.method(CharTable.class, "convert", String.class);
    PowerMockito.doReturn("?")
        .when(CharTable.class, convertMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));

    // Act
    final String actual = Utility.normalize(text);

    // Assert result
    Assert.assertEquals("?", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void prfInput3Output3() {

    // Arrange
    final int[] stat = {0, -958_716_935, 0};

    // Act
    final double[] actual = Utility.prf(stat);

    // Assert result
    Assert.assertArrayEquals(new double[] {-0.0, Double.NaN, Double.NaN}, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void prfInputZeroZeroPositiveOutput3() {

    // Arrange
    final int goldTotal = 0;
    final int predTotal = 0;
    final int correct = 405_818_233;

    // Act
    final double[] actual = Utility.prf(goldTotal, predTotal, correct);

    // Assert result
    Assert.assertArrayEquals(
        new double[] {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NaN}, actual, 0.0);
  }

  // Test written by Diffblue Cover.

  @Test
  public void reshapeNERInput0Output3() {

    // Arrange
    final ArrayList<String[]> ner = new ArrayList<String[]>();

    // Act
    final String[][] actual = Utility.reshapeNER(ner);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(3, ((String[])actual).length);
    Assert.assertArrayEquals(new String[] {}, ((String[])((String[])actual)[0]));
    Assert.assertArrayEquals(new String[] {}, ((String[])((String[])actual)[1]));
    Assert.assertArrayEquals(new String[] {}, ((String[])((String[])actual)[2]));
  }

  // Test written by Diffblue Cover.

  @Test
  public void reshapeNERInput1OutputArrayIndexOutOfBoundsException() {

    // Arrange
    final ArrayList<String[]> ner = new ArrayList<String[]>();
    final String[] stringArray = {};
    ner.add(stringArray);

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    Utility.reshapeNER(ner);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void reshapeNERInput1OutputArrayIndexOutOfBoundsException2() {

    // Arrange
    final ArrayList<String[]> ner = new ArrayList<String[]>();
    final String[] stringArray = {"?"};
    ner.add(stringArray);

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    Utility.reshapeNER(ner);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void reshapeNERInput1OutputArrayIndexOutOfBoundsException3() {

    // Arrange
    final ArrayList<String[]> ner = new ArrayList<String[]>();
    final String[] stringArray = {"?", null};
    ner.add(stringArray);

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    Utility.reshapeNER(ner);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void reshapeNERInput1101OutputArrayIndexOutOfBoundsException() {

    // Arrange
    final ArrayList<String[]> collector = new ArrayList<String[]>();
    final String[] stringArray = {null, null};
    collector.add(stringArray);
    final String[] wordArray = {null};
    final String[] posArray = {};
    final String[] tagArray = {null};

    // Act
    thrown.expect(ArrayIndexOutOfBoundsException.class);
    Utility.reshapeNER(collector, wordArray, posArray, tagArray);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void reshapeNERInput1111OutputNullPointerException() {

    // Arrange
    final ArrayList<String[]> collector = new ArrayList<String[]>();
    collector.add(null);
    final String[] wordArray = {null};
    final String[] posArray = {null};
    final String[] tagArray = {null};

    // Act
    thrown.expect(NullPointerException.class);
    Utility.reshapeNER(collector, wordArray, posArray, tagArray);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void reshapeNERInput1120OutputArrayIndexOutOfBoundsException() {

    // Arrange
    final ArrayList<String[]> collector = new ArrayList<String[]>();
    final String[] stringArray = {null, null};
    collector.add(stringArray);
    final String[] wordArray = {null};
    final String[] posArray = {"?", "?"};
    final String[] tagArray = {};
    try {

      // Act
      thrown.expect(ArrayIndexOutOfBoundsException.class);
      Utility.reshapeNER(collector, wordArray, posArray, tagArray);
    } catch (ArrayIndexOutOfBoundsException ex) {

      // Assert side effects
      Assert.assertArrayEquals(new String[] {null, "?"}, posArray);
      throw ex;
    }
  }

  // Test written by Diffblue Cover.

  @Test
  public void toWordArrayInput0Output0() {

    // Arrange
    final ArrayList<Word> wordList = new ArrayList<Word>();

    // Act
    final String[] actual = Utility.toWordArray(wordList);

    // Assert result
    Assert.assertArrayEquals(new String[] {}, actual);
  }
}
