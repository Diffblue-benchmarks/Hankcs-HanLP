package com.hankcs.hanlp.mining.word2vec;

import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.hankcs.hanlp.mining.word2vec.Utility;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.Array;

@RunWith(PowerMockRunner.class)
public class UtilityTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: Utility */
  // Test written by Diffblue Cover.
  @PrepareForTest({Utility.class, System.class})
  @Test
  public void shrinkInput00Output0() throws Exception {

    // Setup mocks
    mockStatic(System.class);

    // Arrange
    final Object[] from = {};
    final Object[] to = {};

    // Act
    final Object[] actual = Utility.shrink(from, to);

    // Assert result
    Assert.assertArrayEquals(new Object[] {}, actual);
  }
}
