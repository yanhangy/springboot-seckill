/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.rabbitmq;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.jesper.seckill.bean.User;
import com.jesper.seckill.rabbitmq.SeckillMessage;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SeckillMessage_SSTest extends SeckillMessage_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_getUser_0()  throws Throwable  {
      //caseID:cd75e75eec31ac595aeb5d4ff4cc0691
      SeckillMessage seckillMessage0 = new SeckillMessage();
      User user0 = seckillMessage0.getUser();
      assertNull(user0);
  }
  @Test(timeout = 4000)
  public void test_getGoodsId_1()  throws Throwable  {
      //caseID:68834b55bd415f9d13b0a3f8dbdd4fd3
      SeckillMessage seckillMessage0 = new SeckillMessage();
      long long0 = seckillMessage0.getGoodsId();
      assertEquals(0L, long0);
  }
  @Test(timeout = 4000)
  public void test_setUser_2()  throws Throwable  {
      //caseID:7eb690b12e3e87486cc03e1915024fc6
      SeckillMessage seckillMessage0 = new SeckillMessage();
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for seckillMessage0
      seckillMessage0.setUser(user0);

      //invoke method for seckillMessage0
      assertEquals(0L, seckillMessage0.getGoodsId());
  }
  @Test(timeout = 4000)
  public void test_setGoodsId_3()  throws Throwable  {
      //caseID:8e0141d1be9575621d61d75c67d155de
      SeckillMessage seckillMessage0 = new SeckillMessage();

      //invoke method for seckillMessage0
      seckillMessage0.setGoodsId(2757L);

      //invoke method for seckillMessage0
      assertEquals(2757L, seckillMessage0.getGoodsId());
  }}
