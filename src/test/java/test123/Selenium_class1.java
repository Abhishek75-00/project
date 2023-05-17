package test123;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Selenium_class1 {
    
	
	@Test
	public void testA() {
		System.out.println("testA");
	}
	
	//Soft assert 
	
	SoftAssert soft=new SoftAssert();
	
	//soft.assertEquals(Actual,Expected);
	// actual equals to expected ==== result==true===test===pass
	//actual not equals expected ==== result === false====test=== Fails
	
	//soft.assertNotEquals(actual,expected);
	// actual equal to expected == result === true === test=== fails
	//Actual notequals to expected=== result === false==== test=== pass
	
	// Soft.assertTrue(condition);
	//actual equal expected == result == true === test -=== pass
	//actual not equal expected ==== result ===false === test === fail
	
	//soft.assertFalse(condition);
	//Actual equal expected === result==true  ==== test === false
	//Actual not equal expected === result === false ===  === test == true
	
	//forcefully  used to fail the test method
	//soft.fail();
	
	
	//to apply the result on test method
	//soft.assertAll();
  
	
	
	
	
	
	
	
	
}
