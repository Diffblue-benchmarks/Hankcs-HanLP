package com.hankcs.hanlp.corpus.document.sentence.word;

import com.hankcs.hanlp.corpus.document.sentence.word.CompoundWord;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CompoundWordTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: CompoundWord */
  // Test written by Diffblue Cover.
  @Test
  public void createInputNotNullOutputNull() {

    // Arrange
    final String param = "foo";

    // Act
    final CompoundWord actual = CompoundWord.create(param);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInputNotNullOutputNull2() {

    // Arrange
    final String param = "\\\\^^^^^^^^^^^^^^^^\\Z_Z^^^]";

    // Act
    final CompoundWord actual = CompoundWord.create(param);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLabelOutputNotNull() {

    // Arrange
    final CompoundWord objectUnderTest = new CompoundWord(null, "3");

    // Act
    final String actual = objectUnderTest.getLabel();

    // Assert result
    Assert.assertEquals("3", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void setLabelInputNotNullOutputVoid() {

    // Arrange
    final CompoundWord objectUnderTest = new CompoundWord(null, "3");
    final String label = "BAZ";

    // Act
    objectUnderTest.setLabel(label);

    // Assert side effects
    Assert.assertEquals("BAZ", objectUnderTest.getLabel());
  }
}
