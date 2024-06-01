package Z_14_log4j2;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_01_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger log=LogManager.getLogger("me_01_");
		log.info("for info only");
		log.debug("for debug");
		 
		log.warn("for warn");
		
		// TODO Auto-generated method stub
//		WebDriverManager.edgedriver().setup();
//
//		WebDriver driver = new EdgeDriver();
//		driver.get("https://demo.automationtesting.in/Register.html");
//		driver.manage().window().maximize();
//		WebElement drp = driver.findElement(By.xpath("//select[@id='Skills']"));
//		Select s = new Select(drp);
//		s.selectByVisibleText("C++");
//
//
//		JavascriptExecutor j=(JavascriptExecutor )driver;
//		j.executeScript("window.scrollBy(0,1000)","");
	}

}


