/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.runtime.SmartAssertions.*;
import com.jesper.seckill.util.MD5Util;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MD5Util_SSTest extends MD5Util_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_inputPassToDbPass_0()  throws Throwable  {
      MD5Util mD5Util0 = new MD5Util();
      // Undeclared exception!
      try { 
        MD5Util.inputPassToDbPass("16", "");
      
      } catch(Throwable e) {
      }
  }
  @Test(timeout = 4000)
  public void test_main_1()  throws Throwable  {
      String[] stringArray0 = new String[1];
      MD5Util.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }}