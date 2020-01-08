import org.testng.annotations.Test;

public class TestOne {

	@Test
    public static void setup(){

        //WebDriverManager.chromedriver().setup();
        System.out.println("Starting Testing------");
       /* File file = new File(System.getProperty("user.dir")+"/src/java/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");*/
        System.out.println("Completed Testing------");
    }
}
