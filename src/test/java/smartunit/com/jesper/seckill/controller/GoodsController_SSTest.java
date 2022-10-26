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
// allCoveredLines:[31, 58, 59, 60, 62, 63, 64, 67, 68, 69, 71, 72, 75, 85, 88, 89, 90, 94, 95, 97, 98, 99, 101, 102, 104, 107, 108, 109, 114, 115, 118, 119, 120, 121, 122, 124, 135, 136, 138, 139, 140, 142, 143, 145, 148, 149, 150, 155, 156, 157, 158, 159, 161]

  @Test(timeout = 4000)
  public void test_detail_0()  throws Throwable  {
      //caseID:2c51c1b9173f3e86790b443684a4abba
      //CoveredLines: [31, 135, 136, 138, 139, 140, 142, 143, 145, 148, 149, 150, 155, 156, 157, 158, 159, 161]
      //Input_0_HttpServletRequest: {}
      //Input_1_HttpServletResponse: {}
      //Input_2_Model: {addAttribute=model0}
      //Input_3_User: {}
      //Input_4_long: 0L
      //Assert: assertEquals(0, method_result.getCode());
      
      GoodsController goodsController0 = new GoodsController();
      //mock date0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(2494L, 9L).when(date0).getTime();
      //mock goodsVo0
      GoodsVo goodsVo0 = mock(GoodsVo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(date0).when(goodsVo0).getEndDate();
      doReturn(date0).when(goodsVo0).getStartDate();
      //mock goodsService0
      GoodsService goodsService0 = mock(GoodsService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(goodsVo0).when(goodsService0).getGoodsVoByGoodsId(anyLong());
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "goodsService", (Object) goodsService0);
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock httpServletResponse0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock model0
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock model1
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model0).when(model1).addAttribute(nullable(java.lang.String.class) , any());
      //mock user0
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: detail
      Result<GoodsDetailVo> result0 = goodsController0.detail(httpServletRequest0, httpServletResponse0, model1, user0, 0L);
      
      //Test Result Assert
      assertEquals(0, result0.getCode());
  }

  @Test(timeout = 4000)
  public void test_detail2_1()  throws Throwable  {
      //caseID:fd144bfc853e90cebe6fd74e9ed2dec2
      //CoveredLines: [31, 85, 88, 89, 90]
      //Input_0_HttpServletRequest: {}
      //Input_1_HttpServletResponse: {}
      //Input_2_Model: {addAttribute=model1 model0}
      //Input_3_User: {}
      //Input_4_long: 0L
      //Assert: assertEquals("1RJ*es?~", method_result);
      
      GoodsController goodsController0 = new GoodsController();
      //mock redisService0
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("1RJ*es?~").when(redisService0).get(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString() , any(java.lang.Class.class));
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "redisService", (Object) redisService0);
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock httpServletResponse0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock model0
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock model1
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock model2
      Model model2 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model1, model0).when(model2).addAttribute(anyString() , any());
      //mock user0
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: detail2
      String string0 = goodsController0.detail2(httpServletRequest0, httpServletResponse0, model2, user0, 0L);
      
      //Test Result Assert
      assertEquals("1RJ*es?~", string0);
  }

  @Test(timeout = 4000)
  public void test_detail2_2()  throws Throwable  {
      //caseID:74e01b14b41b32cea94dca39977c9e11
      //CoveredLines: [31, 85, 88, 89, 94, 95, 97, 98, 99, 101, 102, 104, 107, 108, 109, 114, 115, 118, 119, 120, 121, 124]
      //Input_0_HttpServletRequest: {getServletContext=servletContext0, getAttributeNames=enumeration0, getParameterMap=map0, getLocale=Locale.TRADITIONAL_CHINESE}
      //Input_1_HttpServletResponse: {}
      //Input_2_Model: {addAttribute=model1 model0 model3 model2, asMap=map1}
      //Input_3_User: {}
      //Input_4_long: 1358L
      //Assert: assertEquals("", method_result);
      
      GoodsController goodsController0 = new GoodsController();
      //mock redisService0
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("").when(redisService0).get(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString() , any(java.lang.Class.class));
      //mock date0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(14L).when(date0).getTime();
      //mock date1
      Date date1 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-1L)).when(date1).getTime();
      //mock goodsVo0
      GoodsVo goodsVo0 = mock(GoodsVo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(date1).when(goodsVo0).getEndDate();
      doReturn(date0).when(goodsVo0).getStartDate();
      //mock goodsService0
      GoodsService goodsService0 = mock(GoodsService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(goodsVo0).when(goodsService0).getGoodsVoByGoodsId(anyLong());
      //mock applicationContext0
      ApplicationContext applicationContext0 = mock(ApplicationContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock springTemplateEngine0
      SpringTemplateEngine springTemplateEngine0 = mock(SpringTemplateEngine.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("").when(springTemplateEngine0).process(anyString() , any(org.thymeleaf.context.IContext.class));
      //mock thymeleafViewResolver0
      ThymeleafViewResolver thymeleafViewResolver0 = mock(ThymeleafViewResolver.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(springTemplateEngine0).when(thymeleafViewResolver0).getTemplateEngine();
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "thymeleafViewResolver", (Object) thymeleafViewResolver0);
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "applicationContext", (Object) applicationContext0);
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "goodsService", (Object) goodsService0);
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "redisService", (Object) redisService0);
      //mock servletContext0
      ServletContext servletContext0 = mock(ServletContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock map0
      Map<String, String[]> map0 = (Map<String, String[]>) mock(Map.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      //mock enumeration0
      Enumeration<String> enumeration0 = (Enumeration<String>) mock(Enumeration.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(false).when(enumeration0).hasMoreElements();
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(enumeration0).when(httpServletRequest0).getAttributeNames();
      doReturn(locale0).when(httpServletRequest0).getLocale();
      doReturn(map0).when(httpServletRequest0).getParameterMap();
      doReturn(servletContext0).when(httpServletRequest0).getServletContext();
      //mock httpServletResponse0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock model0
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock model1
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock map1
      Map<String, Object> map1 = (Map<String, Object>) mock(Map.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-1)).when(map1).size();
      //mock model2
      Model model2 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock model3
      Model model3 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock model4
      Model model4 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model1, model0, model3, model2).when(model4).addAttribute(anyString() , any());
      doReturn(map1).when(model4).asMap();
      //mock user0
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: detail2
      String string0 = goodsController0.detail2(httpServletRequest0, httpServletResponse0, model4, user0, 1358L);
      
      //Test Result Assert
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test_detail2_3()  throws Throwable  {
      //caseID:7de8d4c36e20811caa2196fba4ae6e09
      //CoveredLines: [31, 85, 88, 89, 94, 95, 97, 98, 99, 101, 102, 104, 107, 108, 109, 114, 115, 118, 119, 120, 121, 122, 124]
      //Input_0_HttpServletRequest: {getServletContext=servletContext0, getAttributeNames=enumeration0, getParameterMap=map0, getLocale=Locale.JAPANESE}
      //Input_1_HttpServletResponse: {}
      //Input_2_Model: {addAttribute=model1 model0 model3 model2, asMap=map1}
      //Input_3_User: {}
      //Input_4_long: 1358L
      //Assert: assertEquals("-1", method_result);
      
      GoodsController goodsController0 = new GoodsController();
      Boolean boolean0 = Boolean.FALSE;
      //mock redisService0
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("").when(redisService0).get(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString() , any(java.lang.Class.class));
      doReturn(boolean0).when(redisService0).set(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString() , any());
      //mock date0
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(2207L, 0L).when(date0).getTime();
      //mock goodsVo0
      GoodsVo goodsVo0 = mock(GoodsVo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(date0).when(goodsVo0).getEndDate();
      doReturn(date0).when(goodsVo0).getStartDate();
      //mock goodsService0
      GoodsService goodsService0 = mock(GoodsService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(goodsVo0).when(goodsService0).getGoodsVoByGoodsId(anyLong());
      //mock applicationContext0
      ApplicationContext applicationContext0 = mock(ApplicationContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock springTemplateEngine0
      SpringTemplateEngine springTemplateEngine0 = mock(SpringTemplateEngine.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("-1").when(springTemplateEngine0).process(anyString() , any(org.thymeleaf.context.IContext.class));
      //mock thymeleafViewResolver0
      ThymeleafViewResolver thymeleafViewResolver0 = mock(ThymeleafViewResolver.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(springTemplateEngine0).when(thymeleafViewResolver0).getTemplateEngine();
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "thymeleafViewResolver", (Object) thymeleafViewResolver0);
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "applicationContext", (Object) applicationContext0);
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "goodsService", (Object) goodsService0);
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "redisService", (Object) redisService0);
      //mock servletContext0
      ServletContext servletContext0 = mock(ServletContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock map0
      Map<String, String[]> map0 = (Map<String, String[]>) mock(Map.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Locale locale0 = Locale.JAPANESE;
      //mock enumeration0
      Enumeration<String> enumeration0 = (Enumeration<String>) mock(Enumeration.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(false).when(enumeration0).hasMoreElements();
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(enumeration0).when(httpServletRequest0).getAttributeNames();
      doReturn(locale0).when(httpServletRequest0).getLocale();
      doReturn(map0).when(httpServletRequest0).getParameterMap();
      doReturn(servletContext0).when(httpServletRequest0).getServletContext();
      //mock httpServletResponse0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock model0
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock model1
      Model model1 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock map1
      Map<String, Object> map1 = (Map<String, Object>) mock(Map.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-885)).when(map1).size();
      //mock model2
      Model model2 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock model3
      Model model3 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock model4
      Model model4 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(model1, model0, model3, model2).when(model4).addAttribute(anyString() , any());
      doReturn(map1).when(model4).asMap();
      //mock user0
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: detail2
      String string0 = goodsController0.detail2(httpServletRequest0, httpServletResponse0, model4, user0, 1358L);
      
      //Test Result Assert
      assertEquals("-1", string0);
  }

  @Test(timeout = 4000)
  public void test_list_4()  throws Throwable  {
      //caseID:01128c72f482ffb49bc017edf31345c5
      //CoveredLines: [31, 58, 59, 60]
      //Input_0_HttpServletRequest: {}
      //Input_1_HttpServletResponse: {}
      //Input_2_Model: {}
      //Input_3_User: {}
      //Assert: assertEquals("1.0", method_result);
      
      GoodsController goodsController0 = new GoodsController();
      //mock redisService0
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("1.0").when(redisService0).get(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString() , any(java.lang.Class.class));
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "redisService", (Object) redisService0);
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock httpServletResponse0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock model0
      Model model0 = mock(Model.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock user0
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: list
      String string0 = goodsController0.list(httpServletRequest0, httpServletResponse0, model0, user0);
      
      //Test Result Assert
      assertEquals("1.0", string0);
  }

  @Test(timeout = 4000)
  public void test_list_5()  throws Throwable  {
      //caseID:82170ee855f58506490c3f7b9d82ef2c
      //CoveredLines: [31, 58, 59, 62, 63, 64, 67, 68, 69, 71, 75]
      //Input_0_HttpServletRequest: {getServletContext=servletContext0, getAttributeNames=enumeration0, getParameterMap=map0, getLocale=Locale.UK}
      //Input_1_HttpServletResponse: {}
      //Input_2_Model: extendedModelMap0
      //Input_3_User: {}
      //Assert: assertEquals(2, extendedModelMap0.size());
      //Assert: assertFalse(extendedModelMap0.isEmpty());
      
      GoodsController goodsController0 = new GoodsController();
      //mock redisService0
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("").when(redisService0).get(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString() , any(java.lang.Class.class));
      LinkedList<GoodsVo> linkedList0 = new LinkedList<GoodsVo>();
      //mock goodsService0
      GoodsService goodsService0 = mock(GoodsService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(linkedList0).when(goodsService0).listGoodsVo();
      //mock applicationContext0
      ApplicationContext applicationContext0 = mock(ApplicationContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock springTemplateEngine0
      SpringTemplateEngine springTemplateEngine0 = mock(SpringTemplateEngine.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("").when(springTemplateEngine0).process(anyString() , any(org.thymeleaf.context.IContext.class));
      //mock thymeleafViewResolver0
      ThymeleafViewResolver thymeleafViewResolver0 = mock(ThymeleafViewResolver.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(springTemplateEngine0).when(thymeleafViewResolver0).getTemplateEngine();
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "thymeleafViewResolver", (Object) thymeleafViewResolver0);
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "applicationContext", (Object) applicationContext0);
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "goodsService", (Object) goodsService0);
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "redisService", (Object) redisService0);
      //mock servletContext0
      ServletContext servletContext0 = mock(ServletContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock map0
      Map<String, String[]> map0 = (Map<String, String[]>) mock(Map.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Locale locale0 = Locale.UK;
      //mock enumeration0
      Enumeration<String> enumeration0 = (Enumeration<String>) mock(Enumeration.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(false).when(enumeration0).hasMoreElements();
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(enumeration0).when(httpServletRequest0).getAttributeNames();
      doReturn(locale0).when(httpServletRequest0).getLocale();
      doReturn(map0).when(httpServletRequest0).getParameterMap();
      doReturn(servletContext0).when(httpServletRequest0).getServletContext();
      //mock httpServletResponse0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      ExtendedModelMap extendedModelMap0 = new ExtendedModelMap();
      //mock user0
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: list
      goodsController0.list(httpServletRequest0, httpServletResponse0, extendedModelMap0, user0);
      
      //Test Result Assert
      assertEquals(2, extendedModelMap0.size());
      
      //Test Result Assert
      assertFalse(extendedModelMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test_list_6()  throws Throwable  {
      //caseID:74a0bb5beef9822bc1c09673aa01a3e1
      //CoveredLines: [31, 58, 59, 62, 63, 64, 67, 68, 69, 71, 72, 75]
      //Input_0_HttpServletRequest: {getServletContext=servletContext0, getAttributeNames=enumeration0, getParameterMap=hashMap0, getLocale=Locale.UK}
      //Input_1_HttpServletResponse: {}
      //Input_2_Model: extendedModelMap0
      //Input_3_User: {}
      //Assert: assertEquals("RESTORE", method_result);
      
      GoodsController goodsController0 = new GoodsController();
      //mock redisService0
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("").when(redisService0).get(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString() , any(java.lang.Class.class));
      LinkedList<GoodsVo> linkedList0 = new LinkedList<GoodsVo>();
      //mock goodsService0
      GoodsService goodsService0 = mock(GoodsService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(linkedList0).when(goodsService0).listGoodsVo();
      //mock applicationContext0
      ApplicationContext applicationContext0 = mock(ApplicationContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock springTemplateEngine0
      SpringTemplateEngine springTemplateEngine0 = mock(SpringTemplateEngine.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("RESTORE").when(springTemplateEngine0).process(anyString() , any(org.thymeleaf.context.IContext.class));
      //mock thymeleafViewResolver0
      ThymeleafViewResolver thymeleafViewResolver0 = mock(ThymeleafViewResolver.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(springTemplateEngine0).when(thymeleafViewResolver0).getTemplateEngine();
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "thymeleafViewResolver", (Object) thymeleafViewResolver0);
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "applicationContext", (Object) applicationContext0);
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "goodsService", (Object) goodsService0);
      PrivateAccess.setVariable((Class<?>) GoodsController.class, goodsController0, "redisService", (Object) redisService0);
      //mock servletContext0
      ServletContext servletContext0 = mock(ServletContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      HashMap<String, String[]> hashMap0 = new HashMap<String, String[]>();
      Locale locale0 = Locale.UK;
      //mock enumeration0
      Enumeration<String> enumeration0 = (Enumeration<String>) mock(Enumeration.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(false).when(enumeration0).hasMoreElements();
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(enumeration0).when(httpServletRequest0).getAttributeNames();
      doReturn(locale0).when(httpServletRequest0).getLocale();
      doReturn(hashMap0).when(httpServletRequest0).getParameterMap();
      doReturn(servletContext0).when(httpServletRequest0).getServletContext();
      //mock httpServletResponse0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      ExtendedModelMap extendedModelMap0 = new ExtendedModelMap();
      //mock user0
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: list
      String string0 = goodsController0.list(httpServletRequest0, httpServletResponse0, extendedModelMap0, user0);
      
      //Test Result Assert
      assertEquals("RESTORE", string0);
  }
}
