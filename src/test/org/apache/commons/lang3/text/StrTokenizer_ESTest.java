/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 26 16:06:24 GMT 2025
 */

package org.apache.commons.lang3.text;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import org.apache.commons.lang3.text.StrMatcher;
import org.apache.commons.lang3.text.StrTokenizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StrTokenizer_ESTest extends StrTokenizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn("set() is unsupported").when(strMatcher0).toString();
      doReturn(383).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrTokenizer strTokenizer0 = new StrTokenizer("set() is unsupported", strMatcher0, strMatcher0);
      // Undeclared exception!
      try { 
        strTokenizer0.next();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance();
      char[] charArray0 = new char[6];
      List<String> list0 = strTokenizer0.tokenize(charArray0, 1, (-1));
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn("set() is unsupported", "Invalid length: ", "NO'Hgt?", "set() is unsupported", "+;Q&z:i").when(strMatcher0).toString();
      doReturn((-920), (-920), (-920), (-920), (-920)).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrTokenizer strTokenizer0 = new StrTokenizer("set() is unsupported", strMatcher0, strMatcher0);
      String string0 = strTokenizer0.next();
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertEquals("set() is unsupported", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("", 'b', '\u0085');
      char[] charArray0 = new char[8];
      charArray0[0] = 'b';
      charArray0[1] = '\u0085';
      charArray0[4] = '\u0085';
      charArray0[5] = '\u0085';
      StrTokenizer strTokenizer1 = strTokenizer0.reset(charArray0);
      // Undeclared exception!
      try { 
        strTokenizer1.previous();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.StrTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("", 'b', 'z');
      char[] charArray0 = new char[3];
      charArray0[0] = 'b';
      charArray0[1] = 'z';
      charArray0[2] = 'z';
      strTokenizer0.reset(charArray0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      strTokenizer0.forEachRemaining(consumer0);
      assertEquals(0, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn("maxWith cannot be negative", (String) null, (String) null, (String) null, (String) null).when(strMatcher0).toString();
      doReturn(9, 0, 0, 0, 0).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrTokenizer strTokenizer0 = new StrTokenizer("set() is unsupported", strMatcher0, strMatcher0);
      strTokenizer0.next();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("wnh;&SA(2en >elw");
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      strTokenizer0.forEachRemaining(consumer0);
      strTokenizer0.previous();
      assertEquals(1, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer((String) null, "!s&");
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[6];
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      StrMatcher strMatcher1 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, strMatcher0, strMatcher1);
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[4];
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, strMatcher0);
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      StrTokenizer strTokenizer0 = new StrTokenizer("length must be valid", strMatcher0);
      char[] charArray0 = new char[1];
      strTokenizer0.tokenize(charArray0, 1, 1);
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer();
      char[] charArray0 = new char[2];
      List<String> list0 = strTokenizer0.tokenize(charArray0, 0, 2);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("_#px>", '#');
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      strTokenizer0.forEachRemaining(consumer0);
      strTokenizer0.setQuoteChar('|');
      assertEquals(2, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      char[] charArray0 = new char[4];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      strTokenizer0.nextToken();
      strTokenizer0.setQuoteChar('|');
      assertEquals(1, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("Q");
      strTokenizer0.setEmptyTokenAsNull(true);
      StrTokenizer strTokenizer1 = strTokenizer0.setQuoteChar('C');
      assertTrue(strTokenizer1.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[4];
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0);
      strTokenizer0.next();
      strTokenizer0.setIgnoredChar('d');
      assertEquals(1, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("_#px>", '#');
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      strTokenizer0.forEachRemaining(consumer0);
      strTokenizer0.setIgnoredChar('r');
      assertEquals(2, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("The type must not be null");
      strTokenizer0.setEmptyTokenAsNull(true);
      strTokenizer0.setIgnoredChar('$');
      assertTrue(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("*0pj[W,", 'b', 'n');
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      strTokenizer0.forEachRemaining(consumer0);
      strTokenizer0.setIgnoreEmptyTokens(true);
      assertEquals(1, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("Q");
      strTokenizer0.setEmptyTokenAsNull(true);
      StrTokenizer strTokenizer1 = strTokenizer0.setIgnoreEmptyTokens(false);
      assertFalse(strTokenizer1.isIgnoreEmptyTokens());
      assertTrue(strTokenizer1.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      char[] charArray0 = new char[6];
      charArray0[4] = '6';
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, '6', 'c');
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      strTokenizer0.forEachRemaining(consumer0);
      strTokenizer0.setEmptyTokenAsNull(false);
      assertEquals(1, strTokenizer0.previousIndex());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(strMatcher0).toString();
      doReturn(0, 0, 0, 0, 0).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrTokenizer strTokenizer0 = new StrTokenizer("'ap1=", strMatcher0, strMatcher0);
      strTokenizer0.next();
      strTokenizer0.setEmptyTokenAsNull(false);
      assertEquals(0, strTokenizer0.previousIndex());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance();
      StrTokenizer strTokenizer1 = strTokenizer0.setDelimiterString("Y<hLM");
      StrTokenizer strTokenizer2 = strTokenizer1.reset("Y<hLM");
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      strTokenizer1.forEachRemaining(consumer0);
      strTokenizer2.setDelimiterString("T)H1h`~+9Fl");
      assertEquals(1, strTokenizer2.previousIndex());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("Q");
      strTokenizer0.nextToken();
      strTokenizer0.setDelimiterString("Q");
      assertEquals(0, strTokenizer0.previousIndex());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char[] charArray0 = new char[3];
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, 'W');
      StrTokenizer strTokenizer1 = strTokenizer0.setEmptyTokenAsNull(true);
      strTokenizer1.setDelimiterString("[2!}_");
      assertTrue(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("J~$?HaR0E$>{;+)2JU", 'R');
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      strTokenizer0.forEachRemaining(consumer0);
      strTokenizer0.setDelimiterChar('R');
      assertEquals(2, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("J~$?HaR0E$>{;+)2JU", 'R');
      strTokenizer0.next();
      strTokenizer0.setDelimiterChar('R');
      assertEquals(0, strTokenizer0.previousIndex());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance((String) null);
      strTokenizer0.setEmptyTokenAsNull(true);
      StrTokenizer strTokenizer1 = strTokenizer0.setDelimiterChar('X');
      assertTrue(strTokenizer1.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      char[] charArray0 = new char[6];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      StrTokenizer strTokenizer1 = strTokenizer0.setEmptyTokenAsNull(true);
      StrTokenizer strTokenizer2 = strTokenizer1.reset(charArray0);
      assertTrue(strTokenizer2.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("");
      StrTokenizer strTokenizer1 = strTokenizer0.reset("', is neither of type Map.Entry nor an Array");
      int int0 = strTokenizer1.size();
      assertEquals(9, int0);
      assertTrue(strTokenizer1.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      StrTokenizer strTokenizer0 = new StrTokenizer("length must be valid", strMatcher0);
      StrTokenizer strTokenizer1 = strTokenizer0.reset();
      assertTrue(strTokenizer1.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance((String) null);
      StrTokenizer strTokenizer1 = strTokenizer0.setEmptyTokenAsNull(true);
      StrTokenizer strTokenizer2 = strTokenizer1.reset();
      assertTrue(strTokenizer2.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer("wnh;&SA(2en >elw");
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      strTokenizer0.forEachRemaining(consumer0);
      strTokenizer0.previousToken();
      assertEquals(0, strTokenizer0.previousIndex());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance();
      char[] charArray0 = new char[1];
      StrTokenizer strTokenizer1 = strTokenizer0.reset(charArray0);
      assertEquals(0, strTokenizer1.nextIndex());
      
      strTokenizer0.next();
      int int0 = strTokenizer0.previousIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      char[] charArray0 = new char[5];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      strTokenizer0.setEmptyTokenAsNull(true);
      strTokenizer0.nextToken();
      String string0 = strTokenizer0.previous();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(strMatcher0).toString();
      doReturn(0, 0, 0, 0, 0).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrTokenizer strTokenizer0 = new StrTokenizer("length must be valid", strMatcher0);
      strTokenizer0.nextToken();
      int int0 = strTokenizer0.nextIndex();
      assertEquals(0, strTokenizer0.previousIndex());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      char[] charArray0 = new char[9];
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance(charArray0);
      strTokenizer0.setEmptyTokenAsNull(true);
      strTokenizer0.next();
      assertEquals(0, strTokenizer0.previousIndex());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance((String) null);
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
      
      strTokenizer0.setEmptyTokenAsNull(true);
      boolean boolean0 = strTokenizer0.isEmptyTokenAsNull();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance("wnh;&SA(2en >elw");
      List<String> list0 = strTokenizer0.getTokenList();
      assertEquals(1, list0.size());
      assertTrue(list0.contains("wnh;&SA(2en >elw"));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      StrMatcher strMatcher1 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      StrTokenizer strTokenizer0 = new StrTokenizer("", strMatcher0, strMatcher1);
      strTokenizer0.getContent();
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      char[] charArray0 = new char[4];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      // Undeclared exception!
      try { 
        strTokenizer0.tokenize(charArray0, 1, 28);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance();
      strTokenizer0.reset("5?g");
      String[] stringArray0 = strTokenizer0.getTokenArray();
      assertEquals(0, strTokenizer0.nextIndex());
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance((String) null);
      StrTokenizer strTokenizer1 = strTokenizer0.reset((String) null);
      assertEquals((-1), strTokenizer1.previousIndex());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(strMatcher0).toString();
      doReturn(0, 0, 0, 0, 0).when(strMatcher0).isMatch(any(char[].class) , anyInt() , anyInt() , anyInt());
      StrTokenizer strTokenizer0 = new StrTokenizer("set() is unsupported", strMatcher0, strMatcher0);
      strTokenizer0.next();
      boolean boolean0 = strTokenizer0.hasPrevious();
      assertEquals(0, strTokenizer0.previousIndex());
      assertTrue(boolean0);
  }

  @Ignore
  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance();
      boolean boolean0 = strTokenizer0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      StrTokenizer strTokenizer0 = new StrTokenizer("set() is unsupported", strMatcher0, strMatcher0);
      strTokenizer0.isEmptyTokenAsNull();
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer((char[]) null, "'\"");
      StrTokenizer strTokenizer1 = strTokenizer0.setQuoteChar('-');
      assertTrue(strTokenizer1.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance();
      StrTokenizer strTokenizer1 = (StrTokenizer)strTokenizer0.clone();
      assertNotSame(strTokenizer1, strTokenizer0);
      assertEquals((-1), strTokenizer1.previousIndex());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      StrMatcher strMatcher0 = mock(StrMatcher.class, new ViolatedAssumptionAnswer());
      StrTokenizer strTokenizer0 = new StrTokenizer("R5:Z:6g*1dmEmN", strMatcher0);
      boolean boolean0 = strTokenizer0.isIgnoreEmptyTokens();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer();
      String string0 = strTokenizer0.toString();
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertEquals("StrTokenizer[not tokenized yet]", string0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer();
      strTokenizer0.previousToken();
      String string0 = strTokenizer0.toString();
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertEquals("StrTokenizer[]", string0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer((String) null, (StrMatcher) null);
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance((String) null);
      assertFalse(strTokenizer0.isEmptyTokenAsNull());
      
      StrTokenizer strTokenizer1 = strTokenizer0.setEmptyTokenAsNull(true);
      strTokenizer1.reset("F\fG06,");
      assertTrue(strTokenizer0.isEmptyTokenAsNull());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance("S!o<&YW33> ");
      boolean boolean0 = strTokenizer0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("aGAP`eh[fDk3[");
      StrTokenizer strTokenizer1 = strTokenizer0.setIgnoredChar('e');
      boolean boolean0 = strTokenizer1.hasPrevious();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      char[] charArray0 = new char[8];
      charArray0[2] = 'R';
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, 'M', '\u0000');
      boolean boolean0 = strTokenizer0.hasNext();
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      char[] charArray0 = new char[2];
      charArray0[0] = '\u0082';
      StrTokenizer strTokenizer0 = new StrTokenizer(charArray0, 'R', '\u0082');
      strTokenizer0.setIgnoredChar('\u0082');
      boolean boolean0 = strTokenizer0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      char[] charArray0 = new char[2];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      strTokenizer0.nextToken();
      String string0 = strTokenizer0.previous();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer();
      strTokenizer0.nextToken();
      assertTrue(strTokenizer0.isIgnoreEmptyTokens());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance("\"G6f>%\"Y-,GVMh&");
      boolean boolean0 = strTokenizer0.hasPrevious();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      char[] charArray0 = new char[10];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      strTokenizer0.nextToken();
      assertEquals(1, strTokenizer0.nextIndex());
      
      strTokenizer0.previousToken();
      assertEquals((-1), strTokenizer0.previousIndex());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance();
      strTokenizer0.getContent();
      assertEquals((-1), strTokenizer0.previousIndex());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      char[] charArray0 = new char[1];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      String string0 = strTokenizer0.getContent();
      assertNotNull(string0);
      assertEquals((-1), strTokenizer0.previousIndex());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(" \t\n\r\f");
      StrTokenizer strTokenizer1 = (StrTokenizer)strTokenizer0.cloneReset();
      assertEquals((-1), strTokenizer1.previousIndex());
      assertNotSame(strTokenizer1, strTokenizer0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance();
      int int0 = strTokenizer0.size();
      assertEquals(0, int0);
      assertEquals((-1), strTokenizer0.previousIndex());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance();
      String[] stringArray0 = strTokenizer0.getTokenArray();
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance();
      // Undeclared exception!
      try { 
        strTokenizer0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // remove() is unsupported
         //
         verifyException("org.apache.commons.lang3.text.StrTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance();
      List<String> list0 = strTokenizer0.getTokenList();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance();
      int int0 = strTokenizer0.previousIndex();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer();
      // Undeclared exception!
      try { 
        strTokenizer0.set("{miCDSt(");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // set() is unsupported
         //
         verifyException("org.apache.commons.lang3.text.StrTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getCSVInstance();
      int int0 = strTokenizer0.nextIndex();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      StrTokenizer strTokenizer0 = new StrTokenizer();
      // Undeclared exception!
      try { 
        strTokenizer0.add("StrTokenizer");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // add() is unsupported
         //
         verifyException("org.apache.commons.lang3.text.StrTokenizer", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      char[] charArray0 = new char[5];
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(charArray0);
      strTokenizer0.isIgnoreEmptyTokens();
      assertEquals(0, strTokenizer0.nextIndex());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      StrTokenizer strTokenizer0 = StrTokenizer.getTSVInstance(" \t\n\r\f");
      boolean boolean0 = strTokenizer0.hasNext();
      assertTrue(boolean0);
      assertEquals(0, strTokenizer0.nextIndex());
  }
}
