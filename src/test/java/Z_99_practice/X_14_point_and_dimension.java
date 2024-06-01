package Z_99_practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_14_point_and_dimension {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		Point p=new Point(200,300);
		driver.manage().window().setPosition(p);
		
		Thread.sleep(4000);
		
		Dimension d=new Dimension(400,600);
		driver.manage().window().setSize(d);
		
		Thread.sleep(4000);

		
		driver.quit();
		
		

	}

}
