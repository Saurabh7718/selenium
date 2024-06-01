package Z_05_set_size_and_position_of_window;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_03_practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			
			
			driver.get( "https://www.w3schools.com/");
			
			driver.manage().window().maximize();
			
			Dimension d=new Dimension(100,400);
			driver.manage().window().setSize(d);
			
			Point p=new Point(300,100);
			driver.manage().window().setPosition(p);
			
			Thread.sleep(5000);
			driver.quit();
			
			
	}

}
