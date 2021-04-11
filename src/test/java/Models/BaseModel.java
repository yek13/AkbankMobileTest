package Models;

import driver.Driver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BaseModel extends Driver {
    WebDriverWait wait = new WebDriverWait(appiumDriver, 20);

    public WebElement findElement(By by) {
        return appiumDriver.findElement(by);
    }

    public void sendKeys(By by, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        findElement(by).sendKeys(text);
    }

    public void clickElement(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }

    protected void clickElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public String getText(By by) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return findElement(by).getText();
    }
    public List<MobileElement> findElements(By by){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return appiumDriver.findElements(by);
    }

    public boolean isElementVisible(By by) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        } catch (Exception var4) {
            return false;
        }
    }

}
