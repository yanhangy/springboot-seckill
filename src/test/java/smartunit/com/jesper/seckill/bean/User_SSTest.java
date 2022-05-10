/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.bean;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.jesper.seckill.bean.User;
import java.util.Date;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class User_SSTest extends User_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_getPassword_00()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getPassword();
      assertNull(string0);
  }
  @Test(timeout = 4000)
  public void test_getNickname_01()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getNickname();
      assertNull(string0);
  }
  @Test(timeout = 4000)
  public void test_getHead_02()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getHead();
      assertNull(string0);
  }
  @Test(timeout = 4000)
  public void test_getSalt_03()  throws Throwable  {
      User user0 = new User();
      String string0 = user0.getSalt();
      assertNull(string0);
  }
  @Test(timeout = 4000)
  public void test_setLastLoginDate_04()  throws Throwable  {
      User user0 = new User();
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for user0
      user0.setLastLoginDate(date0);

      //invoke method for user0
      assertNull(user0.getId());
  }
  @Test(timeout = 4000)
  public void test_setRegisterDate_05()  throws Throwable  {
      User user0 = new User();
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for user0
      user0.setRegisterDate(date0);

      //invoke method for user0
      assertNull(user0.getHead());
  }
  @Test(timeout = 4000)
  public void test_setPassword_06()  throws Throwable  {
      User user0 = new User();

      //invoke method for user0
      user0.setPassword("");

      //invoke method for user0
      assertEquals("", user0.getPassword());
  }
  @Test(timeout = 4000)
  public void test_setNickname_07()  throws Throwable  {
      User user0 = new User();

      //invoke method for user0
      user0.setNickname("");

      //invoke method for user0
      assertNull(user0.getPassword());
  }
  @Test(timeout = 4000)
  public void test_setLoginCount_08()  throws Throwable  {
      User user0 = new User();
      Integer integer0 = new Integer(1);

      //invoke method for user0
      user0.setLoginCount(integer0);

      //invoke method for user0
      assertNull(user0.getNickname());
  }
  @Test(timeout = 4000)
  public void test_setHead_09()  throws Throwable  {
      User user0 = new User();

      //invoke method for user0
      user0.setHead("1");

      //invoke method for user0
      assertNull(user0.getNickname());
  }
  @Test(timeout = 4000)
  public void test_setSalt_10()  throws Throwable  {
      User user0 = new User();

      //invoke method for user0
      user0.getLastLoginDate();

      //invoke method for user0
      user0.setSalt("1");

      //invoke method for user0
      assertNull(user0.getLoginCount());
  }
  @Test(timeout = 4000)
  public void test_getId_11()  throws Throwable  {
      User user0 = new User();

      //invoke method for user0
      user0.getLoginCount();

      //invoke method for user0
      user0.getId();
      Date date0 = user0.getRegisterDate();
      assertNull(date0);
  }
  @Test(timeout = 4000)
  public void test_setId_12()  throws Throwable  {
      User user0 = new User();
      Long long0 = new Long(1L);

      //invoke method for user0
      user0.getLastLoginDate();

      //invoke method for user0
      user0.getRegisterDate();

      //invoke method for user0
      user0.setId(long0);

      //invoke method for user0
      assertEquals(1L, (long)user0.getId());
  }}