package Z_09_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_03_alert_with_ok_cancle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");

		// alert with ok
		driver.findElement(By.xpath("  /html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();

		// alter with ok button
		driver.findElement(By.xpath(" //button[contains(text(),'click the button to display a confirm box')]")).click();
		
		String exptext="You Pressed Ok";
		String exptextcancle="You Pressed Cancel";
		
		String acttext=driver.findElement( By.xpath("//p[@id='demo']")).getText();
		// switch to alert
		driver.switchTo().alert().accept();
		
		if(exptext.equals(acttext)==true) {
			System.out.println("test is passed");
		}
		exptext="You Pressed Ok";
		exptextcancle="You Pressed Cancel";
		acttext=driver.findElement( By.xpath("//p[@id='demo']")).getText();
		
		driver.findElement(By.xpath(" //button[contains(text(),'click the button to display a confirm box')]")).click();
		driver.switchTo().alert().dismiss();
		
		if(exptextcancle.equals(acttext)==true) {
			System.out.println("test is passed");
		}
	}

}
