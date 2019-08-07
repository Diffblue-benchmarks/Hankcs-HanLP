package com.hankcs.hanlp.model.perceptron.tagset;

import com.hankcs.hanlp.model.perceptron.tagset.TagSet;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;

public class TagSetTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: TagSet */
  // Test written by Diffblue Cover.
  @Test
  public void allTagsOutputNull() {

    // Arrange
    final TagSet objectUnderTest = new TagSet(null);

    // Act
    final int[] actual = objectUnderTest.allTags();

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void bosIdOutputZero() {

    // Arrange
    final TagSet objectUnderTest = new TagSet(null);

    // Act
    final int actual = objectUnderTest.bosId();

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void containsInputNotNullOutputFalse() {

    // Arrange
    final TagSet objectUnderTest = new TagSet(null);
    final String tag = "3";

    // Act
    final boolean actual = objectUnderTest.contains(tag);

    // Assert result
    Assert.assertFalse(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void idOfInputNotNullOutputNegative() {

    // Arrange
    final TagSet objectUnderTest = new TagSet(null);
    final String string = "3";

    // Act
    final int actual = objectUnderTest.idOf(string);

    // Assert result
    Assert.assertEquals(-1, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void sizeIncludingBosOutputPositive() {

    // Arrange
    final TagSet objectUnderTest = new TagSet(null);

    // Act
    final int actual = objectUnderTest.sizeIncludingBos();

    // Assert result
    Assert.assertEquals(1, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void sizeOutputZero() {

    // Arrange
    final TagSet objectUnderTest = new TagSet(null);

    // Act
    final int actual = objectUnderTest.size();

    // Assert result
    Assert.assertEquals(0, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void stringOfInputPositiveOutputIndexOutOfBoundsException() {

    // Arrange
    final TagSet objectUnderTest = new TagSet(null);
    final int id = 1;

    // Act
    thrown.expect(IndexOutOfBoundsException.class);
    objectUnderTest.stringOf(id);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void tagsOutput0() {

    // Arrange
    final TagSet objectUnderTest = new TagSet(null);

    // Act
    final Collection<String> actual = objectUnderTest.tags();

    // Assert result
    final ArrayList<String> arrayList = new ArrayList<String>();
    Assert.assertEquals(arrayList, actual);
  }
}
