package Z_99_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_06_check_currentpage_url_title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String expectedTitle="Shop Winter Wear, Designer Clothes, Fashion Jewellery & Nightwear Online @ Cilory";
		String expectedUrl="https://www.cilory.com/";
		
		driver.get("https://www.cilory.com/");
		
		String actualTitle=driver.getTitle();
		String actualUrl=driver.getCurrentUrl();
		
		if(actualTitle.equals(expectedTitle)){
			System.out.println("matched title");
		}
		else {
			System.out.println("not matched title");
		}
		
		if(actualUrl.equals(expectedUrl)) {
			System.out.println("matched url");
		}
		else {
			System.out.println("not matched url");
			
			
		}
		
		driver.close();
	}

}
