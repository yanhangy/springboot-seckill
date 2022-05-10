/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.bean;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.jesper.seckill.bean.Goods;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Goods_SSTest extends Goods_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_setId_00()  throws Throwable  {
      Goods goods0 = new Goods();
      Long long0 = new Long(543L);

      //invoke method for goods0
      goods0.setId(long0);

      //invoke method for goods0
      assertNull(goods0.getGoodsPrice());
  }
  @Test(timeout = 4000)
  public void test_setGoodsDetail_01()  throws Throwable  {
      Goods goods0 = new Goods();

      //invoke method for goods0
      goods0.setGoodsDetail("");

      //invoke method for goods0
      assertNull(goods0.getGoodsName());
  }
  @Test(timeout = 4000)
  public void test_setGoodsStock_02()  throws Throwable  {
      Goods goods0 = new Goods();
      Integer integer0 = new Integer((-1));

      //invoke method for goods0
      goods0.setGoodsStock(integer0);

      //invoke method for goods0
      assertNull(goods0.getId());
  }
  @Test(timeout = 4000)
  public void test_setGoodsTitle_03()  throws Throwable  {
      Goods goods0 = new Goods();

      //invoke method for goods0
      goods0.setGoodsTitle("1.0");

      //invoke method for goods0
      assertEquals("1.0", goods0.getGoodsTitle());
  }
  @Test(timeout = 4000)
  public void test_setGoodsPrice_04()  throws Throwable  {
      Goods goods0 = new Goods();
      Double double0 = new Double(1.0);

      //invoke method for goods0
      goods0.setGoodsPrice(double0);

      //invoke method for goods0
      assertNull(goods0.getGoodsDetail());
  }
  @Test(timeout = 4000)
  public void test_setGoodsImg_05()  throws Throwable  {
      Goods goods0 = new Goods();

      //invoke method for goods0
      goods0.setGoodsImg("");

      //invoke method for goods0
      assertNull(goods0.getGoodsName());
  }
  @Test(timeout = 4000)
  public void test_setGoodsName_06()  throws Throwable  {
      Goods goods0 = new Goods();

      //invoke method for goods0
      goods0.setGoodsName("");

      //invoke method for goods0
      assertNull(goods0.getGoodsTitle());
  }
  @Test(timeout = 4000)
  public void test_getGoodsDetail_07()  throws Throwable  {
      Goods goods0 = new Goods();

      //invoke method for goods0
      goods0.getGoodsPrice();

      //invoke method for goods0
      goods0.getGoodsStock();

      //invoke method for goods0
      goods0.getId();
      String string0 = goods0.getGoodsName();
      assertNull(string0);
  }
  @Test(timeout = 4000)
  public void test_getGoodsDetail_08()  throws Throwable  {
      Goods goods0 = new Goods();

      //invoke method for goods0
      goods0.getGoodsPrice();

      //invoke method for goods0
      goods0.getGoodsStock();

      //invoke method for goods0
      goods0.getId();
      String string0 = goods0.getGoodsDetail();
      assertNull(string0);
  }
  @Test(timeout = 4000)
  public void test_getGoodsDetail_09()  throws Throwable  {
      Goods goods0 = new Goods();

      //invoke method for goods0
      goods0.getGoodsPrice();

      //invoke method for goods0
      goods0.getGoodsStock();

      //invoke method for goods0
      goods0.getId();
      String string0 = goods0.getGoodsImg();
      assertNull(string0);
  }
  @Test(timeout = 4000)
  public void test_getGoodsDetail_10()  throws Throwable  {
      Goods goods0 = new Goods();

      //invoke method for goods0
      goods0.getGoodsPrice();

      //invoke method for goods0
      goods0.getGoodsStock();

      //invoke method for goods0
      goods0.getId();
      String string0 = goods0.getGoodsTitle();
      assertNull(string0);
  }}
