import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parents  {
    public static WebDriverWait wait;
    public void Parent(){
        wait = new WebDriverWait(BaseDriver.driver, Duration.ofSeconds(20));
    }
    public void sendKeys(WebElement element,String value){
        element.clear();
        element.sendKeys(value);
    }
    public void clickFunction(WebElement element) {
        element.click();
    }


    public void verifyContainsText(WebElement element, String msg) {
        Assert.assertTrue(element.getText().contains(msg));
    }
    public void hoverFunction(WebElement element) {
        Actions actions = new Actions(BaseDriver.driver);
        Action action = actions.moveToElement(element).build();
        action.perform();
    }

}
