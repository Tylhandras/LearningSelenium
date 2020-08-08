import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import siteTest.*;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class learningSelenium {
    public static void main (String[] args) {
        Elements elmObj = new Elements();
        Forms frmObj = new Forms();
        Alerts alrObj = new Alerts();
        Widgets wdgObj = new Widgets();
        Interactions actObj = new Interactions();

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sxo85\\Documents\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.prompt_for_download", false);
        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);
        driver.get("http://www.demoqa.com");

        // Project wide wait so pages can load
        // Considered best practice
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // cssSelector() > Relative xPath >= Absolute xPath
        // Absolute xPath is shorter than relative xPath
        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]"));
        element.click();
        elmObj.elementsTest(driver);

        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]"));
        element.click();
        frmObj.formsTest(driver);

        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]"));
        element.click();
        alrObj.alertsTest(driver);

        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]"));
        element.click();
        wdgObj.widgetsTest(driver);

        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]"));
        element.click();
        actObj.interactionsTest(driver);

        driver.quit();
    }


}
