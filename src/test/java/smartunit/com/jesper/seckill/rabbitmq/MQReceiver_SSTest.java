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
  public void test_receive_0()  throws Throwable  {
      //caseID:269be8a19a83dd0571467bad97668ad6
      MQReceiver mQReceiver0 = new MQReceiver();
      // Undeclared exception!
      try { 

        //invoke method for mQReceiver0
        mQReceiver0.receive("");
      } catch(Throwable e) {
         verifyException("com.jesper.seckill.rabbitmq.MQReceiver", e);
         assertEquals("java.lang.NullPointerException", e.getClass().getName());
      }
  }
  @Test(timeout = 4000)
  public void test_receiveTopic2_1()  throws Throwable  {
      //caseID:25c62eb35a2347bb70586c4ffe6a15e5
      MQReceiver mQReceiver0 = new MQReceiver();

      //invoke method for mQReceiver0
      mQReceiver0.receiveTopic2("com.jesper.seckill.rabbitmq.MQReceiver");
  }
  @Test(timeout = 4000)
  public void test_receiveTopic1_2()  throws Throwable  {
      //caseID:0f7e39641b05be2c41a5a600c18171fd
      MQReceiver mQReceiver0 = new MQReceiver();

      //invoke method for mQReceiver0
      mQReceiver0.receiveTopic1("SHUTDOWN");
  }}