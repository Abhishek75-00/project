package test123;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test12345 {


	@BeforeClass  //   write the code for launching the browser
	public void beforeclass() {
		System.out.println("before class");
	}
	
	@BeforeMethod /// login details or object creation 
	public void beforemethod() {
		System.out.println("before method -2");
		
		String url="https://www.flipkart.com";// actual result
		
		//hard Assert
		// Assert 
		// Class name Assert
		Assert.assertEquals(url,"https://www.flipkart.com"); // expected result
		
		
	}
	
	@Test
	public void testC() {
		
		System.out.println("testC-2");
		System.out.println("hello");
		Assert.fail();
	}
	@Test
	public void testB() {
		
		System.out.println("testB-2");
		
	}
	@Test
	public void testA() 
	{
		System.out.println("testA-2");
	}
	
	@AfterMethod // code for logout
	public void aftermethod() 
	{
		System.out.println("after method-2");
		
 
	}
	
	@AfterClass // closing the browser we write into this
	public void afterclass()
	{
		System.out.println("afterclass-2");
		
		
	}
	
}
