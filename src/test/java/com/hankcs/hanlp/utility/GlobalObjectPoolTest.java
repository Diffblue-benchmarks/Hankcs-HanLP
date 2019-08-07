package com.hankcs.hanlp.utility;

import com.hankcs.hanlp.utility.GlobalObjectPool;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class GlobalObjectPoolTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: GlobalObjectPool */
  // Test written by Diffblue Cover.
  @Test
  public void getInputNullOutputNull() {

    // Arrange
    final Object id = null;

    // Act
    final Object actual = GlobalObjectPool.get(id);

    // Assert result
    Assert.assertNull(actual);
  }
}
