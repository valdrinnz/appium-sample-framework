package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DriverUtils;

import java.time.Duration;

public class BaseTest {

    protected WebDriverWait wait; // 👈 Shared wait for all tests

    @BeforeMethod
    public void setUp() {
        DriverUtils.initializeDriver();
        wait = new WebDriverWait(DriverUtils.getDriver(), Duration.ofSeconds(10)); // 👈 Init explicit wait here
        WebElement okButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='OK']")));
        okButton.click();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        DriverUtils.quitDriver();
    }
}



