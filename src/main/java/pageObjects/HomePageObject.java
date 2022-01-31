package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {

	public HomePageObject() {
			
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'Currency')]")
	private WebElement currency;

	@FindBy(xpath = "//button[@name='EUR']")
	private WebElement currencyEero;

	@FindBy(xpath = "//button[@name='GBP']")
	private WebElement currencyGbp;

	@FindBy(xpath = "//button[@name='USD']")
	private WebElement currencyUsd;

	@FindBy(xpath = "//i[@class='fa fa-phone']")
	private WebElement phoneIcon;

	@FindBy(xpath = "//span[contains(text(),'123456789')]")
	private WebElement phoneIconText;

	@FindBy(xpath="//span[contains(text(),'My Account')]")
	private WebElement myAccount;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	private WebElement registerOption;
	
	@FindBy(xpath= "//a[contains(text(),'Login')]")
	private WebElement loginOption;
	
	@FindBy(xpath="//span[contains(text(),'Wish List')]")
	private WebElement wishList;
	
	@FindBy(xpath="//span[contains(text(),'Shopping Cart')]")
	private WebElement shoppingCart;
	
	@FindBy(xpath="//span[contains(text(),'Checkout')]")
	private WebElement checkout;
	
	@FindBy(css= "input[name='search']")
	private WebElement searchText;
	
	@FindBy(id= "cart-total")
	private WebElement cartIcon;
	
	@FindBy(xpath="//a[contains(text(),'TEST ENVIRONMENT')]")
	private WebElement headerTestEnvironment;
	
	@FindBy(css = "nav[class='navbar']")
	private WebElement navigationBar;
	
	@FindBy(xpath="//footer//div[@class='row']//a")
	private WebElement footerLinks;
	
	@FindBy(linkText = "About Us")
	private WebElement aboutUs;
	
	@FindBy(linkText = "Delivery Information")
	private WebElement deliveryInfo;
	
	@FindBy(linkText = "Privacy Policy")
	private WebElement privacyPolicy;
	
	@FindBy(linkText = "Terms & Conditions")
	private WebElement termsCondition;
	
	@FindBy(linkText = "Contact Us")
	private WebElement contactUs;
	
	@FindBy(linkText = "Returns")
	private WebElement returns;
	
	@FindBy(linkText = "Site Map")
	private WebElement siteMap;
	
	@FindBy(linkText = "Brands")
	private WebElement brands;
	
	@FindBy(linkText = "Gift Certificates")
	private WebElement giftCerticate;
	
	@FindBy(linkText = "Affiliate")
	private WebElement affiliate;
	
	@FindBy(linkText = "Specials")
	private WebElement specials;
	
	@FindBy(linkText = "My Account")
	private WebElement footerMyAccount;
	
	@FindBy(linkText = "Order History")
	private WebElement orderHistory;
	
	@FindBy(linkText = "Wish List")
	private WebElement footerWishList;
	
	@FindBy(linkText = "Newsletter")
	private WebElement newsletter;
	
	@FindBy(xpath ="//h3[contains(text(),'Featured')]")
	private WebElement homeFeatured;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
