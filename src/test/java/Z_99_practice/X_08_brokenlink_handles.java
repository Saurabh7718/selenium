package Z_99_practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_08_brokenlink_handles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.deadlinkcity.com/");

		List<WebElement> element=driver.findElements(By.tagName("a"));

		int res=200;
		int brokenlink=0;
		
		for(WebElement e: element) {
			String linkurl=e.getAttribute("href");

			try {
				URL urlLink=new URL(linkurl);

				HttpURLConnection huc=(HttpURLConnection)urlLink.openConnection();
				huc.setRequestMethod("HEAD");
				
				huc.connect();
				
				res=huc.getResponseCode();

				
				if(res>=400) {
					System.out.println("broken link: "+linkurl);
					brokenlink++;
				}


			}
			 catch(Exception e1) {
				 System.out.println(e1);
			 }
			
			 






		}
		System.out.println("total no of broken links : "+brokenlink);

	}
}
