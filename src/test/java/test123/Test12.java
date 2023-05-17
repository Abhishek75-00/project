package test123;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.http.HttpClient;
import org.openqa.selenium.remote.http.HttpRequest;
import org.openqa.selenium.remote.http.HttpResponse;

import pom.Header;
import pom.LoginPage;
import pom.TaskPage;
import utils.Utility;


public class Test12 {

// we navigational steps into test class
	
	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (5)\\chromedriver.exe");

 WebDriver driver =new ChromeDriver();
//WebDriver driver=new FirefoxDriver();
 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

 driver.get("https://online.actitime.com/ci/login.do");

 
 driver.manage().window().maximize();
 
 LoginPage a=new LoginPage(driver);
String user=Utility.fetchExcelData("Sheet1", 1, 0);
 a.sendUsername(user);
 String pass=Utility.fetchExcelData("Sheet1", 1, 1);
 a.sendPassword(pass);

 a.Keepmelogin();
 
 a.Loginbutton();

 


 Header ha=new Header(driver);

 //test case 1
 TaskPage t=new TaskPage(driver);
 
 t.openTimeTrack();

 String url=driver.getCurrentUrl();
 String title=driver.getTitle();
 System.out.println(url);
 System.out.println(title);
 
 
 if(url.equals("https://online.actitime.com/ci/timetrack/enter.do")&& title.equals("actiTIME - Enter Time-Track")) {
	 
	 System.out.println("Pass");
	 }

	 else {
		 
		 System.out.println("failed");
		 
	 }
	 
 
 
 t.openTask();
 
 String url1=driver.getCurrentUrl();
 String title1=driver.getTitle();
 System.out.println(url1);
 System.out.println(title1);
 
 if(url1.equals("https://online.actitime.com/ci/tasks/tasklist.do") && title1.equals("actiTIME - Task List"))
 {
	 System.out.println("Pass");
 }
 else {
	 
	 System.out.println("Failed");
	 
 }

 
 
 
 /// test case 3
 t.openReport();
 String url2=driver.getCurrentUrl();
 String title2=driver.getTitle();
 System.out.println(url2);
 System.out.println(title2);
 
 if(url2.equals("https://online.actitime.com/ci/reports/dashboard.do") && title2.equals("actiTIME - Reports Dashboard"))
 {
	 System.out.println("Pass");
 }
 else {
	 System.out.println("Failed");
 }
 
 //test case 4  
 
 
 t.openUser();
 String url3=driver.getCurrentUrl();
 String title3=driver.getTitle();
 System.out.println(url3);
 System.out.println(title3);
 
 if(url3.equals("https://online.actitime.com/ci/administration/userlist.do") && title3.equals("actiTIME - User List"))
 {
	 System.out.println("Pass");
 }
 else {
	 System.out.println("Failed");
 }
 
 
 t.clickonlogout();
 
   }
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}


