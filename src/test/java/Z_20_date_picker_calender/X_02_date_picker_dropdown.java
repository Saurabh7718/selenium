package Z_20_date_picker_calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_02_date_picker_dropdown {

    public static void main(String[] args) {
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");

        // Click on the date input field
        driver.findElement(By.id("dob")).click();

        // Month and year selection
        Select monthSelect = new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
        monthSelect.selectByVisibleText("May");

        Select yearSelect = new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
        yearSelect.selectByVisibleText("2024");

        // Date selection
        String date = "10";
        boolean dateSelected = false;
        while (!dateSelected) {
            try {
                // Locate all date elements
                List<WebElement> allDates = driver
                        .findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td//a"));

                // Iterate through each date and click the desired date
                for (WebElement e : allDates) {
                    String dt = e.getText();
                    if (dt.equalsIgnoreCase(date)) {
                        e.click();
                        dateSelected = true; // Exit the loop once date is selected
                        break;
                    }
                }
            } catch (org.openqa.selenium.StaleElementReferenceException ex) {
                System.out.println("StaleElementReferenceException occurred. Retrying...");
            }
        }
    }
}
