package swaglabs_seleniumPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut {
	WebDriver ldriver;
	public CheckOut(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
	}
	
	@FindBy(id="finish")
	WebElement clickFinish;
	
	public void ClickONFinish() {
		clickFinish.click();
	}
}
