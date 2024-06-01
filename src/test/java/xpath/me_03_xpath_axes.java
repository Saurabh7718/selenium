package xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_03_xpath_axes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get( "https://www.facebook.com/signup");
		//locate first namr field from signuppage in facebook
		// //button[@id='u_0_s_EW']/p/arent::*/parent::*/child::div[1]/div::div[1]
		
		//identify the password from mobile number fieldd in facebook
		//input[@id='u_0_r']/following::input
		
		//identify the mobile nmber from password fieldd in facebook
		//input[@id='password_step_input']/preceding::input[2]
		
		//locate surname from female radio button 
		//label[contains(text(),'Female')]/ancestor::div[2]/div[1]/div[1]/div[2]
		
	}

}
