package com.hankcs.hanlp.corpus.document;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import com.hankcs.hanlp.corpus.document.CorpusLoader.HandlerThread;
import com.hankcs.hanlp.corpus.document.CorpusLoader;
import com.hankcs.hanlp.corpus.io.IOUtil;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;

@RunWith(PowerMockRunner.class)
public class CorpusLoaderTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: CorpusLoader */
  // Test written by Diffblue Cover.
  @PrepareForTest({CorpusLoader.class, IOUtil.class, System.class})
  @Test
  public void walkInputNotNull0OutputArithmeticException() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(System.class);
    PowerMockito.mockStatic(IOUtil.class);

    // Arrange
    final String folderPath = "?";
    final CorpusLoader.HandlerThread[] threadArray = {};
    final ArrayList arrayList = new ArrayList();
    final Method fileListMethod = DTUMemberMatcher.method(IOUtil.class, "fileList", String.class);
    PowerMockito.doReturn(arrayList)
        .when(IOUtil.class, fileListMethod)
        .withArguments(or(isA(String.class), isNull(String.class)));
    PowerMockito.when(System.currentTimeMillis()).thenReturn(1_515_585_600_000L);

    // Act
    thrown.expect(ArithmeticException.class);
    CorpusLoader.walk(folderPath, threadArray);

    // Method is not expected to return due to exception thrown
  }
}
