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
  public void test_setMsg_0()  throws Throwable  {
      //caseID:008bd67ead806575423fa2e2d09330b2

      //prepare data for codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-1)).when(codeMsg0).getCode();
      doReturn("success").when(codeMsg0).getMsg();
      Result<String> result0 = Result.error(codeMsg0);

      //invoke method for result0
      result0.setMsg("nF2TX=pIs");

      //invoke method for result0
      assertEquals("nF2TX=pIs", result0.getMsg());
  }
  @Test(timeout = 4000)
  public void test_setCode_1()  throws Throwable  {
      //caseID:c99d7de0421e50d190e6291660b13380

      //prepare data for codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(codeMsg0).getCode();
      doReturn("1.0").when(codeMsg0).getMsg();
      Result<Object> result0 = Result.error(codeMsg0);

      //invoke method for result0
      result0.setCode(0);

      //invoke method for result0
      assertEquals(0, result0.getCode());
  }
  @Test(timeout = 4000)
  public void test_error_2()  throws Throwable  {
      //caseID:4a0e42049953bab17c20b2b661ec16d7

      //prepare data for codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(500).when(codeMsg0).getCode();
      doReturn("").when(codeMsg0).getMsg();
      Result<String> result0 = Result.error(codeMsg0);

      //invoke method for result0
      result0.getData();

      //invoke method for result0
      assertEquals(500, result0.getCode());
      
      Result.success((Object) null);
      Result<Object> result1 = Result.error((CodeMsg) null);

      //invoke method for result1
      assertEquals(0, result1.getCode());
  }
  @Test(timeout = 4000)
  public void test_getMsg_3()  throws Throwable  {
      //caseID:6c83f12a517f20210e0ac07e9973bbbe

      //prepare data for codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(2334).when(codeMsg0).getCode();
      doReturn("lX#7-").when(codeMsg0).getMsg();
      Result<String> result0 = Result.error(codeMsg0);

      //invoke method for result0
      result0.getData();
      Result.success((Object) null);
      String string0 = result0.getMsg();
      assertNotNull(string0);

      //invoke method for result0
      assertEquals(2334, result0.getCode());
  }
  @Test(timeout = 4000)
  public void test_getCode_4()  throws Throwable  {
      //caseID:7c9a0443bb858e7e7ef29422228fe3d2
      Result.success((Object) "^buKRXzz2U-kCBT.(}");

      //prepare data for codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0).when(codeMsg0).getCode();
      doReturn("\u4E3B\u952E\u51B2\u7A81").when(codeMsg0).getMsg();
      Result<String> result0 = Result.error(codeMsg0);

      //invoke method for result0
      result0.getData();
      int int0 = result0.getCode();
      assertEquals(0, int0);
  }
  @Test(timeout = 4000)
  public void test_setData_5()  throws Throwable  {
      //caseID:2ab9dd7b8d2493881a359a0a38c77efa

      //prepare data for codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(codeMsg0).getCode();
      doReturn("1.0").when(codeMsg0).getMsg();
      Result<String> result0 = Result.error(codeMsg0);

      //invoke method for result0
      result0.getData();

      //invoke method for result0
      assertEquals(1, result0.getCode());
      
      Result<Object> result1 = Result.success((Object) null);

      //invoke method for result1
      result1.setData("1");

      //invoke method for result1
      assertNull(result1.getMsg());
  }}
