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
import com.jesper.seckill.mapper.OrderMapper;
import com.jesper.seckill.redis.RedisService;
import com.jesper.seckill.service.OrderService;
import com.jesper.seckill.vo.GoodsVo;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class OrderService_SSTest extends OrderService_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_getOrderById_0()  throws Throwable  {
      OrderService orderService0 = new OrderService();

      //prepare data for orderMapper0
      OrderInfo orderInfo0 = mock(OrderInfo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      OrderMapper orderMapper0 = mock(OrderMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(orderInfo0).when(orderMapper0).getOrderById(nullable(java.lang.Long.class));

      //invoke method for orderService0
      PrivateAccess.setVariable((Class<?>) OrderService.class, orderService0, "orderMapper", (Object) orderMapper0);
      OrderInfo orderInfo1 = orderService0.getOrderById(1709L);
      assertNull(orderInfo1.getDeliveryAddrId());
  }
  @Test(timeout = 4000)
  public void test_getOrderByUserIdGoodsId_1()  throws Throwable  {
      OrderService orderService0 = new OrderService();
      SeckillOrder seckillOrder0 = mock(SeckillOrder.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(seckillOrder0).when(redisService0).get(nullable(com.jesper.seckill.redis.KeyPrefix.class) , nullable(java.lang.String.class) , nullable(java.lang.Class.class));
      PrivateAccess.setVariable((Class<?>) OrderService.class, orderService0, "redisService", (Object) redisService0);
      SeckillOrder seckillOrder1 = orderService0.getOrderByUserIdGoodsId(0L, 0L);
      assertSame(seckillOrder1, seckillOrder0);
  }
  @Test(timeout = 4000)
  public void test_createOrder_2()  throws Throwable  {
      OrderService orderService0 = new OrderService();

      //prepare data for orderMapper0
      OrderMapper orderMapper0 = mock(OrderMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0L).when(orderMapper0).insert(nullable(com.jesper.seckill.bean.OrderInfo.class));
      doReturn(0).when(orderMapper0).insertSeckillOrder(nullable(com.jesper.seckill.bean.SeckillOrder.class));

      //prepare data for redisService0
      Boolean boolean0 = Boolean.valueOf("29");
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(boolean0).when(redisService0).set(nullable(com.jesper.seckill.redis.KeyPrefix.class) , nullable(java.lang.String.class) , any());

      //invoke method for orderService0
      PrivateAccess.setVariable((Class<?>) OrderService.class, orderService0, "redisService", (Object) redisService0);

      //invoke method for orderService0
      PrivateAccess.setVariable((Class<?>) OrderService.class, orderService0, "orderMapper", (Object) orderMapper0);
      User user0 = new User();
      GoodsVo goodsVo0 = new GoodsVo();
      OrderInfo orderInfo0 = orderService0.createOrder(user0, goodsVo0);
      assertEquals(0L, (long)orderInfo0.getDeliveryAddrId());
      assertEquals(0, (int)orderInfo0.getStatus());
      assertEquals(1, (int)orderInfo0.getGoodsCount());
      assertEquals(1, (int)orderInfo0.getOrderChannel());
  }}
