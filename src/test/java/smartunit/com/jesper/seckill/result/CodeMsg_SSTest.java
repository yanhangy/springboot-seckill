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
      //caseID:b58ecc6aff7271ce3c2a8eae752481cc
      CodeMsg codeMsg0 = CodeMsg.SESSION_ERROR;
      String string0 = codeMsg0.toString();
      assertEquals("CodeMsg [code=500210, msg=Session\u4E0D\u5B58\u5728\u6216\u8005\u5DF2\u7ECF\u5931\u6548]", string0);
  }
  @Test(timeout = 4000)
  public void test_getMsg_1()  throws Throwable  {
      //caseID:3c46c123ff3abdb2fd4ddf682392c292
      CodeMsg codeMsg0 = CodeMsg.ORDER_NOT_EXIST;
      String string0 = codeMsg0.getMsg();
      assertEquals("\u8BA2\u5355\u4E0D\u5B58\u5728", string0);
  }
  @Test(timeout = 4000)
  public void test_setCode_2()  throws Throwable  {
      //caseID:5e0c3b5774fd1943eb1dad72b15c165a
      CodeMsg codeMsg0 = CodeMsg.PASSWORD_EMPTY;

      //invoke method for codeMsg0
      codeMsg0.setCode(1780);

      //invoke method for codeMsg0
      assertEquals(1780, codeMsg0.getCode());
  }
  @Test(timeout = 4000)
  public void test_setMsg_3()  throws Throwable  {
      //caseID:66fb33fb3a163ca3cdc4d420709cafba
      CodeMsg codeMsg0 = CodeMsg.MOBILE_EMPTY;

      //invoke method for codeMsg0
      codeMsg0.setMsg("1.0");

      //invoke method for codeMsg0
      assertEquals("1.0", codeMsg0.getMsg());
  }
  @Test(timeout = 4000)
  public void test_getCode_4()  throws Throwable  {
      //caseID:665fe19334e12b4734ef38365619c982
      CodeMsg codeMsg0 = CodeMsg.SECKILL_OVER;
      Object[] objectArray0 = new Object[2];
      CodeMsg codeMsg1 = codeMsg0.fillArgs(objectArray0);
      int int0 = codeMsg1.getCode();
      assertEquals(500500, int0);
  }}
