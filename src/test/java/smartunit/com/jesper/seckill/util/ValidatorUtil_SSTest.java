/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.jesper.seckill.util.ValidatorUtil;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ValidatorUtil_SSTest extends ValidatorUtil_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_isMobile_0()  throws Throwable  {
      //caseID:90cef9ec420c7b9231657e52c969c9f8
      ValidatorUtil validatorUtil0 = new ValidatorUtil();
      boolean boolean0 = ValidatorUtil.isMobile("");
      assertFalse(boolean0);
  }
  @Test(timeout = 4000)
  public void test_isMobile_1()  throws Throwable  {
      //caseID:6baab95a239c29dcd75f30bb5bbda54c
      ValidatorUtil validatorUtil0 = new ValidatorUtil();
      boolean boolean0 = ValidatorUtil.isMobile("1");
      assertFalse(boolean0);
  }}