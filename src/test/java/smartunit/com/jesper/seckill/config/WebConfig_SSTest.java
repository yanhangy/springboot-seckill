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

  @Test(timeout = 4000)
  public void test_addArgumentResolvers_0()  throws Throwable  {
      //caseID:ea36d59aff7a20a4fb8c6c21583bed72
      WebConfig webConfig0 = new WebConfig();
      Vector<HandlerMethodArgumentResolver> vector0 = new Vector<HandlerMethodArgumentResolver>();
      webConfig0.addArgumentResolvers(vector0);
      assertEquals(1, vector0.size());
  }}
