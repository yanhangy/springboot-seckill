/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import com.jesper.seckill.util.UUIDUtil;
import org.junit.runner.RunWith;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class UUIDUtil_SSTest extends UUIDUtil_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_uuid_0()  throws Throwable  {
      UUIDUtil uUIDUtil0 = new UUIDUtil();
      String string0 = UUIDUtil.uuid();
      assertEquals("14865770098048b2b173d05ca26ff48a", string0);
  }}
