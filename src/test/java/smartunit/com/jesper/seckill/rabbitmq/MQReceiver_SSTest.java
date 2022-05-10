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

  @Test(timeout = 4000)
  public void test_receiveTopic2_0()  throws Throwable  {
      MQReceiver mQReceiver0 = new MQReceiver();

      //invoke method for mQReceiver0
      mQReceiver0.receiveTopic2("1");
  }
  @Test(timeout = 4000)
  public void test_receiveTopic1_1()  throws Throwable  {
      MQReceiver mQReceiver0 = new MQReceiver();

      //invoke method for mQReceiver0
      mQReceiver0.receiveTopic1("57343");
  }
  @Test(timeout = 4000)
  public void test_receive_2()  throws Throwable  {
      MQReceiver mQReceiver0 = new MQReceiver();
      // Undeclared exception!
      try { 

        //invoke method for mQReceiver0
        mQReceiver0.receive("");
      
      } catch(Throwable e) {
         //
         // Exception Name: NullPointerException
         // no message in exception (getMessage() returned null)
         //
      }
  }}