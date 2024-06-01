package Z_A_P_09_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_01_select_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//select[@id='Skills']
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement skills=driver.findElement(By.xpath("//select[@id='Skills']"));
		
		
		Select select=new Select(skills);
		
		//select.selectByIndex(1);
		//select.selectByValue("C");
		select.selectByVisibleText("C");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
