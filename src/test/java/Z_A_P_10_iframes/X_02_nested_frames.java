package Z_A_P_10_iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_02_nested_frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Frames.html");

		//click on multiple frame
		driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();

		WebElement mainframe=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));

		driver.switchTo().frame(0);

		WebElement innerframe=driver.findElement(By.xpath(" iframe[src='SingleFrame.html']"));

		driver.switchTo().frame(1);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("text");

		Thread.sleep(3000);

		driver.quit();
	}

}
