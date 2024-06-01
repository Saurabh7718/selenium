package Z_99_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class X_16_static_handle_webtable {

    public static void main(String[] args) {
        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open the webpage
        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");

        // Get the number of columns in the table
        int colCount = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th")).size();

        System.out.println("printing headers");
        // Loop through the columns
        for (int i = 1; i <= colCount; i++) {
            // Get the text of each column
            String text = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[1]/th[" + i + "]"))
                    .getText();
            System.out.println(text);
        }

        System.out.println("printing data");

        // Loop through the rows
        for (int i = 2; i <= 7; i++) {
            // Loop through the columns
            for (int j = 1; j <= colCount; j++) {
                String text = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[" + i + "]/td[" + j + "]"))
                        .getText();
                System.out.print(text + "\t");
            }
            System.out.println();
        }

        // Quit the driver
        driver.quit();
    }
}
