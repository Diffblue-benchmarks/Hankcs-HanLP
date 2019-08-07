package com.hankcs.hanlp.classification.utilities.io;

import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.hankcs.hanlp.classification.utilities.io.ConsoleLogger;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.InvocationTargetException;

@RunWith(PowerMockRunner.class)
public class ConsoleLoggerTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: ConsoleLogger */
  // Test written by Diffblue Cover.
  @PrepareForTest({ConsoleLogger.class, System.class})
  @Test
  public void startInputNotNullNullOutputVoid() throws Exception, InvocationTargetException {

    // Setup mocks
    PowerMockito.mockStatic(System.class);

    // Arrange
    final ConsoleLogger objectUnderTest = new ConsoleLogger();
    objectUnderTest.start = 0L;
    final String format = ",";
    final Object[] args = null;
    PowerMockito.when(System.currentTimeMillis()).thenReturn(1_515_585_600_000L);

    // Act
    objectUnderTest.start(format, args);

    // Assert side effects
    Assert.assertEquals(1_515_585_600_000L, objectUnderTest.start);
  }
}
