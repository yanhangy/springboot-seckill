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
import com.jesper.seckill.redis.KeyPrefix;
import com.jesper.seckill.redis.OrderKey;
import com.jesper.seckill.redis.RedisService;
import javax.swing.JLayeredPane;
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
      RedisService redisService0 = new RedisService();
      Class<Object> class0 = Object.class;
      Object object0 = RedisService.stringToBean("", class0);
      assertNull(object0);
  }
  @Test(timeout = 4000)
  public void test_stringToBean_01()  throws Throwable  {
      RedisService redisService0 = new RedisService();
      Object object0 = RedisService.stringToBean("1", (Class<Object>) null);
      assertNull(object0);
  }
  @Test(timeout = 4000)
  public void test_stringToBean_02()  throws Throwable  {
      RedisService redisService0 = new RedisService();
      Class<Integer> class0 = Integer.TYPE;
      Integer integer0 = RedisService.stringToBean("1", class0);
      assertNotNull(integer0);
      assertEquals(1, (int)integer0);
  }
  @Test(timeout = 4000)
  public void test_stringToBean_03()  throws Throwable  {
      RedisService redisService0 = new RedisService();
      Class<Integer> class0 = Integer.class;
      Integer integer0 = RedisService.stringToBean("1", class0);
      assertNotNull(integer0);
      assertEquals(1, (int)integer0);
  }
  @Test(timeout = 4000)
  public void test_stringToBean_04()  throws Throwable  {
      RedisService redisService0 = new RedisService();
      Class<Object> class0 = Object.class;
      Object object0 = RedisService.stringToBean("{}", class0);
      assertNotNull(object0);
  }
  @Test(timeout = 4000)
  public void test_beanToString_05()  throws Throwable  {
      RedisService redisService0 = new RedisService();
      Long long0 = Long.valueOf((-1L));
      String string0 = RedisService.beanToString(long0);
      assertEquals("-1", string0);
  }
  @Test(timeout = 4000)
  public void test_get_06()  throws Throwable  {
      RedisService redisService0 = new RedisService();
      OrderKey orderKey0 = new OrderKey("1.0");
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 

        //invoke method for redisService0
        redisService0.get((KeyPrefix) orderKey0, "org.apache.catalina.loader.JdbcLeakPrevention", class0);
      
      } catch(Throwable e) {
         //
         // Exception Name: NullPointerException
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test_decr_07()  throws Throwable  {
      RedisService redisService0 = new RedisService();
      OrderKey orderKey0 = new OrderKey("redis.clients.jedis.BinaryShardedJedis");
      // Undeclared exception!
      try { 

        //invoke method for redisService0
        redisService0.decr((KeyPrefix) orderKey0, "org.apache.catalina.realm.NullRealm");
      
      } catch(Throwable e) {
         //
         // Exception Name: NullPointerException
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test_incr_08()  throws Throwable  {
      RedisService redisService0 = new RedisService();
      OrderKey orderKey0 = new OrderKey("toURI");
      // Undeclared exception!
      try { 

        //invoke method for redisService0
        redisService0.incr((KeyPrefix) orderKey0, "");
      
      } catch(Throwable e) {
         //
         // Exception Name: NullPointerException
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test_beanToString_09()  throws Throwable  {
      RedisService redisService0 = new RedisService();
      String string0 = RedisService.beanToString((Object) redisService0);
      assertEquals("{}", string0);
  }
  @Test(timeout = 4000)
  public void test_incr_10()  throws Throwable  {
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);

      //prepare data for keyPrefix0
      KeyPrefix keyPrefix0 = mock(KeyPrefix.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("MethodMetadata must not be null").when(keyPrefix0).getPrefix();
      Long long0 = redisService0.incr(keyPrefix0, "");
      assertNull(long0);
  }
  @Test(timeout = 4000)
  public void test_decr_11()  throws Throwable  {
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);

      //prepare data for keyPrefix0
      KeyPrefix keyPrefix0 = mock(KeyPrefix.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("com.jesper.seckill.redis.RedisService").when(keyPrefix0).getPrefix();
      Long long0 = redisService0.decr(keyPrefix0, "1.0");
      assertNull(long0);
  }
  @Test(timeout = 4000)
  public void test_exists_12()  throws Throwable  {
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);

      //prepare data for keyPrefix0
      KeyPrefix keyPrefix0 = mock(KeyPrefix.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("exists").when(keyPrefix0).getPrefix();
      // Undeclared exception!
      try { 

        //invoke method for redisService0
        redisService0.exists(keyPrefix0, "Yws<n_(");
      
      } catch(Throwable e) {
         //
         // Exception Name: NullPointerException
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test_delete_13()  throws Throwable  {
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);

      //prepare data for keyPrefix0
      KeyPrefix keyPrefix0 = mock(KeyPrefix.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("1h/H.O").when(keyPrefix0).getPrefix();
      // Undeclared exception!
      try { 

        //invoke method for redisService0
        redisService0.delete(keyPrefix0, "r^}");
      
      } catch(Throwable e) {
         //
         // Exception Name: NullPointerException
         // no message in exception (getMessage() returned null)
         //
      }
  }
  @Test(timeout = 4000)
  public void test_delete_14()  throws Throwable  {
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Long long0 = new Long(0L);
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(jedis0).del(nullable(java.lang.String.class));
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);
      OrderKey orderKey0 = new OrderKey("file [");
      boolean boolean0 = redisService0.delete(orderKey0, "1");
      assertFalse(boolean0);
  }
  @Test(timeout = 4000)
  public void test_delete_15()  throws Throwable  {
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Long long0 = new Long(758L);
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(long0).when(jedis0).del(nullable(java.lang.String.class));
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);

      //prepare data for keyPrefix0
      KeyPrefix keyPrefix0 = mock(KeyPrefix.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("0").when(keyPrefix0).getPrefix();
      boolean boolean0 = redisService0.delete(keyPrefix0, "ab'vLxA(I");
      assertTrue(boolean0);
  }
  @Test(timeout = 4000)
  public void test_set_16()  throws Throwable  {
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);
      OrderKey orderKey0 = OrderKey.getSeckillOrderByUidGid;
      Boolean boolean0 = redisService0.set((KeyPrefix) orderKey0, ">", (Integer) null);
      assertFalse(boolean0);
  }
  @Test(timeout = 4000)
  public void test_get_17()  throws Throwable  {
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);

      //prepare data for keyPrefix0
      KeyPrefix keyPrefix0 = mock(KeyPrefix.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("0").when(keyPrefix0).getPrefix();
      Class<String> class0 = String.class;
      String string0 = redisService0.get(keyPrefix0, "1", class0);
      assertNull(string0);
  }
  @Test(timeout = 4000)
  public void test_get_18()  throws Throwable  {
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("110").when(jedis0).get(nullable(java.lang.String.class));
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);

      //prepare data for keyPrefix0
      KeyPrefix keyPrefix0 = mock(KeyPrefix.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("com.jesper.seckill.redis.RedisService").when(keyPrefix0).getPrefix();
      Class<String> class0 = String.class;
      String string0 = redisService0.get(keyPrefix0, "1", class0);
      assertNotNull(string0);
      assertEquals("110", string0);
  }
  @Test(timeout = 4000)
  public void test_set_19()  throws Throwable  {
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn("0").when(jedis0).setex(nullable(java.lang.String.class) , nullable(java.lang.Integer.class) , nullable(java.lang.String.class));
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);

      //prepare data for keyPrefix0
      KeyPrefix keyPrefix0 = mock(KeyPrefix.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(3).when(keyPrefix0).expireSeconds();
      doReturn("qE[ ").when(keyPrefix0).getPrefix();
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      Boolean boolean0 = redisService0.set(keyPrefix0, "T", (Object) integer0);
      assertTrue(boolean0);
  }
  @Test(timeout = 4000)
  public void test_set_20()  throws Throwable  {
      RedisService redisService0 = new RedisService();

      //prepare data for jedisPool0
      Jedis jedis0 = mock(Jedis.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      JedisPool jedisPool0 = mock(JedisPool.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(jedis0).when(jedisPool0).getResource();

      //invoke method for redisService0
      PrivateAccess.setVariable((Class<?>) RedisService.class, redisService0, "jedisPool", (Object) jedisPool0);

      //prepare data for keyPrefix0
      KeyPrefix keyPrefix0 = mock(KeyPrefix.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(0).when(keyPrefix0).expireSeconds();
      doReturn("com.jesper.seckill.redis.RedisService").when(keyPrefix0).getPrefix();
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      Boolean boolean0 = redisService0.set(keyPrefix0, "T", (Object) integer0);
      assertTrue(boolean0);
  }}
