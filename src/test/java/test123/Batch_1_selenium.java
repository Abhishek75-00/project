package test123;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Batch_1_selenium {
	
	
@Test
	public void testA() {
		System.out.println("testA");
		String actual ="https://paytm.com/";
		String expected="https://paytm.com";
		Assert.assertEquals(actual,expected);
		System.out.println("passed-test A");
}
@Test
	public void testB() {
	
		System.out.println("testB");
		String actual="https://www.flipkart.com/";
		String expected="https://www.flipkart.c/";
		Assert.assertNotEquals(actual, expected);
	}
@Test
	public void testC() {
	
		System.out.println("testC");
		String url="https://www.flipkart.com/";
		
		boolean result=(url!=url);
		Assert.assertTrue(result);
		
	}
@Test (timeOut=5000)
	public void testD() throws InterruptedException {
		
		System.out.println("testD");
		String url="https://www.flipkart.com/";
		boolean result=(url==url);
		Assert.assertFalse(result);
		Thread.sleep(2000);
		Assert.fail();

	}

@Test
 public void testE() {
	System.out.println("testE");
	Assert.fail();
}
@Test
public void testF() {
	
	System.out.println("testF");
	
}

}
