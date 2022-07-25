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
  public void test_error_0()  throws Throwable  {
      //caseID:562341e3451e92a15f146da71cb062f2
      Result.error((CodeMsg) null);

      //prepare data for codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-1)).when(codeMsg0).getCode();
      doReturn("").when(codeMsg0).getMsg();
      Result<String> result0 = Result.error(codeMsg0);

      //invoke method for result0
      assertEquals((-1), result0.getCode());
  }
  @Test(timeout = 4000)
  public void test_setData_1()  throws Throwable  {
      //caseID:acab99301e3ef440da0db3eaa3974844
      Result<String> result0 = Result.success("com.jesper.seckill.result.Result");

      //invoke method for result0
      result0.setData("com.jesper.seckill.result.Result");

      //invoke method for result0
      assertNull(result0.getMsg());
  }
  @Test(timeout = 4000)
  public void test_getCode_2()  throws Throwable  {
      //caseID:cd4496ce1027c73de0e21db996e4f89c

      //prepare data for codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(codeMsg0).getCode();
      doReturn("1.0").when(codeMsg0).getMsg();
      Result<String> result0 = Result.error(codeMsg0);
      int int0 = result0.getCode();
      assertEquals(1, int0);
  }
  @Test(timeout = 4000)
  public void test_setCode_3()  throws Throwable  {
      //caseID:712b1f397e7627f26ae3847ad4509b8e

      //prepare data for codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0).when(codeMsg0).getCode();
      doReturn("@E]=~;xkH.cf").when(codeMsg0).getMsg();
      Result<String> result0 = Result.error(codeMsg0);
      Result<String> result1 = Result.success("m=x*d=>SF*X^Y");

      //invoke method for result1
      result1.getMsg();

      //invoke method for result0
      result0.setCode(0);

      //invoke method for result0
      assertEquals(0, result0.getCode());
  }
  @Test(timeout = 4000)
  public void test_setMsg_4()  throws Throwable  {
      //caseID:aca69de65b6bbd8057549cabfad1fe95

      //prepare data for codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0).when(codeMsg0).getCode();
      doReturn("1.0").when(codeMsg0).getMsg();
      Result<Integer> result0 = Result.error(codeMsg0);

      //invoke method for result0
      result0.getData();
      Result.success((Object) null);

      //invoke method for result0
      result0.setMsg("\u8BBF\u95EE\u9AD8\u5CF0\u671F\uFF0C\u8BF7\u7A0D\u7B49\uFF01");

      //invoke method for result0
      assertEquals(0, result0.getCode());
  }
  @Test(timeout = 4000)
  public void test_setCode_5()  throws Throwable  {
      //caseID:a42964bd2cf7ba60c22a729645e56424

      //prepare data for codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(500216).when(codeMsg0).getCode();
      doReturn("L`ci}^HQSD1.L%").when(codeMsg0).getMsg();
      Result<String> result0 = Result.error(codeMsg0);

      //invoke method for result0
      assertEquals(500216, result0.getCode());
      
      Result<String> result1 = Result.success("1.0");

      //invoke method for result1
      result1.getData();

      //invoke method for result0
      result0.setCode(0);

      //invoke method for result0
      assertEquals(0, result0.getCode());
  }}
