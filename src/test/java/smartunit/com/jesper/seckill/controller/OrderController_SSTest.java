/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.jesper.seckill.bean.OrderInfo;
import com.jesper.seckill.bean.User;
import com.jesper.seckill.controller.OrderController;
import com.jesper.seckill.result.Result;
import com.jesper.seckill.service.GoodsService;
import com.jesper.seckill.service.OrderService;
import com.jesper.seckill.vo.OrderDetailVo;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.ui.Model;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class OrderController_SSTest extends OrderController_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_info_0()  throws Throwable  {
      OrderController orderController0 = new OrderController();
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Result<OrderDetailVo> result0 = orderController0.info(model0, (User) null, 0L);
      assertEquals(500210, result0.getCode());
  }
  @Test(timeout = 4000)
  public void test_info_1()  throws Throwable  {
      OrderController orderController0 = new OrderController();
      GoodsService goodsService0 = mock(GoodsService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //prepare data for orderService0
      Long long0 = new Long(2587L);
      OrderInfo orderInfo0 = mock(OrderInfo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(orderInfo0).getGoodsId();
      OrderService orderService0 = mock(OrderService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(orderInfo0).when(orderService0).getOrderById(nullable(java.lang.Long.class));

      //invoke method for orderController0
      PrivateAccess.setVariable((Class<?>) OrderController.class, orderController0, "orderService", (Object) orderService0);

      //invoke method for orderController0
      PrivateAccess.setVariable((Class<?>) OrderController.class, orderController0, "goodsService", (Object) goodsService0);
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Result<OrderDetailVo> result0 = orderController0.info(model0, user0, (-1L));
      assertEquals(0, result0.getCode());
  }}
