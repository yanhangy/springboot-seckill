/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.rabbitmq;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.runtime.SmartAssertions.*;
import com.jesper.seckill.rabbitmq.MQReceiver;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MQReceiver_SSTest extends MQReceiver_SSTest_scaffolding {
// allCoveredLines:[20, 39, 40, 41, 62, 63, 67, 68]

  @Test(timeout = 4000)
  public void test_receive_0()  throws Throwable  {
      //caseID:b52c0f5e929be75e64f67a090b470612
      //CoveredLines: [20, 39, 40, 41]
      //Input_0_String: ""
      
      MQReceiver mQReceiver0 = new MQReceiver();
      
      //Call method: receive
      // Undeclared exception!
      try { 
        mQReceiver0.receive("");
      } catch(Throwable e) {
         verifyException("com.jesper.seckill.rabbitmq.MQReceiver", e);
         assertEquals("java.lang.NullPointerException", e.getClass().getName());
      }
  }

  @Test(timeout = 4000)
  public void test_receiveTopic1_1()  throws Throwable  {
      //caseID:76a08536e86c64c36e906ee420c1e971
      //CoveredLines: [20, 62, 63]
      //Input_0_String: "77"
      
      MQReceiver mQReceiver0 = new MQReceiver();
      
      //Call method: receiveTopic1
      mQReceiver0.receiveTopic1("77");
  }

  @Test(timeout = 4000)
  public void test_receiveTopic2_2()  throws Throwable  {
      //caseID:4530c81fb7fe0e4bf69a2b619f61ed73
      //CoveredLines: [20, 67, 68]
      //Input_0_String: " topic  queue1 message:"
      
      MQReceiver mQReceiver0 = new MQReceiver();
      
      //Call method: receiveTopic2
      mQReceiver0.receiveTopic2(" topic  queue1 message:");
  }
}
