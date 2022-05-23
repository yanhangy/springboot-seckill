/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.service;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.jesper.seckill.mapper.GoodsMapper;
import com.jesper.seckill.service.GoodsService;
import com.jesper.seckill.vo.GoodsVo;
import java.util.LinkedList;
import java.util.List;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class GoodsService_SSTest extends GoodsService_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_listGoodsVo_0()  throws Throwable  {
      //caseID:4805ac962cfec7cc22dcece8ad6420aa
      GoodsService goodsService0 = new GoodsService();

      //prepare data for goodsMapper0
      LinkedList<GoodsVo> linkedList0 = new LinkedList<GoodsVo>();
      GoodsMapper goodsMapper0 = mock(GoodsMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(linkedList0).when(goodsMapper0).listGoodsVo();

      //invoke method for goodsService0
      PrivateAccess.setVariable((Class<?>) GoodsService.class, goodsService0, "goodsMapper", (Object) goodsMapper0);
      List<GoodsVo> list0 = goodsService0.listGoodsVo();
      assertTrue(list0.isEmpty());
  }
  @Test(timeout = 4000)
  public void test_getGoodsVoByGoodsId_1()  throws Throwable  {
      //caseID:b178097fad52206d1be58c646aaa9f97
      GoodsService goodsService0 = new GoodsService();

      //prepare data for goodsMapper0
      GoodsVo goodsVo0 = mock(GoodsVo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      GoodsMapper goodsMapper0 = mock(GoodsMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(goodsVo0).when(goodsMapper0).getGoodsVoByGoodsId(anyLong());

      //invoke method for goodsService0
      PrivateAccess.setVariable((Class<?>) GoodsService.class, goodsService0, "goodsMapper", (Object) goodsMapper0);
      GoodsVo goodsVo1 = goodsService0.getGoodsVoByGoodsId(0L);
      assertNull(goodsVo1.getVersion());
  }
  @Test(timeout = 4000)
  public void test_reduceStock_2()  throws Throwable  {
      //caseID:f68d8b0f36cbff812f58b8568644cda2
      GoodsService goodsService0 = new GoodsService();

      //prepare data for goodsVo0
      Integer integer0 = new Integer((-1));
      Long long0 = new Long(1008L);
      GoodsVo goodsVo0 = mock(GoodsVo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(goodsVo0).getId();
      doReturn(integer0).when(goodsVo0).getVersion();
      boolean boolean0 = goodsService0.reduceStock(goodsVo0);
      assertFalse(boolean0);
  }
  @Test(timeout = 4000)
  public void test_reduceStock_3()  throws Throwable  {
      //caseID:9c963977c5b18db6c7d7f04e9b8717cb
      GoodsService goodsService0 = new GoodsService();

      //prepare data for goodsMapper0
      GoodsMapper goodsMapper0 = mock(GoodsMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0, 55296, 0, 2, 1).when(goodsMapper0).getVersionByGoodsId(anyLong());
      doReturn(0, 0, 0, 3009, 2658).when(goodsMapper0).reduceStockByVersion(any(com.jesper.seckill.bean.SeckillGoods.class));

      //invoke method for goodsService0
      PrivateAccess.setVariable((Class<?>) GoodsService.class, goodsService0, "goodsMapper", (Object) goodsMapper0);

      //prepare data for goodsVo0
      Integer integer0 = new Integer(0);
      Long long0 = new Long(0);
      GoodsVo goodsVo0 = mock(GoodsVo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0, long0, long0, long0, long0, long0).when(goodsVo0).getId();
      doReturn(integer0).when(goodsVo0).getVersion();
      boolean boolean0 = goodsService0.reduceStock(goodsVo0);
      assertTrue(boolean0);
  }}
