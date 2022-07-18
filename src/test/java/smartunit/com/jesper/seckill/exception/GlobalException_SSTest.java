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
import com.jesper.seckill.result.CodeMsg;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class GlobalException_SSTest extends GlobalException_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_getCodeMsg_0()  throws Throwable  {
      //caseID:88e0b5225eac6e342a7bfbaf2ccbd41e
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("com.jesper.seckill.exception.GlobalException").when(codeMsg0).toString();
      GlobalException globalException0 = new GlobalException(codeMsg0);
      CodeMsg codeMsg1 = globalException0.getCodeMsg();
      assertSame(codeMsg1, codeMsg0);
  }}