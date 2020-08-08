package siteTest;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class Alerts {

    public Alerts () { super(); }

    public static void alertsTest (WebDriver driver) {
        String url = "https://www.demoqa.com/alertsWindows";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(url)) {
            System.out.println(actualUrl);
            System.out.println("Verification Successful");
        }
        else {
            System.out.println(actualUrl);
            System.out.println("Verification Failed");
            return;
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]"));
        js.executeScript("arguments[0].click();", element);
        broWinTest(driver);

        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]"));
        js.executeScript("arguments[0].click();", element);
        alrTest(driver);

        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[3]"));
        js.executeScript("arguments[0].click();", element);
        frameTest(driver);

        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[4]"));
        js.executeScript("arguments[0].click();", element);
        nestedTest(driver);

        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[5]"));
        js.executeScript("arguments[0].click();", element);
        modalTest(driver);

        driver.navigate().back();
    }

    private static void broWinTest (WebDriver driver) {
        String url = "https://www.demoqa.com/browser-windows";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(url)) {
            System.out.println(actualUrl);
            System.out.println("Verification Successful");
        }
        else {
            System.out.println(actualUrl);
            System.out.println("Verification Failed");
            return;
        }

        ArrayList<String> winHand;
        WebDriverWait wait = new WebDriverWait (driver, 30);
        String base = driver.getWindowHandle();

        WebElement element = driver.findElement(By.cssSelector("#tabButton"));
        element.click();
        winHand = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(winHand.get(1));
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
            }
        });
        driver.close();
        driver.switchTo().window(winHand.get(0));

        element = driver.findElement(By.cssSelector("#windowButton"));
        element.click();
        winHand = new ArrayList<String>(driver.getWindowHandles());
        winHand.remove(base);
        driver.switchTo().window(winHand.get(0));
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
            }
        });
        driver.close();
        driver.switchTo().window(base);

        element = driver.findElement(By.cssSelector("#messageWindowButton"));
        element.click();
        winHand = new ArrayList<String>(driver.getWindowHandles());
        winHand.remove(base);
        driver.switchTo().window(winHand.get(0));
        driver.close();
        driver.switchTo().window(base);

        driver.navigate().back();
    }

    private static void alrTest (WebDriver driver) {
        String url = "https://www.demoqa.com/alerts";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(url)) {
            System.out.println(actualUrl);
            System.out.println("Verification Successful");
        }
        else {
            System.out.println(actualUrl);
            System.out.println("Verification Failed");
            return;
        }

        WebDriverWait wait = new WebDriverWait (driver, 30);

        WebElement element = driver.findElement(By.cssSelector("#alertButton"));
        element.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        element = driver.findElement(By.cssSelector("#timerAlertButton"));
        element.click();
        wait.until(ExpectedConditions.alertIsPresent());
        alert = driver.switchTo().alert();
        alert.accept();

        element = driver.findElement(By.cssSelector("#confirmButton"));
        element.click();
        alert = driver.switchTo().alert();
        alert.dismiss();

        element = driver.findElement(By.cssSelector("#promtButton"));
        element.click();
        alert = driver.switchTo().alert();
        alert.sendKeys("Sean");
        alert.accept();

        driver.navigate().back();
    }

    private static void frameTest (WebDriver driver) {
        String url = "https://www.demoqa.com/frames";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(url)) {
            System.out.println(actualUrl);
            System.out.println("Verification Successful");
        }
        else {
            System.out.println(actualUrl);
            System.out.println("Verification Failed");
            return;
        }

        WebElement element = driver.findElement(By.cssSelector("#frame1"));
        driver.switchTo().frame(element);
        System.out.println(driver.findElement(By.cssSelector("#sampleHeading")).getText());
        driver.switchTo().parentFrame();

        element = driver.findElement(By.cssSelector("#frame2"));
        driver.switchTo().frame(element);
        System.out.println(driver.findElement(By.cssSelector("#sampleHeading")).getText());
        driver.switchTo().parentFrame();

        driver.navigate().back();
    }

    private static void nestedTest (WebDriver driver) {
        String url = "https://www.demoqa.com/nestedframes";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(url)) {
            System.out.println(actualUrl);
            System.out.println("Verification Successful");
        }
        else {
            System.out.println(actualUrl);
            System.out.println("Verification Failed");
            return;
        }

        WebElement element = driver.findElement(By.cssSelector("#frame1"));
        driver.switchTo().frame(element);
        element = driver.findElement(By.cssSelector("body:nth-child(2) > iframe:nth-child(1)"));
        driver.switchTo().frame(element);
        System.out.println(driver.findElement(By.cssSelector("body:nth-child(2) > p:nth-child(1)")).getText());
        driver.switchTo().defaultContent();

        driver.navigate().back();
    }

    private static void modalTest (WebDriver driver) {
        String url = "https://www.demoqa.com/modal-dialogs";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(url)) {
            System.out.println(actualUrl);
            System.out.println("Verification Successful");
        }
        else {
            System.out.println(actualUrl);
            System.out.println("Verification Failed");
            return;
        }

        WebDriverWait wait = new WebDriverWait (driver, 30);

        WebElement element = driver.findElement(By.cssSelector("#showSmallModal"));
        element.click();

        element = driver.findElement(By.cssSelector("#closeSmallModal"));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();

        element = driver.findElement(By.cssSelector("#showLargeModal"));
        element.click();

        element = driver.findElement(By.cssSelector("#closeLargeModal"));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();

        driver.navigate().back();
    }
}
