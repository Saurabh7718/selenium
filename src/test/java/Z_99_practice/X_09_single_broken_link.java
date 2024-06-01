package Z_99_practice;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_09_single_broken_link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.deadlinkcity.com/");

		WebElement firsturl = driver.findElement(By.xpath("//a[normalize-space()='Errorcode 401']"));

		int res = 200;
		try {

			String linkurl = firsturl.getAttribute("href");

			URL urlLink = new URL(linkurl);
			HttpURLConnection huc = (HttpURLConnection) urlLink.openConnection();

			huc.setRequestMethod("HEAD");

			huc.connect();
			
			res=huc.getResponseCode();

			if(res>400) {
				System.out.println("broken link");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		driver.close();
	}

}
