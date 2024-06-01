package Z_09_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_04_switch_between_pop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//alert with ok
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
		
		//alter with ok button
		driver.findElement( By.xpath( "//button[contains(text(),'alert box:')]")).click();
		
		//switv to alert box
		String  msg=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(msg);
		

	}

}
