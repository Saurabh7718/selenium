package Z_20_date_picker_calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_01_first_type_calender {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        ChromeDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");

        String year = "2024";
        String month = "May"; // Corrected to match the month format in the date picker
        String date = "10";

        // opens date picker
        driver.findElement(By.xpath("//i[@class='sc-cSHVUG NyvQv icon icon-datev2']")).click();

        int timeout = 10; // Timeout in seconds
        long startTime = System.currentTimeMillis();

        while (true) {
            String monthyear = driver
                    .findElement(By.xpath("//td[@class='monthTitle']"))
                    .getText();

            String[] arr = monthyear.split(" ");
            String mon = arr[0];
            String yr = arr[1];

            System.out.println("Current Month: " + mon);
            System.out.println("Current Year: " + yr);
            

            if (mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year)) {
                break;
            } else {
                driver.findElement(
                        By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]//*[name()='svg']"))
                        .click();
            }

             
            
        }
        
        //Date selection
        List<WebElement> alldates=driver.findElements(By.xpath("//tab;e[@class='rb-monthTable first last']//td"));
        
        for(WebElement ele:alldates) {
        	String dt=ele.getText();
        	
        	if(dt.equalsIgnoreCase(date)) {
        		ele.click();
        		break;
        	}
        }

        // driver.quit();
    }

}
