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

  @Test(timeout = 4000)
  public void test_addArgumentResolvers_0()  throws Throwable  {
      //caseID:0552cddf386d044565719c838cee0d5c
      WebConfig webConfig0 = new WebConfig();
      UserArgumentResolver userArgumentResolver0 = mock(UserArgumentResolver.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for webConfig0
      PrivateAccess.setVariable((Class<?>) WebConfig.class, webConfig0, "userArgumentResolver", (Object) userArgumentResolver0);
      Sequence sequence0 = new Sequence();
      webConfig0.addArgumentResolvers(sequence0);
      assertFalse(sequence0.isEmpty());
  }}
