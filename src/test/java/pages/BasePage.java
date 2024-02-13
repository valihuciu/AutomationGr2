package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);
    public static WebDriver driver;

    public static void setUp() {
        LOG.info("Start test");
        System.setProperty("webdriver.chrome.driver", "C://Webdrivers/chromedriver121.exe");
        driver = new ChromeDriver();
        String url = "https://demo.automationtesting.in/Index.html";
        driver.get(url);
        driver.get(url);

        LOG.info("Open browser maximize");
        driver.manage().window().maximize();

    }

    public static void tearDown() {
        LOG.info("Close the browser");
        driver.quit();
    }

    public static String returnBaseUrl() {
        return "https://demo.automationtesting.in/Index.html";
    }

    public static String getBaseUrl(){
        String baseurl = returnBaseUrl();
        if (baseurl != null){
            return baseurl.replace("Index.html", "");
        }
        return baseurl;
    }

}
