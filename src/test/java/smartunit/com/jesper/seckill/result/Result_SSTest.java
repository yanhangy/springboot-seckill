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
  public void test_setData_0()  throws Throwable  {
      //caseID:fb6f45bd02ad4cac803a69f63e609a93
      Result<String> result0 = Result.error((CodeMsg) null);

      //invoke method for result0
      result0.setData("7");

      //invoke method for result0
      assertEquals(0, result0.getCode());
  }
  @Test(timeout = 4000)
  public void test_setMsg_1()  throws Throwable  {
      //caseID:642eb42b60526b019e91e2eed66899c8
      Object object0 = new Object();
      Result<Object> result0 = Result.success(object0);

      //invoke method for result0
      result0.setMsg("com.jesper.seckill.result.Result");

      //invoke method for result0
      assertEquals("com.jesper.seckill.result.Result", result0.getMsg());
  }
  @Test(timeout = 4000)
  public void test_setCode_2()  throws Throwable  {
      //caseID:a3897fe1d167624c2a73bbef632d28d0
      Result<String> result0 = Result.success("1.0");

      //invoke method for result0
      result0.setCode(2253);

      //invoke method for result0
      assertEquals(2253, result0.getCode());
  }
  @Test(timeout = 4000)
  public void test_getCode_3()  throws Throwable  {
      //caseID:6733f6a70fc06430d0a77899025c3c71

      //prepare data for codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(386).when(codeMsg0).getCode();
      doReturn("").when(codeMsg0).getMsg();
      Result<Object> result0 = Result.error(codeMsg0);
      int int0 = result0.getCode();
      assertEquals(386, int0);
  }
  @Test(timeout = 4000)
  public void test_setData_4()  throws Throwable  {
      //caseID:936c8eba5abc56af1eb8e7b367e1e2b4

      //prepare data for codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0).when(codeMsg0).getCode();
      doReturn("").when(codeMsg0).getMsg();
      Result<Object> result0 = Result.error(codeMsg0);

      //invoke method for result0
      result0.setData("");

      //invoke method for result0
      assertEquals(0, result0.getCode());
  }
  @Test(timeout = 4000)
  public void test_getMsg_5()  throws Throwable  {
      //caseID:5a2e56155610206afaf7c3417a89fea8

      //prepare data for codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0).when(codeMsg0).getCode();
      doReturn("1.0").when(codeMsg0).getMsg();
      Result<String> result0 = Result.error(codeMsg0);

      //invoke method for result0
      result0.getData();
      Result<Object> result1 = Result.success((Object) null);
      String string0 = result1.getMsg();
      assertNull(string0);
  }}
