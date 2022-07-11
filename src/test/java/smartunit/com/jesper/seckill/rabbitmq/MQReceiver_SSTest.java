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
      //caseID:24511f5a0027943a962754948f2222b3
      MQReceiver mQReceiver0 = new MQReceiver();
      // Undeclared exception!
      try { 

        //invoke method for mQReceiver0
        mQReceiver0.receive((String) null);
      } catch(Throwable e) {
         verifyException("com.jesper.seckill.rabbitmq.MQReceiver", e);
         assertEquals("java.lang.NullPointerException", e.getClass().getName());
      }
  }
  @Test(timeout = 4000)
  public void test_receiveTopic2_1()  throws Throwable  {
      //caseID:9a3e86bac2f052b313c91ad32dd71c76
      MQReceiver mQReceiver0 = new MQReceiver();

      //invoke method for mQReceiver0
      mQReceiver0.receiveTopic2("");
  }
  @Test(timeout = 4000)
  public void test_receiveTopic1_2()  throws Throwable  {
      //caseID:2afd4c4b8ddf8b1a5503eed0494bd2d9
      MQReceiver mQReceiver0 = new MQReceiver();

      //invoke method for mQReceiver0
      mQReceiver0.receiveTopic1("BGREWRITEAOF");
  }}
