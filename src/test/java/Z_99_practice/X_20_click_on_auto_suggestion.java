package Z_99_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.*
;public class X_20_click_on_auto_suggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		String expText="redmi note 10";
		driver.findElement(By.xpath("//input[@class=’gLFyfgsfi’]")).sendKeys("redmi");
		Thread.sleep(2000);
		List<WebElement> MultipleElements=driver.findElements(By.xpath("//ul[@class='G43f7e'])[1]/li"));
		for( WebElement singLeElement: MultipleElements)
		{
		String actText = singLeElement.getText();
		if(actText.equalsIgnoreCase(expText))
		{
		singLeElement.click();
		break;
		}
	}
		driver.quit();

	}
}