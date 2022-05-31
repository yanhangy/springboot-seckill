/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
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
import org.springframework.ui.Model;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SeckillController_SSTest extends SeckillController_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_seckillResult_0()  throws Throwable  {
      //caseID:1145a2058d51f918273935b62094d6b9
      SeckillController seckillController0 = new SeckillController();
      SeckillService seckillService0 = mock(SeckillService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for seckillController0
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "seckillService", (Object) seckillService0);

      //prepare data for model1
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model0).when(model1).addAttribute(anyString() , any());

      //prepare data for user0
      Long long0 = new Long(9223372036854775807L);
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(user0).getId();
      Result<Long> result0 = seckillController0.seckillResult(model1, user0, 461L);
      assertEquals(0, result0.getCode());
  }
  @Test(timeout = 4000)
  public void test_list_1()  throws Throwable  {
      //caseID:152b610c547245700d9e450f5b935aef
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
      Result<Integer> result0 = seckillController0.list(model1, user0, 492L);
      assertEquals(500500, result0.getCode());
  }
  @Test(timeout = 4000)
  public void test_list_2()  throws Throwable  {
      //caseID:a4305b600de9369b35d8f9a52bf8ffb8
      SeckillController seckillController0 = new SeckillController();
      MQSender mQSender0 = mock(MQSender.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Long long0 = new Long(2379L);
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(redisService0).decr(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString());
      OrderService orderService0 = mock(OrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Boolean boolean0 = new Boolean(false);
      HashMap<Long, Boolean> hashMap0 = (HashMap<Long, Boolean>) mock(HashMap.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(boolean0).when(hashMap0).get(any());
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "localOverMap", (Object) hashMap0);
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "orderService", (Object) orderService0);
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "redisService", (Object) redisService0);
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "sender", (Object) mQSender0);
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model0).when(model1).addAttribute(anyString() , any());
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(user0).getId();
      Result<Integer> result0 = seckillController0.list(model1, user0, 1L);
      assertEquals(0, result0.getCode());
  }

  @Test(timeout = 4000)
  public void test_list_3()  throws Throwable  {
      //caseID:803d994cf548873fdf4b32553e964767
      SeckillController seckillController0 = new SeckillController();
      Long long0 = new Long((-627L));
      Boolean boolean0 = Boolean.valueOf(true);
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0, long0).when(redisService0).decr(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString());
      doReturn(boolean0).when(redisService0).set(nullable(com.jesper.seckill.redis.KeyPrefix.class) , nullable(java.lang.String.class) , any());
      LinkedList<GoodsVo> linkedList0 = new LinkedList<GoodsVo>();
      Integer integer0 = new Integer((-1));
      GoodsVo goodsVo0 = mock(GoodsVo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0, long0).when(goodsVo0).getId();
      doReturn(integer0).when(goodsVo0).getStockCount();
      linkedList0.add(goodsVo0);
      GoodsService goodsService0 = mock(GoodsService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(linkedList0).when(goodsService0).listGoodsVo();
      Boolean boolean1 = new Boolean("");
      HashMap<Long, Boolean> hashMap0 = (HashMap<Long, Boolean>) mock(HashMap.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(boolean1).when(hashMap0).get(any());
      doReturn(long0, long0).when(hashMap0).put(anyLong() , anyBoolean());
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "localOverMap", (Object) hashMap0);
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "goodsService", (Object) goodsService0);
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "redisService", (Object) redisService0);
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model0).when(model1).addAttribute(anyString() , any());
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Result<Integer> result0 = seckillController0.list(model1, user0, 3209L);
      assertEquals("\u5546\u54C1\u5DF2\u7ECF\u79D2\u6740\u5B8C\u6BD5", result0.getMsg());
  }

  @Test(timeout = 4000)
  public void test_list_4()  throws Throwable  {
      //caseID:9d1dfe0d2993f512203d10a8ad7e9cc3
      SeckillController seckillController0 = new SeckillController();
      Long long0 = new Long((-8L));
      Long long1 = new Long(1530L);
      Boolean boolean0 = Boolean.TRUE;
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0, long1).when(redisService0).decr(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString());
      doReturn(boolean0).when(redisService0).set(nullable(com.jesper.seckill.redis.KeyPrefix.class) , nullable(java.lang.String.class) , any());
      LinkedList<GoodsVo> linkedList0 = new LinkedList<GoodsVo>();
      Integer integer0 = new Integer(1);
      GoodsVo goodsVo0 = mock(GoodsVo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0, long0).when(goodsVo0).getId();
      doReturn(integer0).when(goodsVo0).getStockCount();
      linkedList0.add(goodsVo0);
      GoodsService goodsService0 = mock(GoodsService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(linkedList0).when(goodsService0).listGoodsVo();
      SeckillOrder seckillOrder0 = mock(SeckillOrder.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      OrderService orderService0 = mock(OrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(seckillOrder0).when(orderService0).getOrderByUserIdGoodsId(anyLong() , anyLong());
      Boolean boolean1 = Boolean.FALSE;
      HashMap<Long, Boolean> hashMap0 = (HashMap<Long, Boolean>) mock(HashMap.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(boolean1).when(hashMap0).get(any());
      doReturn(long1).when(hashMap0).put(anyLong() , anyBoolean());
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "localOverMap", (Object) hashMap0);
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "orderService", (Object) orderService0);
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "goodsService", (Object) goodsService0);
      PrivateAccess.setVariable((Class<?>) SeckillController.class, seckillController0, "redisService", (Object) redisService0);
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model0).when(model1).addAttribute(anyString() , any());
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long1).when(user0).getId();
      Result<Integer> result0 = seckillController0.list(model1, user0, 827L);
      assertEquals(500501, result0.getCode());
  }
}
