package ui;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.driver.chromedriver", "C:\\Browsers Drivers\\geckodriver");
		//System.setProperty("webdriver.driver.geckodriver", "C:\\Browsers Drivers\\geckodriver");
		//System.setProperty("webdriver.driver.msedgedriver", "C:\\Browsers Driver\\msedgedriver");
		
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new  ChromeDriver();
		
		driver.get("https://www.google.com");

	}

}
