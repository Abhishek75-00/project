package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
   
	
	@FindBy (xpath="//input[@name='username']")
	private WebElement Username;
	
	@FindBy (xpath="//input[@name='pwd']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@name='remember']")     /// Private access specifier 
	private WebElement Keepmelogin;												// make global variable private
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement Loginbutton;

	private WebDriver driver;
	
	//or 
	// multiple element
	// List<WebElement>

	
	//2. intisilize the constructor by public access specifier
	
	public Header(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		this.driver=driver;
	}
	
	
	// 3 . utilised the method with access specifier public
   
	 public void clickonusername() {
		 
		 Username.sendKeys("kambleabhishek7007@gmail.com");
	 }
	 
	 public void clickonpassword() {
		 Password.sendKeys("vTsPUSy6");
	 }
	 
	 
	 public void clickonKeepmeLogin() {
		 Keepmelogin.click();

	 }
	
	public void clickonloginbutton() {
		Loginbutton.click();
	}

	
	
}
