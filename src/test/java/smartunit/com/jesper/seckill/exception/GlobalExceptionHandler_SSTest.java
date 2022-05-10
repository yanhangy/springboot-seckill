/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.jesper.seckill.exception.GlobalExceptionHandler;
import com.jesper.seckill.result.Result;
import javax.servlet.http.HttpServletRequest;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class GlobalExceptionHandler_SSTest extends GlobalExceptionHandler_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_exceptionHandler_0()  throws Throwable  {
      GlobalExceptionHandler globalExceptionHandler0 = new GlobalExceptionHandler();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Exception exception0 = mock(Exception.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Result<String> result0 = globalExceptionHandler0.exceptionHandler(httpServletRequest0, exception0);
      assertEquals(500100, result0.getCode());
  }}