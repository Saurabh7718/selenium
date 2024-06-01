package Z_08_action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_03_context_click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.get(
				" https://www.flipkart.com/?ef_id=1fb883bdd3701e8e8f7ce7aca52c3744:G:s&s_kwcid=AL!739!10!76003884035435!76004101990553&semcmpid=sem_F1167BY7_Brand_adcenter");
		driver.manage().window().maximize();
		
		//close login
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//identify cart element
		WebElement cart=driver.findElement(By.xpath("//span[normalize-space()='Cart']"));
		
		Actions act=new Actions(driver);
		
		act.contextClick(cart).perform();
		
	}

}
