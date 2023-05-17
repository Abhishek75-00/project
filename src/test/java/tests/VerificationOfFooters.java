package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import base.Browsers;

import pom.Footer;
import pom.Header;

public class VerificationOfFooters extends Browsers{

	 WebDriver driver;
	 Header h;
	 Footer f;
	 
	@Parameters("browserName")
	@BeforeTest
	public void launchcode(String browser) {
		System.out.println("before test");
		if(browser.equals("Chrome")) {
			driver=openChromeBrowser();
		}
		if(browser.equals("Firefox")) {
			driver=openFirefoxbrowser();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeClass
	public void createPOMobjects() {
		System.out.println("before class");
		
		h=new Header(driver);
		f=new Footer(driver);
		
	}
	
	@BeforeMethod // URL , object , the giving the method for actions
	public void VerifytheUrl() {
		driver.get("https://online.actitime.com/ci/login.do");
		
		//driver.manage().window().ma
		
		
		h.clickonusername();
		h.clickonpassword();
		h.clickonKeepmeLogin();
		h.clickonloginbutton();
	
	}
	
	@Test        //( verify the test class)
	public void testA() {
		f.ClickonTimetrack();
		
		
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(url);
	    System.out.println(title);
	    
	    if(url.equals("https://online.actitime.com/ci/timetrack/enter.do")&& title.equals("actiTIME - Enter Time-Track"))
	    {
	    	System.out.println("PASS");
	    }
	    else
	    {
	    	System.out.println("Failed");
	    }
	    }

	
	@Test
	public void VerifytheTaskbutton() {
		
		f.clickontaskbutton();
		String url1=driver.getCurrentUrl();
		String title1=driver.getTitle();
		System.out.println(url1);
		System.out.println(title1);
		
		if(url1.equals("https://online.actitime.com/ci/tasks/tasklist.do")&& title1.equals("actiTIME - Task List"))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("failed");
		}}
	
		@Test
		public void VerifytheUsers() {
			f.Clickonuser();
		 String  Url3=driver.getCurrentUrl();
		   
		    String title3=driver.getTitle();
		    
		    
		    System.out.println(Url3);
		    
		    System.out.println(title3);
		    
		    
		    if(Url3.equals("https://online.actitime.com/ci/administration/userlist.do") && title3.equals("actiTIME - User List"))
		    {
		    	System.out.println("Pass");
		    	}
		    
		    else {
		    	System.out.println("Failed");
		    }
	}
	
	@AfterMethod
	public void clickonlogout() {
		
		f.Clickonlogout();
			
	}
	
	@AfterClass
	
   public void clearObject() {
		h=null;
		f=null;
	}
	
	@AfterTest
	public void closeBrowser(){
		System.out.println("Aftertest");
		driver.quit();
		driver=null;
		System.gc();
		
	}
		
	    
	  
	    
	 
		
	
	

	
}
