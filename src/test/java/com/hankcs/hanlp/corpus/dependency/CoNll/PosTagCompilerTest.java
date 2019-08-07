package com.hankcs.hanlp.corpus.dependency.CoNll;

import com.hankcs.hanlp.corpus.dependency.CoNll.PosTagCompiler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class PosTagCompilerTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: PosTagCompiler */
  // Test written by Diffblue Cover.
  @Test
  public void compileInputNotNullNotNullOutputNotNull() {

    // Arrange
    final String tag = "/";
    final String name = "1234";

    // Act
    final String actual = PosTagCompiler.compile(tag, name);

    // Assert result
    Assert.assertEquals("1234", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void compileInputNotNullNotNullOutputNotNull2() {

    // Arrange
    final String tag = "t";
    final String name = "?";

    // Act
    final String actual = PosTagCompiler.compile(tag, name);

    // Assert result
    Assert.assertEquals("\u672a##\u65f6", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void compileInputNotNullNotNullOutputNotNull3() {

    // Arrange
    final String tag = "m";
    final String name = "?";

    // Act
    final String actual = PosTagCompiler.compile(tag, name);

    // Assert result
    Assert.assertEquals("\u672a##\u6570", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void compileInputNotNullNotNullOutputNotNull4() {

    // Arrange
    final String tag = "x";
    final String name = "?";

    // Act
    final String actual = PosTagCompiler.compile(tag, name);

    // Assert result
    Assert.assertEquals("\u672a##\u4e32", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void compileInputNotNullNotNullOutputNotNull5() {

    // Arrange
    final String tag = "nrn";
    final String name = "?";

    // Act
    final String actual = PosTagCompiler.compile(tag, name);

    // Assert result
    Assert.assertEquals("\u672a##\u4eba", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void compileInputNotNullNotNullOutputNotNull6() {

    // Arrange
    final String tag = "xx";
    final String name = "?";

    // Act
    final String actual = PosTagCompiler.compile(tag, name);

    // Assert result
    Assert.assertEquals("\u672a##\u5b83", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void compileInputNotNullNotNullOutputNotNull7() {

    // Arrange
    final String tag = "nx";
    final String name = "?";

    // Act
    final String actual = PosTagCompiler.compile(tag, name);

    // Assert result
    Assert.assertEquals("\u672a##\u4e13", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void compileInputNotNullNotNullOutputNotNull8() {

    // Arrange
    final String tag = "ns";
    final String name = "?";

    // Act
    final String actual = PosTagCompiler.compile(tag, name);

    // Assert result
    Assert.assertEquals("\u672a##\u5730", actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void compileInputNotNullNotNullOutputNotNull9() {

    // Arrange
    final String tag = "nt";
    final String name = "?";

    // Act
    final String actual = PosTagCompiler.compile(tag, name);

    // Assert result
    Assert.assertEquals("\u672a##\u56e2", actual);
  }
}
