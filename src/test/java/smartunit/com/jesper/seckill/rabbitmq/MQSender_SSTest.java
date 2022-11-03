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
// allCoveredLines:[14, 28, 29, 30, 31, 32, 35, 36, 37, 39]

  @Test(timeout = 4000)
  public void test_sendSeckillMessage_0()  throws Throwable  {
      //caseID:c5ad968b03564b30be8ebc125e4e580a
      //CoveredLines: [14, 35, 36, 37, 39]
      //Input_0_SeckillMessage: null
      
      MQSender mQSender0 = new MQSender();
      //mock amqpTemplate0
      AmqpTemplate amqpTemplate0 = mock(AmqpTemplate.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      PrivateAccess.setVariable((Class<?>) MQSender.class, mQSender0, "amqpTemplate", (Object) amqpTemplate0);
      
      //Call method: sendSeckillMessage
      mQSender0.sendSeckillMessage((SeckillMessage) null);
  }

  @Test(timeout = 4000)
  public void test_sendTopic_1()  throws Throwable  {
      //caseID:37fcadbd455422baef80e96b07a84d88
      //CoveredLines: [14, 28, 29, 30, 31, 32]
      //Input_0_Object: mQSender0
      
      MQSender mQSender0 = new MQSender();
      //mock amqpTemplate0
      AmqpTemplate amqpTemplate0 = mock(AmqpTemplate.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      PrivateAccess.setVariable((Class<?>) MQSender.class, mQSender0, "amqpTemplate", (Object) amqpTemplate0);
      
      //Call method: sendTopic
      mQSender0.sendTopic(mQSender0);
  }
}
