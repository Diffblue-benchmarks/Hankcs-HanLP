package com.hankcs.hanlp.collection.trie;

import static org.mockito.AdditionalMatchers.or;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.isA;
import static org.mockito.Matchers.isNull;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import com.diffblue.deeptestutils.mock.DTUMemberMatcher;
import com.hankcs.hanlp.collection.trie.DoubleArrayTrie;
import com.hankcs.hanlp.corpus.io.ByteArray;
import com.hankcs.hanlp.utility.ByteUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.api.mockito.expectation.PowerMockitoStubber;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.DataOutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@RunWith(PowerMockRunner.class)
public class DoubleArrayTrieTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: DoubleArrayTrie */
  // Test written by Diffblue Cover.
  @Test
  public void buildInputNotNullNullNullPositiveOutputZero() {

    // Arrange
    final DoubleArrayTrie objectUnderTest = new DoubleArrayTrie();
    final ArrayList<String> _key = new ArrayList<String>();
    final int[] _length = null;
    final int[] _value = null;
    final int _keySize = 1;

    // Act
    final int actual = objectUnderTest.build(_key, _length, _value, _keySize);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void buildInputNullNullNullZeroOutputZero() {

    // Arrange
    final DoubleArrayTrie objectUnderTest = new DoubleArrayTrie();
    final List<String> _key = null;
    final int[] _length = null;
    final int[] _value = null;
    final int _keySize = 0;

    // Act
    final int actual = objectUnderTest.build(_key, _length, _value, _keySize);

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getBaseOutputNull() {

    // Arrange
    final DoubleArrayTrie objectUnderTest = new DoubleArrayTrie();

    // Act
    final int[] actual = objectUnderTest.getBase();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCheckOutputNull() {

    // Arrange
    final DoubleArrayTrie objectUnderTest = new DoubleArrayTrie();

    // Act
    final int[] actual = objectUnderTest.getCheck();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getSizeOutputZero() {

    // Arrange
    final DoubleArrayTrie objectUnderTest = new DoubleArrayTrie();

    // Act
    final int actual = objectUnderTest.getSize();

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getTotalSizeOutputZero() {

    // Arrange
    final DoubleArrayTrie objectUnderTest = new DoubleArrayTrie();

    // Act
    final int actual = objectUnderTest.getTotalSize();

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getUnitSizeOutputPositive() {

    // Arrange
    final DoubleArrayTrie objectUnderTest = new DoubleArrayTrie();

    // Act
    final int actual = objectUnderTest.getUnitSize();

    // Assert result
    Assert.assertEquals(8, actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(ByteUtil.class)
  @Test
  public void loadInput0Zero0OutputTrue() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(ByteUtil.class);

    // Arrange
    final DoubleArrayTrie objectUnderTest = new DoubleArrayTrie();
    final byte[] bytes = {};
    final int offset = 0;
    final Object[] value = {};
    final Method bytesHighFirstToIntMethod =
        DTUMemberMatcher.method(ByteUtil.class, "bytesHighFirstToInt", byte[].class, int.class);
    ((PowerMockitoStubber)PowerMockito.doReturn(1).doReturn(0).doReturn(0))
        .when(ByteUtil.class, bytesHighFirstToIntMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)), anyInt());

    // Act
    final boolean actual = objectUnderTest.load(bytes, offset, value);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @PrepareForTest(ByteUtil.class)
  @Test
  public void loadInput0ZeroNullOutputTrue() throws Exception {

    // Setup mocks
    PowerMockito.mockStatic(ByteUtil.class);

    // Arrange
    final DoubleArrayTrie objectUnderTest = new DoubleArrayTrie();
    final byte[] bytes = {};
    final int offset = 0;
    final Object[] value = null;
    final Method bytesHighFirstToIntMethod =
        DTUMemberMatcher.method(ByteUtil.class, "bytesHighFirstToInt", byte[].class, int.class);
    PowerMockito.doReturn(0)
        .when(ByteUtil.class, bytesHighFirstToIntMethod)
        .withArguments(or(isA(byte[].class), isNull(byte[].class)), anyInt());

    // Act
    final boolean actual = objectUnderTest.load(bytes, offset, value);

    // Assert result
    Assert.assertTrue(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void loadInputNullNullOutputFalse() {

    // Arrange
    final DoubleArrayTrie objectUnderTest = new DoubleArrayTrie();
    final ByteArray byteArray = null;
    final Object[] value = null;

    // Act
    final boolean actual = objectUnderTest.load(byteArray, value);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void loadInputNullZeroNullOutputFalse() {

    // Arrange
    final DoubleArrayTrie objectUnderTest = new DoubleArrayTrie();
    final byte[] bytes = null;
    final int offset = 0;
    final Object[] value = null;

    // Act
    final boolean actual = objectUnderTest.load(bytes, offset, value);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void outputInputNegativeOutputNull() {

    // Arrange
    final DoubleArrayTrie objectUnderTest = new DoubleArrayTrie();
    final int state = -2_147_483_648;

    // Act
    final Object actual = objectUnderTest.output(state);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void saveInputNullOutputFalse() {

    // Arrange
    final DoubleArrayTrie objectUnderTest = new DoubleArrayTrie();
    final DataOutputStream out = null;

    // Act
    final boolean actual = objectUnderTest.save(out);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void toStringOutputNotNull() {

    // Arrange
    final DoubleArrayTrie objectUnderTest = new DoubleArrayTrie();

    // Act
    final String actual = objectUnderTest.toString();

    // Assert result
    Assert.assertEquals(
        "DoubleArrayTrie{size=0, allocSize=0, key=null, keySize=0, progress=0, nextCheckPos=0, error_=0}",
        actual);
  }
}
