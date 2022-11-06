package day6;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class FirstSeleniumTest {
   private final By SEE_THE_LIST_BTN = By.xpath(".//div[@class='dc-ui inline-block' and text()='See the list']");

   @Test
    public void openHomePageCheck() {
       System.setProperty("webdriver.chrome.driver", "C://chromedriver/chromedriver.exe");
       WebDriver browser = new ChromeDriver();
       browser.manage().window().maximize();
       browser.get("http://www.discovercars.com/");

      WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));

      wait.until(ExpectedConditions.elementToBeClickable(SEE_THE_LIST_BTN));
       browser.findElement(SEE_THE_LIST_BTN).click();
   }
}
