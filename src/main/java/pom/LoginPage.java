package pom;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
 @FindBy(xpath="//input[@name='username']")
private WebElement userName;
 
 @FindBy(xpath="//input[@name='pwd']")
 private WebElement passWord;
 
 @FindBy(xpath="//input[@name='remember']")
 private WebElement keepmeLogin;
 
 @FindBy(xpath="//a[@id='loginButton']")
 private WebElement loginButton;
 
 
 
 
 private WebDriver driver;
 private WebDriverWait wait;
 private JavascriptExecutor js;
 
public LoginPage(WebDriver driver) {
	 
	 PageFactory.initElements(driver,this);
	 this.driver=driver;
	 js = (JavascriptExecutor)driver;
 }
 

 public void sendUsername(String user) {
	 
	//wait=new WebDriverWait(driver,10);
	//wait.until(ExpectedConditions.visibilityOf(userName));
	//js.executeScript("arguments[0].value = 'user';", userName);

	userName.sendKeys(user);
 }
 
 public void sendPassword(String pass) {
	//actions.moveToElement(keepmeLogin).click();
	//actions.moveToElement(passWord).sendKeys("MqVpmJ65").build().perform();
	 //js.executeScript("arguments[0].value = 'pass';", passWord);
	passWord.sendKeys(pass);
 }
 
 public void Keepmelogin() {
	// alt.accept();
	 keepmeLogin.click();
	 }
 
 public void Loginbutton() {
	 loginButton.click();
 }
}
