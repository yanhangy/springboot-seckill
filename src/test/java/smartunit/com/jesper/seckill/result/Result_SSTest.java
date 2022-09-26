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
      //caseID:fd0d6fb76419e20049c87655bd0e1edc
      //CoveredLines: [13, 20, 23, 24, 25, 32, 33, 34, 35, 37]
      //Input_0_CodeMsg: {}
      //Assert: assertFalse(method_result.equals((Object)result0));
      
      Object object0 = new Object();
      Result<Object> result0 = Result.success(object0);
      //mock codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: error
      Result<Object> result1 = Result.error(codeMsg0);
      
      //Test Result Assert
      assertFalse(result1.equals((Object)result0));
  }

  @Test(timeout = 4000)
  public void test_getCode_1()  throws Throwable  {
      //caseID:6bf7bfb3a34fe02292451c7e6e2c5279
      //CoveredLines: [20, 32, 33, 34, 35, 37, 41]
      //Assert: assertEquals(2450, method_result);
      
      //mock codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(2450).when(codeMsg0).getCode();
      doReturn("1.0").when(codeMsg0).getMsg();
      Result<String> result0 = Result.error(codeMsg0);
      
      //Call method: getCode
      int int0 = result0.getCode();
      
      //Test Result Assert
      assertEquals(2450, int0);
  }

  @Test(timeout = 4000)
  public void test_getData_2()  throws Throwable  {
      //caseID:4da2a3fb432b98258dd54b9f065e9960
      //CoveredLines: [20, 32, 33, 37, 53]
      //Assert: assertNull(method_result);
      
      Result<Object> result0 = Result.error((CodeMsg) null);
      
      //Call method: getData
      Object object0 = result0.getData();
      
      //Test Result Assert
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_getData_3()  throws Throwable  {
      //caseID:d1dcc5a7dbc63c652a616817e99b8a25
      //CoveredLines: [20, 32, 33, 34, 35, 37, 53]
      //Assert: assertNull(method_result);
      
      //mock codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Result<Object> result0 = Result.error(codeMsg0);
      
      //Call method: getData
      Object object0 = result0.getData();
      
      //Test Result Assert
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_getMsg_4()  throws Throwable  {
      //caseID:f95bf70b8ed5bc309a593d95ce6c1578
      //CoveredLines: [20, 32, 33, 34, 35, 37, 47]
      //Assert: assertNull(method_result);
      
      //mock codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Result<String> result0 = Result.error(codeMsg0);
      
      //Call method: getMsg
      String string0 = result0.getMsg();
      
      //Test Result Assert
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test_setCode_5()  throws Throwable  {
      //caseID:00ab11eea2bf6219eb2dd140c7dbced0
      //CoveredLines: [20, 32, 33, 34, 35, 37, 44, 45]
      //Input_0_int: 1
      
      //mock codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Result<Object> result0 = Result.error(codeMsg0);
      
      //Call method: setCode
      result0.setCode(1);
      
      //Test Result Assert
      assertEquals(1, result0.getCode());
  }

  @Test(timeout = 4000)
  public void test_setData_6()  throws Throwable  {
      //caseID:d27523f1043458ad28a0213647132ad4
      //CoveredLines: [20, 32, 33, 34, 35, 37, 56, 57]
      //Input_0_Integer: 1000
      
      //mock codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Result<Integer> result0 = Result.error(codeMsg0);
      Integer integer0 = new Integer(1000);
      
      //Call method: setData
      result0.setData(integer0);
      
      //Test Result Assert
      assertEquals(0, result0.getCode());
  }

  @Test(timeout = 4000)
  public void test_setMsg_7()  throws Throwable  {
      //caseID:9953101515568147b54f85995b4c787a
      //CoveredLines: [13, 23, 24, 25, 50, 51]
      //Input_0_String: "\u4E3B\u952E\u51B2\u7A81"
      
      Result<String> result0 = Result.success("\u4E3B\u952E\u51B2\u7A81");
      
      //Call method: setMsg
      result0.setMsg("\u4E3B\u952E\u51B2\u7A81");
      
      //Test Result Assert
      assertEquals("\u4E3B\u952E\u51B2\u7A81", result0.getMsg());
  }
}
