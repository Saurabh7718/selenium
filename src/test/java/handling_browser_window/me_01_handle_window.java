package handling_browser_window;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_01_handle_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get( "https://demo.automationtesting.in/Windows.html");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath( "//a[contains(text(),'Open New Tabbed Windows')]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();
		
		System.out.println(driver.getTitle());
		
		Set<String> s=driver.getWindowHandles();
		
		//open multiple windows
		for(String i:s) {
			System.out.println(i);
			String t =driver.switchTo().window(i).getTitle();
			System.out.println(t);
		}
		
		//close specific window
		for (String i : s) {

			 String t = driver.switchTo().window(i).getTitle();

			if (t.contains("Selenium")) {
				driver.close();
			}
		}
		
		driver.quit();
	}

}
