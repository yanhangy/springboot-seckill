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
      //caseID:60293c6336ae87117239188b6e51f73d
      CodeMsg codeMsg0 = CodeMsg.SUCCESS;
      String string0 = codeMsg0.toString();
      assertEquals("CodeMsg [code=0, msg=success]", string0);
  }
  @Test(timeout = 4000)
  public void test_getMsg_1()  throws Throwable  {
      //caseID:86c290bf746af97e8e7ee7db5cf052d6
      CodeMsg codeMsg0 = CodeMsg.ACCESS_LIMIT_REACHED;
      String string0 = codeMsg0.getMsg();
      assertEquals("\u8BBF\u95EE\u9AD8\u5CF0\u671F\uFF0C\u8BF7\u7A0D\u7B49\uFF01", string0);
  }
  @Test(timeout = 4000)
  public void test_getCode_2()  throws Throwable  {
      //caseID:e6163577ccfdc0b4cbe27784edeaafdd
      CodeMsg codeMsg0 = CodeMsg.ORDER_NOT_EXIST;
      int int0 = codeMsg0.getCode();
      assertEquals(500400, int0);
  }
  @Test(timeout = 4000)
  public void test_setMsg_3()  throws Throwable  {
      //caseID:95cd299495f9705d53fc9b8099a83ef1
      CodeMsg codeMsg0 = CodeMsg.ACCESS_LIMIT_REACHED;

      //invoke method for codeMsg0
      codeMsg0.setMsg("1.0");

      //invoke method for codeMsg0
      assertEquals(500104, codeMsg0.getCode());
  }
  @Test(timeout = 4000)
  public void test_setCode_4()  throws Throwable  {
      //caseID:5854ebdfa2db02b40c5df5b66f5ac854
      CodeMsg codeMsg0 = CodeMsg.MOBILE_ERROR;

      //invoke method for codeMsg0
      codeMsg0.setCode((-11));

      //invoke method for codeMsg0
      assertEquals((-11), codeMsg0.getCode());
  }
  @Test(timeout = 4000)
  public void test_fillArgs_5()  throws Throwable  {
      //caseID:ce9a6c7c0a0577010d73175faabaafad
      CodeMsg codeMsg0 = CodeMsg.SERVER_ERROR;
      Object[] objectArray0 = new Object[0];
      CodeMsg codeMsg1 = codeMsg0.fillArgs(objectArray0);

      //invoke method for codeMsg1
      assertEquals(500100, codeMsg1.getCode());
  }}
