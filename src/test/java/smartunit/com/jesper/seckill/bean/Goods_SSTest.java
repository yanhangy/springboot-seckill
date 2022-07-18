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
  public void test_getGoodsStock_00()  throws Throwable  {
      //caseID:52ff61bbe40c64dd85820086d78d713e
      Goods goods0 = new Goods();
      Integer integer0 = goods0.getGoodsStock();
      assertNull(integer0);
  }
  @Test(timeout = 4000)
  public void test_getGoodsImg_01()  throws Throwable  {
      //caseID:c3385700c3bca261f71e652d554e018c
      Goods goods0 = new Goods();
      String string0 = goods0.getGoodsImg();
      assertNull(string0);
  }
  @Test(timeout = 4000)
  public void test_getGoodsDetail_02()  throws Throwable  {
      //caseID:79946fcd2b26ba7de03632b35a39f3bf
      Goods goods0 = new Goods();
      String string0 = goods0.getGoodsTitle();
      assertNull(string0);
  }
  @Test(timeout = 4000)
  public void test_getGoodsPrice_03()  throws Throwable  {
      //caseID:7e516d59aec0ec3388c3132d1b686881
      Goods goods0 = new Goods();
      Double double0 = goods0.getGoodsPrice();
      assertNull(double0);
  }
  @Test(timeout = 4000)
  public void test_getId_04()  throws Throwable  {
      //caseID:ed69a778a80169465f1a4bed3ba89bee
      Goods goods0 = new Goods();
      Long long0 = goods0.getId();
      assertNull(long0);
  }
  @Test(timeout = 4000)
  public void test_getGoodsDetail_05()  throws Throwable  {
      //caseID:7f53313a0ecbde6ba71867ed2204d45b
      Goods goods0 = new Goods();
      String string0 = goods0.getGoodsDetail();
      assertNull(string0);
  }
  @Test(timeout = 4000)
  public void test_getGoodsName_06()  throws Throwable  {
      //caseID:a6038f0367060af2abf2e8e86ae664c0
      Goods goods0 = new Goods();
      String string0 = goods0.getGoodsName();
      assertNull(string0);
  }
  @Test(timeout = 4000)
  public void test_setGoodsTitle_07()  throws Throwable  {
      //caseID:f1e8b5e1143dbe7c7991c64c89b9a3f2
      Goods goods0 = new Goods();

      //invoke method for goods0
      goods0.setGoodsTitle("");

      //invoke method for goods0
      assertNull(goods0.getGoodsDetail());
  }
  @Test(timeout = 4000)
  public void test_setGoodsDetail_08()  throws Throwable  {
      //caseID:c20ed145ed476095f8c6b3e717d07402
      Goods goods0 = new Goods();

      //invoke method for goods0
      goods0.setGoodsDetail("");

      //invoke method for goods0
      assertNull(goods0.getGoodsPrice());
  }
  @Test(timeout = 4000)
  public void test_setGoodsPrice_09()  throws Throwable  {
      //caseID:56f86051af5ecde9daf6fd9ca519a480
      Goods goods0 = new Goods();
      Double double0 = new Double(2107.7305647);

      //invoke method for goods0
      goods0.setGoodsPrice(double0);

      //invoke method for goods0
      assertEquals(2107.7305647, goods0.getGoodsPrice(), 0.01);
  }
  @Test(timeout = 4000)
  public void test_setGoodsImg_10()  throws Throwable  {
      //caseID:7a55215210ddd3674b44318fa5fe3a08
      Goods goods0 = new Goods();

      //invoke method for goods0
      goods0.setGoodsImg("1");

      //invoke method for goods0
      assertNull(goods0.getId());
  }
  @Test(timeout = 4000)
  public void test_setGoodsStock_11()  throws Throwable  {
      //caseID:14c4c7393066455b9db330597d20c889
      Goods goods0 = new Goods();
      Integer integer0 = new Integer(1);

      //invoke method for goods0
      goods0.setGoodsStock(integer0);

      //invoke method for goods0
      assertNull(goods0.getGoodsPrice());
  }
  @Test(timeout = 4000)
  public void test_setId_12()  throws Throwable  {
      //caseID:0d5efb6b7553580930eb2c503cdc34e9
      Goods goods0 = new Goods();
      Long long0 = new Long(3457);

      //invoke method for goods0
      goods0.setId(long0);

      //invoke method for goods0
      assertNull(goods0.getGoodsPrice());
  }
  @Test(timeout = 4000)
  public void test_setGoodsName_13()  throws Throwable  {
      //caseID:936223ee9eb5f4c592f5ff1d0cf2f620
      Goods goods0 = new Goods();

      //invoke method for goods0
      goods0.setGoodsName("com.jesper.seckill.bean.Goods");

      //invoke method for goods0
      assertNull(goods0.getGoodsPrice());
  }}