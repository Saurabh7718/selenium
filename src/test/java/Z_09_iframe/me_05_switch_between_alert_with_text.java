package Z_09_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_05_switch_between_alert_with_text {

	public static void main(String[] args) {
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

		driver.switchTo().alert().sendKeys("this is me");
		driver.switchTo().alert().accept();

		System.out.println(driver.findElement(By.xpath("//p[@id='demo1']")).getText());
		
		driver.quit();

	}

}
