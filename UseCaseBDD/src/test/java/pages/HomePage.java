package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

/**
 * @author Administrator
 *
 */
public class HomePage extends TestBase{
	@FindBy(xpath="//a[contains(text(),'Samsung galaxy s6')]")
	WebElement product;
	
	@FindBy(xpath="//a[contains(text(),'Add to cart')]")
	WebElement Addcart;
	
	@FindBy(xpath="//a[contains(text(),'Cart')]")
	WebElement cart;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void addItem() {
		product.click();
		
	}
	public void addToCart() {
		Addcart.click();
	}
		
		public void navigateToCart() {
			cart.click();	
	}
	}


