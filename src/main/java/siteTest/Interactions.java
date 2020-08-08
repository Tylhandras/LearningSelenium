package siteTest;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Interactions {

    public Interactions () { super(); }

    public static void interactionsTest (WebDriver driver) {
        String url = "https://www.demoqa.com/interaction";
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

        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[1]"));
        js.executeScript("arguments[0].click();", element);
        sortTest(driver);

        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[2]"));
        js.executeScript("arguments[0].click();", element);
        selectTest(driver);

        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[3]"));
        js.executeScript("arguments[0].click();", element);
        resizeTest(driver);

        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[4]"));
        js.executeScript("arguments[0].click();", element);
        dropTest(driver);

        js.executeScript("window.scrollBy(0,1000)");

        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[5]/div[1]/ul[1]/li[5]"));
        js.executeScript("arguments[0].click();", element);
        dragTest(driver);

        driver.navigate().back();
    }

    private static void sortTest (WebDriver driver) {
        String url = "https://www.demoqa.com/sortable";
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
        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]"));
        action.click(element).clickAndHold().moveByOffset(0, 200).release().build().perform();

        element = driver.findElement(By.cssSelector("#demo-tab-grid"));
        element.click();

        element = driver.findElement(By.xpath("//div[contains(text(),'Seven')]"));
        action.click(element).clickAndHold().moveByOffset(0, -450).release().build().perform();
        element = driver.findElement(By.xpath("//div[contains(text(),'Seven')]"));
        action.click(element).clickAndHold().moveByOffset(300, 0).release().build().perform();

        driver.navigate().back();
    }

    private static void selectTest (WebDriver driver) {
        String url = "https://www.demoqa.com/selectable";
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

        WebElement element = driver.findElement(By.xpath("//li[contains(text(),'Cras justo odio')]"));
        element.click();
        element = driver.findElement(By.xpath("//li[contains(text(),'Porta ac consectetur ac')]"));
        element.click();

        element = driver.findElement(By.cssSelector("#demo-tab-grid"));
        element.click();
        element = driver.findElement(By.xpath("//li[contains(text(),'One')]"));
        element.click();
        element = driver.findElement(By.xpath("//li[contains(text(),'Six')]"));
        element.click();
        element = driver.findElement(By.xpath("//li[contains(text(),'Seven')]"));
        element.click();
        element = driver.findElement(By.xpath("//li[contains(text(),'Nine')]"));
        element.click();

        driver.navigate().back();
    }

    private static void resizeTest (WebDriver driver) {
        String url = "https://www.demoqa.com/resizable";
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
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.resizable-container div.constraint-area div.box.react-resizable > span.react-resizable-handle.react-resizable-handle-se"));
        action.clickAndHold(element).moveByOffset(150, 50).release().build().perform();

        js.executeScript("window.scrollBy(0,1000)");

        element = driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.resizable-container div.resizable-nolimit.mt-4 div.box.react-resizable > span.react-resizable-handle.react-resizable-handle-se"));
        action.clickAndHold(element).moveByOffset(350, 250).release().build().perform();

        driver.navigate().back();
    }

    private static void dropTest (WebDriver driver) {
        String url = "https://www.demoqa.com/droppable";
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
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait (driver, 30);

        WebElement element = driver.findElement(By.cssSelector("#droppableExample-tab-simple"));
        element.click();
        WebElement drgBox = driver.findElement(By.cssSelector("#draggable"));
        WebElement drpBox = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
        action.dragAndDrop(drgBox, drpBox).build().perform();

        element = driver.findElement(By.cssSelector("#droppableExample-tab-accept"));
        element.click();
        drpBox = driver.findElement(By.xpath("//div[@id='acceptDropContainer']//div[@id='droppable']"));
        drgBox = driver.findElement(By.cssSelector("#notAcceptable"));
        action.dragAndDrop(drgBox, drpBox).build().perform();
        if (driver.findElement(By.xpath("//div[@id='acceptDropContainer']//div[@id='droppable']")).getText().equals("Drop here")) {
            drgBox = driver.findElement(By.cssSelector("#acceptable"));
            action.dragAndDrop(drgBox, drpBox).build().perform();
        }

        element = driver.findElement(By.cssSelector("#droppableExample-tab-preventPropogation"));
        element.click();
        drgBox = driver.findElement(By.cssSelector("#dragBox"));
        drpBox = driver.findElement(By.cssSelector("#notGreedyInnerDropBox"));
        action.dragAndDrop(drgBox, drpBox).build().perform();
        js.executeScript("window.scrollBy(0,1000)");
        drgBox = driver.findElement(By.cssSelector("#dragBox"));
        drpBox = driver.findElement(By.cssSelector("#greedyDropBoxInner"));
        action.dragAndDrop(drgBox, drpBox).build().perform();
        Boolean nGreed =
        wait.until(ExpectedConditions.and(
                ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector("#notGreedyDropBox")), "Dropped!"),
                ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector("#greedyDropBox")), "Outer droppable")));

        element = driver.findElement(By.cssSelector("#droppableExample-tab-revertable"));
        element.click();
        drgBox = driver.findElement(By.cssSelector("#revertable"));
        drpBox = driver.findElement(By.xpath("//div[@id='revertableDropContainer']//div[@id='droppable']"));
        action.dragAndDrop(drgBox, drpBox).build().perform();

        drgBox = driver.findElement(By.cssSelector("#notRevertable"));
        drpBox = driver.findElement(By.xpath("//div[@id='revertableDropContainer']//div[@id='droppable']"));
        action.dragAndDrop(drgBox, drpBox).build().perform();

        driver.navigate().back();
    }

    private static void dragTest (WebDriver driver) {
        String url = "https://www.demoqa.com/dragabble";
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

        WebElement element = driver.findElement(By.cssSelector("#draggableExample-tab-simple"));
        element.click();
        element = driver.findElement(By.cssSelector("#dragBox"));
        action.dragAndDropBy(element, 100, 250).build().perform();

        element = driver.findElement(By.cssSelector("#draggableExample-tab-axisRestriction"));
        element.click();
        element = driver.findElement(By.cssSelector("#restrictedX"));
        action.dragAndDropBy(element, 100, 0).build().perform();
        element = driver.findElement(By.cssSelector("#restrictedY"));
        action.dragAndDropBy(element, 0, 100).build().perform();

        element = driver.findElement(By.cssSelector("#draggableExample-tab-containerRestriction"));
        element.click();
        element = driver.findElement(By.xpath("//div[@class='draggable ui-widget-content ui-draggable ui-draggable-handle']"));
        action.dragAndDropBy(element, 40, 10).build().perform();
        element = driver.findElement(By.xpath("//span[@class='ui-widget-header ui-draggable ui-draggable-handle']"));
        action.dragAndDropBy(element, 20, 50).build().perform();

        element = driver.findElement(By.cssSelector("#draggableExample-tab-cursorStyle"));
        element.click();
        element = driver.findElement(By.cssSelector("#cursorCenter"));
        action.dragAndDropBy(element, 100, 10).build().perform();
        element = driver.findElement(By.cssSelector("#cursorTopLeft"));
        action.dragAndDropBy(element, 175, 50).build().perform();
        element = driver.findElement(By.cssSelector("#cursorBottom"));
        action.dragAndDropBy(element, 20, 100).build().perform();

        driver.navigate().back();
    }
}
