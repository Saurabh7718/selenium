package Z_08_action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_10_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/drag_drop.html ");
		
		WebElement src=driver.findElement(By.xpath("//li[@id='credit']//a[@class='button button-orange'][normalize-space()='-5000']"));
		WebElement dest=driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		
		
		Thread.sleep(10000);
		
		driver.close();
		
	}
	
	

}
