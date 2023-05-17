package test123;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Batch1 {
   SoftAssert soft=new SoftAssert();
	//Soft assert 
	@Test
	public void testA() {
		System.out.println("testA---1");
		String url="https://www.flipkart.com/";
		
		SoftAssert soft=new SoftAssert();
		
		soft.assertEquals(url,"https://www.flipkart.com/");
		
		soft.assertAll();
		
		
	}
	@Test
	public void testB() {
		System.out.println("testB----2");
		String url="https://www.flipkart.com/";
		// not equals
		soft.assertNotEquals(url,"https://www.flipkart.co");
		soft.assertAll();
	}
	@Test
	public void testC() {
		System.out.println("testC----3");
		String url="https://www.flipkart.com/";
		boolean result= (url==url);
		soft.assertTrue(result);
		soft.assertAll();// to get the fail result we are using this method
	}
	@Test
	public void testD() {
		System.out.println("testD-----4");
		
		String url="https://www.flipkart.com/";
		boolean result = (url!=url);
		soft.assertFalse(result);
		soft.assertAll();
		
	}
	
	@Test
	public void testE() {
		System.out.println("testE");
		String url="https://www.flipkart.com/";
		soft.fail(url);
		soft.assertAll();
	}
}