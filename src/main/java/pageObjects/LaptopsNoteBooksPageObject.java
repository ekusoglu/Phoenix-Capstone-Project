package pageObjects;

import java.util.List;

import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopsNoteBooksPageObject extends Base {

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

	@FindBy(xpath = "//div[@class='caption']/h4")
	private List<WebElement> products;

	@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	private List<WebElement> addToCartLaptos;

	@FindBy(xpath = "//i[@class='fa fa-exchange']")
	private List<WebElement> compareIcon;
	
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

		String trimmedMessage = cartIcon.getText().replace(" - ", "-");
		SoftAssertions softAssert = new SoftAssertions();
		softAssert.assertThat(cart.equals(trimmedMessage));
		softAssert.assertAll();

	}

	public void getCartIcon() {
		cartIcon.click();
	}

	public void getCartIconRemoveButton() {
		cartIconRemoveButton.click();
	}

	public void getCartIconMessageEmpty(String cartEmpty) {

		String trimmedMessage1 = cartIcon.getText().replace(" - ", "-");
		Assert.assertEquals(cartEmpty, trimmedMessage1);
	}

	public void getCompareIcon(String comparedItems) {
		
		List<WebElement> products = driver.findElements(By.tagName("h4"));
		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();
			if (name.contains(comparedItems)) {
				compareIcon.get(i).click();
				break;
			}
		}
	}
	
	public void getCompareProducts() {
		compareProducts.click();
	}
	
	public void getComparisonChart() {
		
		Assert.assertEquals(true,comparisonChart.isDisplayed());
	}
}
