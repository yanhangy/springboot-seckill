/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.config;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.jesper.seckill.bean.User;
import com.jesper.seckill.config.UserArgumentResolver;
import com.jesper.seckill.service.UserService;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.ModelAndViewContainer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class UserArgumentResolver_SSTest extends UserArgumentResolver_SSTest_scaffolding {
// allCoveredLines:[22, 36, 37, 45, 46, 48, 49, 50, 51, 53, 54, 59, 60, 61, 63, 64, 65, 68]

  @Test(timeout = 4000)
  public void test_getCookieValue_0()  throws Throwable  {
      //caseID:2f41e9237f32b471824af90e053ec6f8
      //CoveredLines: [22, 59, 60, 63, 64, 68]
      //Input_0_HttpServletRequest: {getCookies=cookieArray0}
      //Input_1_String: "ConnectionProperties.ignoreNonTxTables"
      //Assert: assertNull(method_result);
      
      UserArgumentResolver userArgumentResolver0 = new UserArgumentResolver();
      Cookie[] cookieArray0 = new Cookie[1];
      //mock cookie0
      Cookie cookie0 = mock(Cookie.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("1.0").when(cookie0).getName();
      cookieArray0[0] = cookie0;
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(cookieArray0).when(httpServletRequest0).getCookies();
      
      //Call method: getCookieValue
      Object object0 = PrivateAccess.callMethod((Class<UserArgumentResolver>) UserArgumentResolver.class, userArgumentResolver0, "getCookieValue", (Object) httpServletRequest0, (Class<?>) HttpServletRequest.class, (Object) "ConnectionProperties.ignoreNonTxTables", (Class<?>) String.class);
      
      //Test Result Assert
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_resolveArgument_1()  throws Throwable  {
      //caseID:fc377ee9ce89f0a5224551693eefc684
      //CoveredLines: [22, 45, 46, 48, 49, 50, 51, 59, 60, 61]
      //Input_0_MethodParameter: {}
      //Input_1_ModelAndViewContainer: {}
      //Input_2_NativeWebRequest: {getNativeRequest=httpServletRequest0, getNativeResponse=httpServletResponse0}
      //Input_3_WebDataBinderFactory: {}
      //Assert: assertNull(method_result);
      
      UserArgumentResolver userArgumentResolver0 = new UserArgumentResolver();
      //mock methodParameter0
      MethodParameter methodParameter0 = mock(MethodParameter.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock modelAndViewContainer0
      ModelAndViewContainer modelAndViewContainer0 = mock(ModelAndViewContainer.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock httpServletResponse0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock nativeWebRequest0
      NativeWebRequest nativeWebRequest0 = mock(NativeWebRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(httpServletRequest0).when(nativeWebRequest0).getNativeRequest(any(java.lang.Class.class));
      doReturn(httpServletResponse0).when(nativeWebRequest0).getNativeResponse(any(java.lang.Class.class));
      //mock webDataBinderFactory0
      WebDataBinderFactory webDataBinderFactory0 = mock(WebDataBinderFactory.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: resolveArgument
      Object object0 = userArgumentResolver0.resolveArgument(methodParameter0, modelAndViewContainer0, nativeWebRequest0, webDataBinderFactory0);
      
      //Test Result Assert
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_resolveArgument_2()  throws Throwable  {
      //caseID:e401024b0163a01ceb65a89a32cdb443
      //CoveredLines: [22, 45, 46, 48, 49, 50, 53, 54, 59, 60, 61]
      //Input_0_MethodParameter: {}
      //Input_1_ModelAndViewContainer: {}
      //Input_2_NativeWebRequest: {getNativeRequest=httpServletRequest0, getNativeResponse=httpServletResponse0}
      //Input_3_WebDataBinderFactory: {}
      //Assert: assertNull(method_result);
      
      UserArgumentResolver userArgumentResolver0 = new UserArgumentResolver();
      //mock userService0
      UserService userService0 = mock(UserService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      PrivateAccess.setVariable((Class<?>) UserArgumentResolver.class, userArgumentResolver0, "userService", (Object) userService0);
      //mock methodParameter0
      MethodParameter methodParameter0 = mock(MethodParameter.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock modelAndViewContainer0
      ModelAndViewContainer modelAndViewContainer0 = mock(ModelAndViewContainer.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock httpServletResponse0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Cookie[] cookieArray0 = new Cookie[0];
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("modified()").when(httpServletRequest0).getParameter(anyString());
      doReturn(cookieArray0).when(httpServletRequest0).getCookies();
      //mock nativeWebRequest0
      NativeWebRequest nativeWebRequest0 = mock(NativeWebRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(httpServletRequest0).when(nativeWebRequest0).getNativeRequest(any(java.lang.Class.class));
      doReturn(httpServletResponse0).when(nativeWebRequest0).getNativeResponse(any(java.lang.Class.class));
      //mock webDataBinderFactory0
      WebDataBinderFactory webDataBinderFactory0 = mock(WebDataBinderFactory.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: resolveArgument
      Object object0 = userArgumentResolver0.resolveArgument(methodParameter0, modelAndViewContainer0, nativeWebRequest0, webDataBinderFactory0);
      
      //Test Result Assert
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test_resolveArgument_3()  throws Throwable  {
      //caseID:02a4c049c6b3ea4eb6babcf526861401
      //CoveredLines: [22, 45, 46, 48, 49, 50, 53, 54, 59, 60, 63, 64, 65]
      //Input_0_MethodParameter: {}
      //Input_1_ModelAndViewContainer: {}
      //Input_2_NativeWebRequest: {getNativeRequest=httpServletRequest0, getNativeResponse=httpServletResponse0}
      //Input_3_WebDataBinderFactory: {}
      //Assert: assertNotNull(method_result);
      
      UserArgumentResolver userArgumentResolver0 = new UserArgumentResolver();
      //mock user0
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("token").when(user0).toString();
      //mock userService0
      UserService userService0 = mock(UserService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(user0).when(userService0).getByToken(any(javax.servlet.http.HttpServletResponse.class) , anyString());
      PrivateAccess.setVariable((Class<?>) UserArgumentResolver.class, userArgumentResolver0, "userService", (Object) userService0);
      //mock methodParameter0
      MethodParameter methodParameter0 = mock(MethodParameter.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock modelAndViewContainer0
      ModelAndViewContainer modelAndViewContainer0 = mock(ModelAndViewContainer.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock httpServletResponse0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Cookie[] cookieArray0 = new Cookie[10];
      //mock cookie0
      Cookie cookie0 = mock(Cookie.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("token").when(cookie0).getName();
      doReturn("token").when(cookie0).getValue();
      cookieArray0[0] = cookie0;
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("").when(httpServletRequest0).getParameter(anyString());
      doReturn(cookieArray0).when(httpServletRequest0).getCookies();
      //mock nativeWebRequest0
      NativeWebRequest nativeWebRequest0 = mock(NativeWebRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(httpServletRequest0).when(nativeWebRequest0).getNativeRequest(any(java.lang.Class.class));
      doReturn(httpServletResponse0).when(nativeWebRequest0).getNativeResponse(any(java.lang.Class.class));
      //mock webDataBinderFactory0
      WebDataBinderFactory webDataBinderFactory0 = mock(WebDataBinderFactory.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: resolveArgument
      Object object0 = userArgumentResolver0.resolveArgument(methodParameter0, modelAndViewContainer0, nativeWebRequest0, webDataBinderFactory0);
      
      //Test Result Assert
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test_resolveArgument_4()  throws Throwable  {
      //caseID:bb6081cac313d5b6ce1a12fe229532dc
      //CoveredLines: [22, 45, 46, 48, 49, 50, 53, 54, 59, 60, 63, 64, 65]
      //Input_0_MethodParameter: {}
      //Input_1_ModelAndViewContainer: {}
      //Input_2_NativeWebRequest: {getNativeRequest=httpServletRequest0, getNativeResponse=httpServletResponse0}
      //Input_3_WebDataBinderFactory: {}
      //Assert: assertNotNull(method_result);
      
      UserArgumentResolver userArgumentResolver0 = new UserArgumentResolver();
      //mock user0
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("token").when(user0).toString();
      //mock userService0
      UserService userService0 = mock(UserService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(user0).when(userService0).getByToken(any(javax.servlet.http.HttpServletResponse.class) , anyString());
      PrivateAccess.setVariable((Class<?>) UserArgumentResolver.class, userArgumentResolver0, "userService", (Object) userService0);
      //mock methodParameter0
      MethodParameter methodParameter0 = mock(MethodParameter.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock modelAndViewContainer0
      ModelAndViewContainer modelAndViewContainer0 = mock(ModelAndViewContainer.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      //mock httpServletResponse0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Cookie[] cookieArray0 = new Cookie[10];
      //mock cookie0
      Cookie cookie0 = mock(Cookie.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("token").when(cookie0).getName();
      doReturn("token").when(cookie0).getValue();
      cookieArray0[0] = cookie0;
      //mock httpServletRequest0
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("token").when(httpServletRequest0).getParameter(anyString());
      doReturn(cookieArray0).when(httpServletRequest0).getCookies();
      //mock nativeWebRequest0
      NativeWebRequest nativeWebRequest0 = mock(NativeWebRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(httpServletRequest0).when(nativeWebRequest0).getNativeRequest(any(java.lang.Class.class));
      doReturn(httpServletResponse0).when(nativeWebRequest0).getNativeResponse(any(java.lang.Class.class));
      //mock webDataBinderFactory0
      WebDataBinderFactory webDataBinderFactory0 = mock(WebDataBinderFactory.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: resolveArgument
      Object object0 = userArgumentResolver0.resolveArgument(methodParameter0, modelAndViewContainer0, nativeWebRequest0, webDataBinderFactory0);
      
      //Test Result Assert
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test_supportsParameter_5()  throws Throwable  {
      //caseID:388c0548bacb9dc7f9c1db65525a0840
      //CoveredLines: [22, 36, 37]
      //Input_0_MethodParameter: {getParameterType=User.class}
      //Assert: assertTrue(method_result);
      
      UserArgumentResolver userArgumentResolver0 = new UserArgumentResolver();
      Class<User> class0 = User.class;
      //mock methodParameter0
      MethodParameter methodParameter0 = mock(MethodParameter.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(class0).when(methodParameter0).getParameterType();
      
      //Call method: supportsParameter
      boolean boolean0 = userArgumentResolver0.supportsParameter(methodParameter0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_supportsParameter_6()  throws Throwable  {
      //caseID:e5640b140f38eaaf5a6fc08b3cf7e7cc
      //CoveredLines: [22, 36, 37]
      //Input_0_MethodParameter: {}
      //Assert: assertFalse(method_result);
      
      UserArgumentResolver userArgumentResolver0 = new UserArgumentResolver();
      //mock methodParameter0
      MethodParameter methodParameter0 = mock(MethodParameter.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      
      //Call method: supportsParameter
      boolean boolean0 = userArgumentResolver0.supportsParameter(methodParameter0);
      
      //Test Result Assert
      assertFalse(boolean0);
  }
}
