import jdk.nashorn.internal.codegen.ApplySpecialization;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static final org.apache.logging.log4j.Logger logger4j= LogManager.getLogger();

    public static WebDriver driver; // SingletonDriver method
    public static WebDriverWait wait;
    @BeforeClass
    public void baslangicIslemleri(){
        Logger logger= Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


    }
    @AfterClass
    public void bitisIslemleri(){ // tearDown
        MyFunction.wait(5);
        driver.quit();
    }
}
