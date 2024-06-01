package Z_100_Practice_selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class j_01_window_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Windows.html");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Open New Tabbed Windows')]")).click();
		
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();
		
		Set <String> s=driver.getWindowHandles();
		int a=s.size();
		System.out.println(a);
		
		for (String x:s) {
			String t = driver.switchTo().window(x).getTitle();
			if(t.contains("Selenium")) {
				driver.close();
			}
			
		}
		
		
	}

}
