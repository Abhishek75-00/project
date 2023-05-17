package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TaskPage {
	   
    @FindBy(xpath="//a[@class='content selected tt']")
    private WebElement timetrack;
    
    @FindBy(xpath="//a[@class='content tasks']")
    private WebElement task;
    
    @FindBy(xpath="//a[@class='content reports']")
    private WebElement report;
    
    
    @FindBy(xpath="//a[@class='content users']")
    private WebElement user;
    
  
    @FindBy(xpath="//a[text()='Logout']")
    private WebElement logOut;
       
   private WebDriver driver;
  private WebDriverWait wait;
 private Actions act;
private JavascriptExecutor js;
    
   public TaskPage(WebDriver driver)  {
   	 
   	 PageFactory.initElements(driver,this);
   	 
     this.driver=driver;
  	 act=new Actions(driver);
  	 js = (JavascriptExecutor)driver;
    }
  
   
    public void openTimeTrack() {
    	
     wait=new WebDriverWait(driver,30);
   wait.until(ExpectedConditions.visibilityOf(timetrack));
    	act.moveToElement(timetrack);
    	act.perform();
        act.click();
  // timetrack.click();
    }
    
    public void openTask() {
    	wait=new WebDriverWait(driver,10);
    	wait.until(ExpectedConditions.visibilityOf(task)); 
    	js.executeScript("arguments[0].click();", task);
//    	act.moveToElement(task);
//    	act.build();
//    	act.perform();
//        act.click();
    	// task.click();
    }
    
    public void openReport() {
    	//wait=new WebDriverWait(driver,30);
    	//wait.until(ExpectedConditions.visibilityOf(report));
    	js.executeScript("arguments[0].click();", report);
//    	act.moveToElement(report);
//    	act.perform();
//        act.click();
    	//report.click();
   
   	 }
    
    public void openUser() {
    	//wait=new WebDriverWait(driver,30);
    	//wait.until(ExpectedConditions.visibilityOf(user));
    	js.executeScript("arguments[0].click();", user);
//    	act.moveToElement(user);
//    	act.perform();
//        act.click();
    	//user.click();
    	
    }
    
    public void clickonlogout() {
    //	wait=new WebDriverWait(driver,30);
    	//wait.until(ExpectedConditions.visibilityOf(logOut));
    	js.executeScript("arguments[0].click();", logOut);
//    	act.moveToElement(logOut);
//    	act.perform();
//        act.click();
    	//logOut.click();
    	
    }
    }
    











