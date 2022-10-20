/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.config;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.jesper.seckill.config.UserArgumentResolver;
import com.jesper.seckill.config.WebConfig;
import groovy.lang.Sequence;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class WebConfig_SSTest extends WebConfig_SSTest_scaffolding {
// allCoveredLines:[16, 27, 28]

  @Test(timeout = 4000)
  public void test_addArgumentResolvers_0()  throws Throwable  {
      //caseID:2e02c16a0831d694fd79b4ba56f9e3c3
      //CoveredLines: [16, 27, 28]
      //Input_0_HandlerMethodArgumentResolver>: sequence0
      
      WebConfig webConfig0 = new WebConfig();
      //mock userArgumentResolver0
      UserArgumentResolver userArgumentResolver0 = mock(UserArgumentResolver.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      PrivateAccess.setVariable((Class<?>) WebConfig.class, webConfig0, "userArgumentResolver", (Object) userArgumentResolver0);
      Sequence sequence0 = new Sequence();
      
      //Call method: addArgumentResolvers
      webConfig0.addArgumentResolvers(sequence0);
      
      //Test Result Assert
      assertFalse(sequence0.isEmpty());
  }
}
