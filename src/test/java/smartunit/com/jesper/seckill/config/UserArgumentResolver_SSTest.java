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

  @Test(timeout = 4000)
  public void test_supportsParameter_0()  throws Throwable  {
      //caseID:06bd9473608c52305b675783fb36b3a1
      UserArgumentResolver userArgumentResolver0 = new UserArgumentResolver();

      //prepare data for methodParameter0
      Class<User> class0 = User.class;
      MethodParameter methodParameter0 = mock(MethodParameter.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(class0).when(methodParameter0).getParameterType();
      boolean boolean0 = userArgumentResolver0.supportsParameter(methodParameter0);
      assertTrue(boolean0);
  }
  @Test(timeout = 4000)
  public void test_resolveArgument_1()  throws Throwable  {
      //caseID:0d891e4d5cc10d6265dcb6a846871afe
      UserArgumentResolver userArgumentResolver0 = new UserArgumentResolver();
      MethodParameter methodParameter0 = mock(MethodParameter.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      ModelAndViewContainer modelAndViewContainer0 = mock(ModelAndViewContainer.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //prepare data for nativeWebRequest0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      NativeWebRequest nativeWebRequest0 = mock(NativeWebRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(httpServletRequest0).when(nativeWebRequest0).getNativeRequest(any(java.lang.Class.class));
      doReturn(httpServletResponse0).when(nativeWebRequest0).getNativeResponse(any(java.lang.Class.class));
      WebDataBinderFactory webDataBinderFactory0 = mock(WebDataBinderFactory.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Object object0 = userArgumentResolver0.resolveArgument(methodParameter0, modelAndViewContainer0, nativeWebRequest0, webDataBinderFactory0);
      assertNull(object0);
  }
  @Test(timeout = 4000)
  public void test_resolveArgument_2()  throws Throwable  {
      //caseID:c0c20d12a990d4cf10a9f5770fc936ea
      UserArgumentResolver userArgumentResolver0 = new UserArgumentResolver();

      //prepare data for userService0
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("1").when(user0).toString();
      UserService userService0 = mock(UserService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(user0).when(userService0).getByToken(any(javax.servlet.http.HttpServletResponse.class) , anyString());

      //invoke method for userArgumentResolver0
      PrivateAccess.setVariable((Class<?>) UserArgumentResolver.class, userArgumentResolver0, "userService", (Object) userService0);
      MethodParameter methodParameter0 = mock(MethodParameter.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      ModelAndViewContainer modelAndViewContainer0 = mock(ModelAndViewContainer.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //prepare data for nativeWebRequest0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Cookie[] cookieArray0 = new Cookie[0];
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("1").when(httpServletRequest0).getParameter(anyString());
      doReturn(cookieArray0).when(httpServletRequest0).getCookies();
      NativeWebRequest nativeWebRequest0 = mock(NativeWebRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(httpServletRequest0).when(nativeWebRequest0).getNativeRequest(any(java.lang.Class.class));
      doReturn(httpServletResponse0).when(nativeWebRequest0).getNativeResponse(any(java.lang.Class.class));
      WebDataBinderFactory webDataBinderFactory0 = mock(WebDataBinderFactory.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Object object0 = userArgumentResolver0.resolveArgument(methodParameter0, modelAndViewContainer0, nativeWebRequest0, webDataBinderFactory0);
      assertNotNull(object0);
  }
  @Test(timeout = 4000)
  public void test_resolveArgument_3()  throws Throwable  {
      //caseID:3814376672e7ebebc1616a28c9b6491e
      UserArgumentResolver userArgumentResolver0 = new UserArgumentResolver();

      //prepare data for userService0
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("com.jesper.seckill.config.UserArgumentResolver").when(user0).toString();
      UserService userService0 = mock(UserService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(user0).when(userService0).getByToken(any(javax.servlet.http.HttpServletResponse.class) , anyString());

      //invoke method for userArgumentResolver0
      PrivateAccess.setVariable((Class<?>) UserArgumentResolver.class, userArgumentResolver0, "userService", (Object) userService0);
      MethodParameter methodParameter0 = mock(MethodParameter.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      ModelAndViewContainer modelAndViewContainer0 = mock(ModelAndViewContainer.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //prepare data for nativeWebRequest0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Cookie[] cookieArray0 = new Cookie[7];
      Cookie cookie0 = mock(Cookie.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("org.apache.coyote.ajp.AjpNioProtocol").when(cookie0).getName();
      cookieArray0[0] = cookie0;
      cookieArray0[1] = cookieArray0[0];
      cookieArray0[2] = cookieArray0[0];
      cookieArray0[3] = cookieArray0[0];
      cookieArray0[4] = cookieArray0[3];
      cookieArray0[5] = cookieArray0[2];
      cookieArray0[6] = cookieArray0[3];
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("A$").when(httpServletRequest0).getParameter(anyString());
      doReturn(cookieArray0).when(httpServletRequest0).getCookies();
      NativeWebRequest nativeWebRequest0 = mock(NativeWebRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(httpServletRequest0).when(nativeWebRequest0).getNativeRequest(any(java.lang.Class.class));
      doReturn(httpServletResponse0).when(nativeWebRequest0).getNativeResponse(any(java.lang.Class.class));
      WebDataBinderFactory webDataBinderFactory0 = mock(WebDataBinderFactory.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Object object0 = userArgumentResolver0.resolveArgument(methodParameter0, modelAndViewContainer0, nativeWebRequest0, webDataBinderFactory0);
      assertNotNull(object0);
  }
  @Test(timeout = 4000)
  public void test_resolveArgument_4()  throws Throwable  {
      //caseID:5226860f9eaf02e9e313360921bf490e
      UserArgumentResolver userArgumentResolver0 = new UserArgumentResolver();

      //prepare data for userService0
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("token").when(user0).toString();
      UserService userService0 = mock(UserService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(user0).when(userService0).getByToken(any(javax.servlet.http.HttpServletResponse.class) , anyString());

      //invoke method for userArgumentResolver0
      PrivateAccess.setVariable((Class<?>) UserArgumentResolver.class, userArgumentResolver0, "userService", (Object) userService0);
      MethodParameter methodParameter0 = mock(MethodParameter.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      ModelAndViewContainer modelAndViewContainer0 = mock(ModelAndViewContainer.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //prepare data for nativeWebRequest0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Cookie[] cookieArray0 = new Cookie[7];
      Cookie cookie0 = mock(Cookie.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("token").when(cookie0).getName();
      doReturn("token").when(cookie0).getValue();
      cookieArray0[0] = cookie0;
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("").when(httpServletRequest0).getParameter(anyString());
      doReturn(cookieArray0).when(httpServletRequest0).getCookies();
      NativeWebRequest nativeWebRequest0 = mock(NativeWebRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(httpServletRequest0).when(nativeWebRequest0).getNativeRequest(any(java.lang.Class.class));
      doReturn(httpServletResponse0).when(nativeWebRequest0).getNativeResponse(any(java.lang.Class.class));
      WebDataBinderFactory webDataBinderFactory0 = mock(WebDataBinderFactory.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Object object0 = userArgumentResolver0.resolveArgument(methodParameter0, modelAndViewContainer0, nativeWebRequest0, webDataBinderFactory0);
      assertNotNull(object0);
  }
  @Test(timeout = 4000)
  public void test_resolveArgument_5()  throws Throwable  {
      //caseID:c703f686c8294d19eb5460a633261342
      UserArgumentResolver userArgumentResolver0 = new UserArgumentResolver();

      //prepare data for userService0
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("token").when(user0).toString();
      UserService userService0 = mock(UserService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(user0).when(userService0).getByToken(any(javax.servlet.http.HttpServletResponse.class) , anyString());

      //invoke method for userArgumentResolver0
      PrivateAccess.setVariable((Class<?>) UserArgumentResolver.class, userArgumentResolver0, "userService", (Object) userService0);
      MethodParameter methodParameter0 = mock(MethodParameter.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      ModelAndViewContainer modelAndViewContainer0 = mock(ModelAndViewContainer.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //prepare data for nativeWebRequest0
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Cookie[] cookieArray0 = new Cookie[7];
      Cookie cookie0 = mock(Cookie.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("token").when(cookie0).getName();
      doReturn("token").when(cookie0).getValue();
      cookieArray0[0] = cookie0;
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("token").when(httpServletRequest0).getParameter(anyString());
      doReturn(cookieArray0).when(httpServletRequest0).getCookies();
      NativeWebRequest nativeWebRequest0 = mock(NativeWebRequest.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(httpServletRequest0).when(nativeWebRequest0).getNativeRequest(any(java.lang.Class.class));
      doReturn(httpServletResponse0).when(nativeWebRequest0).getNativeResponse(any(java.lang.Class.class));
      WebDataBinderFactory webDataBinderFactory0 = mock(WebDataBinderFactory.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Object object0 = userArgumentResolver0.resolveArgument(methodParameter0, modelAndViewContainer0, nativeWebRequest0, webDataBinderFactory0);
      assertNotNull(object0);
  }}
