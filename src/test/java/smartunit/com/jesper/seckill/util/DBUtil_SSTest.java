/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.runtime.SmartAssertions.*;
import com.jesper.seckill.util.DBUtil;
import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DBUtil_SSTest extends DBUtil_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_getConn_0()  throws Throwable  {
      //caseID:e493317acb2b19d4aa6db06e4fe63c1f
      DBUtil dBUtil0 = new DBUtil();
      try { 
        DBUtil.getConn();
      } catch(Throwable e) {
      }
  }}
