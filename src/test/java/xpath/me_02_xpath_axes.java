package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class me_02_xpath_axes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");

		driver.manage().window().maximize();

		// self noode
		/*
		 * String text =
		 * driver.findElement(By.xpath("//a[contains(text(),'Punj. Alkalie')]/self::a"))
		 * .getText(); System.out.println(text);
		 * 
		 * // parent node text = driver.findElement(By.
		 * xpath("//a[contains(text(),'Punj. Alkalie')]/parent::td")).getText();
		 * System.out.println(text);
		 * 
		 * //child node List<WebElement> childs=driver.findElements(By.
		 * xpath("//a[contains(text(),'Punj. Alkalie')]/ancestor::tr/child::td"));
		 * System.out.println(childs.size());
		 * 
		 * 
		 * //ancestor node String text = driver.findElement(By.
		 * xpath("//a[contains(text(),'Punj. Alkalie')]/ancestor::tr")).getText();
		 * System.out.println(text);
		 * 
		 * //descendent-select all descedants(children,grandchildern,etx)of current node
		 * 
		 * List<WebElement> descedant = driver.findElements(By.
		 * xpath(" //a[contains(text(),'Punj. Alkalie')]/ancestor::tr/descedant::*"));
		 * System.out.println(descedant.size()); //output=7
		 * 
		 * //following- select everything in the document after closing tag of the
		 * current node List<WebElement> following=driver.findElements(By.xpath(
		 * "//a[contains(text(),'Punj. Alkalie')]/ancestor::tr/following::tr"));
		 * System.out.println(following.size());
		 * 
		 * //following sibling-selects all siblings after the current node
		 * List<WebElement> siblings=driver.findElements(By.xpath(
		 * "//a[contains(text(),'Punj. Alkalie')]/ancestor::tr/following-siblings::*"));
		 * System.out.println(siblings.size());
		 * 
		 * 
		 * // preceding=select all nodes that appear before the current node in the //
		 * document List<WebElement> precedings = driver .findElements(By.
		 * xpath("//a[contains(text(),'Punj. Alkalie')]/ancestor::tr/preceding::tr"));
		 * System.out.println(precedings.size());
		 */
		
		//preceding -sibling =>select all siblings before current node
		List<WebElement> precedingssiblings = driver
				.findElements(By.xpath(" //a[contains(text(),'Punj. Alkalie')]/ancestor::tr/preceding-sibling::*"));
		System.out.println(precedingssiblings.size());

		driver.close();
	}

}
