/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.jesper.seckill.exception.GlobalException;
import com.jesper.seckill.exception.GlobalExceptionHandler;
import com.jesper.seckill.result.CodeMsg;
import com.jesper.seckill.result.Result;
import java.util.LinkedList;
import javax.servlet.http.HttpServletRequest;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class GlobalExceptionHandler_SSTest extends GlobalExceptionHandler_SSTest_scaffolding {
// allCoveredLines:[21, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 36]

  @Test(timeout = 4000)
  public void test_exceptionHandler_0()  throws Throwable  {
      //caseID:fecddd341916422cb54358675e796a54
      //CoveredLines: [21, 25, 26, 27, 28]
      //Input_0_HttpServletRequest: {}
      //Input_1_Exception: codeMsg0
      //Assert: assertNull(method_result.getMsg());
      
      GlobalExceptionHandler globalExceptionHandler0 = new GlobalExceptionHandler();
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      GlobalException globalException0 = new GlobalException(codeMsg0);
      
      //Call method: exceptionHandler
      Result<String> result0 = globalExceptionHandler0.exceptionHandler(httpServletRequest0, globalException0);
      
      //Test Result Assert
      assertNull(result0.getMsg());
  }

  @Test(timeout = 4000)
  public void test_exceptionHandler_1()  throws Throwable  {
      //caseID:45ac5a4bfa3078fa965dec49df0430ea
      //CoveredLines: [21, 25, 26, 29, 36]
      //Input_0_HttpServletRequest: {}
      //Input_1_Exception: {}
      //Assert: assertEquals(500100, method_result.getCode());
      
      GlobalExceptionHandler globalExceptionHandler0 = new GlobalExceptionHandler();
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock exception0
      Exception exception0 = mock(Exception.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: exceptionHandler
      Result<String> result0 = globalExceptionHandler0.exceptionHandler(httpServletRequest0, exception0);
      
      //Test Result Assert
      assertEquals(500100, result0.getCode());
  }

  @Test(timeout = 4000)
  public void test_exceptionHandler_2()  throws Throwable  {
      //caseID:f84414ea041b9d655b3fe500226ceeb6
      //CoveredLines: [21, 25, 26, 29, 30, 31, 32, 33, 34]
      //Input_0_HttpServletRequest: {}
      //Input_1_Exception: bindingResult0
      //Assert: assertEquals(500101, method_result.getCode());
      
      GlobalExceptionHandler globalExceptionHandler0 = new GlobalExceptionHandler();
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      LinkedList<ObjectError> linkedList0 = new LinkedList<ObjectError>();
      //mock objectError0
      ObjectError objectError0 = mock(ObjectError.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      linkedList0.add(objectError0);
      //mock bindingResult0
      BindingResult bindingResult0 = mock(BindingResult.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(linkedList0).when(bindingResult0).getAllErrors();
      BindException bindException0 = new BindException(bindingResult0);
      
      //Call method: exceptionHandler
      Result<String> result0 = globalExceptionHandler0.exceptionHandler(httpServletRequest0, bindException0);
      
      //Test Result Assert
      assertEquals(500101, result0.getCode());
  }
}
