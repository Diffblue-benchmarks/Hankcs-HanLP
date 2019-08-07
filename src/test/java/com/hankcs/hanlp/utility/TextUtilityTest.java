package com.hankcs.hanlp.utility;

import com.hankcs.hanlp.utility.TextUtility;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class TextUtilityTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: TextUtility */
  // Test written by Diffblue Cover.
  @Test
  public void charTypeInputNotNullOutputPositive() {

    // Arrange
    final char c = '\u4f70';

    // Act
    final int actual = TextUtility.charType(c);

    // Assert result
    Assert.assertEquals(11, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void charTypeInputNotNullOutputPositive2() {

    // Arrange
    final String str = "";

    // Act
    final int actual = TextUtility.charType(str);

    // Assert result
    Assert.assertEquals(17, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void cintInputNotNullOutputPositive() {

    // Arrange
    final String str = "1";

    // Act
    final int actual = TextUtility.cint(str);

    // Assert result
    Assert.assertEquals(1, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void cintInputNullOutputNegative() {

    // Arrange
    final String str = null;

    // Act
    final int actual = TextUtility.cint(str);

    // Assert result
    Assert.assertEquals(-1, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void combineInput0OutputNotNull() {

    // Arrange
    final String[] termArray = {};

    // Act
    final String actual = TextUtility.combine(termArray);

    // Assert result
    Assert.assertEquals("", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void combineInput1OutputNotNull() {

    // Arrange
    final String[] termArray = {","};

    // Act
    final String actual = TextUtility.combine(termArray);

    // Assert result
    Assert.assertEquals(",", actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void countInputNotNullNotNullOutputPositive() {

    // Arrange
    final String keyword = "2";
    final String srcText = "2";

    // Act
    final int actual = TextUtility.count(keyword, srcText);

    // Assert result
    Assert.assertEquals(1, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void countInputNotNullNotNullOutputZero() {

    // Arrange
    final String keyword = "1a 2b 3c";
    final String srcText = "1";

    // Act
    final int actual = TextUtility.count(keyword, srcText);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void countInputNotNullNotNullOutputZero2() {

    // Arrange
    final String keyword = "foo";
    final String srcText = "1";

    // Act
    final int actual = TextUtility.count(keyword, srcText);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void getCharCountInputNotNullNotNullOutputPositive() {

    // Arrange
    final String charSet = "1234";
    final String word = "3";

    // Act
    final int actual = TextUtility.getCharCount(charSet, word);

    // Assert result
    Assert.assertEquals(1, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void getCharCountInputNotNullNotNullOutputZero() {

    // Arrange
    final String charSet = "/";
    final String word = "1";

    // Act
    final int actual = TextUtility.getCharCount(charSet, word);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getUnsignedInputPositiveOutputPositive() {

    // Arrange
    final byte b = (byte)1;

    // Act
    final int actual = TextUtility.getUnsigned(b);

    // Assert result
    Assert.assertEquals(1, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getUnsignedInputZeroOutputZero() {

    // Arrange
    final byte b = (byte)0;

    // Act
    final int actual = TextUtility.getUnsigned(b);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void isAllChineseNumInputNotNullOutputFalse() {

    // Arrange
    final String word = "1";

    // Act
    final boolean actual = TextUtility.isAllChineseNum(word);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void isAllChineseNumInputNotNullOutputTrue() {

    // Arrange
    final String word = "\u6570\u4e5d";

    // Act
    final boolean actual = TextUtility.isAllChineseNum(word);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void isAllChineseNumInputNotNullOutputTrue2() {

    // Arrange
    final String word = "\u5343\u500d";

    // Act
    final boolean actual = TextUtility.isAllChineseNum(word);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void isAllChineseNumInputNotNullOutputTrue3() {

    // Arrange
    final String word = "\u5206\u4e4b";

    // Act
    final boolean actual = TextUtility.isAllChineseNum(word);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllChineseNumInputNullOutputFalse() {

    // Arrange
    final String word = null;

    // Act
    final boolean actual = TextUtility.isAllChineseNum(word);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllDelimiterInput0OutputTrue() {

    // Arrange
    final byte[] sString = {};

    // Act
    final boolean actual = TextUtility.isAllDelimiter(sString);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllDelimiterInput1OutputFalse() {

    // Arrange
    final byte[] sString = {(byte)0};

    // Act
    final boolean actual = TextUtility.isAllDelimiter(sString);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllDelimiterInput3OutputFalse() {

    // Arrange
    final byte[] sString = {(byte)0, (byte)1, (byte)1};

    // Act
    final boolean actual = TextUtility.isAllDelimiter(sString);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllDelimiterInput3OutputFalse2() {

    // Arrange
    final byte[] sString = {(byte)1, (byte)0, (byte)0};

    // Act
    final boolean actual = TextUtility.isAllDelimiter(sString);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllDelimiterInput3OutputFalse3() {

    // Arrange
    final byte[] sString = {(byte)-95, (byte)32, (byte)33};

    // Act
    final boolean actual = TextUtility.isAllDelimiter(sString);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllIndexInput0OutputTrue() {

    // Arrange
    final byte[] sString = {};

    // Act
    final boolean actual = TextUtility.isAllIndex(sString);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllIndexInput1OutputFalse() {

    // Arrange
    final byte[] sString = {(byte)0};

    // Act
    final boolean actual = TextUtility.isAllIndex(sString);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllIndexInput2OutputFalse() {

    // Arrange
    final byte[] sString = {(byte)65, (byte)1};

    // Act
    final boolean actual = TextUtility.isAllIndex(sString);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllIndexInput2OutputTrue() {

    // Arrange
    final byte[] sString = {(byte)-94, (byte)35};

    // Act
    final boolean actual = TextUtility.isAllIndex(sString);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllIndexInput3OutputFalse() {

    // Arrange
    final byte[] sString = {(byte)0, (byte)1, (byte)1};

    // Act
    final boolean actual = TextUtility.isAllIndex(sString);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllIndexInput3OutputFalse2() {

    // Arrange
    final byte[] sString = {(byte)1, (byte)0, (byte)0};

    // Act
    final boolean actual = TextUtility.isAllIndex(sString);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllIndexInput3OutputFalse3() {

    // Arrange
    final byte[] sString = {(byte)93, (byte)-124, (byte)28};

    // Act
    final boolean actual = TextUtility.isAllIndex(sString);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllIndexInput5OutputFalse() {

    // Arrange
    final byte[] sString = {(byte)123, (byte)-94, (byte)59, (byte)126, (byte)126};

    // Act
    final boolean actual = TextUtility.isAllIndex(sString);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllLetterInputNotNullOutputFalse() {

    // Arrange
    final String text = "\'";

    // Act
    final boolean actual = TextUtility.isAllLetter(text);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllLetterInputNotNullOutputFalse2() {

    // Arrange
    final String text = "a\'b\'c";

    // Act
    final boolean actual = TextUtility.isAllLetter(text);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllLetterInputNotNullOutputFalse3() {

    // Arrange
    final String text = "A1B2C3";

    // Act
    final boolean actual = TextUtility.isAllLetter(text);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllLetterInputNotNullOutputTrue() {

    // Arrange
    final String text = "foo";

    // Act
    final boolean actual = TextUtility.isAllLetter(text);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllLetterOrNumInputNotNullOutputFalse() {

    // Arrange
    final String text = "\'";

    // Act
    final boolean actual = TextUtility.isAllLetterOrNum(text);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllLetterOrNumInputNotNullOutputFalse2() {

    // Arrange
    final String text = "a/b/c";

    // Act
    final boolean actual = TextUtility.isAllLetterOrNum(text);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllLetterOrNumInputNotNullOutputTrue() {

    // Arrange
    final String text = "1";

    // Act
    final boolean actual = TextUtility.isAllLetterOrNum(text);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllLetterOrNumInputNotNullOutputTrue2() {

    // Arrange
    final String text = "Bar";

    // Act
    final boolean actual = TextUtility.isAllLetterOrNum(text);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllNonChineseInput0OutputTrue() {

    // Arrange
    final byte[] sString = {};

    // Act
    final boolean actual = TextUtility.isAllNonChinese(sString);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllNonChineseInput6OutputFalse() {

    // Arrange
    final byte[] sString = {(byte)-128, (byte)-128, (byte)0, (byte)-79, (byte)-128, (byte)0};

    // Act
    final boolean actual = TextUtility.isAllNonChinese(sString);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllNonChineseInput6OutputFalse2() {

    // Arrange
    final byte[] sString = {(byte)-128, (byte)-128, (byte)0, (byte)-7, (byte)-64, (byte)-48};

    // Act
    final boolean actual = TextUtility.isAllNonChinese(sString);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllNonChineseInput8OutputFalse() {

    // Arrange
    final byte[] sString = {(byte)-80,  (byte)-79, (byte)-79, (byte)0,
                            (byte)-128, (byte)0,   (byte)0,   (byte)0};

    // Act
    final boolean actual = TextUtility.isAllNonChinese(sString);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void isAllNumInputNotNullOutputFalse() {

    // Arrange
    final String str = "\'";

    // Act
    final boolean actual = TextUtility.isAllNum(str);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void isAllNumInputNotNullOutputFalse2() {

    // Arrange
    final String str = "1a 2b 3c";

    // Act
    final boolean actual = TextUtility.isAllNum(str);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllNumInputNotNullOutputFalse3() {

    // Arrange
    final String str = "\uff12\u00b7\uff14\uff1009,\u767e\uff143????";

    // Act
    final boolean actual = TextUtility.isAllNum(str);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllNumInputNotNullOutputFalse4() {

    // Arrange
    final String str = "\u00b1\uff17\uff17\uff0c\uff14\uff1402\u22362\uff15\uff30???????????????";

    // Act
    final boolean actual = TextUtility.isAllNum(str);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void isAllNumInputNotNullOutputTrue() {

    // Arrange
    final String str = "2";

    // Act
    final boolean actual = TextUtility.isAllNum(str);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllNumInputNotNullOutputTrue2() {

    // Arrange
    final String str = "\uff17\uff17\uff0f7";

    // Act
    final boolean actual = TextUtility.isAllNum(str);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllNumInputNotNullOutputTrue3() {

    // Arrange
    final String str = "\uff10\uff10";

    // Act
    final boolean actual = TextUtility.isAllNum(str);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllNumInputNotNullOutputTrue4() {

    // Arrange
    final String str = "\uff12\u00b7\uff14\uff1009,";

    // Act
    final boolean actual = TextUtility.isAllNum(str);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllNumInputNotNullOutputTrue5() {

    // Arrange
    final String str = "\u00b1\uff17";

    // Act
    final boolean actual = TextUtility.isAllNum(str);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllNumInputNullOutputFalse() {

    // Arrange
    final String str = null;

    // Act
    final boolean actual = TextUtility.isAllNum(str);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllSingleByteInputNotNullOutputFalse() {

    // Arrange
    final String str = "\u0082";

    // Act
    final boolean actual = TextUtility.isAllSingleByte(str);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isAllSingleByteInputNotNullOutputTrue() {

    // Arrange
    final String str = "1";

    // Act
    final boolean actual = TextUtility.isAllSingleByte(str);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isBlankInputNotNullOutputFalse() {

    // Arrange
    final CharSequence cs = "\u0000";

    // Act
    final boolean actual = TextUtility.isBlank(cs);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isBlankInputNotNullOutputTrue() {

    // Arrange
    final CharSequence cs = "\n";

    // Act
    final boolean actual = TextUtility.isBlank(cs);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isBlankInputNullOutputTrue() {

    // Arrange
    final CharSequence cs = null;

    // Act
    final boolean actual = TextUtility.isBlank(cs);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isDBCCaseInputNullOutputFalse() {

    // Arrange
    final String str = null;

    // Act
    final boolean actual = TextUtility.isDBCCase(str);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isDelimiterInputNotNullOutputFalse() {

    // Arrange
    final String str = "foo";

    // Act
    final boolean actual = TextUtility.isDelimiter(str);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isDelimiterInputNotNullOutputTrue() {

    // Arrange
    final String str = "\uff0d";

    // Act
    final boolean actual = TextUtility.isDelimiter(str);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isDelimiterInputNotNullOutputTrue2() {

    // Arrange
    final String str = "-";

    // Act
    final boolean actual = TextUtility.isDelimiter(str);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isInAggregateInputNotNullNotNullOutputFalse() {

    // Arrange
    final String aggr = "1a 2b 3c";
    final String str = "\'";

    // Act
    final boolean actual = TextUtility.isInAggregate(aggr, str);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isInAggregateInputNotNullNotNullOutputFalse2() {

    // Arrange
    final String aggr = "1";
    final String str = "1a 2b 3c";

    // Act
    final boolean actual = TextUtility.isInAggregate(aggr, str);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isInAggregateInputNotNullNotNullOutputTrue() {

    // Arrange
    final String aggr = "1234";
    final String str = "1";

    // Act
    final boolean actual = TextUtility.isInAggregate(aggr, str);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isInAggregateInputNullNullOutputFalse() {

    // Arrange
    final String aggr = null;
    final String str = null;

    // Act
    final boolean actual = TextUtility.isInAggregate(aggr, str);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isSBCCaseInputNullOutputFalse() {

    // Arrange
    final String str = null;

    // Act
    final boolean actual = TextUtility.isSBCCase(str);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isUnknownWordInputNotNullOutputFalse() {

    // Arrange
    final String word = "3";

    // Act
    final boolean actual = TextUtility.isUnknownWord(word);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isUnknownWordInputNotNullOutputTrue() {

    // Arrange
    final String word = "\u672a##??";

    // Act
    final boolean actual = TextUtility.isUnknownWord(word);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isYearTimeInputNotNullOutputFalse() {

    // Arrange
    final String snum = "foo";

    // Act
    final boolean actual = TextUtility.isYearTime(snum);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isYearTimeInputNotNullOutputTrue() {

    // Arrange
    final String snum = "1234";

    // Act
    final boolean actual = TextUtility.isYearTime(snum);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void joinInput0NotNullOutputNotNull() {

    // Arrange
    final ArrayList s = new ArrayList();
    final String delimiter = "2";

    // Act
    final String actual = TextUtility.join(s, delimiter);

    // Assert result
    Assert.assertEquals("", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void joinInput1NullOutputClassCastException() {

    // Arrange
    final ArrayList s = new ArrayList();
    s.add(0);
    final String delimiter = null;

    // Act
    thrown.expect(ClassCastException.class);
    TextUtility.join(s, delimiter);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void long2charInputZeroOutput4() {

    // Arrange
    final long x = 0L;

    // Act
    final char[] actual = TextUtility.long2char(x);

    // Assert result
    Assert.assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000'}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void nonZeroInputPositiveOutputPositive() {

    // Arrange
    final double frequency = 0x0.0000000000001p-1022 /* 4.94066e-324 */;

    // Act
    final double actual = TextUtility.nonZero(frequency);

    // Assert result
    Assert.assertEquals(0x0.0000000000001p-1022 /* 4.94066e-324 */, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void nonZeroInputZeroOutputPositive() {

    // Arrange
    final double frequency = 0.0;

    // Act
    final double actual = TextUtility.nonZero(frequency);

    // Assert result
    Assert.assertEquals(0.001, actual, 0.0);
  }
}
