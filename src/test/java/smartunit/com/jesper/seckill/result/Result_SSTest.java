/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.result;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.jesper.seckill.result.CodeMsg;
import com.jesper.seckill.result.Result;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Result_SSTest extends Result_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_setCode_0()  throws Throwable  {
      Result<Object> result0 = Result.error((CodeMsg) null);

      //invoke method for result0
      result0.setCode(2084);

      //invoke method for result0
      assertEquals(2084, result0.getCode());
  }
  @Test(timeout = 4000)
  public void test_setMsg_1()  throws Throwable  {
      Result<String> result0 = Result.success("1.0");

      //invoke method for result0
      result0.setMsg("");

      //invoke method for result0
      assertEquals(0, result0.getCode());
  }
  @Test(timeout = 4000)
  public void test_getCode_2()  throws Throwable  {
      CodeMsg codeMsg0 = CodeMsg.MOBILE_EMPTY;
      Result<String> result0 = Result.error(codeMsg0);

      //invoke method for result0
      result0.getMsg();
      int int0 = result0.getCode();
      assertEquals(500212, int0);
  }
  @Test(timeout = 4000)
  public void test_setData_3()  throws Throwable  {

      //prepare data for codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0).when(codeMsg0).getCode();
      doReturn("").when(codeMsg0).getMsg();
      Result<Object> result0 = Result.error(codeMsg0);

      //invoke method for result0
      result0.setData("1");

      //invoke method for result0
      assertEquals(0, result0.getCode());
  }
  @Test(timeout = 4000)
  public void test_getMsg_4()  throws Throwable  {

      //prepare data for codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0).when(codeMsg0).getCode();
      doReturn("1").when(codeMsg0).getMsg();
      Result<String> result0 = Result.error(codeMsg0);

      //invoke method for result0
      result0.getData();
      Result<Object> result1 = Result.success((Object) null);
      String string0 = result1.getMsg();
      assertNull(string0);
  }
  @Test(timeout = 4000)
  public void test_setCode_5()  throws Throwable  {
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(500211).when(codeMsg0).getCode();
      doReturn("-sl$").when(codeMsg0).getMsg();
      Result.error(codeMsg0);
      Result<String> result0 = Result.success("k6!(MfBU%");

      //invoke method for result0
      result0.getData();

      //invoke method for result0
      result0.setCode((-1));

      //invoke method for result0
      assertEquals((-1), result0.getCode());
  }}
