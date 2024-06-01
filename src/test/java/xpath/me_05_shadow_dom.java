package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_05_shadow_dom {

	public static void main(String[] args) {
		// TODO Auto-generated method stubWebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://shop.polymer-project.org/");
		
		driver.manage().window().maximize();
		
		WebElement root=driver.findElement(By.tagName( "shop-app"));//root node/shadow host
		
		WebElement shadowDom1=getShadowDOM(root,driver);
		WebElement ironpages=shadowDom1.findElement(By.tagName( "iron-pages"));
		WebElement shophome=ironpages.findElement(By.tagName("shop-home"));
		
		WebElement shadowDom2=getShadowDOM(shophome,driver);
		shadowDom2.findElement(By.cssSelector("div:nth-child(2) > shop-button >a")).click();
		
		
	}
	
	static WebElement getShadowDOM(WebElement element,WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement shadowDom1=(WebElement) js.executeScript("return argument[0].shadowRoot",element);
		return shadowDom1;
		
	}

}
