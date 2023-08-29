package stepDefs;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class AddITem  extends TestBase{
	HomePage homePage;
	@Given("User Login into App")
	public void user_login_into_app() {
	Initialize();
	}
	@When("User add an item to cart")
	public void user_add_an_item_to_cart() throws InterruptedException {

		homePage=new HomePage();
		homePage.addItem();
		homePage.addToCart();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
	    alert.accept();
	}
	@Then("Items must be added to cart")
	public void items_must_be_added_to_cart() {
		homePage.navigateToCart();
	}
}
