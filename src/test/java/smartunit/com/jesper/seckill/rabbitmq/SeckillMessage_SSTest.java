/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.rabbitmq;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.jesper.seckill.bean.User;
import com.jesper.seckill.rabbitmq.SeckillMessage;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SeckillMessage_SSTest extends SeckillMessage_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_getGoodsId_0()  throws Throwable  {
      SeckillMessage seckillMessage0 = new SeckillMessage();

      //invoke method for seckillMessage0
      seckillMessage0.getUser();
      long long0 = seckillMessage0.getGoodsId();
      assertEquals(0L, long0);
  }
  @Test(timeout = 4000)
  public void test_setUser_1()  throws Throwable  {
      SeckillMessage seckillMessage0 = new SeckillMessage();
      User user0 = seckillMessage0.getUser();

      //invoke method for seckillMessage0
      seckillMessage0.setUser(user0);

      //invoke method for seckillMessage0
      assertEquals(0L, seckillMessage0.getGoodsId());
  }
  @Test(timeout = 4000)
  public void test_setGoodsId_2()  throws Throwable  {
      SeckillMessage seckillMessage0 = new SeckillMessage();

      //invoke method for seckillMessage0
      seckillMessage0.getUser();

      //invoke method for seckillMessage0
      seckillMessage0.setGoodsId(504L);

      //invoke method for seckillMessage0
      assertEquals(504L, seckillMessage0.getGoodsId());
  }}
