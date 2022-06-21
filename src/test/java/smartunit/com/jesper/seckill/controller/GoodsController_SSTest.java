/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.jesper.seckill.bean.User;
import com.jesper.seckill.controller.GoodsController;
import com.jesper.seckill.redis.RedisService;
import com.jesper.seckill.result.Result;
import com.jesper.seckill.service.GoodsService;
import com.jesper.seckill.vo.GoodsDetailVo;
import com.jesper.seckill.vo.GoodsVo;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.context.ApplicationContext;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class GoodsController_SSTest extends GoodsController_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_list_0()  throws Throwable  {
      //caseID:fecc92a21e739ff0cd6cefcf5e60be3a
      GoodsController goodsController0 = new GoodsController();

      //prepare data for redisService0
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("goods_list").when(redisService0).get(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString() , any(java.lang.Class.class));

      //invoke method for goodsController0
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "redisService", (Object) redisService0);
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      String string0 = goodsController0.list(httpServletRequest0, httpServletResponse0, model0, user0);
      assertEquals("goods_list", string0);
  }
  @Test(timeout = 4000)
  public void test_detail2_1()  throws Throwable  {
      //caseID:76bf07271814eff14b4df9fccb1e3960
      GoodsController goodsController0 = new GoodsController();

      //prepare data for redisService0
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("2").when(redisService0).get(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString() , any(java.lang.Class.class));

      //invoke method for goodsController0
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "redisService", (Object) redisService0);
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //prepare data for model1
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model0).when(model1).addAttribute(anyString() , any());
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      String string0 = goodsController0.detail2(httpServletRequest0, httpServletResponse0, model1, user0, 1127L);
      assertEquals("2", string0);
  }
  @Test(timeout = 4000)
  public void test_list_2()  throws Throwable  {
      //caseID:ed71916bc7b08451959b381ef9b48941
      GoodsController goodsController0 = new GoodsController();

      //prepare data for redisService0
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("").when(redisService0).get(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString() , any(java.lang.Class.class));

      //prepare data for goodsService0
      LinkedList<GoodsVo> linkedList0 = new LinkedList<GoodsVo>();
      GoodsService goodsService0 = mock(GoodsService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(linkedList0).when(goodsService0).listGoodsVo();
      ApplicationContext applicationContext0 = mock(ApplicationContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //prepare data for thymeleafViewResolver0
      SpringTemplateEngine springTemplateEngine0 = mock(SpringTemplateEngine.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("").when(springTemplateEngine0).process(anyString() , any(org.thymeleaf.context.IContext.class));
      ThymeleafViewResolver thymeleafViewResolver0 = mock(ThymeleafViewResolver.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(springTemplateEngine0).when(thymeleafViewResolver0).getTemplateEngine();

      //invoke method for goodsController0
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "thymeleafViewResolver", (Object) thymeleafViewResolver0);

      //invoke method for goodsController0
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "applicationContext", (Object) applicationContext0);

      //invoke method for goodsController0
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "goodsService", (Object) goodsService0);

      //invoke method for goodsController0
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "redisService", (Object) redisService0);

      //prepare data for httpServletRequest0
      ServletContext servletContext0 = mock(ServletContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Map<String, String[]> map0 = (Map<String, String[]>) mock(Map.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Locale locale0 = new Locale("token", "redirect:");
      Enumeration<String> enumeration0 = (Enumeration<String>) mock(Enumeration.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(false).when(enumeration0).hasMoreElements();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(enumeration0).when(httpServletRequest0).getAttributeNames();
      doReturn(locale0).when(httpServletRequest0).getLocale();
      doReturn(map0).when(httpServletRequest0).getParameterMap();
      doReturn(servletContext0).when(httpServletRequest0).getServletContext();
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      ExtendedModelMap extendedModelMap0 = new ExtendedModelMap();
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      goodsController0.list(httpServletRequest0, httpServletResponse0, extendedModelMap0, user0);
      assertFalse(extendedModelMap0.isEmpty());
      assertEquals(2, extendedModelMap0.size());
  }
  @Test(timeout = 4000)
  public void test_list_3()  throws Throwable  {
      //caseID:10fa714cc020222402ae851194ee94a1
      GoodsController goodsController0 = new GoodsController();

      //prepare data for redisService0
      Boolean boolean0 = new Boolean(false);
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("").when(redisService0).get(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString() , any(java.lang.Class.class));
      doReturn(boolean0).when(redisService0).set(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString() , any());

      //prepare data for goodsService0
      LinkedList<GoodsVo> linkedList0 = new LinkedList<GoodsVo>();
      GoodsService goodsService0 = mock(GoodsService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(linkedList0).when(goodsService0).listGoodsVo();
      ApplicationContext applicationContext0 = mock(ApplicationContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //prepare data for thymeleafViewResolver0
      SpringTemplateEngine springTemplateEngine0 = mock(SpringTemplateEngine.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("org.thymeleaf.spring4.dialect.SpringStandardDialect").when(springTemplateEngine0).process(anyString() , any(org.thymeleaf.context.IContext.class));
      ThymeleafViewResolver thymeleafViewResolver0 = mock(ThymeleafViewResolver.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(springTemplateEngine0).when(thymeleafViewResolver0).getTemplateEngine();

      //invoke method for goodsController0
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "thymeleafViewResolver", (Object) thymeleafViewResolver0);

      //invoke method for goodsController0
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "applicationContext", (Object) applicationContext0);

      //invoke method for goodsController0
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "goodsService", (Object) goodsService0);

      //invoke method for goodsController0
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "redisService", (Object) redisService0);

      //prepare data for httpServletRequest0
      ServletContext servletContext0 = mock(ServletContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Map<String, String[]> map0 = (Map<String, String[]>) mock(Map.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Locale locale0 = new Locale("token", "redirect:");
      Enumeration<String> enumeration0 = (Enumeration<String>) mock(Enumeration.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(false).when(enumeration0).hasMoreElements();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(enumeration0).when(httpServletRequest0).getAttributeNames();
      doReturn(locale0).when(httpServletRequest0).getLocale();
      doReturn(map0).when(httpServletRequest0).getParameterMap();
      doReturn(servletContext0).when(httpServletRequest0).getServletContext();
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      ExtendedModelMap extendedModelMap0 = new ExtendedModelMap();
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      String string0 = goodsController0.list(httpServletRequest0, httpServletResponse0, extendedModelMap0, user0);
      assertFalse(extendedModelMap0.isEmpty());
      assertEquals("org.thymeleaf.spring4.dialect.SpringStandardDialect", string0);
  }
  @Test(timeout = 4000)
  public void test_detail_4()  throws Throwable  {
      //caseID:843875459cd431b9dca6a8cfc9f67ce8
      GoodsController goodsController0 = new GoodsController();

      //prepare data for goodsService0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-1L), (-1L)).when(date0).getTime();
      GoodsVo goodsVo0 = mock(GoodsVo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(date0).when(goodsVo0).getEndDate();
      doReturn(date0).when(goodsVo0).getStartDate();
      GoodsService goodsService0 = mock(GoodsService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(goodsVo0).when(goodsService0).getGoodsVoByGoodsId(anyLong());

      //invoke method for goodsController0
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "goodsService", (Object) goodsService0);
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //prepare data for model1
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model0).when(model1).addAttribute(anyString() , any());
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Result<GoodsDetailVo> result0 = goodsController0.detail(httpServletRequest0, httpServletResponse0, model1, user0, 2664L);
      assertNull(result0.getMsg());
  }
  @Test(timeout = 4000)
  public void test_detail2_5()  throws Throwable  {
      //caseID:0ad1dec7101f6bcf2be6e49d847fb120
      GoodsController goodsController0 = new GoodsController();

      //prepare data for redisService0
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("").when(redisService0).get(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString() , any(java.lang.Class.class));

      //prepare data for goodsService0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1000L, (-5180L)).when(date0).getTime();
      GoodsVo goodsVo0 = mock(GoodsVo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(date0).when(goodsVo0).getEndDate();
      doReturn(date0).when(goodsVo0).getStartDate();
      GoodsService goodsService0 = mock(GoodsService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(goodsVo0).when(goodsService0).getGoodsVoByGoodsId(anyLong());
      ApplicationContext applicationContext0 = mock(ApplicationContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //prepare data for thymeleafViewResolver0
      SpringTemplateEngine springTemplateEngine0 = mock(SpringTemplateEngine.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("").when(springTemplateEngine0).process(anyString() , any(org.thymeleaf.context.IContext.class));
      ThymeleafViewResolver thymeleafViewResolver0 = mock(ThymeleafViewResolver.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(springTemplateEngine0).when(thymeleafViewResolver0).getTemplateEngine();

      //invoke method for goodsController0
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "thymeleafViewResolver", (Object) thymeleafViewResolver0);

      //invoke method for goodsController0
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "applicationContext", (Object) applicationContext0);

      //invoke method for goodsController0
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "goodsService", (Object) goodsService0);

      //invoke method for goodsController0
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "redisService", (Object) redisService0);

      //prepare data for httpServletRequest0
      ServletContext servletContext0 = mock(ServletContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      HashMap<String, String[]> hashMap0 = new HashMap<String, String[]>();
      Locale locale0 = Locale.ITALIAN;
      Enumeration<String> enumeration0 = (Enumeration<String>) mock(Enumeration.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(false).when(enumeration0).hasMoreElements();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(enumeration0).when(httpServletRequest0).getAttributeNames();
      doReturn(locale0).when(httpServletRequest0).getLocale();
      doReturn(hashMap0).when(httpServletRequest0).getParameterMap();
      doReturn(servletContext0).when(httpServletRequest0).getServletContext();
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //prepare data for model4
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      Model model2 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model3 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model4 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model1, model0, model3, model2).when(model4).addAttribute(anyString() , any());
      doReturn(hashMap1).when(model4).asMap();
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      String string0 = goodsController0.detail2(httpServletRequest0, httpServletResponse0, model4, user0, 1127L);
      assertEquals("", string0);
  }
  @Test(timeout = 4000)
  public void test_detail2_6()  throws Throwable  {
      //caseID:ca4f05246f0cccb23b6b518c55064d68
      GoodsController goodsController0 = new GoodsController();

      //prepare data for redisService0
      Boolean boolean0 = Boolean.FALSE;
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("").when(redisService0).get(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString() , any(java.lang.Class.class));
      doReturn(boolean0).when(redisService0).set(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString() , any());

      //prepare data for goodsService0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0L, 0L).when(date0).getTime();
      GoodsVo goodsVo0 = mock(GoodsVo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(date0).when(goodsVo0).getEndDate();
      doReturn(date0).when(goodsVo0).getStartDate();
      GoodsService goodsService0 = mock(GoodsService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(goodsVo0).when(goodsService0).getGoodsVoByGoodsId(anyLong());
      ApplicationContext applicationContext0 = mock(ApplicationContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //prepare data for thymeleafViewResolver0
      SpringTemplateEngine springTemplateEngine0 = mock(SpringTemplateEngine.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("SUBSTR").when(springTemplateEngine0).process(anyString() , any(org.thymeleaf.context.IContext.class));
      ThymeleafViewResolver thymeleafViewResolver0 = mock(ThymeleafViewResolver.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(springTemplateEngine0).when(thymeleafViewResolver0).getTemplateEngine();

      //invoke method for goodsController0
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "thymeleafViewResolver", (Object) thymeleafViewResolver0);

      //invoke method for goodsController0
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "applicationContext", (Object) applicationContext0);

      //invoke method for goodsController0
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "goodsService", (Object) goodsService0);

      //invoke method for goodsController0
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "redisService", (Object) redisService0);

      //prepare data for httpServletRequest0
      ServletContext servletContext0 = mock(ServletContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Map<String, String[]> map0 = (Map<String, String[]>) mock(Map.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Locale locale0 = Locale.PRC;
      Enumeration<String> enumeration0 = (Enumeration<String>) mock(Enumeration.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(false).when(enumeration0).hasMoreElements();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(enumeration0).when(httpServletRequest0).getAttributeNames();
      doReturn(locale0).when(httpServletRequest0).getLocale();
      doReturn(map0).when(httpServletRequest0).getParameterMap();
      doReturn(servletContext0).when(httpServletRequest0).getServletContext();
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //prepare data for model4
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Map<String, Object> map1 = (Map<String, Object>) mock(Map.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-1)).when(map1).size();
      Model model2 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model3 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Model model4 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model1, model0, model3, model2).when(model4).addAttribute(anyString() , any());
      doReturn(map1).when(model4).asMap();
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      String string0 = goodsController0.detail2(httpServletRequest0, httpServletResponse0, model4, user0, 2143L);
      assertEquals("SUBSTR", string0);
  }}
