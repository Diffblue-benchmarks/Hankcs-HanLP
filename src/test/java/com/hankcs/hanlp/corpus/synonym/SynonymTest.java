package com.hankcs.hanlp.corpus.synonym;

import com.hankcs.hanlp.corpus.synonym.Synonym.Type;
import com.hankcs.hanlp.corpus.synonym.Synonym;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class SynonymTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: Synonym */
  // Test written by Diffblue Cover.

  @Test
  public void constructorInputNotNullNotNullOutputStringIndexOutOfBoundsException() {

    // Arrange
    final String realWord = "3";
    final String idString = "foo";

    // Act, creating object to test constructor
    thrown.expect(StringIndexOutOfBoundsException.class);
    final Synonym objectUnderTest = new Synonym(realWord, idString);
  }

  // Test written by Diffblue Cover.

  @Test
  public void constructorInputNotNullNotNullOutputVoid() {

    // Arrange
    final String realWord = "3";
    final String idString = "1a 2b 3c";

    // Act, creating object to test constructor
    final Synonym objectUnderTest = new Synonym(realWord, idString);

    // Assert side effects
    Assert.assertEquals("3", objectUnderTest.getRealWord());
    Assert.assertEquals(-108_567_657L, objectUnderTest.getId());
  }

  // Test written by Diffblue Cover.

  @Test
  public void constructorInputNotNullZeroNotNullOutputVoid() {

    // Arrange
    final String realWord = "1a 2b 3c";
    final long id = 0L;
    final Synonym.Type type = Synonym.Type.SINGLE;

    // Act, creating object to test constructor
    final Synonym objectUnderTest = new Synonym(realWord, id, type);

    // Assert side effects
    Assert.assertEquals(Synonym.Type.SINGLE, objectUnderTest.type);
    Assert.assertEquals("1a 2b 3c", objectUnderTest.getRealWord());
  }

  // Test written by Diffblue Cover.

  @Test
  public void constructorInputNotNullZeroOutputVoid() {

    // Arrange
    final String realWord = ",";
    final long id = 0L;

    // Act, creating object to test constructor
    final Synonym objectUnderTest = new Synonym(realWord, id);

    // Assert side effects
    Assert.assertEquals("2", objectUnderTest.getRealWord());
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInput0OutputIllegalArgumentException() {

    // Arrange
    final String[] args = {};

    // Act
    thrown.expect(IllegalArgumentException.class);
    Synonym.create(args);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.

  @Test
  public void createInput1Output0() {

    // Arrange
    final String[] args = {"1a 2b 3c"};

    // Act
    final ArrayList<Synonym> actual = Synonym.create(args);

    // Assert result
    final ArrayList<Synonym> arrayList = new ArrayList<Synonym>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInput1Output02() {

    // Arrange
    final String[] args = {"\u5360\u1a25\u0010(\u0080\ua53d\uf03b#######"};

    // Act
    final ArrayList<Synonym> actual = Synonym.create(args);

    // Assert result
    final ArrayList<Synonym> arrayList = new ArrayList<Synonym>();
    Assert.assertEquals(arrayList, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInput2Output1() {

    // Arrange
    final String[] args = {
        "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000",
        "\u0001"};

    // Act
    final ArrayList<Synonym> actual = Synonym.create(args);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.size());
    Assert.assertNotNull(actual.get(0));
    Assert.assertEquals(Synonym.Type.SINGLE, actual.get(0).type);
    Assert.assertEquals("\u0001", actual.get(0).realWord);
    Assert.assertEquals(-458_492_165_883L, actual.get(0).id);
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInput2Output12() {

    // Arrange
    final String[] args = {"\u5360\u1a25\u0010(\u0080\ua53d\uf03b=======", "\u42cd"};

    // Act
    final ArrayList<Synonym> actual = Synonym.create(args);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.size());
    Assert.assertNotNull(actual.get(0));
    Assert.assertEquals(Synonym.Type.EQUAL, actual.get(0).type);
    Assert.assertEquals("\u42cd", actual.get(0).realWord);
    Assert.assertEquals(145_415_076_843_519L, actual.get(0).id);
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInput2Output13() {

    // Arrange
    final String[] args = {
        "\u5360\u1a25\u0010(\u0080\ua53d\uf03b#######",
        "\u42cd\u1a69\u0010b\u0084\ua535\uf0b3\u00a4\u00a4\u00a4\u00a4\u00a4\u00a4\u00a4"};

    // Act
    final ArrayList<Synonym> actual = Synonym.create(args);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.size());
    Assert.assertNotNull(actual.get(0));
    Assert.assertEquals(Synonym.Type.LIKE, actual.get(0).type);
    Assert.assertEquals(
        "\u42cd\u1a69\u0010b\u0084\ua535\uf0b3\u00a4\u00a4\u00a4\u00a4\u00a4\u00a4\u00a4",
        actual.get(0).realWord);
    Assert.assertEquals(145_415_076_843_520L, actual.get(0).id);
  }

  // Test written by Diffblue Cover.

  @Test
  public void createInputNotNullOutput1() {

    // Arrange
    final String param =
        "\u4330\ueffa\ue7ec\uc699\uedcf\u001e%\u0780\u0780\u0780\u0780\u0780\u0780\u0780\u0780\u0780\u0780 \u00a0\uefbe\u60a0\ucfaa ";

    // Act
    final List<Synonym> actual = Synonym.create(param);

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals(1, actual.size());
    Assert.assertNotNull(actual.get(0));
    Assert.assertEquals(Synonym.Type.SINGLE, actual.get(0).type);
    Assert.assertEquals("\u00a0\uefbe\u60a0\ucfaa", actual.get(0).realWord);
    Assert.assertEquals(116_164_636_907_175L, actual.get(0).id);
  }

  // Test written by Diffblue Cover.

  @Test
  public void createInputNotNullOutputStringIndexOutOfBoundsException() {

    // Arrange
    final String param = "1234";

    // Act
    thrown.expect(StringIndexOutOfBoundsException.class);
    Synonym.create(param);

    // Method is not expected to return due to exception thrown
  }

  // Test written by Diffblue Cover.
  @Test
  public void createInputNullOutputNull() {

    // Arrange
    final String param = null;

    // Act
    final List<Synonym> actual = Synonym.create(param);

    // Assert result
    Assert.assertNull(actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void distanceInputNotNullOutputZero() {

    // Arrange
    final Synonym objectUnderTest = new Synonym("A1B2C3", 0L);
    final Synonym other = new Synonym(",", 0L);

    // Act
    final long actual = objectUnderTest.distance(other);

    // Assert result
    Assert.assertEquals(0L, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIdOutputZero() {

    // Arrange
    final Synonym objectUnderTest = new Synonym("A1B2C3", 0L);

    // Act
    final long actual = objectUnderTest.getId();

    // Assert result
    Assert.assertEquals(0L, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void valueOfInputNullOutputNullPointerException() {

    // Arrange
    final String name = null;

    // Act
    thrown.expect(NullPointerException.class);
    Synonym.Type.valueOf(name);

    // Method is not expected to return due to exception thrown
  }
}
