package tests;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.Browsers;

import pom.LoginPage;
import pom.TaskPage;
import utils.Utility;



public class VerificationofHeader extends Browsers {

	WebDriver driver;
		TaskPage t;
		 LoginPage a;	  
		int testid;
		String user;
		String pass;
	
		static ExtentTest test;
	static ExtentHtmlReporter reporter;
		 @Parameters("browserName")
		 
		 @BeforeTest
		 public void launchBrowser(String browser) {
			System.out.println("before test");
			
			
			reporter=new ExtentHtmlReporter("test-output\\ExtendReport\\Extent.html");
			ExtentReports extend=new ExtentReports();
			extend.attachReporter(reporter);
			if(browser.equals("Chrome")) 
			{
				driver=openChromeBrowser();
			}
			
				if(browser.equals("Firefox")) 
				{
					driver=openFirefoxbrowser();
				}
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.manage().window().maximize();
				
				}	
		 
		 
				@BeforeClass
				public void createObject() throws InterruptedException
				{
				 a=new LoginPage(driver);
				 t=new TaskPage(driver);
				}
			
			@BeforeMethod
			public void beforemethod() {//loginToApplication
				System.out.println("before method");
				 driver.get("https://online.actitime.com/ci/login.do");
                //  driver.manage().window().maximize();
                 String ur="https://online.actitime.com/ci/login.do";
                 Assert.assertEquals(ur,"https://online.actitime.com/ci/login.do");
           
	             String user=Utility.fetchExcelData("Sheet1", 1, 0);
				 a.sendUsername(user);
				 String pass=Utility.fetchExcelData("Sheet1",1,1);
				 a.sendPassword(pass);
				 
				 a.Keepmelogin();
				 
				 a.Loginbutton();

			}
			
			@Test 
			public void toverifytimetrack()  {//toverifytimetrack
				testid=101;
				System.out.println("test A");
				
				t.openTimeTrack();
				 
        String url=driver.getCurrentUrl();
			String	title= driver.getTitle();
				
			System.out.println(url);	
			System.out.println(title);
		//Assert.fail("https://online.actitime.com/ci/timetrack/enter.do");
			Assert.assertEquals(url,"https://online.actitime.com/ci/timetrack/enter.do");
		    Assert.assertEquals(title,"actiTIME - Enter Time-Track");
		
			}
			@Test
			public void Toverifythetask(){
				testid=102;
				System.out.println("test B");
				
				t.openTask();
				
			String	url1=driver.getCurrentUrl();
		    String title1=driver.getTitle();
		    System.out.println(url1);
		    System.out.println(title1);
		    
		    Assert.assertEquals(url1,"https://online.actitime.com/ci/tasks/tasklist.do");
		    Assert.assertEquals(title1,"actiTIME - Task List");
		    
			}
			
			@Test
			public void testC() {
				testid=103;
				System.out.println("testC");
				
				t.openReport();
				
		String url2=driver.getCurrentUrl();
		String title2=driver.getTitle();
		System.out.println(url2);
		System.out.println(title2);
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(url2, "https://online.actitime.com/ci/reports/dashboard.do");
			soft.assertEquals(title2,"actiTIME - Reports Dashboar")	;
			
			}
			
		@Test
		public void testD() {
			testid=104;
			System.out.println("testD");
		}

			
			
			@AfterMethod
			//listeners
			//
			public void logoutFromApplication(ITestResult result) throws IOException {
				System.out.println("aftermethod");
				if(ITestResult.FAILURE==result.getStatus()){
					Utility.capture(driver, testid=102, "Toverifythetask");
				}
				t.clickonlogout();
			}
			
			@AfterClass
			public void clearObject() {
				a = null;
				t=null;
			}
			@AfterTest
			public void aftertest() {
				System.out.println("after test");
			driver.quit();
			driver=null;
			System.gc();//garbage collector 
			}

}

