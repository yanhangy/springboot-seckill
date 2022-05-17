/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.jesper.seckill.controller.LoginController;
import com.jesper.seckill.result.Result;
import com.jesper.seckill.service.UserService;
import com.jesper.seckill.vo.LoginVo;
import javax.servlet.http.HttpServletResponse;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LoginController_SSTest extends LoginController_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_toLogin_0()  throws Throwable  {
      LoginController loginController0 = new LoginController();
      String string0 = loginController0.toLogin();
      assertEquals("login", string0);
  }
  @Test(timeout = 4000)
  public void test_doLogin_1()  throws Throwable  {
      LoginController loginController0 = new LoginController();

      //prepare data for userService0
      UserService userService0 = mock(UserService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("1.0").when(userService0).login(nullable(javax.servlet.http.HttpServletResponse.class) , nullable(com.jesper.seckill.vo.LoginVo.class));

      //invoke method for loginController0
      PrivateAccess.setVariable((Class<?>) LoginController.class, loginController0, "userService", (Object) userService0);
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //prepare data for loginVo0
      LoginVo loginVo0 = mock(LoginVo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("$X{|As>ei?]j\"ET>").when(loginVo0).toString();
      Result<String> result0 = loginController0.doLogin(httpServletResponse0, loginVo0);
      assertNull(result0.getMsg());
  }}
