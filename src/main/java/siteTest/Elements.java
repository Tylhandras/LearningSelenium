package siteTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;


public class Elements {

    public Elements () { super(); }

    public static void elementsTest (WebDriver driver) {
        String url = "https://www.demoqa.com/elements";
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

        WebElement element = driver.findElement(By.cssSelector("#item-0"));
        element.click();
        textBoxTest(driver);

        element = driver.findElement(By.cssSelector("#item-1"));
        element.click();
        checkTest(driver);

        element = driver.findElement(By.cssSelector("#item-2"));
        element.click();
        radioTest(driver);

        element = driver.findElement(By.cssSelector("#item-3"));
        element.click();
        tableTest(driver);

        element = driver.findElement(By.cssSelector("#item-4"));
        element.click();
        buttonTest(driver);

        element = driver.findElement(By.cssSelector("#item-5"));
        element.click();
        linkTest(driver);

        js.executeScript("window.scrollBy(0,1000)");

        element = driver.findElement(By.cssSelector("#item-6"));
        element.click();
        upDownTest(driver);

        element = driver.findElement(By.cssSelector("#item-7"));
        element.click();
        propTest(driver);

        driver.navigate().back();
    }

    private static void textBoxTest (WebDriver driver) {
        String url = "https://www.demoqa.com/text-box";
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

        WebElement name = driver.findElement(By.cssSelector("#userName"));
        name.sendKeys("Sean O'Brien");

        WebElement email = driver.findElement(By.cssSelector("#userEmail"));
        email.sendKeys("torphanin@hotmail.com");

        WebElement curAddr = driver.findElement(By.cssSelector("#currentAddress"));
        curAddr.sendKeys("1725 Chestnut St. \nWaukegan, IL  60085");

        WebElement permAddr = driver.findElement(By.cssSelector("#permanentAddress"));
        permAddr.sendKeys("38420 N. Dilleys Rd. \nWadsworth, IL  60083");

        WebElement subBut = driver.findElement(By.cssSelector("#submit"));
        subBut.submit();

        driver.navigate().back();
        driver.navigate().back();
    }

    private static void checkTest (WebDriver driver) {
        String url = "https://www.demoqa.com/checkbox";
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

        WebElement expand = driver.findElement(By.cssSelector("button[title='Expand all']"));
        expand.click();

        WebElement chBox = driver.findElement(By.cssSelector("input[id='tree-node-angular']"));
        js.executeScript("arguments[0].click();", chBox);

        WebElement collapse = driver.findElement(By.cssSelector("button[title='Collapse all']"));
        collapse.click();

        driver.navigate().back();
    }

    private static void radioTest (WebDriver driver) {
        String url = "https://www.demoqa.com/radio-button";
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

        WebElement radio = driver.findElement(By.cssSelector("input[id='yesRadio']"));
        js.executeScript("arguments[0].click();", radio);

        driver.navigate().back();
    }

    private static void tableTest (WebDriver driver) {
        String url = "https://www.demoqa.com/webtables";
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

        WebElement addRec = driver.findElement(By.cssSelector("button[id='addNewRecordButton']"));
        addRec.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("form[id='userForm'"))));

        WebElement fName = driver.findElement(By.cssSelector("input[id='firstName']"));
        fName.sendKeys("Sean");
        WebElement lName = driver.findElement(By.cssSelector("input[id='lastName']"));
        lName.sendKeys("O'Brien");
        WebElement email = driver.findElement(By.cssSelector("input[id='userEmail']"));
        email.sendKeys("torphanin@hotmail.com");
        WebElement age = driver.findElement(By.cssSelector("input[id='age']"));
        age.sendKeys("34");
        WebElement money = driver.findElement(By.cssSelector("input[id='salary']"));
        money.sendKeys("45000");
        WebElement dept = driver.findElement(By.cssSelector("input[id='department']"));
        dept.sendKeys("Developer");
        WebElement butSub = driver.findElement(By.cssSelector("button[id='submit']"));
        butSub.click();

        WebElement srcBox = driver.findElement(By.cssSelector("input[id='searchBox']"));
        srcBox.sendKeys("Cierra");

        driver.navigate().back();
    }

    private static void buttonTest (WebDriver driver) {
        String url = "https://www.demoqa.com/buttons";
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

        Actions action = new Actions(driver);

        WebElement lClick = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/button[1]"));
        lClick.click();

        WebElement rClick = driver.findElement(By.cssSelector("button[id='rightClickBtn']"));
        action.contextClick(rClick);

        WebElement dblClick = driver.findElement(By.cssSelector("button[id='doubleClickBtn']"));
        action.doubleClick(dblClick);

        driver.navigate().back();
    }

    private static void linkTest (WebDriver driver) {
        String url = "https://www.demoqa.com/links";
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
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement simTabLink = driver.findElement(By.cssSelector("a[id='simpleLink'"));
        simTabLink.click();
        winHand = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(winHand.get(1));
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
            }
        });
        driver.close();
        driver.switchTo().window(winHand.get(0));

        WebElement dynTabLink = driver.findElement(By.cssSelector("a[id='dynamicLink'"));
        dynTabLink.click();
        winHand = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(winHand.get(1));
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
            }
        });
        driver.close();
        driver.switchTo().window(winHand.get(0));

        WebElement crtApiLink = driver.findElement(By.cssSelector("a[id='created'"));
        crtApiLink.click();
        WebElement nctApiLink = driver.findElement(By.cssSelector("a[id='no-content'"));
        nctApiLink.click();
        WebElement movApiLink = driver.findElement(By.cssSelector("a[id='moved'"));
        movApiLink.click();
        WebElement badApiLink = driver.findElement(By.cssSelector("a[id='bad-request'"));
        badApiLink.click();
        WebElement athApiLink = driver.findElement(By.cssSelector("a[id='unauthorized'"));
        athApiLink.click();
        WebElement ngoApiLink = driver.findElement(By.cssSelector("a[id='forbidden'"));
        ngoApiLink.click();

        js.executeScript("window.scrollBy(0,1000)");
        WebElement finApiLink = driver.findElement(By.cssSelector("a[id='invalid-url'"));
        finApiLink.click();

        driver.navigate().back();
    }

    private static void upDownTest (WebDriver driver) {
        String url = "https://www.demoqa.com/upload-download";
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

        WebElement downBtn = driver.findElement(By.cssSelector("a[id='downloadButton'"));
        downBtn.click();

        WebElement upBtn = driver.findElement(By.cssSelector("input[id='uploadFile'"));
        upBtn.sendKeys("C:\\Users\\sxo85\\Downloads\\sampleFile.jpeg");

        driver.navigate().back();
    }

    private static void propTest (WebDriver driver) {
        String url = "https://www.demoqa.com/dynamic-properties";
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

        WebElement timeBtn = driver.findElement(By.cssSelector("button[id='enableAfter']"));

        wait.until(ExpectedConditions.elementToBeClickable(timeBtn));

        driver.navigate().back();
    }
}
