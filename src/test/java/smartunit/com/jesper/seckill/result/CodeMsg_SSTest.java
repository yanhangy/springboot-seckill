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
  public void test_toString_0()  throws Throwable  {
      //caseID:417023ec9a097d20532bb0d57d17019a
      CodeMsg codeMsg0 = CodeMsg.SERVER_ERROR;
      String string0 = codeMsg0.toString();
      assertEquals("CodeMsg [code=500100, msg=\u670D\u52A1\u7AEF\u5F02\u5E38]", string0);
  }
  @Test(timeout = 4000)
  public void test_getMsg_1()  throws Throwable  {
      //caseID:cd62fe2645025f529f58409b37b837c8
      CodeMsg codeMsg0 = CodeMsg.BIND_ERROR;
      String string0 = codeMsg0.getMsg();
      assertEquals("\u53C2\u6570\u6821\u9A8C\u5F02\u5E38\uFF1A%s", string0);
  }
  @Test(timeout = 4000)
  public void test_getCode_2()  throws Throwable  {
      //caseID:023774a500fd63413e70d26f32f169f1
      CodeMsg codeMsg0 = CodeMsg.SERVER_ERROR;
      int int0 = codeMsg0.getCode();
      assertEquals(500100, int0);
  }
  @Test(timeout = 4000)
  public void test_setMsg_3()  throws Throwable  {
      //caseID:0b28665456a421663c80db3ed23981da
      CodeMsg codeMsg0 = CodeMsg.SECKILL_OVER;

      //invoke method for codeMsg0
      codeMsg0.setMsg("500400");

      //invoke method for codeMsg0
      assertEquals("500400", codeMsg0.getMsg());
  }
  @Test(timeout = 4000)
  public void test_setCode_4()  throws Throwable  {
      //caseID:981c5ff1d648f094f546335930a0307c
      CodeMsg codeMsg0 = CodeMsg.SECKILL_OVER;

      //invoke method for codeMsg0
      codeMsg0.setCode(500201);

      //invoke method for codeMsg0
      assertEquals(500201, codeMsg0.getCode());
  }
  @Test(timeout = 4000)
  public void test_fillArgs_5()  throws Throwable  {
      //caseID:529fae055c84691a3b732263efa7bb46
      CodeMsg codeMsg0 = CodeMsg.MOBILE_ERROR;
      Object[] objectArray0 = new Object[0];
      CodeMsg codeMsg1 = codeMsg0.fillArgs(objectArray0);

      //invoke method for codeMsg1
      assertEquals(500213, codeMsg1.getCode());
  }}
