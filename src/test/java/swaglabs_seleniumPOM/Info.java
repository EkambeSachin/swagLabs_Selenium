package swaglabs_seleniumPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Info {

	WebDriver ldriver;
	public Info(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
	}
	
	@FindBy(id="first-name")
	WebElement enterName;
	
	@FindBy(id="last-name")
	WebElement enterlast;
	
	@FindBy(id="postal-code")
	WebElement enterpost;
	
	@FindBy(id="continue")
	WebElement Continue;
	
	
	public void EnterFname(String fname) {
		enterName.sendKeys(fname);
	}
	
	public void EnterLastName(String lname) {
		enterlast.sendKeys(lname);
	}
	
	public void EnterPostalCode(String postal) {
		enterpost.sendKeys(postal);
	}
	
	public void ClickOnContinue() {
		Continue.click();
	}
}
