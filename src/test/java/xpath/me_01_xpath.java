package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_01_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://practice.automationtesting.in/");
		driver.manage().window().maximize();

		// absolute xpath
		/*
		 * driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/header[1]/div[2]/div[2]/form[1]/input[1]"))
		 * .sendKeys("tshirts"); driver.findElement(By.xpath(
		 * "/html[1]/body[1]/div[1]/div[1]/header[1]/div[2]/div[2]/form[1]/button[1]"))
		 * .click();
		 * 
		 * // relative xpath
		 * driver.findElement(By.xpath("//input[@id='s']")).sendKeys("teshirts");
		 * driver.findElement( By.xpath(
		 * "//header/div[@id='mobile-menu']/div[@id='searchform-wrap']/form[@id='searchform']/i[1]"
		 * )) .click();
		 */
		// xpath with "OR" operator
		// driver.findElement( By.xpath("//input[@title='Search' or
		// @id='s']")).sendKeys("tshirts");

		// xpath with "AND" operator
		// driver.findElement( By.xpath("//input[@title='Search' and
		// @id='sa']")).sendKeys("tshitrts");

		// Xpath with contains()
		//driver.findElement(By.xpath("//input[contains(@id,'s')]")).sendKeys("tsggksfd");

		//xpath  starts.with()
		//driver.findElement(By.xpath("//input[starts.with(@title,'Sear')]")).sendKeys("tsggksfd");
		
		//xpath text()
		driver.findElement(By.xpath( "//a[text()='shop']")).click();
		
		
		
	}

}
