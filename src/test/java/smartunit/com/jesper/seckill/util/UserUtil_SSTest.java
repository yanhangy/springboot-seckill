/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.runtime.SmartAssertions.*;
import com.jesper.seckill.util.UserUtil;
import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class UserUtil_SSTest extends UserUtil_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_main_0()  throws Throwable  {
      //caseID:f64d0d4d3a0d20ba2c5e12bc9ce40992
      UserUtil userUtil0 = new UserUtil();
      String[] stringArray0 = new String[3];
      try { 
        UserUtil.main(stringArray0);
      } catch(Throwable e) {
      }
  }}
