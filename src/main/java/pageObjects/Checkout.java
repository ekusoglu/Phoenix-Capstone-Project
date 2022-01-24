package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Checkout extends Base {

	public Checkout() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='cart']")
	private WebElement cartIcon;
	
	@FindBy(xpath = "//p[@class='text-right']/a[1]")
	private WebElement viewCart;
	@FindBy(xpath = "//p[@class='text-right']/a[2]")
	private WebElement checkout;
	
	@FindBy(css= "input[value = 'Continue']")
	private WebElement contunie;
	
	@FindBy(xpath = "//input[@id='button-shipping-address']")
	private WebElement deliverydetailsContunie;
	
	@FindBy(xpath="//textarea[@name='comment']")
	private WebElement deliveryComment;
	
	@FindBy(xpath = "//input[@id='button-shipping-method']")
	private WebElement shippingMethodContunie;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkbox;
	
	@FindBy(xpath = "button-payment-method")
	private WebElement paymnentContunie;
	
	@FindBy(xpath = "//input[@value='Confirm Order']")
	private WebElement confirmOrder;
	
	@FindBy(xpath = "//div[@id='content']/h1")
	private WebElement orderpacedMessage;
}
