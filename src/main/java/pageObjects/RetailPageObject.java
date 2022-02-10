package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utility;

public class RetailPageObject extends Base {

	public RetailPageObject() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountButton;

	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginButton;

	@FindBy(xpath = "//a[contains(text(),'Register')]")
	private WebElement registerOption;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement loginEmail;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement loginPassword;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement submit;

	@FindBy(xpath = "//div[@id='content']")
	private WebElement dashboard;

	@FindBy(xpath = "//div[@class='form-group']//a[contains(text(),'Forgotten Password')]")
	private WebElement forgetPassword;

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement register;

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstNameField;

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastNameField;

	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement telephoneField;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@id='input-confirm']")
	private WebElement confirmPasswordField;

	@FindBy(xpath = "//div[@class='form-group']/div/label[1]/input")
	private WebElement subscribe;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement agreeToTermsCheckBox;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;

	@FindBy(linkText = "Edit your account information")
	private WebElement editAccount;

	@FindBy(linkText = "Change your password")
	private WebElement changePassword;

	@FindBy(linkText = "Modify your address book entries")
	private WebElement modifyAddress;

	@FindBy(linkText = "Modify your wish list")
	private WebElement modifyWishList;

	@FindBy(linkText = "View your order history")
	private WebElement orderHistory;

	@FindBy(linkText = "Downloads")
	private WebElement downloads;

	@FindBy(linkText = "Your Reward Points")
	private WebElement rewardPoint;

	@FindBy(linkText = "View your return requests")
	private WebElement returnRequest;

	@FindBy(linkText = "Your Transactions")
	private WebElement transactions;

	@FindBy(linkText = "Recurring payments")
	private WebElement recurringPayments;

	@FindBy(linkText = "Register for an affiliate account")
	private WebElement registerAffiliate;

	@FindBy(linkText = "Edit your affiliate information")
	private WebElement editAffiliate;

	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement companyName;

	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement websiteField;

	@FindBy(css = "#input-tax")
	private WebElement taxIDField;

	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement paymentCheque;

	@FindBy(xpath = "//input[@value='paypal']")
	private WebElement paymentPaypal;

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement paymentBank;

	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement chequePayeeName;

	@FindBy(xpath = "//input[@name='agree']")
	private WebElement aboutCheckBox;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement affiliateContinue;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement messageBox;

	@FindBy(linkText = "Subscribe / unsubscribe to newsletter")
	private WebElement subscribeNewsletter;

	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement bankNameField;

	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement abaNumberField;

	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement swiftCodeField;

	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement accountNameField;

	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement accountNumberField;

	@FindBy(css = "#input-firstname")
	private WebElement editFirstName;

	@FindBy(css = "#input-lastname")
	private WebElement editLastName;

	@FindBy(css = "#input-email")
	private WebElement editEmail;

	@FindBy(css = "#input-telephone")
	private WebElement editTelephone;

	public void getMyAccount() {
		myAccountButton.click();
	}

	public void getLogin() {
		loginButton.click();
	}

	public void getLoginInfo(String userName, String password) {
		loginEmail.sendKeys(userName);
		loginPassword.sendKeys(password);
	}

	public void getSubmit() {
		submit.click();
	}

	public void getDashboard() {
		Utility.highlightelementRedBorder(dashboard);
		Assert.assertTrue(dashboard.isDisplayed());
	}

	public void getRegisterAffiliate() {

		registerAffiliate.click();
	}

	public void getCompany(String company) {
		companyName.sendKeys(company);
	}

	public void getWebsiteField(String website) {
		websiteField.sendKeys(website);
	}

	public void getTaxIDField(String taxID) {
		taxIDField.sendKeys(taxID);
	}

	public void getPaymentMethodField(String paymentMethod) {

		while (paymentMethod.equals("Cheque")) {
			if (paymentCheque.isSelected()) {
				break;
			} else {
				paymentCheque.click();
			}
		}

	}

	public void gethequePayeeName(String payeeName) {
		chequePayeeName.sendKeys(payeeName);
	}

	public void getAboutCheckBox() {

		Utility.highlightelementRedBorder(aboutCheckBox);
		aboutCheckBox.click();
	}

	public void getAffiliateContinue() {
		Utility.highlightelementRedBorder(affiliateContinue);
		affiliateContinue.click();
	}

	public void getMessageBox() {
		Assert.assertTrue(messageBox.isDisplayed());
	}

	public void getEditAffiliate() {

		editAffiliate.click();
	}

	public void getpaymentBank() {
		paymentBank.click();
	}

	public void getBankNameField(String bankName) {
		bankNameField.sendKeys(bankName);
	}

	public void getAbaNumberField(String abaNumber) {

		abaNumberField.sendKeys(abaNumber);
	}

	public void getSwiftCodeField(String swiftCode) {
		swiftCodeField.sendKeys(swiftCode);
	}

	public void getAccountNameField(String accountName) {

		accountNameField.sendKeys(accountName);
	}

	public void getAccountNumberField(String accountNumber) {

		accountNumberField.sendKeys(accountNumber);
	}

	public void getEditAccount() {
		editAccount.click();
	}

	public void getEditFirstName(String firstName) {
		editFirstName.clear();
		editFirstName.sendKeys(firstName);
	}

	public void getEditLastName(String lastName) {
		editLastName.clear();
		editLastName.sendKeys(lastName);
	}

	public void getEditEmail(String email) {
		editEmail.clear();
		editEmail.sendKeys(email);
	}

	public void getEditTelephone(String telephone) {

		editTelephone.clear();
		editTelephone.sendKeys(telephone);
	}
}
