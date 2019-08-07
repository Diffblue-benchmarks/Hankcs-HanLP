package com.hankcs.hanlp.corpus.document.sentence;

import com.hankcs.hanlp.corpus.document.sentence.Sentence;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class SentenceTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: Sentence */
  // Test written by Diffblue Cover.
  @Test
  public void createInputNotNullOutputNull() {

    // Arrange
    final String param = "                                  ";

    // Act
    final Sentence actual = Sentence.create(param);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse() {

    // Arrange
    final Sentence objectUnderTest = new Sentence(null);
    final Sentence o = new Sentence(null);

    // Act
    final boolean actual = objectUnderTest.equals(o);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNullOutputFalse() {

    // Arrange
    final Sentence objectUnderTest = new Sentence(null);
    final Object o = null;

    // Act
    final boolean actual = objectUnderTest.equals(o);

    // Assert result
    Assert.assertFalse(actual);
  }
}
