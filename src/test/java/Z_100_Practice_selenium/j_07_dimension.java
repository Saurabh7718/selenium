package Z_100_Practice_selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class j_07_dimension {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		Point p=new Point(100,100);
		
		Dimension d=new Dimension(0,100);
 		driver.manage().window().setPosition(p);
		
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		driver.close();
		
		
		
		
	
	}

}
