 package Z_99_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class x_02_loginpage_check {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Index.html");
		driver.manage().window().maximize();
		String title = driver.getTitle();

		// Check if the title contains the text "Index"
		Assert.assertTrue(title.contains("Index"), "Page title does not contain 'Index'");

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("saurabh@gmail.com");
		driver.findElement(By.xpath("//img[@id='enterimg']")).click();

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("saurabh");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("c");

		// driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine
		// ng-valid ng-touched']")).sendKeys("silicon valley Z street");
		// driver.findElement(By.className(" form-control ng-pristine ng-valid
		// ng-touched")).sendKeys("silicon valley");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ABC@gmail.com");

		driver.findElement(
				By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]"))
				.click();
		WebElement female = driver.findElement(By.xpath("//input[@value=Female']"));
		 
//		 if (!male.isSelected()) {
//             // Select the radio button
//             male.click();
//         } else {
//             System.out.println("Radio button is already selected.");
//         }
//     
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[6]/div[1]/div[1]/input[1]")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();

		// Close the browser
		driver.close();
		driver.quit();

	}

}
