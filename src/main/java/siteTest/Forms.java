package siteTest;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Forms {

    public Forms () { super(); }

    public static void formsTest (WebDriver driver) {
        String url = "https://www.demoqa.com/forms";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(url)) {
            System.out.println(actualUrl);
            System.out.println("Verification Successful");
        }
        else {
            System.out.println(actualUrl);
            System.out.println("Verification Failed");
        }
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]"));
        js.executeScript("arguments[0].click();", element);
        pracFormTest(driver);

        driver.navigate().back();
    }

    private static void pracFormTest (WebDriver driver) {
        String url = "https://www.demoqa.com/automation-practice-form";
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
        WebDriverWait wait = new WebDriverWait (driver, 30);

        WebElement element = driver.findElement(By.cssSelector("#firstName"));
        element.sendKeys("Sean");

        element = driver.findElement(By.cssSelector("#lastName"));
        element.sendKeys("O'Brien");

        element = driver.findElement(By.cssSelector("#userEmail"));
        element.sendKeys("torphanin@hotmail.com");

        element = driver.findElement(By.cssSelector("#gender-radio-1"));
        js.executeScript("arguments[0].click();", element);

        element = driver.findElement(By.cssSelector("#userNumber"));
        element.sendKeys("5558675309");

        element = driver.findElement(By.cssSelector("#subjectsInput"));
        element.sendKeys("Math, Science, Art");

        element = driver.findElement(By.cssSelector("#hobbies-checkbox-2"));
        js.executeScript("arguments[0].click();", element);
        element = driver.findElement(By.cssSelector("#hobbies-checkbox-3"));
        js.executeScript("arguments[0].click();", element);

        element = driver.findElement(By.cssSelector("#uploadPicture"));
        element.sendKeys("C:\\Users\\sxo85\\Downloads\\sampleFile.jpeg");
        js.executeScript("window.scrollBy(0,1000)");

        element = driver.findElement(By.cssSelector("#currentAddress"));
        element.sendKeys("1725 Chestnut St.");

        element = driver.findElement(By.cssSelector("#react-select-4-input"));
        WebElement stateDrpDown = driver.findElement(By.cssSelector("#react-select-3-input"));
        WebElement cityDrpDown = driver.findElement(By.cssSelector("#react-select-4-input"));
        stateDrpDown.sendKeys("NCR");
        stateDrpDown.sendKeys(Keys.RETURN);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        cityDrpDown.sendKeys("Delhi");
        cityDrpDown.sendKeys(Keys.RETURN);

        element = driver.findElement(By.cssSelector("#submit"));
        element.click();

        element = driver.findElement(By.cssSelector("#closeLargeModal"));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();

        driver.navigate().back();
    }
}
