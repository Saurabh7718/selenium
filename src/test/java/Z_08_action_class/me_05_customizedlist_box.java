package Z_08_action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_05_customizedlist_box {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.get(
				"  https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		//click on create new account
		WebElement month=driver.findElement(By.xpath("  //select[@placeholder='Month']"));
		
		//ceate action class object  
		Actions act=new Actions(driver);
		
		act.click(month).perform();
		Thread.sleep(3000);
		
		//to move option downward
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		
		
		
	}

}
