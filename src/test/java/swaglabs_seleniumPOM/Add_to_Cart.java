package swaglabs_seleniumPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_to_Cart {

	WebDriver ldriver;
	
	public Add_to_Cart(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="checkout")
	WebElement clickCheckButton;
	
	public void clickOnCheckOut() {
		clickCheckButton.click();
	}
}
