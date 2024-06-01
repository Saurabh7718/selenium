package Z_A_04_webelement_operation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_01_Webelement_operation {
	
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("sam");
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		
		Boolean val=driver.findElement(By.xpath("//input[@value='Male']")).isSelected();
		
		if(val) {
			driver.findElement(By.xpath("//input[@value='Male']")).click();
			
		}
		
		driver.close();
	}

}
