/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.config;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.jesper.seckill.config.WebConfig;
import java.util.ArrayList;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class WebConfig_SSTest extends WebConfig_SSTest_scaffolding {
// allCoveredLines:[16, 27, 28]

  @Test(timeout = 4000)
  public void test_addArgumentResolvers_0()  throws Throwable  {
      //caseID:c6c2e036629ee27d6a8732b5fc601c36
      //CoveredLines: [16, 27, 28]
      //Input_0_HandlerMethodArgumentResolver>: arrayList0
      
      WebConfig webConfig0 = new WebConfig();
      ArrayList<HandlerMethodArgumentResolver> arrayList0 = new ArrayList<HandlerMethodArgumentResolver>();
      
      //Call method: addArgumentResolvers
      webConfig0.addArgumentResolvers(arrayList0);
      
      //Test Result Assert
      assertFalse(arrayList0.isEmpty());
  }
}
