/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.service;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import static org.smartunit.runtime.SmartAssertions.*;
import com.jesper.seckill.bean.User;
import com.jesper.seckill.mapper.UserMapper;
import com.jesper.seckill.redis.RedisService;
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
public class UserService_SSTest extends UserService_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_login_0()  throws Throwable  {
      UserService userService0 = new UserService();
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      // Undeclared exception!
      try { 

        //invoke method for userService0
        userService0.login(httpServletResponse0, (LoginVo) null);
      
      } catch(Throwable e) {
         //
         // Exception Name: RuntimeException
         // CodeMsg [code=500100, msg=\u670D\u52A1\u7AEF\u5F02\u5E38]
         //
      }
  }
  @Test(timeout = 4000)
  public void test_getByToken_1()  throws Throwable  {
      UserService userService0 = new UserService();
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      User user0 = userService0.getByToken(httpServletResponse0, "");
      assertNull(user0);
  }
  @Test(timeout = 4000)
  public void test_getByToken_2()  throws Throwable  {
      UserService userService0 = new UserService();

      //prepare data for redisService0
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(user0).when(redisService0).get(nullable(com.jesper.seckill.redis.KeyPrefix.class) , nullable(java.lang.String.class) , nullable(java.lang.Class.class));

      //invoke method for userService0
      PrivateAccess.setVariable((Class<?>) UserService.class, userService0, "redisService", (Object) redisService0);
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      User user1 = userService0.getByToken(httpServletResponse0, "T'=q_o:BJ");
      assertNotNull(user1);
      assertNull(user1.getId());
  }
  @Test(timeout = 4000)
  public void test_login_3()  throws Throwable  {
      UserService userService0 = new UserService();

      //prepare data for redisService0
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("token").when(user0).getPassword();
      doReturn("-2073684043").when(user0).getSalt();
      doReturn("token").when(user0).toString();
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(user0).when(redisService0).get(nullable(com.jesper.seckill.redis.KeyPrefix.class) , nullable(java.lang.String.class) , nullable(java.lang.Class.class));

      //invoke method for userService0
      PrivateAccess.setVariable((Class<?>) UserService.class, userService0, "redisService", (Object) redisService0);
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //prepare data for loginVo0
      LoginVo loginVo0 = mock(LoginVo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("-2073684043").when(loginVo0).getMobile();
      doReturn("-2073684043").when(loginVo0).getPassword();
      // Undeclared exception!
      try { 

        //invoke method for userService0
        userService0.login(httpServletResponse0, loginVo0);
      
      } catch(Throwable e) {
         //
         // Exception Name: RuntimeException
         // CodeMsg [code=500215, msg=\u5BC6\u7801\u9519\u8BEF]
         //
      }
  }
  @Test(timeout = 4000)
  public void test_updatePassword_4()  throws Throwable  {
      UserService userService0 = new UserService();
      UserMapper userMapper0 = mock(UserMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //prepare data for redisService0
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("com.jesper.seckill.service.UserService").when(user0).getSalt();
      doReturn("fR: jv;]\u0001BG{NRaf").when(user0).toString();
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(user0).when(redisService0).get(nullable(com.jesper.seckill.redis.KeyPrefix.class) , nullable(java.lang.String.class) , nullable(java.lang.Class.class));

      //invoke method for userService0
      PrivateAccess.setVariable((Class<?>) UserService.class, userService0, "redisService", (Object) redisService0);

      //invoke method for userService0
      PrivateAccess.setVariable((Class<?>) UserService.class, userService0, "userMapper", (Object) userMapper0);
      boolean boolean0 = userService0.updatePassword("com.jesper.seckill.service.UserService", 0L, "com.jesper.seckill.service.UserService");
      assertTrue(boolean0);
  }}
