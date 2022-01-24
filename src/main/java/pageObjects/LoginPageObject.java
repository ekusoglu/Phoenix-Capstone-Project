package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPageObject extends Base{

	
	public LoginPageObject() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountButton;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	private WebElement registerOption;
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement submit;
	
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
	
	@FindBy(xpath= "//div[@class='form-group']/div/label[1]/input")
	private WebElement subscribe;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement agreeToTermsCheckBox;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	
	@FindBy(linkText = "Edit your account information")
	private WebElement edit;
	
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

	@FindBy(linkText = "Subscribe / unsubscribe to newsletter")
	private WebElement subscribeNewsletter;

	
	
	
	
}
