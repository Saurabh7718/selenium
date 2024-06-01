package Z_08_action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_04_drag_and_drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.get(" https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();

		//identify element src
		WebElement src=driver.findElement(By.xpath(" //section[@id='g-container-main']//li[1]//a[1]"));
		// identify src
		WebElement dest = driver.findElement(By.xpath(" //ol[@id='amt7']//li[@class='placeholder']"));

		Actions act = new Actions(driver);

		act.dragAndDrop(src,dest).perform();
		
	}

}
