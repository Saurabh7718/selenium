package Z_A_07_p_webtables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_01_static_webtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// body[1]/div[1]/div[3]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();

		// find rows in table

		int rows = driver.findElements(By.xpath(
				"// body[1]/div[1]/div[3]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[]"))
				.size();

		// find columns
		int cols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				WebElement item=driver.findElement(By.xpath(
						"//body[1]/div[1]/div[3]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[i]/td[j]"));
			
			System.out.println(item.getText());
			}
		}

		driver.quit();
	}

}
