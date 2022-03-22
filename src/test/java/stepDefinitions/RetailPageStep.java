package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import io.cucumber.datatable.DataTable;
import core.Base;
import io.cucumber.java.en.And;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RetailPageObject;
import utilities.Utility;

public class RetailPageStep extends Base {

	RetailPageObject retail = new RetailPageObject();

	@And("User click on MyAccount")
	public void user_click_on_my_account() throws IOException {
		logger.info("User clicks on MyAccount");
		retail.getMyAccount();
		Utility.takeScreenshot("My Account Button");
	}

	@When("User click on Login")
	public void user_click_on_login() throws IOException {
		logger.info("User clicks on Login");
		retail.getLogin();
		Utility.takeScreenshot("Login Button");
	}

	@And("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String userName, String password) throws IOException {
		logger.info("User enters valid email and password");
		retail.getLoginInfo(userName, password);
		Utility.takeScreenshot("Enter UserName and Password");

	}

	@And("User click on Login button")
	public void user_click_on_login_button() throws IOException {
		logger.info("User clicks on Login button");
		retail.getSubmit();
		Utility.takeScreenshot("Logging in Account");

	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() throws IOException {

		logger.info("User in MyAccount dashboard");
		retail.getDashboard();
		Utility.takeScreenshot("Dashboard");

	}

	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() throws IOException {
		logger.info("User clicks on Register as an Affiliate link");
		retail.getRegisterAffiliate();
		Utility.takeScreenshot("Register Affiliate");

	}

	@And("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) throws IOException {
		logger.info("User fills out the information");
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retail.getCompany(data.get(0).get("company"));
		retail.getWebsiteField(data.get(0).get("website"));
		retail.getTaxIDField(data.get(0).get("taxID"));
		retail.getPaymentMethodField(data.get(0).get("paymentMethod"));
		retail.gethequePayeeName(data.get(0).get("payeeName"));
		Utility.takeScreenshot("Filled out Info");

	}

	@And("User check on About us check box")
	public void user_check_on_about_us_check_box() throws IOException {
		logger.info("User clicks on About check box");
		retail.getAboutCheckBox();
		Utility.takeScreenshot("About CheckBox");
	}

	@And("User click on Continue button")
	public void user_click_on_continue_button() throws IOException, InterruptedException {
		logger.info("user clicks on Continue button");
		retail.getAffiliateContinue();
		Utility.takeScreenshot("Affiliate Continue Button");
		Thread.sleep(3000);
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() throws IOException {

		logger.info("User should be see a success message");
		retail.getMessageBox();
		Utility.takeScreenshot("Success Message Box");
	}

	@When("User click on ‘Edit your affiliate information’ link")
	public void user_click_on_edit_your_affiliate_information_link() throws IOException {
		logger.info("User clicks on Edit Affiliate link");
		retail.getEditAffiliate();
		Utility.takeScreenshot("Edit Affiliate");
	}

	@And("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() throws IOException {
		logger.info("User click on Bank Transfer button");
		retail.getpaymentBank();
		Utility.takeScreenshot("Bank Transfer Button");
	}

	@And("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable)
			throws IOException {
		logger.info("user fills Bank Information");

		List<Map<String, String>> bankData = dataTable.asMaps(String.class, String.class);
		retail.getBankNameField(bankData.get(0).get("bankName"));
		retail.getAbaNumberField(bankData.get(0).get("abaNumber"));
		retail.getSwiftCodeField(bankData.get(0).get("swiftCode"));
		retail.getAccountNameField(bankData.get(0).get("accountName"));
		retail.getAccountNumberField(bankData.get(0).get("accountNumber"));
		Utility.takeScreenshot("Bank Information");

	}

	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() throws IOException {
		logger.info("User click on edit account link");
		retail.getEditAccount();
		Utility.takeScreenshot("Edit Account Link");
	}

	@And("User modify below information")
	public void user_modify_below_information(io.cucumber.datatable.DataTable dataTable) throws IOException {

		logger.info("User modify the account");
		List<Map<String, String>> editData = dataTable.asMaps(String.class, String.class);
		retail.getEditFirstName(editData.get(0).get("firstName"));
		retail.getEditLastName(editData.get(0).get("lastName"));
		retail.getEditEmail(editData.get(0).get("email"));
		retail.getEditTelephone(editData.get(0).get("telephone"));
		Utility.takeScreenshot("Editing Account");
	}

}
