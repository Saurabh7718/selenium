package Z_99_practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_31_xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"navFooter\"]/div[1]/div"));
		
		for(WebElement l:list) {
			String text=l.getText();
			System.out.println(text);
		}
		
		
		Thread.sleep(5000);
		driver.quit();
		 
			
		
		

	}

}
