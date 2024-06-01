package Z_30_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchProducts {
	WebDriver driver;
	Actions act;
	
	@FindBy (xpath="//span[normalize-space()='Results']")
	private WebElement pageHeader;
	
	@FindBy (xpath="//img[@alt=\"Sponsored Ad - Amazon Essentials Men's Short-Sleeve Crewneck T-Shirt, Pack of 2\"]")
	private WebElement firstProduct;
	
	public SearchProducts(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void validateHeaderPage(String expectedHeader) {
		String actualHeader=pageHeader.getText();
		Assert.assertEquals( actualHeader,expectedHeader,"succesfully navigated to header page" );
	}
	
	public void clickFirstProducts() {
		if(firstProduct.isDisplayed()) {
			act=new Actions (driver);
			act.moveToElement(firstProduct).click().build().perform();
			
		}
		else {
			Assert.fail("product is not displaying");
		}
	}
	
	

}
