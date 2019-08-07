package com.hankcs.hanlp.model.perceptron.utility;

import com.hankcs.hanlp.model.perceptron.instance.Instance;
import com.hankcs.hanlp.model.perceptron.model.LinearModel;
import com.hankcs.hanlp.model.perceptron.utility.IOUtility;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.Method;

public class IOUtility_1Test {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: IOUtility_1 */
  // Test written by Diffblue Cover.
  @Test
  public void evaluateInput0NullOutput1() {

    // Arrange
    final Instance[] instances = {};
    final LinearModel model = null;

    // Act
    final double[] actual = IOUtility.evaluate(instances, model);

    // Assert result
    Assert.assertArrayEquals(new double[] {Double.NaN}, actual, 0.0);
  }

  // Test written by Diffblue Cover.

  @Test
  public void readLineToArrayInputNotNullOutput0() {

    // Arrange
    final String line =
        "\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004";

    // Act
    final String[] actual = IOUtility.readLineToArray(line);

    // Assert result
    Assert.assertArrayEquals(new String[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLineToArrayInputNullOutputNullPointerException() {

    // Arrange
    final String line = null;

    // Act
    thrown.expect(NullPointerException.class);
    IOUtility.readLineToArray(line);

    // Method is not expected to return due to exception thrown
  }
}
