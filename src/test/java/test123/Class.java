package test123;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Class {

	@Test
	public void testA(){
		System.out.println("testA");
		String actual="https://www.flipkart.com";
		String expected="https://www.flipkart.com";
		//Assert.assertEquals(actual, expected);
	}
	
	// Actual result is equal to expected = result true == pass that testmethod
	// Actual result is not equal to expected == result false === failed the method
	// Assert.assertEquals(Actual,Expected) -- Assert class
	
	
	// Assert.assertNotEquals(Actual , expected);
	// actual result equal to expected == result -true == test --Fail
	// actual result not equals to expected == result -- false === test == pass
	
	//Assert.assertTrue(result);
	//boolean datatype --- 
	// result== true == pass method 
	// result === false == fail method
	
	// Assert.assertFalse(result)
	//result = true == test --- fail
	// result === false == test --- pass
	
	//Assert.fail();
// we are this method to forcefully failing any test method

	// important note --- When any method fails in hard assert we are are not able verify the remaining method it
	//will show error

}
