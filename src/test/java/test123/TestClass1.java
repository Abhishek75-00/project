package test123;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pom.Footer;
import pom.Header;

public class TestClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.gecko.driver","D:\\abhi\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	driver.get("https://online.actitime.com/ci/logi.do");
	
	Header h=new Header(driver);
	h.clickonusername();
	h.clickonpassword();
	h.clickonKeepmeLogin();
	h.clickonloginbutton();
	
	
	
	
	Footer f=new Footer(driver);
	f.ClickonTimetrack();
	
	String url=driver.getCurrentUrl();
	String title1=driver.getTitle();
	System.out.println(url);
	
	System.out.println(title1);
	
	
	if (url.equals("https://online.actitime.com/cicd/timetrack/enter.do")&& title1.equals("actiTIME - Enter Time-Track"))
	{
		System.out.println("PAss");
	}
	else
	{
	
		System.out.println("failed");
	
	}
	


	
	f.clickontaskbutton();

	String url1=driver.getCurrentUrl();
	String title2=driver.getTitle();
	System.out.println(url1);
	System.out.println(title2);
	
	
	if(url1.equals("https://online.actitime.com/ci/tasks/tasklist.do")&& title2.equals("actiTIME - Task List"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("failed");
	}
	
	
	
	f.Clickonreport();
	 String  Url=driver.getCurrentUrl();
	   
	    String title=driver.getTitle();
	    
	    
	    System.out.println(Url);
	    
	    System.out.println(title);
	    
	    
	    if(Url.equals("https://online.actitime.com/ci/reports/dashboard.do") && title.equals("actiTIME - Reports Dashboard"))
	    {
	    	System.out.println("Pass");
	    	}
	    
	    else {
	    	System.out.println("Failed");
	    }
	    
	    f.Clickonuser();
		 String  Url3=driver.getCurrentUrl();
		   
		    String title3=driver.getTitle();
		    
		    
		    System.out.println(Url3);
		    
		    System.out.println(title3);
		    
		    
		    if(Url3.equals("https://online.actitime.com/ci/reports/dashboard.do") && title3.equals("actiTIME - Reports Dashboard"))
		    {
		    	System.out.println("Pass");
		    	}
		    
		    else {
		    	System.out.println("Failed");
		    }
	    
		
		}





}
	
	/// 
	//Test case 1
	

	
  
	
	
	 
	
	 


