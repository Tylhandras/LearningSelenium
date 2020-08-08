package siteTest;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Widgets {

    public Widgets () { super(); }

    public static void widgetsTest (WebDriver driver) {
        String url = "https://www.demoqa.com/widgets";
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

        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[1]"));
        js.executeScript("arguments[0].click();", element);
        accordianTest(driver);

        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]"));
        js.executeScript("arguments[0].click();", element);
        autoComTest(driver);

        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[3]"));
        js.executeScript("arguments[0].click();", element);
        datePickTest(driver);

        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[4]"));
        js.executeScript("arguments[0].click();", element);
        slideTest(driver);

        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[5]"));
        js.executeScript("arguments[0].click();", element);
        progBarTest(driver);

        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[6]"));
        js.executeScript("arguments[0].click();", element);
        tabTest(driver);

        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[7]"));
        js.executeScript("arguments[0].click();", element);
        toolTipTest(driver);

        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[8]"));
        js.executeScript("arguments[0].click();", element);
        menuTest(driver);

        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[9]"));
        js.executeScript("arguments[0].click();", element);
        selMenuTest(driver);

        driver.navigate().back();
    }

    private static void accordianTest (WebDriver driver) {
        String url = "https://www.demoqa.com/accordian";
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

        js.executeScript("window.scrollBy(0,200)");
        WebElement element = driver.findElement(By.cssSelector("#section3Heading"));
        element.click();

        element = driver.findElement(By.cssSelector("#section2Heading"));
        element.click();

        element = driver.findElement(By.cssSelector("#section1Heading"));
        element.click();

        driver.navigate().back();
    }

    private static void autoComTest (WebDriver driver) {
        String url = "https://www.demoqa.com/auto-complete";
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

        WebElement element = driver.findElement(By.cssSelector("#autoCompleteMultipleInput"));
        element.sendKeys("red");
        element.sendKeys(Keys.ARROW_DOWN);
        element.sendKeys(Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")))).click();

        element.sendKeys("bla");
        element.sendKeys(Keys.ARROW_DOWN);
        element.sendKeys(Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")))).click();

        element.sendKeys("red");
        element.sendKeys(Keys.ARROW_DOWN);
        element.sendKeys(Keys.RETURN);
        element.sendKeys("bla");
        element.sendKeys(Keys.ARROW_DOWN);
        element.sendKeys(Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]")))).click();

        element = driver.findElement(By.cssSelector("#autoCompleteSingleInput"));
        element.sendKeys("yel");
        element.sendKeys(Keys.ARROW_DOWN);
        element.sendKeys(Keys.RETURN);

        driver.navigate().back();
    }

    private static void datePickTest (WebDriver driver) {
        String url = "https://www.demoqa.com/date-picker";
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

        WebElement element = driver.findElement(By.cssSelector("#datePickerMonthYearInput"));
        element.click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]"))));
        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]"));
        element.click();

        element = driver.findElement(By.cssSelector("#dateAndTimePickerInput"));
        element.click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]"))));
        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]"));
        element.click();

        element = driver.findElement(By.xpath("//li[contains(text(),'15:00')]"));
        element.click();

        driver.navigate().back();
    }

    private static void slideTest (WebDriver driver) {
        String url = "https://www.demoqa.com/slider";
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

        WebElement element = driver.findElement(By.xpath("//input[contains(@class,'range-slider range-slider--primary')]"));
        Actions move = new Actions(driver);
        Action action = move.dragAndDropBy(element, 30, 0).build();
        action.perform();

        driver.navigate().back();
    }

    private static void progBarTest (WebDriver driver) {
        String url = "https://www.demoqa.com/progress-bar";
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

        WebDriverWait wait = new WebDriverWait (driver, 30, 5);

        WebElement element = driver.findElement(By.cssSelector("#startStopButton"));
        element.click();


        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return driver.findElement(By.xpath("//div[contains(@class,'progress-bar bg-info')]")).getAttribute("aria-valuenow").equals("50");
            }
        });

        element = driver.findElement(By.cssSelector("#startStopButton"));
        element.click();

        driver.navigate().back();
    }

    private static void tabTest (WebDriver driver) {
        String url = "https://www.demoqa.com/tabs";
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

        WebElement element = driver.findElement(By.cssSelector("#demo-tab-use"));
        element.click();

        element = driver.findElement(By.cssSelector("#demo-tab-origin"));
        element.click();

        element = driver.findElement(By.cssSelector("#demo-tab-what"));
        element.click();

        driver.navigate().back();
    }

    private static void toolTipTest (WebDriver driver) {
        String url = "https://www.demoqa.com/tool-tips";
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

        WebElement element = driver.findElement(By.cssSelector("#toolTipButton"));
        Actions action = new Actions(driver);

        action.moveToElement(element).build().perform();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("#buttonToolTip"))));

        element = driver.findElement(By.cssSelector("#toolTipTextField"));
        action.moveToElement(element).build().perform();

        driver.navigate().back();
    }

    private static void menuTest (WebDriver driver) {
        String url = "https://www.demoqa.com/menu";
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

        WebElement element = driver.findElement(By.linkText("Main Item 2"));
        Actions action = new Actions(driver);

        action.moveToElement(element).build().perform();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("SUB SUB LIST »"))));

        element = driver.findElement(By.linkText("SUB SUB LIST »"));
        action.moveToElement(element).build().perform();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Sub Sub Item 2"))));

        element = driver.findElement(By.linkText("Sub Sub Item 2"));
        action.moveToElement(element).build().perform();

        driver.navigate().back();
    }

    private static void selMenuTest (WebDriver driver) {
        String url = "https://www.demoqa.com/select-menu";
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

        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        element.sendKeys(Keys.ARROW_DOWN);
        element.sendKeys(Keys.RETURN);

        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
        element.sendKeys(Keys.ARROW_DOWN);
        element.sendKeys(Keys.ARROW_DOWN);
        element.sendKeys(Keys.RETURN);

        Select drpColor = new Select(driver.findElement(By.cssSelector("#oldSelectMenu")));
        drpColor.selectByValue("10");

        driver.navigate().back();
    }
}
