package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Footer {

	@FindBy(xpath="//a[@class='content selected tt']")
	private WebElement Timetrack;
	
	
	@FindBy (xpath="//a[@class='content tasks']")
	private WebElement taskbutton;
	
	
	@FindBy(xpath="//a[@class='content reports']")
	private WebElement Report;
	
	
	@FindBy (xpath="//a[@class='content users']")
	private WebElement User;
	
@FindBy (xpath="(//a[@id='logoutLink'])")
private WebElement Logout;
	
	private WebDriver driver;
	private WebDriverWait wait;
	private Actions act;
	//private Alert alt;
	
	public Footer(WebDriver driver) {// 2 nd point
		PageFactory.initElements(driver, this);
		this.driver=driver;
		wait=new WebDriverWait(driver,30);
		act=new Actions(driver);
		//alt=driver.switchTo().alert();
	}

	
	
	
	public  void ClickonTimetrack() {
	
	
		wait.until(ExpectedConditions.visibilityOf(Timetrack));

		Timetrack.click();
	}
	
	public void clickontaskbutton() {
		
		wait.until(ExpectedConditions.visibilityOf(Timetrack));
		taskbutton.click();
	}
	
	public void Clickonreport() {

		wait.until(ExpectedConditions.visibilityOf(Timetrack));
		Report.click();
		
	}
	
	public void Clickonuser() {
		wait.until(ExpectedConditions.visibilityOf(User));
		User.click();
	}
	
	public void Clickonlogout() {
		wait.until(ExpectedConditions.visibilityOf(Logout));
		Logout.click();
	}
}
