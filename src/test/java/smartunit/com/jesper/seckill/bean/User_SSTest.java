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
  public void test_getSalt_00()  throws Throwable  {
      //caseID:5e0a0a2b97e0d351e7b1d6aeed18d7d1
      User user0 = new User();
      String string0 = user0.getSalt();
      assertNull(string0);
  }
  @Test(timeout = 4000)
  public void test_getRegisterDate_01()  throws Throwable  {
      //caseID:147894ce13992262bcb9aec2200a0780
      User user0 = new User();
      Date date0 = user0.getLastLoginDate();
      assertNull(date0);
  }
  @Test(timeout = 4000)
  public void test_getSalt_02()  throws Throwable  {
      //caseID:d1343798036d60c1614c6569494baa1a
      User user0 = new User();
      String string0 = user0.getPassword();
      assertNull(string0);
  }
  @Test(timeout = 4000)
  public void test_getSalt_03()  throws Throwable  {
      //caseID:18564da2388133e2b5f83b98458f2a91
      User user0 = new User();
      String string0 = user0.getHead();
      assertNull(string0);
  }
  @Test(timeout = 4000)
  public void test_getId_04()  throws Throwable  {
      //caseID:099cdae026f6e44ce500376dc60ba34e
      User user0 = new User();
      Long long0 = user0.getId();
      assertNull(long0);
  }
  @Test(timeout = 4000)
  public void test_getRegisterDate_05()  throws Throwable  {
      //caseID:e60d7f73b8ed104cf3c0023fc31a5d0b
      User user0 = new User();
      Date date0 = user0.getRegisterDate();
      assertNull(date0);
  }
  @Test(timeout = 4000)
  public void test_getLoginCount_06()  throws Throwable  {
      //caseID:c4388eed8b0052d7fe044eba2928b162
      User user0 = new User();
      Integer integer0 = user0.getLoginCount();
      assertNull(integer0);
  }
  @Test(timeout = 4000)
  public void test_getSalt_07()  throws Throwable  {
      //caseID:16cc22756a5948f24d86b3cc927bf33a
      User user0 = new User();
      String string0 = user0.getNickname();
      assertNull(string0);
  }
  @Test(timeout = 4000)
  public void test_setLastLoginDate_08()  throws Throwable  {
      //caseID:2c70be98ba091e503851bd9fa76ebf05
      User user0 = new User();
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for user0
      user0.setLastLoginDate(date0);

      //invoke method for user0
      assertNull(user0.getPassword());
  }
  @Test(timeout = 4000)
  public void test_setRegisterDate_09()  throws Throwable  {
      //caseID:488add2ee039e75c5fd0398bc2f25351
      User user0 = new User();
      Date date0 = mock(Date.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());

      //invoke method for user0
      user0.setRegisterDate(date0);

      //invoke method for user0
      assertNull(user0.getSalt());
  }
  @Test(timeout = 4000)
  public void test_setSalt_10()  throws Throwable  {
      //caseID:b5ebbcbebcf0da75355240a8724ae8d5
      User user0 = new User();

      //invoke method for user0
      user0.setSalt("org.apache.tomcat.util.buf.Utf8Encoder");

      //invoke method for user0
      assertNull(user0.getNickname());
  }
  @Test(timeout = 4000)
  public void test_setHead_11()  throws Throwable  {
      //caseID:3b221a4b46e4a58d4e3e61159a00a3f2
      User user0 = new User();

      //invoke method for user0
      user0.setHead("56320");

      //invoke method for user0
      assertNull(user0.getId());
  }
  @Test(timeout = 4000)
  public void test_setPassword_12()  throws Throwable  {
      //caseID:ac884389e24d39009bdacc452ff5f1e3
      User user0 = new User();

      //invoke method for user0
      user0.setPassword("224");

      //invoke method for user0
      assertNull(user0.getHead());
  }
  @Test(timeout = 4000)
  public void test_setNickname_13()  throws Throwable  {
      //caseID:0d425df12b25fd798c7eac32fd46a99e
      User user0 = new User();

      //invoke method for user0
      user0.setNickname("C/,@>*wV:'*9kV");

      //invoke method for user0
      assertNull(user0.getSalt());
  }
  @Test(timeout = 4000)
  public void test_setLoginCount_14()  throws Throwable  {
      //caseID:31bfe0ba60d5018418292881bffbe46e
      User user0 = new User();
      Integer integer0 = new Integer(0);

      //invoke method for user0
      user0.setLoginCount(integer0);

      //invoke method for user0
      assertNull(user0.getNickname());
  }
  @Test(timeout = 4000)
  public void test_setId_15()  throws Throwable  {
      //caseID:1b092de541d174206dc90acf12b441d8
      User user0 = new User();
      Long long0 = new Long(2);

      //invoke method for user0
      user0.setId(long0);

      //invoke method for user0
      assertEquals(2L, (long)user0.getId());
  }}
