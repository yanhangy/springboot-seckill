/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.rabbitmq;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.jesper.seckill.rabbitmq.MQConfig;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Queue;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MQConfig_SSTest extends MQConfig_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_queue_0()  throws Throwable  {
      //caseID:9eb417b32182ea1559c11ddfad6acf0c
      MQConfig mQConfig0 = new MQConfig();
      Queue queue0 = mQConfig0.queue();
      assertTrue(queue0.isDurable());
      assertEquals("queue", queue0.getName());
  }
  @Test(timeout = 4000)
  public void test_topicBinding2_1()  throws Throwable  {
      //caseID:ea347f5ed7fb16405c51360fe900d3a1
      MQConfig mQConfig0 = new MQConfig();
      Binding binding0 = mQConfig0.topicBinding2();
      assertEquals("topic.queue2", binding0.getDestination());
      assertEquals("topicExchage", binding0.getExchange());
      assertEquals("topic.#", binding0.getRoutingKey());
  }
  @Test(timeout = 4000)
  public void test_topicBinding1_2()  throws Throwable  {
      //caseID:bef5c26011d4401129c4a8a8d24cd2ef
      MQConfig mQConfig0 = new MQConfig();
      Binding binding0 = mQConfig0.topicBinding1();
      assertEquals("topicExchage", binding0.getExchange());
      assertEquals("topic.queue1", binding0.getDestination());
      assertEquals("topic.key1", binding0.getRoutingKey());
  }}
