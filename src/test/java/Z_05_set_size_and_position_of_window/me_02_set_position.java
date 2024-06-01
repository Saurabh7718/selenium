package Z_05_set_size_and_position_of_window;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_02_set_position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("Https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Point p=new Point(100,100);
		
		driver.manage().window().setPosition(p);
	}

}
