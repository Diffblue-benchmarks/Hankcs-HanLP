package com.hankcs.hanlp.corpus.io;

import static org.mockito.AdditionalMatchers.or;

import com.hankcs.hanlp.corpus.io.IIOAdapter;
import com.hankcs.hanlp.corpus.io.IOUtil;
import com.hankcs.hanlp.dictionary.CoreDictionary.Attribute;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.TreeMap;

@RunWith(PowerMockRunner.class)
public class IOUtilTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: IOUtil */
  // Test written by Diffblue Cover.
  @Test
  public void baseNameInputNotNullOutputNotNull() {

    // Arrange
    final String path = "";

    // Act
    final String actual = IOUtil.baseName(path);

    // Assert result
    Assert.assertEquals("", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void baseNameInputNullOutputNotNull() {

    // Arrange
    final String path = null;

    // Act
    final String actual = IOUtil.baseName(path);

    // Assert result
    Assert.assertEquals("", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void dirnameInputNotNullOutputNotNull() {

    // Arrange
    final String path = "/";

    // Act
    final String actual = IOUtil.dirname(path);

    // Assert result
    Assert.assertEquals("/", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void dirnameInputNotNullOutputNotNull2() {

    // Arrange
    final String path = "1a 2b 3c";

    // Act
    final String actual = IOUtil.dirname(path);

    // Assert result
    Assert.assertEquals("1a 2b 3c", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getSuffixInputNotNullNotNullOutputNotNull() {

    // Arrange
    final String name = "3";
    final String delimiter = "3";

    // Act
    final String actual = IOUtil.getSuffix(name, delimiter);

    // Assert result
    Assert.assertEquals("", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void loadDictionaryInput0Output0() throws IOException {

    // Arrange
    final String[] pathArray = {};

    // Act
    final TreeMap<String, Attribute> actual = IOUtil.loadDictionary(pathArray);

    // Assert result
    final TreeMap<String, Attribute> treeMap = new TreeMap<String, Attribute>();
    Assert.assertEquals(treeMap, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(IIOAdapter.class)
  @Test
  public void newInputStreamInputNotNullOutputNull() throws Exception, IOException {

    // Arrange
    final String path = "1a 2b 3c";

    // Act
    final InputStream actual = IOUtil.newInputStream(path);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(IIOAdapter.class)
  @Test
  public void newOutputStreamInputNotNullOutputNull() throws Exception, IOException {

    // Arrange
    final String path = "A1B2C3";

    // Act
    final OutputStream actual = IOUtil.newOutputStream(path);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readBytesFromOtherInputStreamInputNull0OutputZero() throws IOException {

    // Arrange
    final InputStream is = null;
    final byte[] targetArray = {};

    // Act
    final int actual = IOUtil.readBytesFromOtherInputStream(is, targetArray);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({IIOAdapter.class, InputStream.class})
  @Test
  public void readBytesInputNotNullOutput02() throws Exception {

    // Arrange
    final String path = "BAZ";

    // Act
    final byte[] actual = IOUtil.readBytes(path);

    // Assert result
    Assert.assertArrayEquals(new byte[] {}, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(IIOAdapter.class)
  @Test
  public void readLineListInputNotNullOutputNullPointerException() throws Exception {

    // Arrange
    final String path = "??????????????????????????????";

    // Act
    thrown.expect(NullPointerException.class);
    IOUtil.readLineList(path);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void readLineListInputNullOutput0() {

    // Arrange
    final String path = null;

    // Act
    final LinkedList<String> actual = IOUtil.readLineList(path);

    // Assert result
    final LinkedList<String> linkedList = new LinkedList<String>();
    Assert.assertEquals(linkedList, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(IIOAdapter.class)
  @Test
  public void readTxtInputNotNullNotNullOutputUnsupportedEncodingException()
      throws Exception, UnsupportedEncodingException, IOException {

    // Arrange
    final String file = "1";
    final String charsetName = "a/b/c";

    // Act
    thrown.expect(UnsupportedEncodingException.class);
    IOUtil.readTxt(file, charsetName);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(IIOAdapter.class)
  @Test
  public void readTxtInputNotNullNotNullOutputUnsupportedEncodingException2()
      throws Exception, UnsupportedEncodingException, IOException {

    // Arrange
    final String file = "BAZ";
    final String charsetName = "Bar";

    // Act
    thrown.expect(UnsupportedEncodingException.class);
    IOUtil.readTxt(file, charsetName);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest({FileInputStream.class, IIOAdapter.class})
  @Test
  public void readTxtInputNotNullOutputNotNull() throws Exception {

    // Arrange
    final String path = "????????????????????????";

    // Act
    final String actual = IOUtil.readTxt(path);

    // Assert result
    Assert.assertEquals("\u0000\u0000", actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(IIOAdapter.class)
  @Test
  public void readTxtInputNotNullOutputNullPointerException() throws Exception {

    // Arrange
    final String path = "????????????????????????";

    // Act
    thrown.expect(NullPointerException.class);
    IOUtil.readTxt(path);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(IIOAdapter.class)
  @Test
  public void readTxtInputNullNotNullOutputNotNull() throws Exception, IOException {

    // Arrange
    final String file = null;
    final String charsetName = "UTF-8";

    // Act
    final String actual = IOUtil.readTxt(file, charsetName);

    // Assert result
    Assert.assertEquals("\u0000\u0000", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void readTxtInputNullOutputNull() {

    // Arrange
    final String path = null;

    // Act
    final String actual = IOUtil.readTxt(path);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeUTF8BOMInputNotNullOutputNotNull() {

    // Arrange
    final String line = "3";

    // Act
    final String actual = IOUtil.removeUTF8BOM(line);

    // Assert result
    Assert.assertEquals("3", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void removeUTF8BOMInputNotNullOutputNotNull2() {

    // Arrange
    final String line = "\ufeff\ufefe\ufefe\ufefe\ufeff\ufeff\ufeff\ufeff";

    // Act
    final String actual = IOUtil.removeUTF8BOM(line);

    // Assert result
    Assert.assertEquals("\ufefe\ufefe\ufefe\ufeff\ufeff\ufeff\ufeff", actual);
  }
}
