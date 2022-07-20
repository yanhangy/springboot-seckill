/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.rabbitmq;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.jesper.seckill.rabbitmq.MQSender;
import com.jesper.seckill.rabbitmq.SeckillMessage;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.amqp.core.AmqpTemplate;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MQSender_SSTest extends MQSender_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_sendSeckillMessage_0()  throws Throwable  {
      //caseID:9026424411be335032bb0eaee35eeb26
      MQSender mQSender0 = new MQSender();
      AmqpTemplate amqpTemplate0 = mock(AmqpTemplate.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for mQSender0
      PrivateAccess.setVariable((Class<?>) MQSender.class, mQSender0, "amqpTemplate", (Object) amqpTemplate0);

      //invoke method for mQSender0
      mQSender0.sendSeckillMessage((SeckillMessage) null);
  }
  @Test(timeout = 4000)
  public void test_sendTopic_1()  throws Throwable  {
      //caseID:0f3dd627e9dc562588907ff92ea9335d
      MQSender mQSender0 = new MQSender();
      AmqpTemplate amqpTemplate0 = mock(AmqpTemplate.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for mQSender0
      PrivateAccess.setVariable((Class<?>) MQSender.class, mQSender0, "amqpTemplate", (Object) amqpTemplate0);
      Object object0 = new Object();

      //invoke method for mQSender0
      mQSender0.sendTopic(object0);
  }}
