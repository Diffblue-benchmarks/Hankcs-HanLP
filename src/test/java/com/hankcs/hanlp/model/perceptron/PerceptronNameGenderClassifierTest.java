package com.hankcs.hanlp.model.perceptron;

import com.hankcs.hanlp.corpus.io.IIOAdapter;
import com.hankcs.hanlp.model.perceptron.PerceptronNameGenderClassifier;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;
import java.lang.reflect.Method;

@RunWith(PowerMockRunner.class)
public class PerceptronNameGenderClassifierTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: PerceptronNameGenderClassifier */
  // Test written by Diffblue Cover.
  @PrepareForTest(IIOAdapter.class)
  @Test
  public void constructorInputNotNullOutputIOException() throws Exception, IOException {

    // Arrange
    final String modelPath = "\'";

    // Act, creating object to test constructor
    thrown.expect(IOException.class);
    final PerceptronNameGenderClassifier objectUnderTest =
        new PerceptronNameGenderClassifier(modelPath);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void extractGivenNameInputNotNullOutputNotNull() {

    // Arrange
    final String name = "3";

    // Act
    final String actual = PerceptronNameGenderClassifier.extractGivenName(name);

    // Assert result
    Assert.assertEquals("_3", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void extractGivenNameInputNotNullOutputNotNull2() {

    // Arrange
    final String name = "1a 2b 3c";

    // Act
    final String actual = PerceptronNameGenderClassifier.extractGivenName(name);

    // Assert result
    Assert.assertEquals("3c", actual);
  }
}
