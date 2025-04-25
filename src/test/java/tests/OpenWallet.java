package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenWallet extends BaseTest {

    @Test(description = "Verify something else")
    public void anotherTest() throws InterruptedException {
        WebElement iHaveAWallet = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='I already have a wallet']")));
        Assert.assertTrue(iHaveAWallet.isDisplayed(), "'I have a wallet' text is not displayed");
        iHaveAWallet.click();

        WebElement zeroButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='0']")));
        for (int i = 0; i < 12; i++) {
            zeroButton.click();
        }

        WebElement secretPhrase = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Secret phrase']")));
        Assert.assertTrue(secretPhrase.isDisplayed(), "'Secret phrase' text is not displayed");
    }
}
