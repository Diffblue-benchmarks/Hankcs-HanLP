package com.hankcs.hanlp.corpus.document.sentence.word;

import com.hankcs.hanlp.corpus.document.sentence.word.Word;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.logging.Level;

@RunWith(PowerMockRunner.class)
public class WordTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: Word */
  // Test written by Diffblue Cover.

  @Test
  public void constructorInputNotNullNotNullOutputVoid() {

    // Arrange
    final String value = "Bar";
    final String label = "a/b/c";

    // Act, creating object to test constructor
    final Word objectUnderTest = new Word(value, label);

    // Assert side effects
    Assert.assertEquals("A1B2C3", objectUnderTest.getLabel());
    Assert.assertEquals(",", objectUnderTest.getValue());
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInputNotNullOutputNotNull() {

    // Arrange
    final String param = "a/b/c";

    // Act
    final Word actual = Word.create(param);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("c", actual.getLabel());
    Assert.assertEquals("a/b", actual.getValue());
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({Word.class, Level.class})
  @Test
  public void createInputNotNullOutputNull() throws Exception {

    // Arrange
    final String param = "3";

    // Act
    final Word actual = Word.create(param);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInputNullOutputNull() {

    // Arrange
    final String param = null;

    // Act
    final Word actual = Word.create(param);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLabelOutputNotNull() {

    // Arrange
    final Word objectUnderTest = new Word("foo", "1a 2b 3c");

    // Act
    final String actual = objectUnderTest.getLabel();

    // Assert result
    Assert.assertEquals("1a 2b 3c", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getValueOutputNotNull() {

    // Arrange
    final Word objectUnderTest = new Word("foo", "1a 2b 3c");

    // Act
    final String actual = objectUnderTest.getValue();

    // Assert result
    Assert.assertEquals("foo", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void lengthOutputPositive() {

    // Arrange
    final Word objectUnderTest = new Word("3", "2");

    // Act
    final int actual = objectUnderTest.length();

    // Assert result
    Assert.assertEquals(1, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void setLabelInputNotNullOutputVoid() {

    // Arrange
    final Word objectUnderTest = new Word("1a 2b 3c", "2");
    final String label = "A1B2C3";

    // Act
    objectUnderTest.setLabel(label);

    // Assert side effects
    Assert.assertEquals("A1B2C3", objectUnderTest.getLabel());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setValueInputNotNullOutputVoid() {

    // Arrange
    final Word objectUnderTest = new Word("1a 2b 3c", "2");
    final String value = "A1B2C3";

    // Act
    objectUnderTest.setValue(value);

    // Assert side effects
    Assert.assertEquals("A1B2C3", objectUnderTest.getValue());
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull() {

    // Arrange
    final Word objectUnderTest = new Word(",", "3");

    // Act
    final String actual = objectUnderTest.toString();

    // Assert result
    Assert.assertEquals(",/3", actual);
  }
}
