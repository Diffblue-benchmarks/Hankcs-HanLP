package com.hankcs.hanlp.model.perceptron;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;

import com.hankcs.hanlp.model.perceptron.PerceptronSegmenter;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;
import java.lang.reflect.Array;

@RunWith(PowerMockRunner.class)
public class PerceptronSegmenterTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: PerceptronSegmenter */
  // Test written by Diffblue Cover.
  @PrepareForTest(PerceptronSegmenter.class)
  @Test
  public void constructorOutputIllegalArgumentException() throws Exception, IOException {

    // Arrange
    final char[] myCharArray = {
        '\\', 'u', '9',  '5',  '1', '9',  '\\', 'u', '8',  'b',  'e', 'f',  '\\', 'u', '7',
        '6',  '8', '4',  '\\', 'u', '6',  'a',  '2', '1',  '\\', 'u', '5',  '7',  '8', 'b',
        '\\', 'u', '7',  'c',  '7', 'b',  '\\', 'u', '5',  '7',  '8', 'b',  ':',  ' ', '\\',
        'u',  '4', 'f',  '2',  '0', '\\', 'u',  '5', '1',  '6',  '5', '\\', 'u',  '7', '6',
        '8',  '4', '\\', 'u',  '4', 'e',  '0',  'd', '\\', 'u',  '6', '6',  '2',  'f', '\\',
        'u',  '5', '2',  '0',  '6', '\\', 'u',  '8', 'b',  'c',  'd', '\\', 'u',  '6', 'a',
        '2',  '1', '\\', 'u',  '5', '7',  '8',  'b', '\\', 'u',  'f', 'f',  '0',  'c', '\\',
        'u',  '8', '0',  '0',  'c', '\\', 'u',  '6', '6',  '2',  'f', ' ',  'n',  'u', 'l',
        'l',  ' ', '\\', 'u',  '6', 'a',  '2',  '1', '\\', 'u',  '5', '7',  '8',  'b'};
    PowerMockito.whenNew(PerceptronSegmenter.class)
        .withParameterTypes(String.class)
        .withArguments(or(isA(String.class), isNull(String.class)))
        .thenThrow(myCharArray);

    // Act, creating object to test constructor
    thrown.expect(IllegalArgumentException.class);
    final PerceptronSegmenter objectUnderTest = new PerceptronSegmenter();
  }
}
