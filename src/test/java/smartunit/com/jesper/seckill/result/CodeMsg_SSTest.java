/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.result;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.jesper.seckill.result.CodeMsg;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CodeMsg_SSTest extends CodeMsg_SSTest_scaffolding {
// allCoveredLines:[34, 35, 36, 37, 40, 44, 45, 48, 52, 53, 61, 62, 63, 68]

  @Test(timeout = 4000)
  public void test_getCode_0()  throws Throwable  {
      //caseID:dd62eed375bbee45ff8bdaebc09b0dd2
      //CoveredLines: [40]
      //Assert: assertEquals(500211, method_result);
      
      CodeMsg codeMsg0 = CodeMsg.PASSWORD_EMPTY;
      
      //Call method: getCode
      int int0 = codeMsg0.getCode();
      
      //Test Result Assert
      assertEquals(500211, int0);
  }

  @Test(timeout = 4000)
  public void test_getMsg_1()  throws Throwable  {
      //caseID:5be637feba5e92a9051cf3cc1ba24380
      //CoveredLines: [34, 35, 36, 37, 48, 61, 62, 63]
      //Assert: assertEquals(500213, codeMsg1.getCode());
      
      CodeMsg codeMsg0 = CodeMsg.MOBILE_ERROR;
      Object[] objectArray0 = new Object[5];
      CodeMsg codeMsg1 = codeMsg0.fillArgs(objectArray0);
      
      //Call method: getMsg
      codeMsg1.getMsg();
      
      //Test Result Assert
      assertEquals(500213, codeMsg1.getCode());
  }

  @Test(timeout = 4000)
  public void test_setCode_2()  throws Throwable  {
      //caseID:738b858cefccdbbe7e64f7accde2ae1e
      //CoveredLines: [44, 45]
      //Input_0_int: 
      
      CodeMsg codeMsg0 = CodeMsg.BIND_ERROR;
      
      //Call method: setCode
      codeMsg0.setCode((-1));
      
      //Test Result Assert
      assertEquals((-1), codeMsg0.getCode());
  }

  @Test(timeout = 4000)
  public void test_setMsg_3()  throws Throwable  {
      //caseID:08ee8d49d07d66c31ed83ae1bfb92f90
      //CoveredLines: [52, 53]
      //Input_0_String: "x"
      
      CodeMsg codeMsg0 = CodeMsg.REPEATE_SECKILL;
      
      //Call method: setMsg
      codeMsg0.setMsg("x");
      
      //Test Result Assert
      assertEquals("x", codeMsg0.getMsg());
  }

  @Test(timeout = 4000)
  public void test_toString_4()  throws Throwable  {
      //caseID:c5686f654fd1591738d4ee3368067bfa
      //CoveredLines: [68]
      //Assert: assertEquals("CodeMsg [code=500101, msg=\u53C2\u6570\u6821\u9A8C\u5F02\u5E38\uFF1A%s]", method_result);
      
      CodeMsg codeMsg0 = CodeMsg.BIND_ERROR;
      
      //Call method: toString
      String string0 = codeMsg0.toString();
      
      //Test Result Assert
      assertEquals("CodeMsg [code=500101, msg=\u53C2\u6570\u6821\u9A8C\u5F02\u5E38\uFF1A%s]", string0);
  }
}
