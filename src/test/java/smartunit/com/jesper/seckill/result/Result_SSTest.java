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
      //caseID:67465f5861b919b1b6b23b90fcf8d56b
      Result<Object> result0 = Result.success((Object) "");

      //invoke method for result0
      result0.setMsg("");

      //invoke method for result0
      assertEquals("", result0.getMsg());
  }
  @Test(timeout = 4000)
  public void test_setCode_1()  throws Throwable  {
      //caseID:07411d19b06d912b45844097d5df9fae
      Result<Object> result0 = Result.success((Object) "1.0");

      //invoke method for result0
      result0.setCode(871);

      //invoke method for result0
      assertEquals(871, result0.getCode());
  }
  @Test(timeout = 4000)
  public void test_getMsg_2()  throws Throwable  {
      //caseID:5142c64beadcff73666ca613ca503a88
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(codeMsg0).getCode();
      doReturn("1.0").when(codeMsg0).getMsg();
      Result.error(codeMsg0);
      Result<Object> result0 = Result.success((Object) "");

      //invoke method for result0
      result0.getData();
      String string0 = result0.getMsg();
      assertNull(string0);
  }
  @Test(timeout = 4000)
  public void test_getCode_3()  throws Throwable  {
      //caseID:f9ebc7f314857629c7f9cb3c8a02fc6c

      //prepare data for codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(500400).when(codeMsg0).getCode();
      doReturn("pO|A'Rs^]Fj(Hh~").when(codeMsg0).getMsg();
      Result<Integer> result0 = Result.error(codeMsg0);

      //invoke method for result0
      result0.getData();
      Result.success((Object) null);
      int int0 = result0.getCode();
      assertEquals(500400, int0);
  }
  @Test(timeout = 4000)
  public void test_setData_4()  throws Throwable  {
      //caseID:002088f75422f477fbb67345f36c944b
      Object object0 = new Object();
      Result<Object> result0 = Result.success(object0);
      Result<Object> result1 = Result.error((CodeMsg) null);

      //prepare data for codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-1)).when(codeMsg0).getCode();
      doReturn("1.0").when(codeMsg0).getMsg();
      Result<Integer> result2 = Result.error(codeMsg0);

      //invoke method for result2
      result2.getData();

      //invoke method for result0
      result0.setData((Object) null);

      //invoke method for result0

      //invoke method for result1
      assertNotSame(result0, result1);
  }}
