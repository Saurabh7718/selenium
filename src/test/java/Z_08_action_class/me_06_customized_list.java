package Z_08_action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_06_customized_list {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();

		driver.get(
				"  https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		//click on create new account
		WebElement month=driver.findElement(By.xpath(" //select[@placeholder='Month']"));
		
		//ceate action class objec  
		Actions act=new Actions(driver);
		
		act.click(month).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		act.sendKeys(Keys.END ).perform();
		for(int i=0;i<=7;i++)   {
			act.sendKeys(Keys.ARROW_DOWN).perform();
			
		}
		act.sendKeys(Keys.ENTER).perform();
	}

}
