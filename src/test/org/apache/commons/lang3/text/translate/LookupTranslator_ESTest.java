/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 26 13:22:27 GMT 2025
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.LookupTranslator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LookupTranslator_ESTest extends LookupTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CharSequence[] charSequenceArray0 = new CharSequence[12];
      charSequenceArray0[0] = (CharSequence) "42";
      CharBuffer charBuffer0 = CharBuffer.allocate(66);
      charSequenceArray0[1] = (CharSequence) charBuffer0;
      CharSequence[] charSequenceArray1 = new CharSequence[6];
      charSequenceArray1[0] = (CharSequence) charBuffer0;
      charSequenceArray1[1] = (CharSequence) charBuffer0;
      charSequenceArray1[2] = (CharSequence) charBuffer0;
      StringWriter stringWriter0 = new StringWriter(25);
      CharSequence[][] charSequenceArray2 = new CharSequence[6][0];
      charSequenceArray2[0] = charSequenceArray1;
      charSequenceArray2[1] = charSequenceArray1;
      charSequenceArray2[2] = charSequenceArray0;
      charSequenceArray2[3] = charSequenceArray0;
      charSequenceArray2[4] = charSequenceArray0;
      charSequenceArray2[5] = charSequenceArray1;
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray2);
      int int0 = lookupTranslator0.translate(charSequenceArray1[2], 25, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CharSequence[] charSequenceArray0 = new CharSequence[12];
      charSequenceArray0[0] = (CharSequence) "42";
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "42");
      charSequenceArray0[1] = (CharSequence) charBuffer0;
      CharSequence[][] charSequenceArray1 = new CharSequence[6][0];
      charSequenceArray1[0] = charSequenceArray0;
      charSequenceArray1[1] = charSequenceArray0;
      charSequenceArray1[2] = charSequenceArray0;
      charSequenceArray1[3] = charSequenceArray0;
      charSequenceArray1[4] = charSequenceArray0;
      charSequenceArray1[5] = charSequenceArray0;
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray1);
      char[] charArray0 = new char[4];
      charArray0[0] = '4';
      CharBuffer charBuffer1 = CharBuffer.wrap(charArray0);
      String string0 = lookupTranslator0.translate((CharSequence) charBuffer1);
      assertEquals("4\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CharSequence[][] charSequenceArray0 = new CharSequence[9][0];
      CharSequence[] charSequenceArray1 = new CharSequence[5];
      charSequenceArray1[0] = (CharSequence) "0";
      char[] charArray0 = new char[9];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 6, 0);
      charSequenceArray1[1] = (CharSequence) charBuffer0;
      CharBuffer charBuffer1 = CharBuffer.allocate(1909);
      charSequenceArray0[0] = charSequenceArray1;
      CharSequence[] charSequenceArray2 = new CharSequence[9];
      charSequenceArray2[0] = (CharSequence) charBuffer1;
      charSequenceArray2[1] = (CharSequence) charBuffer0;
      charSequenceArray0[1] = charSequenceArray2;
      LookupTranslator lookupTranslator0 = null;
      try {
        lookupTranslator0 = new LookupTranslator(charSequenceArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("org.apache.commons.lang3.text.translate.LookupTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CharSequence[] charSequenceArray0 = new CharSequence[12];
      charSequenceArray0[0] = (CharSequence) "42";
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "42");
      charSequenceArray0[1] = (CharSequence) charBuffer0;
      CharSequence[] charSequenceArray1 = new CharSequence[5];
      charSequenceArray1[0] = (CharSequence) "42";
      charSequenceArray1[1] = (CharSequence) charBuffer0;
      charSequenceArray1[2] = (CharSequence) charBuffer0;
      StringWriter stringWriter0 = new StringWriter();
      CharSequence[][] charSequenceArray2 = new CharSequence[6][0];
      charSequenceArray2[0] = charSequenceArray1;
      charSequenceArray2[1] = charSequenceArray0;
      charSequenceArray2[2] = charSequenceArray0;
      charSequenceArray2[3] = charSequenceArray1;
      charSequenceArray2[4] = charSequenceArray0;
      charSequenceArray2[5] = charSequenceArray1;
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray2);
      int int0 = lookupTranslator0.translate(charSequenceArray1[2], 0, (Writer) stringWriter0);
      assertEquals("42", stringWriter0.toString());
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CharSequence[][] charSequenceArray0 = new CharSequence[0][5];
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray0);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        lookupTranslator0.translate((CharSequence) stringBuffer0, 50, (Writer) stringWriter0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CharSequence[][] charSequenceArray0 = new CharSequence[0][5];
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray0);
      Writer writer0 = new java.io.StringWriter();
      // Undeclared exception!
      try { 
        lookupTranslator0.translate((CharSequence) null, 901, writer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.LookupTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CharSequence[] charSequenceArray0 = new CharSequence[12];
      charSequenceArray0[0] = (CharSequence) "42";
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "42");
      charSequenceArray0[1] = (CharSequence) charBuffer0;
      StringWriter stringWriter0 = new StringWriter();
      CharSequence[][] charSequenceArray1 = new CharSequence[6][0];
      charSequenceArray1[0] = charSequenceArray0;
      charSequenceArray1[1] = charSequenceArray0;
      charSequenceArray1[2] = charSequenceArray0;
      charSequenceArray1[3] = charSequenceArray0;
      charSequenceArray1[4] = charSequenceArray0;
      charSequenceArray1[5] = charSequenceArray0;
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray1);
      // Undeclared exception!
      try { 
        lookupTranslator0.translate(charSequenceArray0[1], (-1), (Writer) stringWriter0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CharSequence[][] charSequenceArray0 = new CharSequence[2][5];
      CharSequence[] charSequenceArray1 = new CharSequence[2];
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      charSequenceArray1[0] = (CharSequence) stringBuffer0;
      charSequenceArray1[1] = (CharSequence) "15";
      charSequenceArray0[0] = charSequenceArray1;
      LookupTranslator lookupTranslator0 = null;
      try {
        lookupTranslator0 = new LookupTranslator(charSequenceArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      CharSequence[][] charSequenceArray0 = new CharSequence[1][2];
      CharSequence[] charSequenceArray1 = new CharSequence[9];
      charSequenceArray1[0] = (CharSequence) charBuffer0;
      charSequenceArray1[1] = (CharSequence) "0";
      charSequenceArray0[0] = charSequenceArray1;
      LookupTranslator lookupTranslator0 = null;
      try {
        lookupTranslator0 = new LookupTranslator(charSequenceArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CharSequence[][] charSequenceArray0 = new CharSequence[1][5];
      LookupTranslator lookupTranslator0 = null;
      try {
        lookupTranslator0 = new LookupTranslator(charSequenceArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.LookupTranslator", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LookupTranslator lookupTranslator0 = new LookupTranslator((CharSequence[][]) null);
  }
}
