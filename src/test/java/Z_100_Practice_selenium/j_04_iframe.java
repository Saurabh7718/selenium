package Z_100_Practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class j_04_iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();

		
		
		driver.switchTo().frame("ClassFrame");
		driver.findElement(By.xpath("This element is in iframe - //a[normalize-space()='org.openqa.selenium.bidi.log']"));
		
		
	}

}
