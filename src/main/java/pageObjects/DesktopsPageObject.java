package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopsPageObject extends Base {

	
	public DesktopsPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Desktops")
	private WebElement desktopsTabs;
	
	@FindBy(partialLinkText = "PC")
	private WebElement desktopTabPC;
	
	@FindBy(partialLinkText = "Mac")
	private WebElement desktopTabMac;
	
	@FindBy(linkText = "Show All Desktops")
	private WebElement sholAllDeskops;
	
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
	
	@FindBy(xpath= "//h2[contains(text(),'Desktops')]")
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
	
	@FindBy(tagName ="h4")
	private List<WebElement> products;
	
	@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	private WebElement addToCartDesktops;

	
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
	
	@FindBy(xpath = "//img[@title='Canon EOS 5D']")
	private WebElement CanonImage;
	
	@FindBy(partialLinkText = "Apple Cinema")
	private WebElement AppleCinemaImage;
	
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
	
	
	//Canon
	
	@FindBy(css= "select[id ='input-option226']")
	private WebElement canonSelect;
	
	@FindBy(xpath = "//option[contains(text(),'Red')]")
	private WebElement canonRed;
	
	@FindBy(xpath = "//option[contains(text(),'Blue')]")
	private WebElement canonBlue;
	
	@FindBy(xpath = "//option[contains(text(),'Green')]")
	private WebElement canonGreen;
	
	// for reviews
	@FindBy(xpath = "//input[@id ='input-quantity']")
	private WebElement SendQuantity;

	@FindBy(css = "button[id='button-cart']")
	private WebElement AddCart;
	
	@FindBy(xpath = "//a[contains(text(),'Write a review')]")
	private WebElement selectReview;
	
	@FindBy(css = "#input-review")
	private WebElement inputReview;
	
	@FindBy(xpath = "//form[@id='form-review']/div[4]/div/input[1]")
	private WebElement rating1;

	@FindBy(xpath = "//form[@id='form-review']/div[4]/div/input[2]")
	private WebElement rating2;
	
	@FindBy(xpath = "//form[@id='form-review']/div[4]/div/input[3]")
	private WebElement rating3;
	
	@FindBy(xpath = "//form[@id='form-review']/div[4]/div/input[4]")
	private WebElement rating4;
	
	@FindBy(xpath = "//form[@id='form-review']/div[4]/div/input[5]")
	private WebElement rating5;
	
	@FindBy(css = "button[id='button-review']")
	private WebElement ReviewContinue;
	
	@FindBy(xpath= "//form[@id='form-review']/div[2]/text()")
	private WebElement warningText;
	
	
	
	@FindBy(xpath = "//input[@id ='input-option225']")
	private WebElement hpTypeDeliveryDate;
	
	@FindBy(xpath = "//select[@id='input-option224']']")
	private WebElement productSelectType;
	
	@FindBy(xpath = "//select[@id='input-option224']//option[contains(text(),'Medium')]")
	private WebElement productMedium;
	
	@FindBy(xpath = "//select[@id='input-option224']//option[contains(text(),'Large')]")
	private WebElement productLarge;
	
	
	
	

	
	/*
	 * public void getDesktopsTabs() { Actions a = new Actions(driver);
	 * a.moveToElement(addToCartDesktops).build().perform(); }
	 */

	/*
	 * public List<WebElement> getProducts() { for (int i = 0; i < products.size();
	 * i++) { String name = products.get(i).getText();
	 * 
	 * if(name.contains("Ipod")) { addToCartDesktops.click(); break; } }
	 * 
	 * return products;
	 * }
	 */
	

	}
	
	
	
	
	
	

