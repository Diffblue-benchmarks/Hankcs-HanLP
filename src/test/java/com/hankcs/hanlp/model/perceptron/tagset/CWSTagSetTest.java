package com.hankcs.hanlp.model.perceptron.tagset;

import com.hankcs.hanlp.model.perceptron.tagset.CWSTagSet;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Method;

public class CWSTagSetTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: CWSTagSet */
  // Test written by Diffblue Cover.

  @Test
  public void constructorInputZeroPositivePositivePositiveOutputNullPointerException() {

    // Arrange
    final int b = 0;
    final int m = 2;
    final int e = 2;
    final int s = 3;

    // Act, creating object to test constructor
    thrown.expect(NullPointerException.class);
    final CWSTagSet objectUnderTest = new CWSTagSet(b, m, e, s);

    // Method is not expected to return due to exception thrown
  }
}
