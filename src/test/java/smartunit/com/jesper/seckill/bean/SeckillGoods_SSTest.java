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
      //caseID:0a921efe6ccdd8f525eafe3127e1d12f
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Date date0 = seckillGoods0.getStartDate();
      assertNull(date0);
  }
  @Test(timeout = 4000)
  public void test_getEndDate_01()  throws Throwable  {
      //caseID:5ed333bd18d3a3e0c85a5762cb790eca
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Date date0 = seckillGoods0.getEndDate();
      assertNull(date0);
  }
  @Test(timeout = 4000)
  public void test_getId_02()  throws Throwable  {
      //caseID:e4a1c05d60efbe80a056086c83049978
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Long long0 = seckillGoods0.getId();
      assertNull(long0);
  }
  @Test(timeout = 4000)
  public void test_getGoodsId_03()  throws Throwable  {
      //caseID:70747096d4f611dcbd7306c605b0556a
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Long long0 = seckillGoods0.getGoodsId();
      assertNull(long0);
  }
  @Test(timeout = 4000)
  public void test_getStockCount_04()  throws Throwable  {
      //caseID:6b9345d390c87fd42037b8b7ac51efb5
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Integer integer0 = seckillGoods0.getStockCount();
      assertNull(integer0);
  }
  @Test(timeout = 4000)
  public void test_getVersion_05()  throws Throwable  {
      //caseID:6794d6448bd595a611574395f59d61ad
      SeckillGoods seckillGoods0 = new SeckillGoods();
      int int0 = seckillGoods0.getVersion();
      assertEquals(0, int0);
  }
  @Test(timeout = 4000)
  public void test_setStartDate_06()  throws Throwable  {
      //caseID:73599c0c3e8d33ccb4d26d6c3fe980e6
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for seckillGoods0
      seckillGoods0.setStartDate(date0);

      //invoke method for seckillGoods0
      assertNull(seckillGoods0.getGoodsId());
  }
  @Test(timeout = 4000)
  public void test_setStockCount_07()  throws Throwable  {
      //caseID:416a199143fae95117cc77388905b717
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Integer integer0 = new Integer(3636);

      //invoke method for seckillGoods0
      seckillGoods0.setStockCount(integer0);

      //invoke method for seckillGoods0
      assertNull(seckillGoods0.getGoodsId());
  }
  @Test(timeout = 4000)
  public void test_setGoodsId_08()  throws Throwable  {
      //caseID:be2f6ac51d4596c0916197ae0c154832
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Long long0 = new Long(0);

      //invoke method for seckillGoods0
      seckillGoods0.setGoodsId(long0);

      //invoke method for seckillGoods0
      assertEquals(0, seckillGoods0.getVersion());
  }
  @Test(timeout = 4000)
  public void test_setId_09()  throws Throwable  {
      //caseID:50defb09d230518dc3c9faccc1f851db
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Long long0 = new Long(102);

      //invoke method for seckillGoods0
      seckillGoods0.setId(long0);

      //invoke method for seckillGoods0
      assertNull(seckillGoods0.getStockCount());
  }
  @Test(timeout = 4000)
  public void test_setEndDate_10()  throws Throwable  {
      //caseID:2a8f0409d7b3d2b18a43630bddabacfa
      SeckillGoods seckillGoods0 = new SeckillGoods();
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for seckillGoods0
      seckillGoods0.setEndDate(date0);

      //invoke method for seckillGoods0
      assertNull(seckillGoods0.getId());
  }
  @Test(timeout = 4000)
  public void test_setVersion_11()  throws Throwable  {
      //caseID:e2323245848eb461493517756c1178b9
      SeckillGoods seckillGoods0 = new SeckillGoods();

      //invoke method for seckillGoods0
      seckillGoods0.setVersion(128);

      //invoke method for seckillGoods0
      assertEquals(128, seckillGoods0.getVersion());
  }}
