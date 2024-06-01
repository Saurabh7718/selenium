package Z_A_P_11_windowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_03_open_new_window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Windows.html");

		// click on separate window option

		driver.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
		// click on click btn
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		Set<String> s = driver.getWindowHandles();

		Thread.sleep(5000);
		for (String i : s) {
			String title=driver.switchTo().window(i).getTitle();
			System.out.println(title);
			System.out.println(i);

		}
		driver.quit();
	}

}
