package com.hankcs.hanlp.dictionary.py;

import com.hankcs.hanlp.dictionary.py.Pinyin;
import com.hankcs.hanlp.dictionary.py.PinyinUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class PinyinUtilTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: PinyinUtil */
  // Test written by Diffblue Cover.

  @Test
  public void convertList2ArrayInput1Output1() {

    // Arrange
    final ArrayList<Pinyin> pinyinList = new ArrayList<Pinyin>();
    pinyinList.add(null);

    // Act
    final Pinyin[] actual = PinyinUtil.convertList2Array(pinyinList);

    // Assert result
    Assert.assertArrayEquals(new Pinyin[] {null}, actual);
  }

  // Test written by Diffblue Cover.

  @Test
  public void convertPinyinList2TonePinyinListInput0Output0() {

    // Arrange
    final ArrayList<Pinyin> pinyinList = new ArrayList<Pinyin>();

    // Act
    final List<String> actual = PinyinUtil.convertPinyinList2TonePinyinList(pinyinList);

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void convertToneNumber2ToneMarkInputNullOutputNullPointerException() {

    // Arrange
    final String pinyinStr = null;

    // Act
    thrown.expect(NullPointerException.class);
    PinyinUtil.convertToneNumber2ToneMark(pinyinStr);

    // Method is not expected to return due to exception thrown
  }
}
