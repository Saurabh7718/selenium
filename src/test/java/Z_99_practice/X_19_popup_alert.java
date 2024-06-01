package Z_99_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_19_popup_alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		/*(1) Alert pop up ok
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		*/
		
		/*(2) Alert pop up ok and cancle
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		
		*/
		
		//(3) Alert with textbox
		driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().sendKeys("sam");
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		
		driver.quit();
		
	}

}
