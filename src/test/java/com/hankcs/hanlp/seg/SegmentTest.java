package com.hankcs.hanlp.seg;

import static org.mockito.Matchers.anyChar;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import com.hankcs.hanlp.dictionary.other.CharType;
import com.hankcs.hanlp.seg.NShort.Path.AtomNode;
import com.hankcs.hanlp.seg.Segment;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.api.mockito.expectation.PowerMockitoStubber;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@RunWith(PowerMockRunner.class)
public class SegmentTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: Segment */
  // Test written by Diffblue Cover.

  @Test
  public void atomSegmentInputNullZeroZeroOutput0() {

    // Arrange
    final char[] charArray = null;
    final int start = 0;
    final int end = 0;

    // Act
    final List<AtomNode> actual = Segment.atomSegment(charArray, start, end);

    // Assert result
    final ArrayList<AtomNode> arrayList = new ArrayList<AtomNode>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void constructorOutputVoid() {

    // Act, creating object to test constructor
    final Segment objectUnderTest = new Segment();

    // Assert side effects
    Assert.assertNotNull(objectUnderTest.config);
    Assert.assertFalse(objectUnderTest.config.organizationRecognize);
    Assert.assertFalse(objectUnderTest.config.speechTagging);
    Assert.assertTrue(objectUnderTest.config.ner);
    Assert.assertFalse(objectUnderTest.config.forceCustomDictionary);
    Assert.assertFalse(objectUnderTest.config.japaneseNameRecognize);
    Assert.assertFalse(objectUnderTest.config.offset);
    Assert.assertTrue(objectUnderTest.config.translatedNameRecognize);
    Assert.assertTrue(objectUnderTest.config.useCustomDictionary);
    Assert.assertFalse(objectUnderTest.config.placeRecognize);
    Assert.assertTrue(objectUnderTest.config.nameRecognize);
    Assert.assertFalse(objectUnderTest.config.numberQuantifierRecognize);
    Assert.assertEquals(1, objectUnderTest.config.threadNumber);
    Assert.assertEquals(0, objectUnderTest.config.indexMode);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(CharType.class)
  @Test
  public void quickAtomSegmentInput10PositiveZeroOutput0() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(CharType.class);

    // Arrange
    final char[] charArray = {'\u0007', '\u0007', '\u0006', '\u0002', '\u0006',
                              '\u0006', '\u0006', '\u0006', '\u0006', '\u0002'};
    final int start = 9;
    final int end = 0;
    final Method getMethod = DTUMemberMatcher.method(CharType.class, "get", char.class);
    PowerMockito.doReturn((byte)0).when(CharType.class, getMethod).withArguments(anyChar());

    // Act
    final List<AtomNode> actual = Segment.quickAtomSegment(charArray, start, end);

    // Assert result
    final LinkedList<AtomNode> linkedList = new LinkedList<AtomNode>();
    Assert.assertEquals(linkedList, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(CharType.class)
  @Test
  public void quickAtomSegmentInput15ZeroPositiveOutputNullPointerException() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(CharType.class);

    // Arrange
    final char[] charArray = {'\u7808', '\uff0e', '\uff0e', '\u4001', '.',
                              ',',      '.',      '\uff0c', '\u6000', '\u1000',
                              '\u0000', '\u2000', '\u6028', '\u5009', '\u2000'};
    final int start = 0;
    final int end = 9;
    final Method getMethod = DTUMemberMatcher.method(CharType.class, "get", char.class);
    ((PowerMockitoStubber)PowerMockito.doReturn((byte)9)
         .doReturn((byte)0)
         .doReturn((byte)9)
         .doReturn((byte)1)
         .doReturn((byte)9)
         .doReturn((byte)9)
         .doReturn((byte)8)
         .doReturn((byte)9)
         .doReturn((byte)9)
         .doReturn((byte)9))
        .when(CharType.class, getMethod)
        .withArguments(anyChar());

    // Act
    thrown.expect(NullPointerException.class);
    Segment.quickAtomSegment(charArray, start, end);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void simpleAtomSegmentInputNullNegativePositiveOutputStringIndexOutOfBoundsException() {

    // Arrange
    final char[] charArray = null;
    final int start = -999_999;
    final int end = 1;

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Segment.simpleAtomSegment(charArray, start, end);

    // Method is not expected to return due to exception thrown
  }
}
