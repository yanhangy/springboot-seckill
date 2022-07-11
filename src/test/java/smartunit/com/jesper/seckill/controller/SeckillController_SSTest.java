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
import org.springframework.ui.Model;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SeckillController_SSTest extends SeckillController_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_list_0()  throws Throwable  {
      //caseID:64b96a67d76a20d05f9af2b38f262b65
      SeckillController seckillController0 = new SeckillController();

      //prepare data for rateLimiter0
      RateLimiter rateLimiter0 = mock(RateLimiter.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(false).when(rateLimiter0).tryAcquire(anyLong() , any(java.util.concurrent.TimeUnit.class));

      //invoke method for seckillController0
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "rateLimiter", (Object) rateLimiter0);
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Result<Integer> result0 = seckillController0.list(model0, user0, 1000L);
      assertEquals(500104, result0.getCode());
  }
  @Test(timeout = 4000)
  public void test_list_1()  throws Throwable  {
      //caseID:7953c8a675fb1b60de2826d33c39854c
      SeckillController seckillController0 = new SeckillController();
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Result<Integer> result0 = seckillController0.list(model0, (User) null, 1379L);
      assertEquals("Session\u4E0D\u5B58\u5728\u6216\u8005\u5DF2\u7ECF\u5931\u6548", result0.getMsg());
  }
  @Test(timeout = 4000)
  public void test_seckillResult_2()  throws Throwable  {
      //caseID:936c71750abda283a4a032a4921870a6
      SeckillController seckillController0 = new SeckillController();

      //prepare data for model1
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model0).when(model1).addAttribute(anyString() , any());
      Result<Long> result0 = seckillController0.seckillResult(model1, (User) null, 2023L);
      assertEquals(500210, result0.getCode());
  }
  @Test(timeout = 4000)
  public void test_seckillResult_3()  throws Throwable  {
      //caseID:bdb3b3ffe64420a906988881522e6df2
      SeckillController seckillController0 = new SeckillController();
      SeckillService seckillService0 = mock(SeckillService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for seckillController0
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "seckillService", (Object) seckillService0);

      //prepare data for model1
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model0).when(model1).addAttribute(anyString() , any());

      //prepare data for user0
      Long long0 = new Long(1000L);
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(user0).getId();
      Result<Long> result0 = seckillController0.seckillResult(model1, user0, 542L);
      assertEquals(0, result0.getCode());
  }
  @Test(timeout = 4000)
  public void test_list_4()  throws Throwable  {
      //caseID:40ea21fae88af4bd951625362ed848de
      SeckillController seckillController0 = new SeckillController();

      //prepare data for hashMap0
      Boolean boolean0 = Boolean.TRUE;
      HashMap<Long, Boolean> hashMap0 = (HashMap<Long, Boolean>) mock(HashMap.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(boolean0).when(hashMap0).get(any());

      //invoke method for seckillController0
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "localOverMap", (Object) hashMap0);

      //prepare data for model1
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model0).when(model1).addAttribute(anyString() , any());
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Result<Integer> result0 = seckillController0.list(model1, user0, 0L);
      assertEquals(500500, result0.getCode());
  }
  @Test(timeout = 4000)
  public void test_list_5()  throws Throwable  {
      //caseID:8a51cc187d62083afcc87f7dcdd58812
      SeckillController seckillController0 = new SeckillController();
      Long long0 = new Long(1518L);
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(redisService0).decr(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString());
      SeckillOrder seckillOrder0 = mock(SeckillOrder.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      OrderService orderService0 = mock(OrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(seckillOrder0).when(orderService0).getOrderByUserIdGoodsId(anyLong() , anyLong());
      Boolean boolean0 = Boolean.FALSE;
      HashMap<Long, Boolean> hashMap0 = (HashMap<Long, Boolean>) mock(HashMap.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(boolean0).when(hashMap0).get(any());
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "localOverMap", (Object) hashMap0);
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "orderService", (Object) orderService0);
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "redisService", (Object) redisService0);
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model0).when(model1).addAttribute(anyString() , any());
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(user0).getId();
      Result<Integer> result0 = seckillController0.list(model1, user0, 729L);
      assertEquals(500501, result0.getCode());
  }

  @Test(timeout = 4000)
  public void test_list_6()  throws Throwable  {
      //caseID:8c8fdf20bc7173238c7c19f2c4fdc39e
      SeckillController seckillController0 = new SeckillController();
      Long long0 = new Long((-218L));
      Long long1 = new Long(0L);
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0, long1).when(redisService0).decr(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString());
      LinkedList<GoodsVo> linkedList0 = new LinkedList<GoodsVo>();
      GoodsService goodsService0 = mock(GoodsService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(linkedList0).when(goodsService0).listGoodsVo();
      SeckillOrder seckillOrder0 = mock(SeckillOrder.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      OrderService orderService0 = mock(OrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(seckillOrder0).when(orderService0).getOrderByUserIdGoodsId(anyLong() , anyLong());
      Boolean boolean0 = Boolean.FALSE;
      HashMap<Long, Boolean> hashMap0 = (HashMap<Long, Boolean>) mock(HashMap.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(boolean0).when(hashMap0).get(any());
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "localOverMap", (Object) hashMap0);
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "orderService", (Object) orderService0);
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "goodsService", (Object) goodsService0);
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "redisService", (Object) redisService0);
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model0).when(model1).addAttribute(anyString() , any());
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long1).when(user0).getId();
      Result<Integer> result0 = seckillController0.list(model1, user0, 0L);
      assertEquals(500501, result0.getCode());
  }

  @Test(timeout = 4000)
  public void test_list_7()  throws Throwable  {
      //caseID:325f53469b70cef8e9259f2696e0e2c7
      SeckillController seckillController0 = new SeckillController();

      //prepare data for hashMap0
      Long long0 = new Long((-15L));
      Boolean boolean0 = new Boolean("2047");
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0, long0).when(redisService0).decr(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString());
      doReturn(boolean0, boolean0, boolean0).when(redisService0).set(nullable(com.jesper.seckill.redis.KeyPrefix.class) , nullable(java.lang.String.class) , any());
      LinkedList<GoodsVo> linkedList0 = new LinkedList<GoodsVo>();
      Integer integer0 = new Integer((-1));
      GoodsVo goodsVo0 = mock(GoodsVo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0, long0).when(goodsVo0).getId();
      doReturn(integer0).when(goodsVo0).getStockCount();
      linkedList0.add(goodsVo0);
      GoodsService goodsService0 = mock(GoodsService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(linkedList0).when(goodsService0).listGoodsVo();
      HashMap<Long, Boolean> hashMap0 = (HashMap<Long, Boolean>) mock(HashMap.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(boolean0).when(hashMap0).get(any());
      doReturn(long0, long0, long0, long0).when(hashMap0).put(anyLong() , anyBoolean());

      //invoke method for seckillController0
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "localOverMap", (Object) hashMap0);

      //invoke method for seckillController0
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "goodsService", (Object) goodsService0);

      //invoke method for seckillController0
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "redisService", (Object) redisService0);

      //prepare data for model1
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model0).when(model1).addAttribute(anyString() , any());
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Result<Integer> result0 = seckillController0.list(model1, user0, 1000L);
      assertEquals(500500, result0.getCode());
  }}
