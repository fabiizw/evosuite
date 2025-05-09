/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 26 13:19:37 GMT 2025
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NumericEntityEscaper_ESTest extends NumericEntityEscaper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(0, 0);
      StringWriter stringWriter0 = new StringWriter();
      boolean boolean0 = numericEntityEscaper0.translate(0, (Writer) stringWriter0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter(1);
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below(1);
      boolean boolean0 = numericEntityEscaper0.translate(1, (Writer) stringWriter0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(68, 68);
      StringWriter stringWriter0 = new StringWriter(0);
      boolean boolean0 = numericEntityEscaper0.translate(68, (Writer) stringWriter0);
      assertEquals("&#68;", stringWriter0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      StringWriter stringWriter0 = new StringWriter(0);
      boolean boolean0 = numericEntityEscaper0.translate(0, (Writer) stringWriter0);
      assertEquals("&#0;", stringWriter0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(1, 0);
      assertNotNull(numericEntityEscaper0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = new NumericEntityEscaper();
      // Undeclared exception!
      try { 
        numericEntityEscaper0.translate(19, (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.NumericEntityEscaper", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.outsideOf(3321, 56);
      StringWriter stringWriter0 = new StringWriter(3321);
      boolean boolean0 = numericEntityEscaper0.translate(56, (Writer) stringWriter0);
      assertEquals("&#56;", stringWriter0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(278, 278);
      Writer writer0 = new StringWriter();
      boolean boolean0 = numericEntityEscaper0.translate(11, writer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.below(0);
      StringWriter stringWriter0 = new StringWriter(1);
      boolean boolean0 = numericEntityEscaper0.translate(1, (Writer) stringWriter0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(1);
      String string0 = numericEntityEscaper0.translate((CharSequence) "1");
      assertEquals("&#49;", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.between(0, 0);
      StringWriter stringWriter0 = new StringWriter(1);
      boolean boolean0 = numericEntityEscaper0.translate(1, (Writer) stringWriter0);
      assertFalse(boolean0);
  }
}
