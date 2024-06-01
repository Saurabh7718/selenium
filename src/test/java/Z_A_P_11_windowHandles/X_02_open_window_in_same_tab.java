package Z_A_P_11_windowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_02_open_window_in_same_tab {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		//System.out.println(driver.getTitle());
		
		WebElement newTab=driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']"));
		newTab.click();
		
		
		
		
		Thread.sleep(5000);
		
		Set<String> s=driver.getWindowHandles();
		
		for(String i:s) {
			String title=driver.switchTo().window(i).getTitle();
			System.out.println(title);
		}
		
		//System.out.println(driver.getTitle());

		//open new tab in same window
		
		driver.switchTo().newWindow(WindowType.TAB).get("https://reqres.in/api");
		Thread.sleep(5000);
		
		driver.quit();
		
		
	
	}
}
