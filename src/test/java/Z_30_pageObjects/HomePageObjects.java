package Z_30_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {

	WebDriver driver;
	
	@FindBy (xpath="//a[@id='nav-logo-sprites'] ") 
	private WebElement logo;
	
	@FindBy (xpath="//span[@class='nav-cart-icon nav-sprite']")
	private WebElement cart;
	
	@FindBy (xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchBar;
	
	@FindBy (xpath="//input[@id='nav-search-submit-button']")
	private WebElement searchIcon;
	
	//constructor
	public HomePageObjects(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean isLogoPresent() {
		boolean logoFlag=logo.isDisplayed();
		return logoFlag;
	}
	 
	public void clickOnLogo() { 
		logo.click();
	}
	public void cart() {
		if(cart.isDisplayed()) {
			cart.click();
		}
		else {
			System.out.println("cart is not dispalying");
		}
		
	}
	public boolean isSearchBarPresent() {
		boolean searchflag=searchBar.isDisplayed();
		return searchflag;
	}
	
	public void setsearchBarField(String input) {
		searchBar.sendKeys(input);
	}
	
	public boolean isSearchIconPresent() {
		boolean searchIconFlag=searchIcon.isDisplayed();
		return searchIconFlag;
	}
	
	public void clickSearchIcon() {
		searchIcon.click();
	}
	
}
