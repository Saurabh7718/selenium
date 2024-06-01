package Z_99_practice;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_12_window_handles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		driver.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(4000);
		
		
		Set<String> windows=driver.getWindowHandles();
		String child;
		
		int count=windows.size();
		System.out.println(count);
		
		for(String s:windows) {
			System.out.println(s);
			if(s!= parent) {
				child=s;
				
			}
		}
		
		driver.switchTo().window(parent);
 		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
