package com.hankcs.hanlp.model.perceptron.common;

import com.hankcs.hanlp.model.perceptron.common.TaskType;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Method;

public class TaskTypeTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: TaskType */
  // Test written by Diffblue Cover.
  @Test
  public void valueOfInputNotNullOutputIllegalArgumentException() {

    // Arrange
    final String name = "3";

    // Act
    thrown.expect(IllegalArgumentException.class);
    TaskType.valueOf(name);

    // Method is not expected to return due to exception thrown
  }
}
