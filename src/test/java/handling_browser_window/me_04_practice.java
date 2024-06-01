package handling_browser_window;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_04_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");

		WebElement new_tab = driver.findElement(By.xpath("//a[normalize-space()='Open New Tabbed Windows']"));
		new_tab.click();
		
		WebElement click=driver.findElement(By.xpath("//button[@class='btn btn-info'][1]"));
		click.click();
		 

		Set<String> windows = driver.getWindowHandles();

		for (String s : windows) {
			String str = driver.switchTo().window(s).getTitle();
			System.out.println(str);
		}
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(15000);

		driver.quit();

	}

}
