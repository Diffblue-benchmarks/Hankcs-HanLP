package com.hankcs.hanlp.mining.word2vec;

import com.hankcs.hanlp.mining.word2vec.VocabWord;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class VocabWordTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: VocabWord */
  // Test written by Diffblue Cover.
  @Test
  public void compareToInputNotNullOutputZero() {

    // Arrange
    final VocabWord objectUnderTest = new VocabWord("foo");
    final VocabWord that = new VocabWord(",");

    // Act
    final int actual = objectUnderTest.compareTo(that);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void constructorInputNotNullOutputVoid() {

    // Arrange
    final String word = "a\'b\'c";

    // Act, creating object to test constructor
    final VocabWord objectUnderTest = new VocabWord(word);

    // Assert side effects
    Assert.assertEquals("1a 2b 3c", objectUnderTest.word);
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull() {

    // Arrange
    final VocabWord objectUnderTest = new VocabWord(",");

    // Act
    final String actual = objectUnderTest.toString();

    // Assert result
    Assert.assertEquals("[,] cn=0, codelen=0, code=(), point=()", actual);
  }
}
