package handling_browser_window;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_03_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.get(" https://demo.automationtesting.in/Windows.html");

		driver.manage().window().maximize();
		
		WebElement drp=driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		Actions act=new Actions(driver);
		
		act.moveToElement(drp).perform();
		
		driver.findElement(By.xpath("//a[normalize-space()='Windows']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(By.xpath("//a[@href='#Tabbed']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.findElement(By.xpath("//button[text()='click']")).click();
		
		Set<String> s=driver.getWindowHandles();
		for(String st:s) {
			System.out.println(st); 
			
		}
		
		
		
	}

}
