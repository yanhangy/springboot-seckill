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
      //caseID:1d5bbd8602cd5ae9c9ed251dfe9bee6e
      WebConfig webConfig0 = new WebConfig();
      Stack<HandlerMethodArgumentResolver> stack0 = new Stack<HandlerMethodArgumentResolver>();
      webConfig0.addArgumentResolvers(stack0);
      assertEquals("[null]", stack0.toString());
  }}
