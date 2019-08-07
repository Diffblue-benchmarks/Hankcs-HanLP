package com.hankcs.hanlp.model.perceptron.tagset;

import com.hankcs.hanlp.model.perceptron.tagset.NERTagSet;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class NERTagSetTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: NERTagSet */
  // Test written by Diffblue Cover.

  @Test
  public void constructorInputZero1OutputNullPointerException() {

    // Arrange
    final int o = 0;
    final ArrayList<String> tags = new ArrayList<String>();
    tags.add(null);

    // Act, creating object to test constructor
    thrown.expect(NullPointerException.class);
    final NERTagSet objectUnderTest = new NERTagSet(o, tags);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void posOfInputNotNullOutputNotNull() {

    // Arrange
    final String tag = ",";

    // Act
    final String actual = NERTagSet.posOf(tag);

    // Assert result
    Assert.assertEquals(",", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void posOfInputNotNullOutputNotNull2() {

    // Arrange
    final String tag = ",,,,,,,,,,,,,,,,,,,-\u00ad\u00ad\u00ad\u00ad\u00ad\u00ad\u00ad";

    // Act
    final String actual = NERTagSet.posOf(tag);

    // Assert result
    Assert.assertEquals("\u00ad\u00ad\u00ad\u00ad\u00ad\u00ad\u00ad", actual);
  }
}
