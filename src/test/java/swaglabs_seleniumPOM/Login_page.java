package swaglabs_seleniumPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	
	WebDriver ldriver;
	public Login_page(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//identify WebElements for Enter user name
	@FindBy(id="user-name")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement passWord;
	
	//find webElement for click on login button
	@FindBy(id="login-button")
	WebElement ClickonLogin;
	
	public void EnterUsername(String Uname) {
		userName.sendKeys(Uname);
	}
	
	public void EnterPassword(String pass) {
		passWord.sendKeys(pass);
	}
	
	public void ClickOnLogin() {
		ClickonLogin.click();
	}
}
