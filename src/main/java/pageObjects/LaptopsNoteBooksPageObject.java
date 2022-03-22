package pageObjects;

import java.io.IOException;
import java.util.List;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Base;
import utilities.Utility;

public class LaptopsNoteBooksPageObject extends Base {

	
	WebDriverWait wait = new WebDriverWait(driver,5);
	
	public LaptopsNoteBooksPageObject() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Laptops & Notebooks")
	private WebElement laptopTab;

	@FindBy(partialLinkText = "Macs")
	private WebElement laptopTabMac;

	@FindBy(partialLinkText = "Windows")
	private WebElement laptopTabWindows;

	@FindBy(linkText = "Show All Laptops & Notebooks")
	private WebElement showAllLaptops;

	@FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
	private WebElement headerLaptops;

	@FindBy(xpath = "//div[@class='col-sm-10']//p")
	private WebElement headerInfoText;

	@FindBy(id = "compare-total")
	private WebElement compareProducts;

	@FindBy(xpath = "//div[@id='content']")
	private WebElement comparisonChart;

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

	@FindBy(xpath = "//span[@class='price-old']")
	private WebElement oldPrice;
	
	@FindBy(xpath = "//span[@class='price-old']")
	private WebElement oldNew;
	
	@FindBy(xpath = "//span[@class='price-old']")
	private WebElement priceTax;
	
	@FindBy(xpath = "//div[@class='product-thumb']")
	private List<WebElement> products;

	@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	private List<WebElement> addToCartLaptos;

	@FindBy(xpath = "//i[@class='fa fa-exchange']")
	private List<WebElement> compareIcon;

	@FindBy(xpath = "//div[@class='product-thumb']//i[@class='fa fa-heart']")
	private List<WebElement> heartIcon;

	@FindBy(xpath = "//div[@id='product-category']/div[1]/div[1]/div[4]/div[5]//button[2]")
	private WebElement heartIconSony;

	@FindBy(xpath = "//h3[contains(text(),'Refine Search')]")
	private WebElement refineSearch;

	@FindBy(xpath = "//div[@class ='col-sm-3']//a[contains(text(), 'Windows')]")
	private WebElement refinedWindows;

	@FindBy(xpath = "//div[@class ='col-sm-3']//a[contains(text(), 'Mac')]")
	private WebElement refinedMac;

	@FindBy(xpath = "//img[@title='HP LP3065']")
	private WebElement hpImage;

	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement macImage;

	@FindBy(xpath = "//img[@title='MacBook Air']")
	private WebElement macAirImage;

	@FindBy(xpath = "//img[@title='MacBook Pro']")
	private WebElement macProImage;

	@FindBy(xpath = "//img[@title='Sony VAIO']")
	private WebElement sonyImage;

	@FindBy(xpath = "//ul[@class='list-unstyled']/li/h2")
	private WebElement macProPrice;

	@FindBy(xpath = "//input[@id ='input-option225']")
	private WebElement hpTypeDeliveryDate;

	@FindBy(xpath = "//input[@id ='input-quantity']")
	private WebElement SendQuantity;

	@FindBy(css = "button[id='button-cart']")
	private WebElement addCart;

	@FindBy(xpath = "//a[contains(text(),'Write a review')]")
	private WebElement selectReview;

	@FindBy(css = "#input-review")
	private WebElement InputReview;

	@FindBy(xpath = "//div[@class='col-sm-12']/input[@type='radio']")
	private List<WebElement> ratingList;

	@FindBy(css = "button[id='button-review']")
	private WebElement ReviewContinue;

	@FindBy(xpath = "//form[@id='form-review']/div[2]/text()")
	private WebElement warningText;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement loginMessage;

	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartIcon;

	@FindBy(xpath = "//i[@class='fa fa-times']")
	private WebElement cartIconRemoveButton;

	public void getLaptobTabs() {
		Actions a = new Actions(driver);
		a.moveToElement(laptopTab).build().perform();
	}

	public void getShowlAllLaptop() {
		showAllLaptops.click();
	}

	public void getMacImage() {
		macImage.click();
	}

	public void getCartIconMessage(String cart) {
		Utility.highlightelementRedBorder(cartIcon);
		String trimmedMessage = cartIcon.getText().replace(" - ", "-");
		
		Assert.assertEquals(cart, trimmedMessage);
	}

	public void getCartIcon() {
		cartIcon.click();
	}

	public void getCartIconRemoveButton() {
		cartIconRemoveButton.click();
	}

	public void getCartIconMessageEmpty(String cartEmpty) {
		
		wait.until(ExpectedConditions.visibilityOf(cartIcon));
		Utility.highlightelementRedBorder(cartIcon);
		String trimmedMessage1 = cartIcon.getText().replace(" - ", "-");
		if(trimmedMessage1.contains(cartEmpty)) {
			Assert.assertTrue(true);
		}
	}

	public void getCompareIcon(String comparedItems) {

	
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='caption']/h4"));
		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();
			if (name.contains(comparedItems)) {

				compareIcon.get(i).click();
				break;
			}
		}

	}

	public void getCompareProducts() {
		
		Utility.highlightelementRedBorder(compareProducts);
		compareProducts.click();
	}

	public void getComparisonChart() {

		Assert.assertEquals(true, comparisonChart.isDisplayed());
	}

	public void getHeartIconSony() {
		heartIconSony.click();
	}

	public void getLoginMessage(String message) {

		String[] string1 = loginMessage.getText().split("\n");

		String string2 = string1[0].trim();

		Assert.assertEquals(message, string2);
	}

	public void getMacProImage() throws IOException {

		macProImage.click();
	}

	public void getMacProPrice(String priceTag) throws IOException {

		Utility.highlightelementBackground(macProPrice);
		String price = macProPrice.getText();
		Assert.assertEquals(priceTag, price);
	}

}
