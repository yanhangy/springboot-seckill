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
  public void test_getGoodsName_00()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();

      //invoke method for orderInfo0
      orderInfo0.getId();
      String string0 = orderInfo0.getGoodsName();
      assertNull(string0);
  }
  @Test(timeout = 4000)
  public void test_setStatus_01()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();
      Integer integer0 = new Integer(56320);

      //invoke method for orderInfo0
      orderInfo0.setStatus(integer0);

      //invoke method for orderInfo0
      assertNull(orderInfo0.getGoodsId());
  }
  @Test(timeout = 4000)
  public void test_setPayDate_02()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for orderInfo0
      orderInfo0.setPayDate(date0);

      //invoke method for orderInfo0
      assertNull(orderInfo0.getGoodsCount());
  }
  @Test(timeout = 4000)
  public void test_setCreateDate_03()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for orderInfo0
      orderInfo0.setCreateDate(date0);

      //invoke method for orderInfo0
      assertNull(orderInfo0.getId());
  }
  @Test(timeout = 4000)
  public void test_setOrderChannel_04()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();
      Integer integer0 = new Integer((-2181));

      //invoke method for orderInfo0
      orderInfo0.setOrderChannel(integer0);

      //invoke method for orderInfo0
      assertNull(orderInfo0.getGoodsName());
  }
  @Test(timeout = 4000)
  public void test_setGoodsId_05()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();
      Long long0 = new Long(0L);

      //invoke method for orderInfo0
      orderInfo0.setGoodsId(long0);

      //invoke method for orderInfo0
      assertEquals(0L, (long)orderInfo0.getGoodsId());
  }
  @Test(timeout = 4000)
  public void test_setGoodsPrice_06()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();
      Double double0 = new Double(0.0);

      //invoke method for orderInfo0
      orderInfo0.setGoodsPrice(double0);

      //invoke method for orderInfo0
      assertNull(orderInfo0.getGoodsCount());
  }
  @Test(timeout = 4000)
  public void test_setGoodsCount_07()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();
      Integer integer0 = new Integer(127);

      //invoke method for orderInfo0
      orderInfo0.setGoodsCount(integer0);

      //invoke method for orderInfo0
      assertNull(orderInfo0.getGoodsName());
  }
  @Test(timeout = 4000)
  public void test_setGoodsName_08()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();

      //invoke method for orderInfo0
      orderInfo0.getCreateDate();

      //invoke method for orderInfo0
      orderInfo0.setGoodsName("");

      //invoke method for orderInfo0
      assertNull(orderInfo0.getGoodsId());
  }
  @Test(timeout = 4000)
  public void test_getGoodsId_09()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();

      //invoke method for orderInfo0
      orderInfo0.getGoodsPrice();

      //invoke method for orderInfo0
      orderInfo0.getStatus();

      //invoke method for orderInfo0
      orderInfo0.getUserId();
      Long long0 = orderInfo0.getId();
      assertNull(long0);
  }
  @Test(timeout = 4000)
  public void test_setDeliveryAddrId_10()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();

      //invoke method for orderInfo0
      orderInfo0.getOrderChannel();

      //invoke method for orderInfo0
      orderInfo0.getDeliveryAddrId();

      //invoke method for orderInfo0
      orderInfo0.setDeliveryAddrId((Long) null);

      //invoke method for orderInfo0
      assertNull(orderInfo0.getGoodsPrice());
  }
  @Test(timeout = 4000)
  public void test_getGoodsId_11()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();

      //invoke method for orderInfo0
      orderInfo0.getStatus();

      //invoke method for orderInfo0
      orderInfo0.getGoodsId();

      //invoke method for orderInfo0
      orderInfo0.getPayDate();
      Long long0 = orderInfo0.getId();
      assertNull(long0);
  }
  @Test(timeout = 4000)
  public void test_setUserId_12()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();

      //invoke method for orderInfo0
      orderInfo0.getGoodsPrice();

      //invoke method for orderInfo0
      orderInfo0.getCreateDate();

      //invoke method for orderInfo0
      orderInfo0.setUserId((Long) null);

      //invoke method for orderInfo0
      assertNull(orderInfo0.getStatus());
  }
  @Test(timeout = 4000)
  public void test_getGoodsId_13()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();

      //invoke method for orderInfo0
      orderInfo0.getGoodsPrice();

      //invoke method for orderInfo0
      orderInfo0.getStatus();

      //invoke method for orderInfo0
      orderInfo0.getDeliveryAddrId();

      //invoke method for orderInfo0
      orderInfo0.getGoodsId();
      Date date0 = orderInfo0.getPayDate();
      assertNull(date0);
  }
  @Test(timeout = 4000)
  public void test_getGoodsId_14()  throws Throwable  {
      OrderInfo orderInfo0 = new OrderInfo();

      //invoke method for orderInfo0
      orderInfo0.getGoodsPrice();

      //invoke method for orderInfo0
      orderInfo0.getGoodsCount();

      //invoke method for orderInfo0
      orderInfo0.getDeliveryAddrId();

      //invoke method for orderInfo0
      orderInfo0.getGoodsId();
      Date date0 = orderInfo0.getCreateDate();
      assertNull(date0);
  }}
