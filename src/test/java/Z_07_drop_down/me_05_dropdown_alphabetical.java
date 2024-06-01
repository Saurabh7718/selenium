package Z_07_drop_down;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_05_dropdown_alphabetical {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

		WebElement drp = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));

		Select s = new Select(drp);
		List<WebElement> opt = (List) s.getOptions();
		
		List<String> originalList=new ArrayList<>();
		
		for(WebElement w:opt) {
			String text=w.getText();
			originalList.add(text);
		}
		
		List<String> sortedList=new ArrayList<>(originalList);
		System.out.println(sortedList);
		Collections.sort(sortedList);
		
		//Assert.assertEquals(originalList, sortedList);
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}
