package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Mp3PlayersPageObject extends Base {
	
	public Mp3PlayersPageObject() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText = "MP3 Players")
	private WebElement Mp3Tab;
	
	@FindBy(linkText = "Show All MP3 Players")
	private WebElement showAllMp3;
	
	@FindBy(partialLinkText = "test 11")
	private WebElement test11;
	
	@FindBy(partialLinkText = "test 12")
	private WebElement test12;

	@FindBy(partialLinkText = "test 15")
	private WebElement test15;
	
	@FindBy(partialLinkText = "test 16")
	private WebElement test16;
	
	@FindBy(partialLinkText = "test 17")
	private WebElement test17;

	@FindBy(partialLinkText = "test 18")
	private WebElement test18;

	@FindBy(partialLinkText = "test 19")
	private WebElement test19;

	@FindBy(partialLinkText = "test 20")
	private WebElement test20;

	@FindBy(partialLinkText = "test 21")
	private WebElement test21;

	@FindBy(partialLinkText = "test 22")
	private WebElement test22;

	@FindBy(partialLinkText = "test 23")
	private WebElement test23;

	@FindBy(partialLinkText = "test 24")
	private WebElement test24;

	@FindBy(partialLinkText = "test 4")
	private WebElement test4;

	@FindBy(partialLinkText = "test 5")
	private WebElement test5;

	@FindBy(partialLinkText = "test 6")
	private WebElement test6;

	@FindBy(partialLinkText = "test 7")
	private WebElement test7;

	@FindBy(partialLinkText = "test 8")
	private WebElement test8;

	@FindBy(partialLinkText = "test 9")
	private WebElement test9;
	
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
	private WebElement addToCartMp3;

	@FindBy(xpath = "//img[@title='iPod Classic']")
	private WebElement iPodClassicImage;
	
	@FindBy(xpath = "//img[@title='iPod Nano']")
	private WebElement iPodNanoImage;
	
	@FindBy(xpath = "//img[@title='iPod Shuffle']")
	private WebElement iPodShuffleImage;
	
	@FindBy(xpath = "//img[@title='iPod Touch']")
	private WebElement iPodTouchImage;
	
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
