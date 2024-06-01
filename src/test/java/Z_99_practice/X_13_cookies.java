package Z_99_practice;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_13_cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_3lda0bxyzj_e&adgrpid=155259813513&hvpone=&hvptwo=&hvadid=674893540019&hvpos=&hvnetw=g&hvrand=11336748500785981784&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007787&hvtargid=kwd-365295376496&hydadcr=5620_2359471&gad_source=1");

		String cname="amazon";

		Cookie cookie=new Cookie("ck",cname);
		//add cookies
		driver.manage().addCookie(cookie);

		//add all cookies
		Set<Cookie> cookieAll=driver.manage().getCookies();

		for(Cookie c:cookieAll) {
			System.out.println(c.getName()+" "+c.getValue());
		}


		//delete all cookies
		driver.manage().deleteAllCookies();


		Set<Cookie> cookieAll1=driver.manage().getCookies();

		for(Cookie c:cookieAll1	) {
			System.out.println(c.getName()+" "+c.getValue());
		}


		driver.quit();

	}

}
