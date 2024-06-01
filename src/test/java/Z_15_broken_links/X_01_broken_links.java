package Z_15_broken_links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_01_broken_links {
 
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        // maximize browser
        driver.manage().window().maximize();

        // wait 10 sec
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        // open url
        driver.get("http://www.deadlinkcity.com/");

        // find hyperlinks
        List<WebElement> linklist = driver.findElements(By.tagName("a"));
        int resCode=200;
        int brokenLinkCount=0;
        
        System.out.println("Total broken links on page:"+linklist.size());
        
        for (WebElement element : linklist) {

            String linkUrl = element.getAttribute("href");

            try {
                URL urlLink = new URL(linkUrl);
                
                //to open links 
                HttpURLConnection huc=(HttpURLConnection)urlLink.openConnection();
                
                //send kiya
                huc.setRequestMethod("HEAD");
                
                
				huc.connect();
				
				resCode=huc.getResponseCode();
				
				if(resCode>=400) {
					System.out.println(linkUrl+":  broken link:  ");
					brokenLinkCount++;
					
				}
                
            } 
            catch(Exception e) {
            	System.out.println(e);
            }

        }

        System.out.println("total broken links:  "+brokenLinkCount);
    }

}
