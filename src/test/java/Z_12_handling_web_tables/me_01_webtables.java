 package Z_12_handling_web_tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_01_webtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		
		//1)How many rows in a table
		int rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		System.out.println("Total no of rows in table :"+rows);
		
		//2)How to find no of columns in table
		
		int cols=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[0]/th")).size();
		System.out.println("No of columns in table: "+cols);
		
 		//3)retrive the specific row and column data
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<=cols;j++) {
				String t=driver.findElement(By.xpath(" /html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[i]/td[j]/span[1]")).getText();
				System.out.println(i+"  "+ j);
				if(t.equals("Google")) {
					break;
				}
				
			}
		}
		
		driver.quit();
		
		 
	}

}
