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
      //caseID:569e835738f2e4827a29aa9ae9b996eb
      CodeMsg codeMsg0 = CodeMsg.PASSWORD_ERROR;
      String string0 = codeMsg0.getMsg();
      assertEquals("\u5BC6\u7801\u9519\u8BEF", string0);
  }
  @Test(timeout = 4000)
  public void test_toString_1()  throws Throwable  {
      //caseID:9bdbaea3eac9b68e6a63b5f94860389a
      CodeMsg codeMsg0 = CodeMsg.BIND_ERROR;
      String string0 = codeMsg0.toString();
      assertEquals("CodeMsg [code=500101, msg=\u53C2\u6570\u6821\u9A8C\u5F02\u5E38\uFF1A%s]", string0);
  }
  @Test(timeout = 4000)
  public void test_setMsg_2()  throws Throwable  {
      //caseID:d56c1fd451eaf50e1f0c82170c6c94d9
      CodeMsg codeMsg0 = CodeMsg.MOBILE_NOT_EXIST;

      //invoke method for codeMsg0
      codeMsg0.setMsg("");

      //invoke method for codeMsg0
      assertEquals(500214, codeMsg0.getCode());
  }
  @Test(timeout = 4000)
  public void test_setCode_3()  throws Throwable  {
      //caseID:07ec59eb71c6962eedb128c044f79751
      CodeMsg codeMsg0 = CodeMsg.PRIMARY_ERROR;

      //invoke method for codeMsg0
      codeMsg0.setCode(500216);

      //invoke method for codeMsg0
      assertEquals(500216, codeMsg0.getCode());
  }
  @Test(timeout = 4000)
  public void test_getCode_4()  throws Throwable  {
      //caseID:29f2157e5915fe72320e702f06117dc3
      CodeMsg codeMsg0 = CodeMsg.SUCCESS;
      Object[] objectArray0 = new Object[4];
      CodeMsg codeMsg1 = codeMsg0.fillArgs(objectArray0);
      int int0 = codeMsg1.getCode();
      assertEquals(0, int0);
  }}
