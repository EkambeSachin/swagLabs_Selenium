package swaglabs_seleniumPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_page {

	WebDriver ldriver;
	public Product_page(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//click on add product 
	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement clickOnAdd;
	
	@FindBy(id="shopping_cart_container")
    WebElement clickOnCart;	
	public void addProduct() {
		clickOnAdd.click();
	}
	
	public void clickOnCart() {
		clickOnCart.click();
	}
	
}
