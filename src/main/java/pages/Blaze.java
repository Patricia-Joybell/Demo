package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Learning.BaseTest;

public class Blaze extends BaseTest {
    JavascriptExecutor executor;
    WebDriverWait wait;
    Alert alt;

    public Blaze(WebDriver driver) {
        this.driver = driver;
        this.executor = (JavascriptExecutor) this.driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Correct for Selenium 4.x
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Monitors']")
    WebElement monitor;
    @FindBy(xpath = "//a[text()='Apple monitor 24']")
    WebElement Apple;
    @FindBy(xpath = "//a[text()='Add to cart']")
    WebElement Addtocart;

    public void homePage() {
        monitor.click();
    }

    public void scrollTheWindow() {
        executor.executeScript("window.scrollBy(0,1000)");
    }

    public void productListPage() {
        Apple.click();
    }

    public void productDetailsPage() {
        Addtocart.click();
    }

    public void waitTillTheAlertPresent() {
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public void accessAlert() {
        waitTillTheAlertPresent();
        alt = driver.switchTo().alert(); // Initialize alert only when it's present
        alt.accept();
    }
}
