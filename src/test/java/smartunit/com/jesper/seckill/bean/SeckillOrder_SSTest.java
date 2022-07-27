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
  public void test_getGoodsId_0()  throws Throwable  {
      //caseID:ab46d6c35dcbf39bd665021f6f32ba6d
      SeckillOrder seckillOrder0 = new SeckillOrder();
      Long long0 = seckillOrder0.getGoodsId();
      assertNull(long0);
  }
  @Test(timeout = 4000)
  public void test_getUserId_1()  throws Throwable  {
      //caseID:d4c540807efe1a1f61d04e9bfd2ebf56
      SeckillOrder seckillOrder0 = new SeckillOrder();
      Long long0 = seckillOrder0.getUserId();
      assertNull(long0);
  }
  @Test(timeout = 4000)
  public void test_getId_2()  throws Throwable  {
      //caseID:b73392a32950eb9467774d0439ceef84
      SeckillOrder seckillOrder0 = new SeckillOrder();
      Long long0 = seckillOrder0.getId();
      assertNull(long0);
  }
  @Test(timeout = 4000)
  public void test_getOrderId_3()  throws Throwable  {
      //caseID:5ff7c86281935e7c1c9c1acc4915aed1
      SeckillOrder seckillOrder0 = new SeckillOrder();
      Long long0 = seckillOrder0.getOrderId();
      assertNull(long0);
  }
  @Test(timeout = 4000)
  public void test_setUserId_4()  throws Throwable  {
      //caseID:37811a0f8f80b321f45f970721b8a291
      SeckillOrder seckillOrder0 = new SeckillOrder();
      Long long0 = new Long(31L);

      //invoke method for seckillOrder0
      seckillOrder0.setUserId(long0);

      //invoke method for seckillOrder0
      assertEquals(31L, (long)seckillOrder0.getUserId());
  }
  @Test(timeout = 4000)
  public void test_setOrderId_5()  throws Throwable  {
      //caseID:149c28a4a9783e66a2465217eecdce9f
      SeckillOrder seckillOrder0 = new SeckillOrder();
      Long long0 = new Long(4300L);

      //invoke method for seckillOrder0
      seckillOrder0.setOrderId(long0);

      //invoke method for seckillOrder0
      assertNull(seckillOrder0.getId());
  }
  @Test(timeout = 4000)
  public void test_setId_6()  throws Throwable  {
      //caseID:8015d1b8a34700da377636f5532da7b1
      SeckillOrder seckillOrder0 = new SeckillOrder();
      Long long0 = new Long(2865L);

      //invoke method for seckillOrder0
      seckillOrder0.setId(long0);

      //invoke method for seckillOrder0
      assertNull(seckillOrder0.getOrderId());
  }
  @Test(timeout = 4000)
  public void test_setGoodsId_7()  throws Throwable  {
      //caseID:2bafd74be48acd1350350a2e87f4f4b0
      SeckillOrder seckillOrder0 = new SeckillOrder();
      Long long0 = new Long((-1L));

      //invoke method for seckillOrder0
      seckillOrder0.setGoodsId(long0);

      //invoke method for seckillOrder0
      assertNull(seckillOrder0.getOrderId());
  }}
