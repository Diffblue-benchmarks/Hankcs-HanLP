package com.hankcs.hanlp.seg;

import com.hankcs.hanlp.seg.CharacterBasedSegment;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CharacterBasedSegmentTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: CharacterBasedSegment */
  // Test written by Diffblue Cover.

  @Test
  public void constructorOutputVoid() {

    // Act, creating object to test constructor
    final CharacterBasedSegment objectUnderTest = new CharacterBasedSegment();

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
}
