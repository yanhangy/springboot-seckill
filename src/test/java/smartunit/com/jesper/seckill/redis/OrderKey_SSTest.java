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
// allCoveredLines:[9, 10]

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      //caseID:ff40055696c126da0599dd73b4b5c48a
      //CoveredLines: [9, 10]
      
      OrderKey orderKey0 = new OrderKey("d]");
      
      //Test Result Assert
      assertEquals(0, orderKey0.expireSeconds());
  }
}
