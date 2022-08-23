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
      //caseID:3a16a95bf7bcce51e20b8f014265fc66
      Result<Object> result0 = Result.error((CodeMsg) null);

      //invoke method for result0
      result0.setMsg("0");

      //invoke method for result0
      assertEquals("0", result0.getMsg());
  }
  @Test(timeout = 4000)
  public void test_getMsg_1()  throws Throwable  {
      //caseID:fdda79264450803e6d708b8936a09ef6

      //prepare data for codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(500101).when(codeMsg0).getCode();
      doReturn("%R,rv<qmU$M64<(D%$").when(codeMsg0).getMsg();
      Result<Object> result0 = Result.error(codeMsg0);
      Result<String> result1 = Result.success("com.jesper.seckill.result.Result");

      //invoke method for result1
      result1.getData();
      String string0 = result0.getMsg();
      assertNotNull(string0);

      //invoke method for result0
      assertEquals(500101, result0.getCode());
  }
  @Test(timeout = 4000)
  public void test_getCode_2()  throws Throwable  {
      //caseID:414c9ba23bc479a3acec633f43a7d8f0
      Result.success((Object) "com.jesper.seckill.result.Result");

      //prepare data for codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0).when(codeMsg0).getCode();
      doReturn("com.jesper.seckill.result.Result").when(codeMsg0).getMsg();
      Result<String> result0 = Result.error(codeMsg0);

      //invoke method for result0
      result0.getData();
      int int0 = result0.getCode();
      assertEquals(0, int0);
  }
  @Test(timeout = 4000)
  public void test_setMsg_3()  throws Throwable  {
      //caseID:493815bcec32737dd853e247af592230

      //prepare data for codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(4090).when(codeMsg0).getCode();
      doReturn("CodeMsg [code=").when(codeMsg0).getMsg();
      Result<Object> result0 = Result.error(codeMsg0);

      //invoke method for result0
      result0.getData();

      //invoke method for result0
      assertEquals(4090, result0.getCode());
      
      Result<Object> result1 = Result.success((Object) null);

      //invoke method for result1
      result1.setMsg("1.0");

      //invoke method for result1
      assertEquals(0, result1.getCode());
  }
  @Test(timeout = 4000)
  public void test_setData_4()  throws Throwable  {
      //caseID:371efbff219498e6d30f36b9abb2787d

      //prepare data for codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(2311).when(codeMsg0).getCode();
      doReturn("1").when(codeMsg0).getMsg();
      Result<String> result0 = Result.error(codeMsg0);

      //invoke method for result0
      assertEquals(2311, result0.getCode());
      
      Result<String> result1 = Result.success("com.jesper.seckill.result.Result");

      //invoke method for result1
      result1.getData();

      //invoke method for result1
      result1.setData("com.jesper.seckill.result.Result");

      //invoke method for result1
      assertNull(result1.getMsg());
  }
  @Test(timeout = 4000)
  public void test_setCode_5()  throws Throwable  {
      //caseID:3a326fe9a42100a1c7584a60dd2f882a

      //prepare data for codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-1)).when(codeMsg0).getCode();
      doReturn(":vUC @gE!-^qJI/[LtA").when(codeMsg0).getMsg();
      Result<Integer> result0 = Result.error(codeMsg0);

      //invoke method for result0
      result0.getData();
      Result.success((Object) null);

      //invoke method for result0
      result0.setCode((-1));

      //invoke method for result0
      assertEquals((-1), result0.getCode());
  }}
