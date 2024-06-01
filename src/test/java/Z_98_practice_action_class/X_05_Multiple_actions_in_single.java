package Z_98_practice_action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_05_Multiple_actions_in_single {
	@Test
	public void test() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();

		FirefoxDriver driver=new FirefoxDriver();

		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		WebElement interactions=driver.findElement(By.xpath("//a[normalize-space()='Interactions']"));
		WebElement dragAndDrop=driver.findElement(By.xpath("//a[normalize-space()='Drag and Drop']"));
		WebElement sta=driver.findElement(By.xpath("//a[normalize-space()='Static']"));
		Actions act=new Actions(driver);

		act.moveToElement(interactions).click().moveToElement(dragAndDrop).moveToElement(sta).build().perform();
		Thread.sleep(5000);
		driver.quit();
	}

}
