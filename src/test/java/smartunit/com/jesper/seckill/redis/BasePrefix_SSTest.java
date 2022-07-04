/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.redis;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.jesper.seckill.redis.BasePrefix;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BasePrefix_SSTest extends BasePrefix_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_expireSeconds_0()  throws Throwable  {
      //caseID:93d343ae8254c170a6d874108130be39
      BasePrefix basePrefix0 = mock(BasePrefix.class, CALLS_REAL_METHODS);
      int int0 = basePrefix0.expireSeconds();
      assertEquals(0, int0);
  }
  @Test(timeout = 4000)
  public void test_getPrefix_1()  throws Throwable  {
      //caseID:4939b790279248dceb22dc28c4e35ed9
      BasePrefix basePrefix0 = mock(BasePrefix.class, CALLS_REAL_METHODS);
      String string0 = basePrefix0.getPrefix();
      //  // Unstable assertion: assertEquals("BasePrefix$MockitoMock$116194319:null", string0);
  }}
