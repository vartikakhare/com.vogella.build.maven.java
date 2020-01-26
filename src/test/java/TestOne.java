import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestOne {

	@Test
    public static void setup() throws InterruptedException{

        //WebDriverManager.chromedriver().setup();
        System.out.println("Starting Testing------");
        File file = new File(System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.get("http://car-store-app-git-mymvnproject.apps.us-west-1.starter.openshift-online.com/");
        //http://car-store-app-git-mymvnproject.apps.us-west-1.starter.openshift-online.com/
        Thread.sleep(10000);
        driver.findElement(By.xpath("//input[@type='submit']")).submit();
        Thread.sleep(10000);

        String textonSite="Available Brands";
        String str = driver.findElement(By.tagName("h1")).getText();

        if(textonSite.equalsIgnoreCase(str))
            System.out.println("Test Case Passed");

        System.out.println("Completed Testing------");
        //driver.quit();
       
    }
}
