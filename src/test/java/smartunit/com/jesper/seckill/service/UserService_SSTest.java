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
  public void test_getByToken_0()  throws Throwable  {
      //caseID:2779f8391a73e328cf702c96fdf5e12a
      UserService userService0 = new UserService();
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      User user0 = userService0.getByToken(httpServletResponse0, "");
      assertNull(user0);
  }
  @Test(timeout = 4000)
  public void test_getByToken_1()  throws Throwable  {
      //caseID:bb6c7437e4334e531093b1163b10de8c
      UserService userService0 = new UserService();

      //prepare data for redisService0
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(user0).when(redisService0).get(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString() , any(java.lang.Class.class));

      //invoke method for userService0
      PrivateAccess.setVariable((Class<?>) UserService.class, userService0, "redisService", (Object) redisService0);
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      User user1 = userService0.getByToken(httpServletResponse0, "oVoK>['");
      assertNotNull(user1);
      assertNull(user1.getId());
  }
  @Test(timeout = 4000)
  public void test_login_2()  throws Throwable  {
      //caseID:5e0f5238b29ec7c0862ddd94b2b3e2e7
      UserService userService0 = new UserService();

      //prepare data for redisService0
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("token").when(user0).getPassword();
      doReturn("-2073757153").when(user0).getSalt();
      doReturn("token").when(user0).toString();
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(user0).when(redisService0).get(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString() , any(java.lang.Class.class));

      //invoke method for userService0
      PrivateAccess.setVariable((Class<?>) UserService.class, userService0, "redisService", (Object) redisService0);
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //prepare data for loginVo0
      LoginVo loginVo0 = mock(LoginVo.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("-2073757153").when(loginVo0).getMobile();
      doReturn("token").when(loginVo0).getPassword();
      // Undeclared exception!
      try { 

        //invoke method for userService0
        userService0.login(httpServletResponse0, loginVo0);
      } catch(Throwable e) {
         verifyException("com.jesper.seckill.service.UserService", e);
         assertEquals("com.jesper.seckill.exception.GlobalException", e.getClass().getName());
         assertEquals("CodeMsg [code=500215, msg=\u5BC6\u7801\u9519\u8BEF]", e.getMessage());
      }
  }
  @Test(timeout = 4000)
  public void test_updatePassword_3()  throws Throwable  {
      //caseID:a48881d3eda749ff8c60812ef0ebe4ca
      UserService userService0 = new UserService();
      UserMapper userMapper0 = mock(UserMapper.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //prepare data for redisService0
      User user0 = mock(User.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("com.jesper.seckill.service.UserService").when(user0).getSalt();
      doReturn("token").when(user0).toString();
      Boolean boolean0 = Boolean.valueOf(true);
      RedisService redisService0 = mock(RedisService.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(false).when(redisService0).delete(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString());
      doReturn(user0).when(redisService0).get(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString() , any(java.lang.Class.class));
      doReturn(boolean0).when(redisService0).set(any(com.jesper.seckill.redis.KeyPrefix.class) , anyString() , any());

      //invoke method for userService0
      PrivateAccess.setVariable((Class<?>) UserService.class, userService0, "redisService", (Object) redisService0);

      //invoke method for userService0
      PrivateAccess.setVariable((Class<?>) UserService.class, userService0, "userMapper", (Object) userMapper0);
      boolean boolean1 = userService0.updatePassword("1.0", 294L, "1");
      assertTrue(boolean1);
  }}
