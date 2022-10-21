/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.config;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.jesper.seckill.config.WebConfig;
import java.util.Vector;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class WebConfig_SSTest extends WebConfig_SSTest_scaffolding {
// allCoveredLines:[16, 27, 28]

  @Test(timeout = 4000)
  public void test_addArgumentResolvers_0()  throws Throwable  {
      //caseID:553b3fdb6e742c6c85f470e9488f7184
      //CoveredLines: [16, 27, 28]
      //Input_0_HandlerMethodArgumentResolver>: vector0
      
      WebConfig webConfig0 = new WebConfig();
      Vector<HandlerMethodArgumentResolver> vector0 = new Vector<HandlerMethodArgumentResolver>();
      
      //Call method: addArgumentResolvers
      webConfig0.addArgumentResolvers(vector0);
      
      //Test Result Assert
      assertFalse(vector0.isEmpty());
  }
}
