package Z_100_Practice_selenium;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class j_03_alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();  

		WebDriver driver = new FirefoxDriver();
		
		driver.get( " https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement sc=driver.findElement(By.xpath("//select[@id='Skills']"));
		
		Select s=new Select(sc);
		
		driver.close();
	}

}
