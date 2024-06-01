 package Z_08_action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_01_action_class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get(
				" https://www.flipkart.com/?ef_id=1fb883bdd3701e8e8f7ce7aca52c3744:G:s&s_kwcid=AL!739!10!76003884035435!76004101990553&semcmpid=sem_F1167BY7_Brand_adcenter");

		// click on close login
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//identify dropdown element
		WebElement login=driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		
		//creation of action object and call action method
		Actions act=new Actions(driver);
		act.moveToElement(login).perform();
		
		Thread.sleep(3000);
		
		//click on dropdown element/gift card
		driver.findElement(By.xpath("//a[@href='/account/rewards?link=home_rewards']"));
		
		
		
		 
	}

}
