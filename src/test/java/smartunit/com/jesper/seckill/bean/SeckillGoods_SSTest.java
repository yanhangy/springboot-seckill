/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.bean;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.jesper.seckill.bean.SeckillGoods;
import java.util.Date;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SeckillGoods_SSTest extends SeckillGoods_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_setGoodsId_0()  throws Throwable  {
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Long long0 = new Long(1L);

      //invoke method for seckillGoods0
      seckillGoods0.setGoodsId(long0);

      //invoke method for seckillGoods0
      assertNull(seckillGoods0.getId());
  }
  @Test(timeout = 4000)
  public void test_setStockCount_1()  throws Throwable  {
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Integer integer0 = new Integer(192);

      //invoke method for seckillGoods0
      seckillGoods0.setStockCount(integer0);

      //invoke method for seckillGoods0
      assertEquals(0, seckillGoods0.getVersion());
  }
  @Test(timeout = 4000)
  public void test_setEndDate_2()  throws Throwable  {
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for seckillGoods0
      seckillGoods0.setEndDate(date0);

      //invoke method for seckillGoods0
      assertNull(seckillGoods0.getStockCount());
  }
  @Test(timeout = 4000)
  public void test_setId_3()  throws Throwable  {
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Long long0 = Long.valueOf(0L);

      //invoke method for seckillGoods0
      seckillGoods0.setId(long0);

      //invoke method for seckillGoods0
      assertNull(seckillGoods0.getStockCount());
  }
  @Test(timeout = 4000)
  public void test_getVersion_4()  throws Throwable  {
      SeckillGoods seckillGoods0 = new SeckillGoods();

      //invoke method for seckillGoods0
      seckillGoods0.getStockCount();
      Long long0 = seckillGoods0.getId();
      assertNull(long0);
  }
  @Test(timeout = 4000)
  public void test_setStartDate_5()  throws Throwable  {
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Date date0 = seckillGoods0.getStartDate();

      //invoke method for seckillGoods0
      seckillGoods0.setStartDate(date0);

      //invoke method for seckillGoods0
      assertNull(seckillGoods0.getStockCount());
  }
  @Test(timeout = 4000)
  public void test_setVersion_6()  throws Throwable  {
      SeckillGoods seckillGoods0 = new SeckillGoods();

      //invoke method for seckillGoods0
      seckillGoods0.getGoodsId();

      //invoke method for seckillGoods0
      seckillGoods0.setVersion(0);

      //invoke method for seckillGoods0
      assertEquals(0, seckillGoods0.getVersion());
  }
  @Test(timeout = 4000)
  public void test_getVersion_7()  throws Throwable  {
      SeckillGoods seckillGoods0 = new SeckillGoods();

      //invoke method for seckillGoods0
      seckillGoods0.getStockCount();

      //invoke method for seckillGoods0
      seckillGoods0.getGoodsId();
      Date date0 = seckillGoods0.getEndDate();
      assertNull(date0);
  }
  @Test(timeout = 4000)
  public void test_getVersion_8()  throws Throwable  {
      SeckillGoods seckillGoods0 = new SeckillGoods();

      //invoke method for seckillGoods0
      seckillGoods0.getStockCount();

      //invoke method for seckillGoods0
      seckillGoods0.getGoodsId();

      //invoke method for seckillGoods0
      seckillGoods0.getStartDate();
      int int0 = seckillGoods0.getVersion();
      assertEquals(0, int0);
  }}
