package test123;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {
//public static void main(String[] args) {
	    
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method");
	}
	//test class will exceute by testNg
	//all method are nonstatic
	//we have not done any objects 
	// this is done by testng
	//annoation works as bookmark and work as testng exceutor base on sequence it will exceute
	//methods should be non-static
	
	@Test(timeOut=6000)
	public void testA() throws InterruptedException {
		
		System.out.println("test A-1");
		Thread.sleep(5000);
		
		System.out.println("hello");
		
	}
	@Test(priority= 0)
	public void testB() {
		System.out.println("test B-1");
	}
	@Test (priority= 1)
	public void testC() {
		System.out.println("test C-1");
		
		}
	@Test (priority= 2)
	public void testD() {
		System.out.println("test D-1");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method-1");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class-1");
		
	}
	
	
}

