package Z_100_Practice_selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class j_02_cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		String cname = "saurabh";

		Cookie ck = new Cookie("name", cname);
		driver.manage().addCookie(ck);
		Set<Cookie> c = driver.manage().getCookies();

		for (Cookie co : c) {
			System.out.println(co.getName() + " " + co.getValue());

		}
		System.out.println("this is delete");
		driver.manage().deleteCookieNamed(cname);

		c = driver.manage().getCookies();

		for (Cookie co : c) {
			System.out.println(co.getName() + " " + co.getValue());

		}
		
		driver.manage().deleteAllCookies();
		
		c = driver.manage().getCookies();

		for (Cookie co : c) {
			System.out.println(co.getName() + " " + co.getValue());

		}

		driver.close();
	}

}
