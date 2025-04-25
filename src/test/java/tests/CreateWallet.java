package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateWallet extends BaseTest {

    @Test(description = "Verify creation of new Wallet")
    public void verifyCreationOfNewWallet() {
        WebElement createWalletButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Create new wallet']")));
        createWalletButton.click();

        WebElement zeroButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='0']")));
        for (int i = 0; i < 12; i++) {
            zeroButton.click();
        }

        WebElement walletReadyText = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[contains(@text, 'Brilliant')]")));
        Assert.assertTrue(walletReadyText.isDisplayed(), "Wallet ready message is not displayed");

        WebElement buyCryptoText = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Buy Crypto']")));
        Assert.assertTrue(buyCryptoText.isDisplayed(), "'Buy Crypto' text is not displayed");

        WebElement depositCryptoText = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Deposit Crypto']")));
        Assert.assertTrue(depositCryptoText.isDisplayed(), "'Deposit Crypto' text is not displayed");
    }
}
