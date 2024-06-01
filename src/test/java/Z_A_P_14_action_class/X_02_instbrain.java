package Z_A_P_14_action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class X_02_instbrain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://term.instabrainstage.io/");
 
		//selection from dropdown
		WebElement drp1=driver.findElement(By.xpath("//select[@id='hero-cta-select']"));
		
		Select s=new Select(drp1);
		s.selectByVisibleText("Protect my family in the event of my death!");
		
		Object text=s.getFirstSelectedOption();
		Assert.assertEquals(text, "Protect my family in the event of my death!");
		
		
		
		
		
	}

}
