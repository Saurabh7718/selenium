package s_04_cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ne_01_cookies_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get( "https://www.amazon.in/");
		
		//capture all cookie from browser
		//cookie is class and it contains values,so we need to save for multiple cookie
/*		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println("size of cookies "+cookies.size());
		
		for(Cookie cookie:cookies) {//read and print all cookies
			System.out.println(cookie.getName() + " " +cookie.getValue()); 
		}

*/

/*
		//print specific cookie according to name
		Cookie cookieName=driver.manage().getCookieNamed("session-token");
		System.out.println(cookieName);
*/
		


		//create and add cookie new cookie to browser
		Cookie cname=new Cookie("mycookie","1223456");
		
		driver.manage().addCookie(cname);
		
		Set<Cookie> cookies=driver.manage().getCookies();
		
		for(Cookie cookie:cookies) {//read and print all cookies
			System.out.println(cookie.getName() + " " +cookie.getValue()); 
		}

		
		
		//delete specific cookie
		driver.manage().deleteCookie(cname);
		cookies= driver.manage().getCookies();
		System.out.println("this is delete ");
		for(Cookie cookie:cookies) {//read and print all cookies
			
			
			System.out.println(cookie.getName() + " " +cookie.getValue()); 
			
		}
		
		//delete all cookies
		driver.manage().deleteAllCookies();
		
		System.out.println("this is all delete ");
		for(Cookie cookie:cookies) {//read and print all cookies
			
			
			System.out.println(cookie.getName() + " " +cookie.getValue()); 
			
		}
		
	}

}
