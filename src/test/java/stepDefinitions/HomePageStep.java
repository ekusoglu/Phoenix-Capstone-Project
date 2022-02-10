package stepDefinitions;

import java.io.IOException;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObject;
import utilities.Utility;

public class HomePageStep extends Base {

	HomePageObject home = new HomePageObject();

	@When("User click on Currency")
	public void user_click_on_currency() throws IOException {
		logger.info("User click on Currency");
		home.getCurrency();
		Utility.takeScreenshot("Currency");
	}

	@And("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() throws IOException {

		logger.info("User clicks on Euro option");
		home.getEuro();
		Utility.takeScreenshot("Euro option");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() throws IOException {
		logger.info("Validating the currency value");
		home.getCurrencyTab();
		Utility.takeScreenshot("Validiate Currency");

	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() throws IOException {
		logger.info("User clicks on Shopping cart");
		home.getShoppingcart();
		Utility.takeScreenshot("Shopping cart");

	}

	@Then("{string} message should display")
	public void message_should_display(String message) throws IOException {
		logger.info("Validiate Shopping cart Message");
		home.getShoppingCartMessage(message);
		Utility.takeScreenshot("validiate Shopping cart Message");

	}

}
