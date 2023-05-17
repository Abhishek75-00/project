package test123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class123 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "D:\\abhi\\chromedriver.exe");
		  
		  
		  WebDriver driver =new ChromeDriver();// upcasting is done here
		  driver.get("https://www.facebook.com/");
		  Thread.sleep(1000);
		  driver.get("");
		  
	}
	
	}


