package Z_09_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_02_inner_frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		 
		WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerFrame);// here we are assign fame as a webElement

		WebElement innerFrame = driver
				.findElement(By.xpath(" //iframe[normalize-space()='<p>Your browser does not support iframes.</p>']"));

		driver.switchTo().frame(innerFrame);

		driver.findElement(By.xpath(" //input[@type='text']")).sendKeys("welcome");
	}

}
