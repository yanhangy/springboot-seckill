/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.google.common.util.concurrent.RateLimiter;
import com.jesper.seckill.bean.SeckillOrder;
import com.jesper.seckill.bean.User;
import com.jesper.seckill.controller.SeckillController;
import com.jesper.seckill.rabbitmq.MQSender;
import com.jesper.seckill.redis.RedisService;
import com.jesper.seckill.result.Result;
import com.jesper.seckill.service.GoodsService;
import com.jesper.seckill.service.OrderService;
import com.jesper.seckill.service.SeckillService;
import com.jesper.seckill.vo.GoodsVo;
import java.util.HashMap;
import java.util.LinkedList;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SeckillController_SSTest extends SeckillController_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_list_0()  throws Throwable  {
      SeckillController seckillController0 = new SeckillController();

      //prepare data for rateLimiter0
      RateLimiter rateLimiter0 = mock(RateLimiter.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(false).when(rateLimiter0).tryAcquire(nullable(java.lang.Long.class) , nullable(java.util.concurrent.TimeUnit.class));

      //invoke method for seckillController0
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "rateLimiter", (Object) rateLimiter0);
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Result<Integer> result0 = seckillController0.list(model0, user0, 0L);
      assertEquals(500104, result0.getCode());
  }
  @Test(timeout = 4000)
  public void test_list_1()  throws Throwable  {
      SeckillController seckillController0 = new SeckillController();
      ExtendedModelMap extendedModelMap0 = new ExtendedModelMap();
      Result<Integer> result0 = seckillController0.list(extendedModelMap0, (User) null, (-1L));
      assertEquals(500210, result0.getCode());
  }
  @Test(timeout = 4000)
  public void test_seckillResult_2()  throws Throwable  {
      SeckillController seckillController0 = new SeckillController();
      SeckillService seckillService0 = mock(SeckillService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for seckillController0
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "seckillService", (Object) seckillService0);

      //prepare data for model1
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model0).when(model1).addAttribute(nullable(java.lang.String.class) , any());

      //prepare data for user0
      Long long0 = new Long(1320L);
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(user0).getId();
      Result<Long> result0 = seckillController0.seckillResult(model1, user0, 1000L);
      assertEquals(0, result0.getCode());
  }
  @Test(timeout = 4000)
  public void test_list_3()  throws Throwable  {
      SeckillController seckillController0 = new SeckillController();

      //prepare data for hashMap0
      Boolean boolean0 = new Boolean(true);
      HashMap<Long, Boolean> hashMap0 = (HashMap<Long, Boolean>) mock(HashMap.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(boolean0).when(hashMap0).get(any());

      //invoke method for seckillController0
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "localOverMap", (Object) hashMap0);

      //prepare data for model1
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model0).when(model1).addAttribute(nullable(java.lang.String.class) , any());
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Result<Integer> result0 = seckillController0.list(model1, user0, 0L);
      assertEquals("\u5546\u54C1\u5DF2\u7ECF\u79D2\u6740\u5B8C\u6BD5", result0.getMsg());
  }
  @Test(timeout = 4000)
  public void test_list_4()  throws Throwable  {
      SeckillController seckillController0 = new SeckillController();
      Long long0 = new Long(4204L);
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(redisService0).decr(nullable(com.jesper.seckill.redis.KeyPrefix.class) , nullable(java.lang.String.class));
      SeckillOrder seckillOrder0 = mock(SeckillOrder.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      OrderService orderService0 = mock(OrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(seckillOrder0).when(orderService0).getOrderByUserIdGoodsId(nullable(java.lang.Long.class) , nullable(java.lang.Long.class));
      Boolean boolean0 = Boolean.FALSE;
      HashMap<Long, Boolean> hashMap0 = (HashMap<Long, Boolean>) mock(HashMap.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(boolean0).when(hashMap0).get(any());
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "localOverMap", (Object) hashMap0);
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "orderService", (Object) orderService0);
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "redisService", (Object) redisService0);
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model0).when(model1).addAttribute(nullable(java.lang.String.class) , any());
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(user0).getId();
      Result<Integer> result0 = seckillController0.list(model1, user0, 1166L);
      assertEquals("\u4E0D\u80FD\u91CD\u590D\u79D2\u6740", result0.getMsg());
  }

  @Test(timeout = 4000)
  public void test_list_5()  throws Throwable  {
      SeckillController seckillController0 = new SeckillController();
      MQSender mQSender0 = mock(MQSender.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Long long0 = new Long(208L);
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(redisService0).decr(nullable(com.jesper.seckill.redis.KeyPrefix.class) , nullable(java.lang.String.class));
      OrderService orderService0 = mock(OrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Boolean boolean0 = Boolean.valueOf("0");
      HashMap<Long, Boolean> hashMap0 = (HashMap<Long, Boolean>) mock(HashMap.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(boolean0).when(hashMap0).get(any());
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "localOverMap", (Object) hashMap0);
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "orderService", (Object) orderService0);
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "redisService", (Object) redisService0);
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "sender", (Object) mQSender0);
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model0).when(model1).addAttribute(nullable(java.lang.String.class) , any());
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(user0).getId();
      Result<Integer> result0 = seckillController0.list(model1, user0, 3634L);
      assertEquals(0, result0.getCode());
  }

  @Test(timeout = 4000)
  public void test_list_6()  throws Throwable  {
      SeckillController seckillController0 = new SeckillController();
      Long long0 = new Long((-1L));
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0, long0).when(redisService0).decr(nullable(com.jesper.seckill.redis.KeyPrefix.class) , nullable(java.lang.String.class));
      LinkedList<GoodsVo> linkedList0 = new LinkedList<GoodsVo>();
      GoodsVo goodsVo0 = mock(GoodsVo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      linkedList0.add(goodsVo0);
      GoodsService goodsService0 = mock(GoodsService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(linkedList0).when(goodsService0).listGoodsVo();
      Boolean boolean0 = Boolean.valueOf("");
      HashMap<Long, Boolean> hashMap0 = (HashMap<Long, Boolean>) mock(HashMap.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(boolean0).when(hashMap0).get(any());
      doReturn(long0).when(hashMap0).put(nullable(java.lang.Long.class) , nullable(java.lang.Boolean.class));
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "localOverMap", (Object) hashMap0);
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "goodsService", (Object) goodsService0);
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "redisService", (Object) redisService0);
      ExtendedModelMap extendedModelMap0 = new ExtendedModelMap();
      User user0 = new User();
      seckillController0.list(extendedModelMap0, user0, (-1L));
      assertFalse(extendedModelMap0.isEmpty());
      assertEquals(1, extendedModelMap0.size());
  }

  @Test(timeout = 4000)
  public void test_list_7()  throws Throwable  {
      SeckillController seckillController0 = new SeckillController();
      MQSender mQSender0 = mock(MQSender.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Long long0 = new Long((-605L));
      Long long1 = new Long(2909L);
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0, long1).when(redisService0).decr(nullable(com.jesper.seckill.redis.KeyPrefix.class) , nullable(java.lang.String.class));
      LinkedList<GoodsVo> linkedList0 = new LinkedList<GoodsVo>();
      GoodsService goodsService0 = mock(GoodsService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(linkedList0).when(goodsService0).listGoodsVo();
      OrderService orderService0 = mock(OrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Boolean boolean0 = Boolean.FALSE;
      HashMap<Long, Boolean> hashMap0 = (HashMap<Long, Boolean>) mock(HashMap.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(boolean0).when(hashMap0).get(any());
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "localOverMap", (Object) hashMap0);
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "orderService", (Object) orderService0);
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "goodsService", (Object) goodsService0);
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "redisService", (Object) redisService0);
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "sender", (Object) mQSender0);
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model0).when(model1).addAttribute(nullable(java.lang.String.class) , any());
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(user0).getId();
      Result<Integer> result0 = seckillController0.list(model1, user0, (-1L));
      assertEquals(0, result0.getCode());
  }
}
