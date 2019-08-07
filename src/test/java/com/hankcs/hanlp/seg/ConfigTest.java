package com.hankcs.hanlp.seg;

import com.hankcs.hanlp.seg.Config;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.InvocationTargetException;

public class ConfigTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: Config */
  // Test written by Diffblue Cover.
  @Test
  public void isIndexModeOutputFalse() {

    // Arrange
    final Config objectUnderTest = new Config();

    // Act
    final boolean actual = objectUnderTest.isIndexMode();

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void isIndexModeOutputTrue() throws InvocationTargetException {

    // Arrange
    final Config objectUnderTest = new Config();
    objectUnderTest.organizationRecognize = false;
    objectUnderTest.speechTagging = false;
    objectUnderTest.ner = false;
    objectUnderTest.forceCustomDictionary = false;
    objectUnderTest.japaneseNameRecognize = false;
    objectUnderTest.offset = false;
    objectUnderTest.translatedNameRecognize = false;
    objectUnderTest.useCustomDictionary = false;
    objectUnderTest.placeRecognize = false;
    objectUnderTest.nameRecognize = false;
    objectUnderTest.numberQuantifierRecognize = false;
    objectUnderTest.threadNumber = 0;
    objectUnderTest.indexMode = 1;

    // Act
    final boolean actual = objectUnderTest.isIndexMode();

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void updateNerConfigOutputVoid2() throws InvocationTargetException {

    // Arrange
    final Config objectUnderTest = new Config();
    objectUnderTest.organizationRecognize = false;
    objectUnderTest.speechTagging = false;
    objectUnderTest.ner = false;
    objectUnderTest.forceCustomDictionary = false;
    objectUnderTest.japaneseNameRecognize = false;
    objectUnderTest.offset = false;
    objectUnderTest.translatedNameRecognize = true;
    objectUnderTest.useCustomDictionary = false;
    objectUnderTest.placeRecognize = false;
    objectUnderTest.nameRecognize = false;
    objectUnderTest.numberQuantifierRecognize = false;
    objectUnderTest.threadNumber = 0;
    objectUnderTest.indexMode = 0;

    // Act
    objectUnderTest.updateNerConfig();

    // Assert side effects
    Assert.assertTrue(objectUnderTest.ner);
  }

  // Test written by Diffblue Cover.
  @Test
  public void updateNerConfigOutputVoid3() throws InvocationTargetException {

    // Arrange
    final Config objectUnderTest = new Config();
    objectUnderTest.organizationRecognize = false;
    objectUnderTest.speechTagging = false;
    objectUnderTest.ner = false;
    objectUnderTest.forceCustomDictionary = false;
    objectUnderTest.japaneseNameRecognize = true;
    objectUnderTest.offset = false;
    objectUnderTest.translatedNameRecognize = false;
    objectUnderTest.useCustomDictionary = false;
    objectUnderTest.placeRecognize = false;
    objectUnderTest.nameRecognize = false;
    objectUnderTest.numberQuantifierRecognize = false;
    objectUnderTest.threadNumber = 0;
    objectUnderTest.indexMode = 0;

    // Act
    objectUnderTest.updateNerConfig();

    // Assert side effects
    Assert.assertTrue(objectUnderTest.ner);
  }

  // Test written by Diffblue Cover.
  @Test
  public void updateNerConfigOutputVoid4() throws InvocationTargetException {

    // Arrange
    final Config objectUnderTest = new Config();
    objectUnderTest.organizationRecognize = false;
    objectUnderTest.speechTagging = false;
    objectUnderTest.ner = false;
    objectUnderTest.forceCustomDictionary = false;
    objectUnderTest.japaneseNameRecognize = false;
    objectUnderTest.offset = false;
    objectUnderTest.translatedNameRecognize = false;
    objectUnderTest.useCustomDictionary = false;
    objectUnderTest.placeRecognize = true;
    objectUnderTest.nameRecognize = false;
    objectUnderTest.numberQuantifierRecognize = false;
    objectUnderTest.threadNumber = 0;
    objectUnderTest.indexMode = 0;

    // Act
    objectUnderTest.updateNerConfig();

    // Assert side effects
    Assert.assertTrue(objectUnderTest.ner);
  }

  // Test written by Diffblue Cover.
  @Test
  public void updateNerConfigOutputVoid5() throws InvocationTargetException {

    // Arrange
    final Config objectUnderTest = new Config();
    objectUnderTest.organizationRecognize = true;
    objectUnderTest.speechTagging = false;
    objectUnderTest.ner = false;
    objectUnderTest.forceCustomDictionary = false;
    objectUnderTest.japaneseNameRecognize = false;
    objectUnderTest.offset = false;
    objectUnderTest.translatedNameRecognize = false;
    objectUnderTest.useCustomDictionary = false;
    objectUnderTest.placeRecognize = false;
    objectUnderTest.nameRecognize = false;
    objectUnderTest.numberQuantifierRecognize = false;
    objectUnderTest.threadNumber = 0;
    objectUnderTest.indexMode = 0;

    // Act
    objectUnderTest.updateNerConfig();

    // Assert side effects
    Assert.assertTrue(objectUnderTest.ner);
  }
}
