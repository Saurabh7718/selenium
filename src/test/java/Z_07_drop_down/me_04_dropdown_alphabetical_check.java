package Z_07_drop_down;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class me_04_dropdown_alphabetical_check {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver = new FirefoxDriver();
        
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");
        
        // Locate the dropdown element
        WebElement dropdownElement = driver.findElement(By.id("Skills"));
        
        // Use Select class to interact with the dropdown
        Select dropdown = new Select(dropdownElement);
        
        // Get all options from the dropdown
        List<WebElement> options = dropdown.getOptions();
        
        // Extract the text from each option
        List<String> originalList = new ArrayList<>();
        for (WebElement option : options) {
            originalList.add(option.getText());
        }
        
        // Create a copy of the original list and sort it
        List<String> sortedList = new ArrayList<>(originalList);
        Collections.sort(sortedList);
        
        // Compare the original list with the sorted list
        if (originalList.equals(sortedList)) {
            System.out.println("The dropdown options are in alphabetical order.");
        } else {
            System.out.println("The dropdown options are NOT in alphabetical order.");
        }
        
        driver.quit();
    }
}
