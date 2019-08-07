package com.hankcs.hanlp.collection.trie.datrie;

import com.hankcs.hanlp.collection.trie.datrie.CharacterMapping;
import com.hankcs.hanlp.collection.trie.datrie.MutableDoubleArrayTrieInteger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.lang.reflect.Array;
import java.lang.reflect.Method;

public class MutableDoubleArrayTrieIntegerTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  /* testedClasses: MutableDoubleArrayTrieInteger */
  // Test written by Diffblue Cover.

  @Test
  public void constructorInputNullOutputNullPointerException() {

    // Arrange
    final CharacterMapping charMap = null;

    // Act, creating object to test constructor
    thrown.expect(NullPointerException.class);
    final MutableDoubleArrayTrieInteger objectUnderTest =
        new MutableDoubleArrayTrieInteger(charMap);

    // Method is not expected to return due to exception thrown
  }
}
