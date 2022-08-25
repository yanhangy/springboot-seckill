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

  @Test(timeout = 4000)
  public void test_getMsg_0()  throws Throwable  {
      //caseID:14fa7d6ffda9e31463b3462b9f8e80c9
      CodeMsg codeMsg0 = CodeMsg.BIND_ERROR;
      String string0 = codeMsg0.getMsg();
      assertEquals("\u53C2\u6570\u6821\u9A8C\u5F02\u5E38\uFF1A%s", string0);
  }
  @Test(timeout = 4000)
  public void test_setMsg_1()  throws Throwable  {
      //caseID:5711db91ffd919187a0f9af5264de964
      CodeMsg codeMsg0 = CodeMsg.SESSION_ERROR;

      //invoke method for codeMsg0
      codeMsg0.setMsg("\u624B\u673A\u53F7\u4E0D\u80FD\u4E3A\u7A7A");

      //invoke method for codeMsg0
      assertEquals(500210, codeMsg0.getCode());
  }
  @Test(timeout = 4000)
  public void test_getCode_2()  throws Throwable  {
      //caseID:1f90ce5d4a3da8052c0c64c64a728f97
      CodeMsg codeMsg0 = CodeMsg.BIND_ERROR;
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) codeMsg0;
      CodeMsg codeMsg1 = codeMsg0.fillArgs(objectArray0);

      //invoke method for codeMsg1
      assertEquals("\u53C2\u6570\u6821\u9A8C\u5F02\u5E38\uFF1ACodeMsg [code=500101, msg=\u53C2\u6570\u6821\u9A8C\u5F02\u5E38\uFF1A%s]", codeMsg1.getMsg());

      //invoke method for codeMsg1
      assertEquals(500101, codeMsg1.getCode());
      
      int int0 = codeMsg0.getCode();
      assertEquals(500101, int0);
  }
  @Test(timeout = 4000)
  public void test_setCode_3()  throws Throwable  {
      //caseID:f21f50445c7a8f70453f83c3cabbdd2c
      CodeMsg codeMsg0 = CodeMsg.SUCCESS;
      Object[] objectArray0 = new Object[5];

      //invoke method for codeMsg0
      codeMsg0.fillArgs(objectArray0);

      //invoke method for codeMsg0
      codeMsg0.setCode(500210);

      //invoke method for codeMsg0
      assertEquals(500210, codeMsg0.getCode());
  }}
