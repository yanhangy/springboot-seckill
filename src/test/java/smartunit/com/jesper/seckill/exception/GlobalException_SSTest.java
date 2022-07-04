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
      //caseID:6fd08dc3f0d81ee02a5d3b4d45bb0325

      //prepare data for codeMsg0
      CodeMsg codeMsg0 = mock(CodeMsg.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("\u767B\u5F55\u5BC6\u7801\u4E0D\u80FD\u4E3A\u7A7A").when(codeMsg0).toString();
      GlobalException globalException0 = new GlobalException(codeMsg0);
      CodeMsg codeMsg1 = globalException0.getCodeMsg();
      assertEquals(0, codeMsg1.getCode());
  }}
