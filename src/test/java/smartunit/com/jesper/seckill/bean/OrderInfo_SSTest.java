/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.bean;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.jesper.seckill.bean.OrderInfo;
import java.util.Date;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class OrderInfo_SSTest extends OrderInfo_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_setGoodsId_00()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();
      Long long0 = new Long(5417L);

      //invoke method for orderInfo0
      orderInfo0.setGoodsId(long0);

      //invoke method for orderInfo0
      assertNull(orderInfo0.getStatus());
  }
  @Test(timeout = 4000)
  public void test_setUserId_01()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();
      Long long0 = new Long(488L);

      //invoke method for orderInfo0
      orderInfo0.setUserId(long0);

      //invoke method for orderInfo0
      assertNull(orderInfo0.getOrderChannel());
  }
  @Test(timeout = 4000)
  public void test_setOrderChannel_02()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();
      Integer integer0 = new Integer(1);

      //invoke method for orderInfo0
      orderInfo0.setOrderChannel(integer0);

      //invoke method for orderInfo0
      assertNull(orderInfo0.getId());
  }
  @Test(timeout = 4000)
  public void test_getGoodsName_03()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();

      //invoke method for orderInfo0
      orderInfo0.getDeliveryAddrId();
      String string0 = orderInfo0.getGoodsName();
      assertNull(string0);
  }
  @Test(timeout = 4000)
  public void test_setGoodsName_04()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();

      //invoke method for orderInfo0
      orderInfo0.getCreateDate();

      //invoke method for orderInfo0
      orderInfo0.setGoodsName("12");

      //invoke method for orderInfo0
      assertNull(orderInfo0.getId());
  }
  @Test(timeout = 4000)
  public void test_setDeliveryAddrId_05()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();
      Long long0 = Long.getLong("1.0", (-1L));

      //invoke method for orderInfo0
      orderInfo0.getUserId();

      //invoke method for orderInfo0
      orderInfo0.setDeliveryAddrId(long0);

      //invoke method for orderInfo0
      assertNull(orderInfo0.getId());
  }
  @Test(timeout = 4000)
  public void test_setCreateDate_06()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();

      //invoke method for orderInfo0
      orderInfo0.getGoodsId();
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for orderInfo0
      orderInfo0.setCreateDate(date0);

      //invoke method for orderInfo0
      assertNull(orderInfo0.getUserId());
  }
  @Test(timeout = 4000)
  public void test_setStatus_07()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();
      Integer integer0 = new Integer((-1));

      //invoke method for orderInfo0
      orderInfo0.getId();

      //invoke method for orderInfo0
      orderInfo0.setStatus(integer0);

      //invoke method for orderInfo0
      assertNull(orderInfo0.getGoodsName());
  }
  @Test(timeout = 4000)
  public void test_setGoodsCount_08()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();

      //invoke method for orderInfo0
      orderInfo0.getGoodsPrice();

      //invoke method for orderInfo0
      orderInfo0.getStatus();

      //invoke method for orderInfo0
      orderInfo0.getDeliveryAddrId();
      Date date0 = orderInfo0.getCreateDate();
      assertNull(date0);
  }
  @Test(timeout = 4000)
  public void test_setPayDate_09()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();

      //invoke method for orderInfo0
      orderInfo0.getStatus();

      //invoke method for orderInfo0
      orderInfo0.getUserId();
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for orderInfo0
      orderInfo0.setPayDate(date0);

      //invoke method for orderInfo0
      assertNull(orderInfo0.getStatus());
  }
  @Test(timeout = 4000)
  public void test_setGoodsPrice_10()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();
      Double double0 = new Double(2144.15);

      //invoke method for orderInfo0
      orderInfo0.getStatus();

      //invoke method for orderInfo0
      orderInfo0.getUserId();

      //invoke method for orderInfo0
      orderInfo0.getCreateDate();

      //invoke method for orderInfo0
      orderInfo0.setGoodsPrice(double0);

      //invoke method for orderInfo0
      assertNull(orderInfo0.getId());
  }
  @Test(timeout = 4000)
  public void test_setGoodsCount_11()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();

      //invoke method for orderInfo0
      orderInfo0.getGoodsPrice();

      //invoke method for orderInfo0
      orderInfo0.getStatus();

      //invoke method for orderInfo0
      orderInfo0.getId();

      //invoke method for orderInfo0
      orderInfo0.getPayDate();

      //invoke method for orderInfo0
      orderInfo0.setGoodsCount((Integer) null);

      //invoke method for orderInfo0
      assertNull(orderInfo0.getGoodsCount());
  }
  @Test(timeout = 4000)
  public void test_setGoodsCount_12()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();

      //invoke method for orderInfo0
      orderInfo0.getGoodsPrice();

      //invoke method for orderInfo0
      orderInfo0.getStatus();

      //invoke method for orderInfo0
      orderInfo0.getUserId();

      //invoke method for orderInfo0
      orderInfo0.getPayDate();

      //invoke method for orderInfo0
      orderInfo0.setGoodsCount((Integer) null);

      //invoke method for orderInfo0
      assertNull(orderInfo0.getGoodsCount());
  }
  @Test(timeout = 4000)
  public void test_setGoodsCount_13()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();

      //invoke method for orderInfo0
      orderInfo0.getGoodsPrice();

      //invoke method for orderInfo0
      orderInfo0.getGoodsCount();

      //invoke method for orderInfo0
      orderInfo0.getGoodsId();

      //invoke method for orderInfo0
      orderInfo0.getPayDate();

      //invoke method for orderInfo0
      orderInfo0.setGoodsCount((Integer) null);

      //invoke method for orderInfo0
      assertNull(orderInfo0.getOrderChannel());
  }
  @Test(timeout = 4000)
  public void test_setGoodsCount_14()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();

      //invoke method for orderInfo0
      orderInfo0.getGoodsPrice();

      //invoke method for orderInfo0
      orderInfo0.getOrderChannel();

      //invoke method for orderInfo0
      orderInfo0.getGoodsId();

      //invoke method for orderInfo0
      orderInfo0.getPayDate();

      //invoke method for orderInfo0
      orderInfo0.setGoodsCount((Integer) null);

      //invoke method for orderInfo0
      assertNull(orderInfo0.getGoodsPrice());
  }}
