/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.config;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.jesper.seckill.config.WebConfig;
import java.util.Stack;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class WebConfig_SSTest extends WebConfig_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_addArgumentResolvers_0()  throws Throwable  {
      //caseID:eeb1e2c1cd99479842d045acb7172d83
      WebConfig webConfig0 = new WebConfig();
      Stack<HandlerMethodArgumentResolver> stack0 = new Stack<HandlerMethodArgumentResolver>();
      webConfig0.addArgumentResolvers(stack0);
      assertFalse(stack0.isEmpty());
  }}
