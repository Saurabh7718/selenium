package Z_05_set_size_and_position_of_window;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_01_set_size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("Https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Dimension d= new Dimension(100,100);
		                                    
		driver.manage().window().setSize(d);
		
		
		
	}

}
