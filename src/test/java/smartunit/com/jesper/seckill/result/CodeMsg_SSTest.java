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
      //caseID:b11e390dc18c12161a655e3c21ad5b86
      //CoveredLines: [40]
      //Assert: assertEquals(500215, method_result);
      
      CodeMsg codeMsg0 = CodeMsg.PASSWORD_ERROR;
      
      //Call method: getCode
      int int0 = codeMsg0.getCode();
      
      //Test Result Assert
      assertEquals(500215, int0);
  }

  @Test(timeout = 4000)
  public void test_getCode_1()  throws Throwable  {
      //caseID:9eb9a7312a73afeed6ec6ed6194a39e0
      //CoveredLines: [34, 35, 36, 37, 61, 62, 63, 68]
      
      CodeMsg codeMsg0 = CodeMsg.BIND_ERROR;
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) codeMsg0;
      CodeMsg codeMsg1 = codeMsg0.fillArgs(objectArray0);
      
      //Test Result Assert
      assertEquals("\u53C2\u6570\u6821\u9A8C\u5F02\u5E38\uFF1ACodeMsg [code=500101, msg=\u53C2\u6570\u6821\u9A8C\u5F02\u5E38\uFF1A%s]", codeMsg1.getMsg());
      
      //Test Result Assert
      assertEquals(500101, codeMsg1.getCode());
  }

  @Test(timeout = 4000)
  public void test_getMsg_2()  throws Throwable  {
      //caseID:66e65426658870de3938e228112bc7ff
      //CoveredLines: [48]
      //Assert: assertEquals("\u53C2\u6570\u6821\u9A8C\u5F02\u5E38\uFF1A%s", method_result);
      
      CodeMsg codeMsg0 = CodeMsg.BIND_ERROR;
      
      //Call method: getMsg
      String string0 = codeMsg0.getMsg();
      
      //Test Result Assert
      assertEquals("\u53C2\u6570\u6821\u9A8C\u5F02\u5E38\uFF1A%s", string0);
  }

  @Test(timeout = 4000)
  public void test_setCode_3()  throws Throwable  {
      //caseID:034043affd18359797235462d19e988c
      //CoveredLines: [34, 35, 36, 37, 44, 45, 61, 62, 63]
      //Input_0_int: 
      
      CodeMsg codeMsg0 = CodeMsg.SUCCESS;
      Object[] objectArray0 = new Object[4];
      CodeMsg codeMsg1 = codeMsg0.fillArgs(objectArray0);
      
      //Test Result Assert
      assertEquals(0, codeMsg1.getCode());
      
      
      //Call method: setCode
      codeMsg0.setCode((-11));
      
      //Test Result Assert
      assertEquals((-11), codeMsg0.getCode());
  }

  @Test(timeout = 4000)
  public void test_setMsg_4()  throws Throwable  {
      //caseID:97e0212ed0fca70a1a6e928a5dbc4753
      //CoveredLines: [52, 53]
      //Input_0_String: "tHRoRX?Q%$CI+YK"
      
      CodeMsg codeMsg0 = CodeMsg.PASSWORD_ERROR;
      
      //Call method: setMsg
      codeMsg0.setMsg("tHRoRX?Q%$CI+YK");
      
      //Test Result Assert
      assertEquals(500215, codeMsg0.getCode());
  }
}
