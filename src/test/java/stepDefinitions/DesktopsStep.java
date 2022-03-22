package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.swing.text.Utilities;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DesktopsPageObject;
import utilities.Utility;

public class DesktopsStep extends Base {

	DesktopsPageObject desktop = new DesktopsPageObject();

	
	
	@Given("^User in on Retail website$")
	public void user_in_on_retail_website() throws IOException {
		Utility.takeScreenshot("Test Environment Retail Page");
		logger.info("User is on Retail Home page");
	}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() throws IOException {

		desktop.getDesktopsTabs();
		logger.info("User is on Desktop tab");
		Utility.takeScreenshot("Desktops Tab");
	}

	@And("User clicks on Show all desktops")
	public void user_clicks_on_show_all_desktops() throws IOException {
		desktop.getShowlAllDeskops();
		logger.info("user is clicked on Show All Desktops");
		Utility.takeScreenshot("Show All Desktops Icon");
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() throws IOException {
		desktop.getProducts();
		Utility.takeScreenshot("Presented Items");
		logger.info("All items are presented on the Page");
	}

	@When("User click ADD TO CART option on {string} item")
	public void user_click_add_to_cart_option_on_item(String item) throws IOException {
		desktop.getAddTocartDesktops(item);
		Utility.takeScreenshot("Add to Cart");
		logger.info("Adding desired item in the cart");
	}

	@When("User select quantity {string}")
	public void user_select_quantity(String quantity) throws IOException {
		desktop.getSendQuantity(quantity);
		Utility.takeScreenshot("Item Quantity");
		logger.info("Adding desired quantity");
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() throws IOException {
		desktop.getAddCart();
		Utility.takeScreenshot("Item Added to Cart");
		logger.info("Adding choesn item to the cart");
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String message) throws IOException {
		desktop.getSuccesMessage(message);
	
		Utility.takeScreenshot("Succes Message");
		logger.info("Validating the Success Message");
	}

	@When("User select color from dropdown {string}")
	public void user_select_color_from_dropdown(String color) throws IOException {
		desktop.getCanonSelect(color);
		Utility.takeScreenshot("Color Choice");
		logger.info("Choosing the Color");
	}

	@And("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() throws IOException {
		desktop.getCanonImage();
		Utility.takeScreenshot("Canon EOS 5D");
		logger.info("Canon EOS 5D has added to cart");
	}

	@And("User click on write a review link")
	public void user_click_on_write_a_review_link() throws IOException {
		desktop.getSelectReview();
		Utility.takeScreenshot("Select Review");
		logger.info("User clicked on the review link");

	}

	@And("User fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) throws IOException {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		desktop.getreviewName(data.get(0).get("name"));
		desktop.getinputReview(data.get(0).get("review"));
		desktop.getRatingList(data.get(0).get("rate"));
		Utility.takeScreenshot("Review section");
		logger.info("User succesfully filled out the Review section");

	}

	@And("User click on Continue Button")
	public void user_click_on_continue_button() throws IOException {
		desktop.getreviewContinue();
		Utility.takeScreenshot("Continue Button");
		logger.info("User clicked on the Continue button");
	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String reviewMessage) throws IOException {
		desktop.getReviewText(reviewMessage);
		Utility.takeScreenshot("Review Message");
		logger.info("Validating to the Review Message");

	}
	
	
	

}
