package Z_97_drop_down_select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_01_select_class {
	@Test
	public void test() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement skills=driver.findElement(By.xpath("//select[@id='Skills']"));
		Select select=new Select(skills);
		//select.selectByIndex(5);
		//select.selectByVisibleText("C++");
		select.selectByValue("C++");
		Thread.sleep(4000);
		driver.quit();
		
	}
	

}
