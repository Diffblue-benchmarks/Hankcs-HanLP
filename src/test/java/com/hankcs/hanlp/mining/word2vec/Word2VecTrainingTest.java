package com.hankcs.hanlp.mining.word2vec;

import com.hankcs.hanlp.mining.word2vec.Word2VecTraining;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Word2VecTrainingTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: Word2VecTraining */
  // Test written by Diffblue Cover.
  @Test
  public void nextRandomInputNegativeOutputZero() {

    // Arrange
    final long nextRandom = -5_321_740_336_664_008_023L;

    // Act
    final long actual = Word2VecTraining.nextRandom(nextRandom);

    // Assert result
    Assert.assertEquals(0L, actual);
  }
}
