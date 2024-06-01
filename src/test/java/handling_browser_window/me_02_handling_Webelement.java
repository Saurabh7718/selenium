package handling_browser_window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_02_handling_Webelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(
				By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]"))
				.sendKeys("pavan");
		driver.findElement(
				By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]"))
				.sendKeys("hyderabad");
		driver.findElement(
				By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]"))
				.sendKeys("abc@gmail.com");
		driver.findElement(
				By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]"))
				.sendKeys("764567589");

		// dropdown
		WebElement drpskill = driver.findElement(By.cssSelector("#Skills"));
		Select s = new Select(drpskill);
		// s.selectByIndex(3); // by index
		// s.selectByValue("Radio-2"); // by value
		// s.selectByVisibleText("c++"); // by visible text

		// how many elements present in drop down(size is used to count number of
		// elements)

		System.out.println(s.getOptions().size());

		// radio button
		System.out.println(driver
				.findElement(By.xpath(
						"//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]"))
				.isSelected());
		driver.findElement(
				By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]"))
				.click();

		// check box selection

		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();

		// link

		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
	}

}
