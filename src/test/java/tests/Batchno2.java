package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Batchno2 {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("beforesuite---2");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest---2");
	}
	
	
	@BeforeClass
	public void beforeclass() {
	 System.out.println("beforeclass---2");	
	}
	
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod---2");
	}
	@Test
	public void testA() {
		System.out.println("testA---2");
	}
	@Test
	public void testB() {
		System.out.println("testB---2");
	}
	@Test
	public void testC() {
		System.out.println("testC--2");
	}
	@Test
	public void testD() {
		System.out.println("testD---2");
	}
  
	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod---2");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass---2");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest--2");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("aftersuite--2");
		
	}
}

