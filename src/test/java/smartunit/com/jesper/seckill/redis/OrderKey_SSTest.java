/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.redis;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.jesper.seckill.redis.OrderKey;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class OrderKey_SSTest extends OrderKey_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      //caseID:923d8cf449517e0b02942d3dbe477bdf
      OrderKey orderKey0 = new OrderKey("1.0");

      //invoke method for orderKey0
      assertEquals(0, orderKey0.expireSeconds());
  }}
