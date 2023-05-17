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

public class Batchno1 {

	@BeforeSuite
	public void beforesuite() {
		System.out.println("beforeSuite---1");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("beforetest----1");
	}
	
	@BeforeClass
	public void beforeclass() {
	 System.out.println("beforeclass---1");	
	}
	
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod---1");
	}
	@Test
	public void testA() {
		System.out.println("testA---1");
	}
	@Test
	public void testB() {
		System.out.println("testB---1");
	}
	@Test
	public void testC() {
		System.out.println("testC--1");
	}
	@Test
	public void testD() {
		System.out.println("testD---1");
	}
  
	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod---1");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass---1");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest--1");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("aftersuite----1");
	}
}
