package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonesPDAsPageObject extends Base {
	
	public PhonesPDAsPageObject() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Phones & PDAs")
	private WebElement phoneTab;
	
	@FindBy(xpath = "//h2[contains(text(),'Monitors')]")
	private WebElement headerMonitor;
	
	@FindBy(id = "compare-total")
	private WebElement compare;
	
	@FindBy(css = "#list-view")
	private WebElement listView;
	
	@FindBy(css = "#grid-view")
	private WebElement gridView;
	
	@FindBy(xpath = "//select[@id='input-sort']")
	private WebElement sortBy;
	
	@FindBy(xpath = "//option[contains(text(),'Name (A - Z)')]")
	private WebElement sort_a_z;
	
	@FindBy(xpath = "//option[contains(text(),'Name (Z - A)')]")
	private WebElement sort_z_a;
	
	@FindBy(xpath = "//option[contains(text(),'Price (Low > High)')]")
	private WebElement sort_low_high;

	@FindBy(xpath = "//option[contains(text(),'Price (High > Low)')]")
	private WebElement sort_high_low;
	
	@FindBy(xpath = "//option[contains(text(),'Rating (Highest)')]")
	private WebElement ratingHighest;
	
	@FindBy(xpath = "//option[contains(text(),'Rating (Lowest)')]")
	private WebElement ratingLowest;
	
	@FindBy(xpath = "//option[contains(text(),'Model (A - Z)')]")
	private WebElement model_a_z;
	
	@FindBy(xpath = "//option[contains(text(),'Model (Z - A)')]")
	private WebElement model_z_a;
	
	@FindBy(xpath = "//select[@id='input-limit']")
	private WebElement showby;
	
	@FindBy(xpath = "//option[contains(text(),'25')]")
	private WebElement showby_25;
	
	@FindBy(xpath = "//option[contains(text(),'50')]")
	private WebElement showby_50;
	
	@FindBy(xpath = "//option[contains(text(),'75')]")
	private WebElement showby_75;
	
	@FindBy(xpath = "//option[contains(text(),'100')]")
	private WebElement showby_100;
	
	@FindBy(xpath = "//h3[contains(text(),'Refine Search')]")
	private WebElement refineSearch;
	
	@FindBy(tagName ="h4")
	private List<WebElement> products;
	
	@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	private WebElement addToCartPhones;
	
	@FindBy(xpath = "//img[@title='HTC Touch HD']")
	private WebElement htcImage;
	
	@FindBy(xpath = "//img[@title='iPhone']")
	private WebElement iPhoneImage;
	
	@FindBy(xpath = "//img[@title='Palm Treo Pro']")
	private WebElement palmImage;

	@FindBy(xpath = "//input[@id ='input-quantity']")
	private WebElement SendQuantity;

	@FindBy(css = "button[id='button-cart']")
	private WebElement AddCart;
	
	@FindBy(xpath = "//a[contains(text(),'Write a review')]")
	private WebElement SelectReview;
	
	@FindBy(css = "#input-review")
	private WebElement InputReview;
	
	@FindBy(xpath = "//form[@id='form-review']/div[4]/div/input[1]")
	private WebElement Rating1;
	
	@FindBy(xpath = "//form[@id='form-review']/div[4]/div/input[2]")
	private WebElement Rating2;
	
	@FindBy(xpath = "//form[@id='form-review']/div[4]/div/input[3]")
	private WebElement Rating3;
	
	@FindBy(xpath = "//form[@id='form-review']/div[4]/div/input[4]")
	private WebElement Rating4;
	
	@FindBy(xpath = "//form[@id='form-review']/div[4]/div/input[5]")
	private WebElement Rating5;
	
	@FindBy(css = "button[id='button-review']")
	private WebElement ReviewContinue;
	
	@FindBy(xpath= "//form[@id='form-review']/div[2]/text()")
	private WebElement warningText;
	
}
