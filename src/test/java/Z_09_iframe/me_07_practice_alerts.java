package Z_09_iframe;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_07_practice_alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		// alert with text
		driver.findElement(By.xpath(" //a[contains(text(),'Alert with Textbox')]")).click();

		// alter with ok button
		driver.findElement(By.xpath("  //button[contains(text(),'click the button to demonstrate the prompt box')]"))
				.click();

		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]"));
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]"));

		Alert alert=driver.switchTo().alert();
		alert.sendKeys("demo testing");
		Thread.sleep(10000);
		alert.accept();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
