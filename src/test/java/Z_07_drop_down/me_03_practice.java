package Z_07_drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_03_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		//WebElement box=driver.findElement(By.xpath("//span[@role='combobox']"));
		WebElement skills=driver.findElement(By.xpath("//select[@id='Skills']  "));
		
		Select s=new Select(skills);
		
		Thread.sleep(2000);
		s.selectByVisibleText("CSS");
		
		Thread.sleep(4000);
		
		driver.quit();
		
	}

}
