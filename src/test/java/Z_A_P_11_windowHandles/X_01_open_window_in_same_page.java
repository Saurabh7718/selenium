package Z_A_P_11_windowHandles;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_01_open_window_in_same_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.browserstack.com/guide/handle-web-tables-in-selenium");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String originalWindow=driver.getWindowHandle();
		
		//original window title
		System.out.println(originalWindow);
		
		WebElement getStarted=driver.findElement(By.xpath("//a[@class='btn-primary btn-lg col-md-3 custom-btn-amp-events']"));
		getStarted.click();
		
		//upon clicking new page open title
		String title1=driver.getTitle();
		System.out.println(title1);
		
		
		
		Set<String> l=driver.getWindowHandles();
		System.out.println("-------------------------------------------");

		//print all windows
		for(String s:l) {
			System.out.println(s);

		}
		Thread.sleep(2000);
		driver.navigate().back();
		
		System.out.println("original");
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}
