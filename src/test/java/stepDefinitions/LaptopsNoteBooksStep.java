package stepDefinitions;

import java.io.IOException;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LaptopsNoteBooksPageObject;
import utilities.Utility;

public class LaptopsNoteBooksStep extends Base {

	LaptopsNoteBooksPageObject laptops = new LaptopsNoteBooksPageObject();

	@Given("^User is on Retail website$")
	public void user_is_on_retail_website() throws IOException {
		logger.info("User is on Retail Page");
		Utility.takeScreenshot("Retail Page");
	}

	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() throws IOException {

		laptops.getLaptobTabs();
		logger.info("user is clicking on Laptop&NoteBook tab");
		Utility.takeScreenshot("Laptoip&NoteBook Tab");

	}

	@And("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() throws IOException {

		laptops.getShowlAllLaptop();
		logger.info("User clicking on Show All Laptop option");
		Utility.takeScreenshot("Show All Option");

	}

	@And("User click on MacBook item")
	public void user_click_on_mac_book_item() throws IOException {

		laptops.getMacImage();
		logger.info("User clicking on MacBook");
		Utility.takeScreenshot("MacBook ");
	}

	@And("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String cart) throws IOException {

		laptops.getCartIconMessage(cart);
		logger.info("Validating the cart");
		Utility.takeScreenshot("Cart");
	}

	@And("User click on cart option")
	public void user_click_on_cart_option() throws IOException {

		laptops.getCartIcon();
		logger.info("User clicking on the cart icon");
		Utility.takeScreenshot("Cart Icon");
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() throws  IOException {
		logger.info("User clicking on red x button");
		Utility.takeScreenshot("Removing Item");
		laptops.getCartIconRemoveButton();
		
	}

	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String cartEmpty) throws IOException {

		laptops.getCartIconMessageEmpty(cartEmpty);
		logger.info("User validating the Cart");
		Utility.takeScreenshot("Validating Cart");
	}

	@And("User click on product comparison icon on {string}")
	public void user_click_on_product_comparison_icon_on(String comparedItems)
			throws InterruptedException, IOException {
		logger.info("User clicks on Camparison icon");
		laptops.getCompareIcon(comparedItems);
	
		Utility.takeScreenshot("Comparision Icon");
	}

	@And("User click on Product comparison link")
	public void user_click_on_product_comparison_link() throws IOException {
		logger.info("User clicks on the Comparision link");
		laptops.getCompareProducts();
		Utility.takeScreenshot("Camparion Link");
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() throws IOException {
		logger.info("Validating the Comparision chart");
		laptops.getComparisonChart();
		Utility.takeScreenshot("Camparision Chart");
	}

	@When("User click on heart icon to add Sony VaIO laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() throws IOException {
		logger.info("User clickd on the wishlist button on Sony VaIO");
		laptops.getHeartIconSony();
		Utility.takeScreenshot("Sony WishList");
	}

	@Then("User should get a message {string}")
	public void user_should_get_a_message(String message) throws IOException {
		logger.info("Validating the Alert Message");
		laptops.getLoginMessage(message);
		Utility.takeScreenshot("Validiate WishList Message");

	}

	@When("User click on {string} item")
	public void user_click_on_item(String item) throws IOException {
		logger.info("User click on the MacBook Pro");
		laptops.getMacProImage();
		Utility.takeScreenshot("MacBook Pro UI");
	}

	@Then("User should see  {string} price tag is present on UI")
	public void user_should_see_price_tag_is_present_on_ui(String priceTag) throws IOException {

		logger.info("Validating the Price Tag");
		laptops.getMacProPrice(priceTag);
		Utility.takeScreenshot("Price Tag");

	}

}
