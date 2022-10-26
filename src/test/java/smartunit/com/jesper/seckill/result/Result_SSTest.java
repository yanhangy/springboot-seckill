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
// allCoveredLines:[13, 20, 23, 24, 25, 32, 33, 34, 35, 37, 41, 44, 45, 47, 50, 51, 53, 56, 57]

  @Test(timeout = 4000)
  public void test_error_0()  throws Throwable  {
      //caseID:9b80efbbc971ca0a90e4a70ae08e9172
      //CoveredLines: [13, 20, 23, 24, 25, 32, 33, 34, 35, 37]
      //Input_0_CodeMsg: {}
      //Assert: assertNull(method_result.getMsg());
      
      Result.success((Object) "");
      //mock codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: error
      Result<String> result0 = Result.error(codeMsg0);
      
      //Test Result Assert
      assertNull(result0.getMsg());
  }

  @Test(timeout = 4000)
  public void test_getCode_1()  throws Throwable  {
      //caseID:8e76c4c2adc07896567d2a9e03edea23
      //CoveredLines: [20, 32, 33, 37, 41]
      //Assert: assertEquals(0, method_result);
      
      Result<Integer> result0 = Result.error((CodeMsg) null);
      
      //Call method: getCode
      int int0 = result0.getCode();
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_getCode_2()  throws Throwable  {
      //caseID:b472449fcfa005028343b5bb7c35e1a7
      //CoveredLines: [20, 32, 33, 34, 35, 37, 41]
      //Assert: assertEquals(0, method_result);
      
      //mock codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Result<Integer> result0 = Result.error(codeMsg0);
      
      //Call method: getCode
      int int0 = result0.getCode();
      
      //Test Result Assert
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test_getData_3()  throws Throwable  {
      //caseID:9aa1528d5c3d8c6121e16ba0dae8da7d
      //CoveredLines: [13, 23, 24, 25, 53]
      //Assert: assertEquals("500400", method_result);
      
      Result<Object> result0 = Result.success((Object) "500400");
      
      //Call method: getData
      Object object0 = result0.getData();
      
      //Test Result Assert
      assertEquals("500400", object0);
  }

  @Test(timeout = 4000)
  public void test_getMsg_4()  throws Throwable  {
      //caseID:5007d4fe8b2966219f64b718138b0214
      //CoveredLines: [20, 32, 33, 34, 35, 37, 47]
      //Assert: assertNotNull(method_result);
      //Assert: assertEquals(1163, result0.getCode());
      
      //mock codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1163).when(codeMsg0).getCode();
      doReturn("500501").when(codeMsg0).getMsg();
      Result<Integer> result0 = Result.error(codeMsg0);
      
      //Call method: getMsg
      String string0 = result0.getMsg();
      
      //Test Result Assert
      assertNotNull(string0);
      
      //Test Result Assert
      assertEquals(1163, result0.getCode());
  }

  @Test(timeout = 4000)
  public void test_setCode_5()  throws Throwable  {
      //caseID:6377b805b94aa2da98f2b95ce58a05d3
      //CoveredLines: [13, 23, 24, 25, 44, 45]
      //Input_0_int: 0
      
      Result<String> result0 = Result.success("1");
      
      //Call method: setCode
      result0.setCode(0);
      
      //Test Result Assert
      assertEquals(0, result0.getCode());
  }

  @Test(timeout = 4000)
  public void test_setData_6()  throws Throwable  {
      //caseID:e0af23ed084128f06795f91d5074bb49
      //CoveredLines: [20, 32, 33, 34, 35, 37, 56, 57]
      //Input_0_String: "1"
      
      //mock codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Result<String> result0 = Result.error(codeMsg0);
      
      //Call method: setData
      result0.setData("1");
      
      //Test Result Assert
      assertNull(result0.getMsg());
  }

  @Test(timeout = 4000)
  public void test_setMsg_7()  throws Throwable  {
      //caseID:e03d633c2d66e87305bb780a1919f3d6
      //CoveredLines: [13, 23, 24, 25, 50, 51]
      //Input_0_String: "1"
      
      Object object0 = new Object();
      Result<Object> result0 = Result.success(object0);
      
      //Call method: setMsg
      result0.setMsg("1");
      
      //Test Result Assert
      assertEquals("1", result0.getMsg());
  }
}
