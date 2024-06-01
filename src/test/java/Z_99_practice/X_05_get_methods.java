package Z_99_practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_05_get_methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Index.html");
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println("currentUrl : "+currentUrl );
		
		String title=driver.getTitle();
		System.out.println("title : "+title);
		
		String pageSource=driver.getPageSource();
		System.out.println("pageSource : "+ pageSource);
		
		String getText=driver.findElement(By.xpath("//input[@id='email']")).getText();
		System.out.println("getText : "+getText);
		
		String getTagName=driver.findElement(By.xpath("//input[@id='email']")).getTagName();
		System.out.println("getTagName : "+getTagName);
		
		
		
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
