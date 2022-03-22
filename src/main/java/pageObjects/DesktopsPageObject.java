package pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.Base;

public class DesktopsPageObject extends Base {

	WebDriverWait wait = new WebDriverWait(driver,5);
	
	public DesktopsPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Desktops")
	private WebElement desktopsTabs;

	@FindBy(partialLinkText = "PC")
	private WebElement desktopTabPC;
	
	@FindBy(xpath = "//span[@class='price-old']")
	private WebElement oldPrice;
	
	@FindBy(xpath = "//span[@class='price-old']")
	private WebElement oldNew;
	
	@FindBy(xpath = "//span[@class='price-old']")
	private WebElement priceTax;
	
	@FindBy(partialLinkText = "Mac")
	private WebElement desktopTabMac;

	@FindBy(linkText = "Show All Desktops")
	private WebElement showlAllDeskops;

	@FindBy(xpath = "//div[@class='list-group']//a[contains(text(), 'PC')]")
	private WebElement pc;

	@FindBy(xpath = "//div[@class='list-group']//a[contains(text(), 'Mac')]")
	private WebElement mac;

	@FindBy(xpath = "//div[@class='list-group']//a[contains(text(), 'Laptops & Notebooks')]")
	private WebElement laptopsNotebooks;

	@FindBy(xpath = "//div[@class='list-group']//a[contains(text(), 'Components')]")
	private WebElement components;

	@FindBy(xpath = "//div[@class='list-group']//a[contains(text(), 'Tablets')]")
	private WebElement tablets;

	@FindBy(xpath = "//div[@class='list-group']//a[contains(text(), 'Software')]")
	private WebElement software;

	@FindBy(xpath = "//div[@class='list-group']//a[contains(text(), 'Phones & PDAs')]")
	private WebElement phonePDA;

	@FindBy(xpath = "//div[@class='list-group']//a[contains(text(), 'Cameras')]")
	private WebElement cameras;

	@FindBy(xpath = "//div[@class='list-group']//a[contains(text(), 'MP3 Players')]")
	private WebElement mp3;

	@FindBy(xpath = "//h2[contains(text(),'Desktops')]")
	private WebElement headerDesktops;

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

	@FindBy(xpath = "//div[@class='caption']/h4")
	private List<WebElement> products;

	@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	private List<WebElement> addToCartDesktops;

	@FindBy(xpath = "//h3[contains(text(),'Refine Search')]")
	private WebElement refineSearch;

	@FindBy(xpath = "//div[@class ='col-sm-3']//a[contains(text(), 'PC')]")
	private WebElement refinedPC;

	@FindBy(xpath = "//div[@class ='col-sm-3']//a[contains(text(), 'Mac')]")
	private WebElement refinedMac;

	@FindBy(xpath = "//img[@title='HP LP3065']")
	private WebElement hpImage;

	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement macImage;

	@FindBy(xpath = "//img[@title='MacBook Air']")
	private WebElement macAirImage;

	@FindBy(xpath = "//img[@title='Sony VAIO']")
	private WebElement sonyImage;

	@FindBy(xpath = "//img[@title='Canon EOS 5D Camera']")
	private WebElement canonImage;

	@FindBy(partialLinkText = "Apple Cinema")
	private WebElement appleCinemaImage;

	@FindBy(xpath = "//img[@title='HTC Touch HD']")
	private WebElement htcImage;

	@FindBy(xpath = "//img[@title='iPhone']")
	private WebElement iPhoneImage;

	@FindBy(xpath = "//img[@title='iPod Classic']")
	private WebElement iPodImage;

	@FindBy(xpath = "//img[@title='Palm Treo Pro']")
	private WebElement palmImage;

	@FindBy(xpath = "//img[@title='Product 8']")
	private WebElement product8Image;

	@FindBy(xpath = "//img[@title='Samsung SyncMaster 941BW']")
	private WebElement samsungImage;

	@FindBy(css = "select[id ='input-option226']")
	private WebElement canonSelect;

	// for reviews
	@FindBy(xpath = "//input[@id ='input-quantity']")
	private WebElement sendQuantity;

	@FindBy(css = "button[id='button-cart']")
	private WebElement addCart;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement succesMessage;

	@FindBy(xpath = "//a[contains(text(),'Write a review')]")
	private WebElement selectReview;

	@FindBy(xpath = "//input[@id='input-name']")
	public WebElement reviewName;

	@FindBy(css = "#input-review")
	private WebElement inputReview;

	@FindBy(xpath = "//div[@class='col-sm-12']/input[@type='radio']")
	private List<WebElement> ratingList;

	@FindBy(css = "button[id='button-review']")
	private WebElement reviewContinue;

	@FindBy(xpath = "//form[@id='form-review']/div[2]/text()")
	private WebElement warningText;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement reviewText;

	@FindBy(xpath = "//input[@id ='input-option225']")
	private WebElement hpTypeDeliveryDate;

	@FindBy(xpath = "//select[@id='input-option224']']")
	private WebElement productSelectType;

	@FindBy(xpath = "//select[@id='input-option224']//option[contains(text(),'Medium')]")
	private WebElement productMedium;

	@FindBy(xpath = "//select[@id='input-option224']//option[contains(text(),'Large')]")
	private WebElement productLarge;

	public void getDesktopsTabs() {
		Actions a = new Actions(driver);
		a.moveToElement(desktopsTabs).build().perform();
	}

	public void getShowlAllDeskops() {
		showlAllDeskops.click();
	}

	public void getProducts() {

		Assert.assertTrue(products.size() != 0);

	}

	public void getAddTocartDesktops(String item) {

		List<WebElement> products = driver.findElements(By.tagName("h4"));
		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();
			if (name.contains(item)) {
				addToCartDesktops.get(i).click();
				break;
			}
		}
	}

	public void getSendQuantity(String quantity) {
		sendQuantity.sendKeys(Keys.BACK_SPACE, quantity);
	}

	public void getAddCart() {
		addCart.click();
	}

	public void getSuccesMessage(String message) {
		wait.until(ExpectedConditions.visibilityOf(succesMessage));
		
		String[] string1 = succesMessage.getText().split("\n");

		String string2 = string1[0].trim();

		Assert.assertEquals(message, string2);
	}

	public void getCanonSelect(String color) {
		Select option = new Select(canonSelect);
		option.selectByVisibleText(color);
	}

	public void getCanonImage() {
		canonImage.click();
	}

	public void getSelectReview() {

		selectReview.click();
	}

	public void getreviewName(String name) {
		reviewName.sendKeys(name);
	}

	public void getinputReview(String review) {
		inputReview.sendKeys(review);
	}

	public void getRatingList(String rate) {

		for (int i = 0; i < ratingList.size(); i++) {
			String rating = ratingList.get(i).getAttribute("value");

			if (rating.contains(rate)) {

				ratingList.get(i).click();
			}
		}
	}

	public void getreviewContinue() {

		reviewContinue.click();
	}

	public void getReviewText(String reviewMessage) {
		String newReviewText = reviewText.getText().replace(". ", ".");
		Assert.assertEquals(reviewMessage, newReviewText);
	}

}
