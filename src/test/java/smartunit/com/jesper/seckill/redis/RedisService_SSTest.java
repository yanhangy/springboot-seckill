/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.redis;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import static org.smartunit.runtime.SmartAssertions.*;
import com.alibaba.fastjson.JSONException;
import com.jesper.seckill.redis.KeyPrefix;
import com.jesper.seckill.redis.RedisService;
import javax.swing.JMenuItem;
import javax.swing.table.DefaultTableModel;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RedisService_SSTest extends RedisService_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_stringToBean_00()  throws Throwable  {
      //caseID:845400a0ec5e3f257e3fe865289bffa2
      RedisService redisService0 = new RedisService();
      Class<JMenuItem> class0 = JMenuItem.class;
      JMenuItem jMenuItem0 = RedisService.stringToBean("", class0);
      assertNull(jMenuItem0);
  }
  @Test(timeout = 4000)
  public void test_stringToBean_01()  throws Throwable  {
      //caseID:b3fc6ac2f2d415746c9a5d6214ea16c7
      RedisService redisService0 = new RedisService();
      DefaultTableModel defaultTableModel0 = RedisService.stringToBean("{}", (Class<DefaultTableModel>) null);
      assertNull(defaultTableModel0);
  }
  @Test(timeout = 4000)
  public void test_stringToBean_02()  throws Throwable  {
      //caseID:fe1e7a54b3eb250e55ce28d2f7024491
      RedisService redisService0 = new RedisService();
      Class<Integer> class0 = Integer.TYPE;
      Integer integer0 = RedisService.stringToBean("0", class0);
      assertNotNull(integer0);
      assertEquals(0, (int)integer0);
  }
  @Test(timeout = 4000)
  public void test_stringToBean_03()  throws Throwable  {
      //caseID:85b765b5729dea56062762bdf0b0f174
      RedisService redisService0 = new RedisService();
      Class<Integer> class0 = Integer.class;
      Integer integer0 = RedisService.stringToBean("0", class0);
      assertNotNull(integer0);
      assertEquals(0, (int)integer0);
  }
  @Test(timeout = 4000)
  public void test_stringToBean_04()  throws Throwable  {
      //caseID:c5c7d2be5ffa887aec36eb7f52de79f2
      RedisService redisService0 = new RedisService();
      Class<Long> class0 = Long.TYPE;
      // Undeclared exception!
      try { 
        RedisService.stringToBean("securityConstraint.uncoveredHttpOmittedMethod", class0);
      } catch(Throwable e) {
         verifyException("java.lang.NumberFormatException", e);
         assertEquals("java.lang.NumberFormatException", e.getClass().getName());
         assertEquals("For input string: \"securityConstraint.uncoveredHttpOmittedMethod\"", e.getMessage());
      }
  }
  @Test(timeout = 4000)
  public void test_beanToString_05()  throws Throwable  {
      //caseID:55e3be77359bfe5feeba534741590adc
      RedisService redisService0 = new RedisService();
      Integer integer0 = new Integer((-1));
      String string0 = RedisService.beanToString(integer0);
      assertEquals("-1", string0);
  }
  @Test(timeout = 4000)
  public void test_exists_06()  throws Throwable  {
      //caseID:64daba4d639918c145e18f0e8d2f4dbd
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Boolean boolean0 = Boolean.valueOf("");
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(boolean0).when(jedis0).exists(anyString());
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);

      //prepare data for keyPrefix0
      KeyPrefix keyPrefix0 = mock(KeyPrefix.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("9").when(keyPrefix0).getPrefix();
      boolean boolean1 = redisService0.exists(keyPrefix0, "1");
      assertFalse(boolean1);
  }
  @Test(timeout = 4000)
  public void test_decr_07()  throws Throwable  {
      //caseID:2abcaaa5d1b2bffef6ee3c3dd073a2be
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);

      //prepare data for keyPrefix0
      KeyPrefix keyPrefix0 = mock(KeyPrefix.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("Expression suffix must not be empty").when(keyPrefix0).getPrefix();
      Long long0 = redisService0.decr(keyPrefix0, "1.0");
      assertNull(long0);
  }
  @Test(timeout = 4000)
  public void test_incr_08()  throws Throwable  {
      //caseID:a938e3cbb36d10158be946e57815e2cc
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);

      //prepare data for keyPrefix0
      KeyPrefix keyPrefix0 = mock(KeyPrefix.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("7").when(keyPrefix0).getPrefix();
      Long long0 = redisService0.incr(keyPrefix0, "1.0");
      assertNull(long0);
  }
  @Test(timeout = 4000)
  public void test_delete_09()  throws Throwable  {
      //caseID:f15ae477c617a6e0138da0b90ab3d542
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Long long0 = new Long(2805L);
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(jedis0).del(anyString());
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);

      //prepare data for keyPrefix0
      KeyPrefix keyPrefix0 = mock(KeyPrefix.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("1").when(keyPrefix0).getPrefix();
      boolean boolean0 = redisService0.delete(keyPrefix0, "1");
      assertTrue(boolean0);
  }
  @Test(timeout = 4000)
  public void test_delete_10()  throws Throwable  {
      //caseID:bbec0fdec4ac82080011e4513fdc8953
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Long long0 = new Long((-1L));
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(jedis0).del(anyString());
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);

      //prepare data for keyPrefix0
      KeyPrefix keyPrefix0 = mock(KeyPrefix.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("Q3z}f(s").when(keyPrefix0).getPrefix();
      boolean boolean0 = redisService0.delete(keyPrefix0, "0");
      assertFalse(boolean0);
  }
  @Test(timeout = 4000)
  public void test_set_11()  throws Throwable  {
      //caseID:2629cf114ce357e2b8e82c78821f35ff
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);
      KeyPrefix keyPrefix0 = mock(KeyPrefix.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Boolean boolean0 = redisService0.set(keyPrefix0, (String) null, (Object) null);
      assertFalse(boolean0);
  }
  @Test(timeout = 4000)
  public void test_set_12()  throws Throwable  {
      //caseID:b60a208db9bc5cf5131a5717552b4c6e
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);
      KeyPrefix keyPrefix0 = mock(KeyPrefix.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Boolean boolean0 = redisService0.set(keyPrefix0, "0", (String) null);
      assertFalse(boolean0);
  }
  @Test(timeout = 4000)
  public void test_get_13()  throws Throwable  {
      //caseID:c76245b7cfd7804aa80f02c22407be52
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);

      //prepare data for keyPrefix0
      KeyPrefix keyPrefix0 = mock(KeyPrefix.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("1").when(keyPrefix0).getPrefix();
      Class<Object> class0 = Object.class;
      Object object0 = redisService0.get(keyPrefix0, "com.jesper.seckill.redis.RedisService", class0);
      assertNull(object0);
  }
  @Test(timeout = 4000)
  public void test_get_14()  throws Throwable  {
      //caseID:f4453db2f2c82d435a9a5b29302b9ebe
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("applicationDispatcher.deallocateException").when(jedis0).get(anyString());
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);

      //prepare data for keyPrefix0
      KeyPrefix keyPrefix0 = mock(KeyPrefix.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("applicationDispatcher.deallocateException").when(keyPrefix0).getPrefix();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 

        //invoke method for redisService0
        redisService0.get(keyPrefix0, "com.jesper.seckill.redis.RedisService", class0);
      } catch(Throwable e) {
         verifyException("com.alibaba.fastjson.parser.DefaultJSONParser", e);
         assertEquals("com.alibaba.fastjson.JSONException", e.getClass().getName());
         assertEquals("syntax error, pos 1, json : applicationDispatcher.deallocateException", e.getMessage());
      }
  }
  @Test(timeout = 4000)
  public void test_get_15()  throws Throwable  {
      //caseID:8bd968069511f74b89c193bc620fb2c8
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("2146718329").when(jedis0).get(anyString());
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);

      //prepare data for keyPrefix0
      KeyPrefix keyPrefix0 = mock(KeyPrefix.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("3986").when(keyPrefix0).getPrefix();
      Class<String> class0 = String.class;
      String string0 = redisService0.get(keyPrefix0, "0", class0);
      assertNotNull(string0);
      assertEquals("2146718329", string0);
  }
  @Test(timeout = 4000)
  public void test_set_16()  throws Throwable  {
      //caseID:406d85410efec87f132b663c6840a9ba
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);
      KeyPrefix keyPrefix0 = mock(KeyPrefix.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      Boolean boolean0 = redisService0.set(keyPrefix0, "", (Object) "");
      assertFalse(boolean0);
  }
  @Test(timeout = 4000)
  public void test_beanToString_17()  throws Throwable  {
      //caseID:19d266de079d36b19a10b37f330275a6
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("0").when(jedis0).get(anyString());
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);

      //prepare data for keyPrefix0
      KeyPrefix keyPrefix0 = mock(KeyPrefix.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("").when(keyPrefix0).getPrefix();
      Class<Long> class0 = Long.class;
      Long long0 = redisService0.get(keyPrefix0, "Lj0MA", class0);
      String string0 = RedisService.beanToString((Object) long0);
      assertNotNull(string0);
      assertEquals("0", string0);
  }
  @Test(timeout = 4000)
  public void test_set_18()  throws Throwable  {
      //caseID:433ac13ca675c8773b42ac48b34d4491
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("").when(jedis0).set(anyString() , anyString());
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);

      //prepare data for keyPrefix0
      KeyPrefix keyPrefix0 = mock(KeyPrefix.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn((-1)).when(keyPrefix0).expireSeconds();
      doReturn("' is not readable or has an invalid getter method: Does the return type of the getter match the parameter type of the setter?").when(keyPrefix0).getPrefix();
      Boolean boolean0 = redisService0.set(keyPrefix0, "1", (Object) "1");
      assertTrue(boolean0);
  }
  @Test(timeout = 4000)
  public void test_set_19()  throws Throwable  {
      //caseID:af29022090064cd4545aad45533e163c
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);

      //prepare data for keyPrefix0
      KeyPrefix keyPrefix0 = mock(KeyPrefix.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(1).when(keyPrefix0).expireSeconds();
      doReturn("1").when(keyPrefix0).getPrefix();
      Boolean boolean0 = redisService0.set(keyPrefix0, "1.0", (Object) "1");
      assertTrue(boolean0);
  }
  }
