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
      //caseID:d78b86e2fdeff9afcd881ecdf61a3e2a
      UserUtil userUtil0 = new UserUtil();
      String[] stringArray0 = new String[0];
      try { 
        UserUtil.main(stringArray0);
      } catch(Throwable e) {
      }
  }}
