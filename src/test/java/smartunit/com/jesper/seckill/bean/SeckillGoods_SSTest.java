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
  public void test_getStartDate_00()  throws Throwable  {
      //caseID:17e1b7bf811d32d6cb972015999ccd17
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Date date0 = seckillGoods0.getStartDate();
      assertNull(date0);
  }
  @Test(timeout = 4000)
  public void test_getId_01()  throws Throwable  {
      //caseID:6bb6f2da6a0abd20de713372bb5147bb
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Long long0 = seckillGoods0.getId();
      assertNull(long0);
  }
  @Test(timeout = 4000)
  public void test_getEndDate_02()  throws Throwable  {
      //caseID:d34aeb41f8f4b668c0a6676a60a6d5d2
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Date date0 = seckillGoods0.getEndDate();
      assertNull(date0);
  }
  @Test(timeout = 4000)
  public void test_getGoodsId_03()  throws Throwable  {
      //caseID:ac9902ba9d8221110f0acc62ef17b1d0
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Long long0 = seckillGoods0.getGoodsId();
      assertNull(long0);
  }
  @Test(timeout = 4000)
  public void test_getStockCount_04()  throws Throwable  {
      //caseID:9dc04039cbf96a41e392bb1f1ecb119d
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Integer integer0 = seckillGoods0.getStockCount();
      assertNull(integer0);
  }
  @Test(timeout = 4000)
  public void test_getVersion_05()  throws Throwable  {
      //caseID:bd14744bcf2f9a80229c0b35e04c4079
      SeckillGoods seckillGoods0 = new SeckillGoods();
      int int0 = seckillGoods0.getVersion();
      assertEquals(0, int0);
  }
  @Test(timeout = 4000)
  public void test_setStartDate_06()  throws Throwable  {
      //caseID:cba9739c002587168b013470915fff10
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for seckillGoods0
      seckillGoods0.setStartDate(date0);

      //invoke method for seckillGoods0
      assertNull(seckillGoods0.getStockCount());
  }
  @Test(timeout = 4000)
  public void test_setGoodsId_07()  throws Throwable  {
      //caseID:c32e4a5e70ca3325992ed1907d00449d
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Long long0 = new Long(3136);

      //invoke method for seckillGoods0
      seckillGoods0.setGoodsId(long0);

      //invoke method for seckillGoods0
      assertEquals(0, seckillGoods0.getVersion());
  }
  @Test(timeout = 4000)
  public void test_setEndDate_08()  throws Throwable  {
      //caseID:34e333fe61ffd99daf90776ef2f91a89
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for seckillGoods0
      seckillGoods0.setEndDate(date0);

      //invoke method for seckillGoods0
      assertNull(seckillGoods0.getGoodsId());
  }
  @Test(timeout = 4000)
  public void test_setVersion_09()  throws Throwable  {
      //caseID:f8c1b9dcdc4361ce4bc3b970eb9101bc
      SeckillGoods seckillGoods0 = new SeckillGoods();

      //invoke method for seckillGoods0
      seckillGoods0.setVersion((-4));

      //invoke method for seckillGoods0
      assertEquals((-4), seckillGoods0.getVersion());
  }
  @Test(timeout = 4000)
  public void test_setStockCount_10()  throws Throwable  {
      //caseID:8e90e1b6bfde00bbb3f4cb2cb3289582
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Integer integer0 = new Integer(314);

      //invoke method for seckillGoods0
      seckillGoods0.setStockCount(integer0);

      //invoke method for seckillGoods0
      assertEquals(314, (int)seckillGoods0.getStockCount());
  }
  @Test(timeout = 4000)
  public void test_setId_11()  throws Throwable  {
      //caseID:085219e890d594a2c12367c1131f634f
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Long long0 = new Long(95);

      //invoke method for seckillGoods0
      seckillGoods0.setId(long0);

      //invoke method for seckillGoods0
      assertNull(seckillGoods0.getStockCount());
  }}
