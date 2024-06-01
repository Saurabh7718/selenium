package Z_12_handling_web_tables;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_100_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stubr
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		int row=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr")).size();
		
		System.out.println(row);
		
		int col=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[1]/th")).size();
		System.out.println(col);
		
		for(int i=2;i<row+1;i++) {
			for(int j=1;j<col+1;j++) {
				String text=driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(text+"\t"+"\t");
			}
			System.out.println();
			
		}
		
		
		driver.quit();

	}

}
