package com.hankcs.hanlp.model.crf;

import com.hankcs.hanlp.model.crf.CRFModel;
import com.hankcs.hanlp.model.crf.FeatureTemplate;
import com.hankcs.hanlp.model.crf.Table;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class CRFModelTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: CRFModel */
  // Test written by Diffblue Cover.
  @Test
  public void computeScoreInput0PositiveOutputZero() {

    // Arrange
    final LinkedList<double[]> scoreList = new LinkedList<double[]>();
    final int tag = 2;

    // Act
    final double actual = CRFModel.computeScore(scoreList, tag);

    // Assert result
    Assert.assertEquals(0.0, actual, 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void computeScoreInput1PositiveOutputZero() {

    // Arrange
    final LinkedList<double[]> scoreList = new LinkedList<double[]>();
    final double[] myDoubleArray = {0.0, 0.0, 0.0, 0.0, 0.0};
    scoreList.add(myDoubleArray);
    final int tag = 2;

    // Act
    final double actual = CRFModel.computeScore(scoreList, tag);

    // Assert result
    Assert.assertEquals(0.0, actual, 0.0);
  }

  // Test written by Diffblue Cover.

  @Test
  public void computeScoreListInputNotNullZeroOutputIndexOutOfBoundsException()
      throws InvocationTargetException {

    // Arrange
    final CRFModel objectUnderTest = new CRFModel();
    objectUnderTest.id2tag = null;
    objectUnderTest.featureFunctionTrie = null;
    objectUnderTest.matrix = null;
    objectUnderTest.tag2id = null;
    final ArrayList<FeatureTemplate> arrayList = new ArrayList<FeatureTemplate>();
    final FeatureTemplate featureTemplate = new FeatureTemplate();
    final ArrayList arrayList1 = new ArrayList();
    arrayList1.add("3");
    featureTemplate.delimiterList = arrayList1;
    featureTemplate.template = null;
    final ArrayList arrayList2 = new ArrayList();
    featureTemplate.offsetList = arrayList2;
    arrayList.add(featureTemplate);
    objectUnderTest.featureTemplateList = arrayList;
    final Table table = new Table();
    final int current = 0;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    objectUnderTest.computeScoreList(table, current);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void getTagIdInputNotNullOutputNull() throws InvocationTargetException {

    // Arrange
    final CRFModel objectUnderTest = new CRFModel();
    objectUnderTest.id2tag = null;
    objectUnderTest.featureFunctionTrie = null;
    objectUnderTest.matrix = null;
    final HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
    objectUnderTest.tag2id = hashMap;
    objectUnderTest.featureTemplateList = null;
    final String tag = "a\'b\'c";

    // Act
    final Integer actual = objectUnderTest.getTagId(tag);

    // Assert result
    Assert.assertNull(actual);
  }
}
