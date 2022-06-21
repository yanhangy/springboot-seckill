/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.bean;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.jesper.seckill.bean.SeckillOrder;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SeckillOrder_SSTest extends SeckillOrder_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_getUserId_0()  throws Throwable  {
      //caseID:63d98ed9e375a3209f00b791806f36ed
      SeckillOrder seckillOrder0 = new SeckillOrder();
      Long long0 = seckillOrder0.getUserId();
      assertNull(long0);
  }
  @Test(timeout = 4000)
  public void test_getGoodsId_1()  throws Throwable  {
      //caseID:e6ff47dd8db5c44e2f893a52facf9771
      SeckillOrder seckillOrder0 = new SeckillOrder();
      Long long0 = seckillOrder0.getGoodsId();
      assertNull(long0);
  }
  @Test(timeout = 4000)
  public void test_getId_2()  throws Throwable  {
      //caseID:148818b92ba7e9d3e107ab3f8905d651
      SeckillOrder seckillOrder0 = new SeckillOrder();
      Long long0 = seckillOrder0.getId();
      assertNull(long0);
  }
  @Test(timeout = 4000)
  public void test_getOrderId_3()  throws Throwable  {
      //caseID:44a05235a974a51f796abf1a5b1ddfc5
      SeckillOrder seckillOrder0 = new SeckillOrder();
      Long long0 = seckillOrder0.getOrderId();
      assertNull(long0);
  }
  @Test(timeout = 4000)
  public void test_setUserId_4()  throws Throwable  {
      //caseID:7824f3bb94291714c9167184f5c54e89
      SeckillOrder seckillOrder0 = new SeckillOrder();
      Long long0 = new Long(1431L);

      //invoke method for seckillOrder0
      seckillOrder0.setUserId(long0);

      //invoke method for seckillOrder0
      assertEquals(1431L, (long)seckillOrder0.getUserId());
  }
  @Test(timeout = 4000)
  public void test_setGoodsId_5()  throws Throwable  {
      //caseID:e77f92cf8e89ba23c478cecbd8a590d5
      SeckillOrder seckillOrder0 = new SeckillOrder();
      Long long0 = new Long(906L);

      //invoke method for seckillOrder0
      seckillOrder0.setGoodsId(long0);

      //invoke method for seckillOrder0
      assertNull(seckillOrder0.getUserId());
  }
  @Test(timeout = 4000)
  public void test_setId_6()  throws Throwable  {
      //caseID:ec924ac9d1007939737a9a69b658d160
      SeckillOrder seckillOrder0 = new SeckillOrder();
      Long long0 = new Long(1112L);

      //invoke method for seckillOrder0
      seckillOrder0.setId(long0);

      //invoke method for seckillOrder0
      assertNull(seckillOrder0.getOrderId());
  }
  @Test(timeout = 4000)
  public void test_setOrderId_7()  throws Throwable  {
      //caseID:3f8695167d3f38843b090a5a7dd2ed81
      SeckillOrder seckillOrder0 = new SeckillOrder();
      Long long0 = new Long((-1L));

      //invoke method for seckillOrder0
      seckillOrder0.setOrderId(long0);

      //invoke method for seckillOrder0
      assertEquals((-1L), (long)seckillOrder0.getOrderId());
  }}
