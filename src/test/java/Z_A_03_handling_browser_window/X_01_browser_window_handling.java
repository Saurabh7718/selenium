package Z_A_03_handling_browser_window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_01_browser_window_handling {
	@Test
	public void browser_window_handle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='Open New Tabbed Windows']")).click();
		String tabbedtitle=driver.getTitle();
		System.out.println(tabbedtitle);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']")).click();
		String title=driver.getTitle();
		
		 
		System.out.println(title);
		
		Set<String> windows=driver.getWindowHandles();
//		for(String i:windows) {
//			System.out.println(i);
//		}
		
		
		//to close specifica window
		for(String w:windows) {
			String s=driver.switchTo().window(w).getTitle();
			
			if(s.contains(title)) {
				driver.close();
			}
		}
	}

}
