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
  public void test_getGoodsDetail_00()  throws Throwable  {
      //caseID:aa22373c132c123b81850b5aca35276d
      Goods goods0 = new Goods();
      String string0 = goods0.getGoodsDetail();
      assertNull(string0);
  }
  @Test(timeout = 4000)
  public void test_getId_01()  throws Throwable  {
      //caseID:7e0d73b89e30c6c8bb59e785b3f521a9
      Goods goods0 = new Goods();
      Long long0 = goods0.getId();
      assertNull(long0);
  }
  @Test(timeout = 4000)
  public void test_getGoodsPrice_02()  throws Throwable  {
      //caseID:abe73133d8999452a27394437ccf2f69
      Goods goods0 = new Goods();
      Double double0 = goods0.getGoodsPrice();
      assertNull(double0);
  }
  @Test(timeout = 4000)
  public void test_getGoodsStock_03()  throws Throwable  {
      //caseID:23cf5e6048b1d11bfdaa55e7edb1efbd
      Goods goods0 = new Goods();
      Integer integer0 = goods0.getGoodsStock();
      assertNull(integer0);
  }
  @Test(timeout = 4000)
  public void test_getGoodsTitle_04()  throws Throwable  {
      //caseID:93252d648f767567af92ccf6571fa640
      Goods goods0 = new Goods();
      String string0 = goods0.getGoodsName();
      assertNull(string0);
  }
  @Test(timeout = 4000)
  public void test_getGoodsImg_05()  throws Throwable  {
      //caseID:8352d0631d94d8e8d49e315d14165d5d
      Goods goods0 = new Goods();
      String string0 = goods0.getGoodsImg();
      assertNull(string0);
  }
  @Test(timeout = 4000)
  public void test_getGoodsTitle_06()  throws Throwable  {
      //caseID:5bf73c6dc2a24fe1610234005f3539eb
      Goods goods0 = new Goods();
      String string0 = goods0.getGoodsTitle();
      assertNull(string0);
  }
  @Test(timeout = 4000)
  public void test_setGoodsStock_07()  throws Throwable  {
      //caseID:f650f54ffed9b20eab6503a06dab2ef4
      Goods goods0 = new Goods();
      Integer integer0 = new Integer(2909);

      //invoke method for goods0
      goods0.setGoodsStock(integer0);

      //invoke method for goods0
      assertNull(goods0.getGoodsImg());
  }
  @Test(timeout = 4000)
  public void test_setGoodsName_08()  throws Throwable  {
      //caseID:a8f26a7240e3d9f2cd2be5d825c69e2a
      Goods goods0 = new Goods();

      //invoke method for goods0
      goods0.setGoodsName("1");

      //invoke method for goods0
      assertNull(goods0.getGoodsTitle());
  }
  @Test(timeout = 4000)
  public void test_setGoodsImg_09()  throws Throwable  {
      //caseID:9ffb926403e7f3c27663f935ee673798
      Goods goods0 = new Goods();

      //invoke method for goods0
      goods0.setGoodsImg("1");

      //invoke method for goods0
      assertNull(goods0.getGoodsTitle());
  }
  @Test(timeout = 4000)
  public void test_setGoodsPrice_10()  throws Throwable  {
      //caseID:df71835cca3968d9dfd42fa09d80cb3c
      Goods goods0 = new Goods();
      Double double0 = new Double(1.0);

      //invoke method for goods0
      goods0.setGoodsPrice(double0);

      //invoke method for goods0
      assertNull(goods0.getId());
  }
  @Test(timeout = 4000)
  public void test_setGoodsDetail_11()  throws Throwable  {
      //caseID:3314cf57cebbd03a9f8454ca2dc0b29d
      Goods goods0 = new Goods();

      //invoke method for goods0
      goods0.setGoodsDetail("B:v+PQ@.v@M_t@}r60n");

      //invoke method for goods0
      assertNull(goods0.getGoodsImg());
  }
  @Test(timeout = 4000)
  public void test_setGoodsTitle_12()  throws Throwable  {
      //caseID:394f9bb17b9c42a63d871f053401f32b
      Goods goods0 = new Goods();

      //invoke method for goods0
      goods0.setGoodsTitle("/,5QI31");

      //invoke method for goods0
      assertNull(goods0.getGoodsDetail());
  }
  @Test(timeout = 4000)
  public void test_setId_13()  throws Throwable  {
      //caseID:bb9258c57252ea5542f4acab65489472
      Goods goods0 = new Goods();
      Long long0 = new Long(1148);

      //invoke method for goods0
      goods0.setId(long0);

      //invoke method for goods0
      assertNull(goods0.getGoodsImg());
  }}
