/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.service;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.jesper.seckill.bean.OrderInfo;
import com.jesper.seckill.bean.SeckillOrder;
import com.jesper.seckill.bean.User;
import com.jesper.seckill.redis.RedisService;
import com.jesper.seckill.service.GoodsService;
import com.jesper.seckill.service.OrderService;
import com.jesper.seckill.service.SeckillService;
import com.jesper.seckill.vo.GoodsVo;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SeckillService_SSTest extends SeckillService_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_getGoodsOver_0()  throws Throwable  {
      //caseID:eef1b293659ed771fd38f4c790428eee
      SeckillService seckillService0 = new SeckillService();

      //prepare data for redisService0
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(false).when(redisService0).exists(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString());

      //invoke method for seckillService0
      PrivateAccess.setVariable((Class<?>) SeckillService.class, seckillService0, "redisService", (Object) redisService0);
      Object object0 = PrivateAccess.callMethod((Class<SeckillService>) SeckillService.class, seckillService0, "getGoodsOver", (Object) (-1L), (Class<?>) long.class);
      assertEquals(false, object0);
  }
  @Test(timeout = 4000)
  public void test_setGoodsOver_1()  throws Throwable  {
      //caseID:1404eb4296cf7ecb1788eb4ad6310024
      SeckillService seckillService0 = new SeckillService();

      //prepare data for redisService0
      Boolean boolean0 = Boolean.valueOf(true);
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(boolean0).when(redisService0).set(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString() , any());

      //invoke method for seckillService0
      PrivateAccess.setVariable((Class<?>) SeckillService.class, seckillService0, "redisService", (Object) redisService0);
      Long long0 = new Long(1223L);
      Object object0 = PrivateAccess.callMethod((Class<SeckillService>) SeckillService.class, seckillService0, "setGoodsOver", (Object) long0, (Class<?>) Long.class);
      assertNull(object0);
  }
  @Test(timeout = 4000)
  public void test_seckill_2()  throws Throwable  {
      //caseID:158e418aec5b0674d9fc308ff69c53b5
      SeckillService seckillService0 = new SeckillService();

      //prepare data for goodsService0
      GoodsService goodsService0 = mock(GoodsService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(true).when(goodsService0).reduceStock(any(com.jesper.seckill.vo.GoodsVo.class));

      //prepare data for orderService0
      OrderInfo orderInfo0 = mock(OrderInfo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("S?>:7RD").when(orderInfo0).toString();
      OrderService orderService0 = mock(OrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(orderInfo0).when(orderService0).createOrder(any(com.jesper.seckill.bean.User.class) , any(com.jesper.seckill.vo.GoodsVo.class));

      //invoke method for seckillService0
      PrivateAccess.setVariable((Class<?>) SeckillService.class, seckillService0, "orderService", (Object) orderService0);

      //invoke method for seckillService0
      PrivateAccess.setVariable((Class<?>) SeckillService.class, seckillService0, "goodsService", (Object) goodsService0);
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      GoodsVo goodsVo0 = mock(GoodsVo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      OrderInfo orderInfo1 = seckillService0.seckill(user0, goodsVo0);
      assertNull(orderInfo1.getUserId());
  }
  @Test(timeout = 4000)
  public void test_getSeckillResult_3()  throws Throwable  {
      //caseID:1eb2475ce5fc354ba745489253eccbcd
      SeckillService seckillService0 = new SeckillService();

      //prepare data for orderService0
      Long long0 = new Long(0L);
      SeckillOrder seckillOrder0 = mock(SeckillOrder.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(seckillOrder0).getOrderId();
      OrderService orderService0 = mock(OrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(seckillOrder0).when(orderService0).getOrderByUserIdGoodsId(anyLong() , anyLong());

      //invoke method for seckillService0
      PrivateAccess.setVariable((Class<?>) SeckillService.class, seckillService0, "orderService", (Object) orderService0);
      long long1 = seckillService0.getSeckillResult(1L, 1064L);
      assertEquals(0L, long1);
  }}
