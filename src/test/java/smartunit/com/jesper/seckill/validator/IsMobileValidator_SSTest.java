/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.com.jesper.seckill.validator;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import static org.smartunit.shaded.org.mockito.Mockito.*;
import org.smartunit.shaded.org.mockito.ArgumentMatchers;
import com.jesper.seckill.validator.IsMobile;
import com.jesper.seckill.validator.IsMobileValidator;
import javax.validation.ConstraintValidatorContext;
import org.junit.runner.RunWith;
import org.smartunit.runtime.ExecutorServiceAnswer;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;
import org.smartunit.runtime.TransactionTemplateAnswer;
import org.smartunit.runtime.ViolatedAssumptionAnswer;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class IsMobileValidator_SSTest extends IsMobileValidator_SSTest_scaffolding {

  @Test(timeout = 4000)
  public void test_isValid_0()  throws Throwable  {
      //caseID:4c750d13d83ac6db3a1dd054a3ffcd47
      IsMobileValidator isMobileValidator0 = new IsMobileValidator();
      ConstraintValidatorContext constraintValidatorContext0 = mock(ConstraintValidatorContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      boolean boolean0 = isMobileValidator0.isValid("", constraintValidatorContext0);
      assertTrue(boolean0);
  }
  @Test(timeout = 4000)
  public void test_initialize_1()  throws Throwable  {
      //caseID:96e6f30c0964d49fa000a32408c90abe
      IsMobileValidator isMobileValidator0 = new IsMobileValidator();

      //prepare data for isMobile0
      IsMobile isMobile0 = mock(IsMobile.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      doReturn(true).when(isMobile0).required();

      //invoke method for isMobileValidator0
      isMobileValidator0.initialize(isMobile0);
  }
  @Test(timeout = 4000)
  public void test_isValid_2()  throws Throwable  {
      //caseID:b226548cb57bee5f46cfee7bafd95b05
      IsMobileValidator isMobileValidator0 = new IsMobileValidator();
      ConstraintValidatorContext constraintValidatorContext0 = mock(ConstraintValidatorContext.class, withSettings().defaultAnswer(new ViolatedAssumptionAnswer()).stubOnly());
      boolean boolean0 = isMobileValidator0.isValid("1", constraintValidatorContext0);
      assertFalse(boolean0);
  }}
