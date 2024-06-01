package Z_06_Scroll_Webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_01_scroll_page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.countries-ofthe-world.com/");
		driver.manage().window().maximize();// maximaize window

		JavascriptExecutor j = (JavascriptExecutor) driver; // conversion of driver into javascriptExecutor
		// 1) scrolling by using pixel
//		j.executeScript("window.scrollBy(0,1000)","");

		// 2)scrolling till we find certain element
		
		//WebElement watch = driver.findElement(By.xpath(
			//	"//body/div[@id='a-page']/div[@id='pageContent']/div[@id='gw-layout']/div[@id='gw-content-grid']/div[@id='main-content']/div[@id='desktop-7']/div[@id='CardInstancelRPtt2zxG7O2BIpaFu3kFQ']/div[@id='176a1d2a-bb99-4164-97a8-00a74052255a']/div[2]/div[1]/ul[1]/li[4]/span[1]/a[1]/img[1]"));
//		j.executeScript("arguments[0].scrollIntoView();", watch);

		// 3)scroll till bottom
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
