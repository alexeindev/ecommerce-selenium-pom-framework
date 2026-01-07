package ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTests {
    public static void main(String[] args) {

        //Frist test to open the browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationteststore.com");
        driver.manage().window().maximize();
        By singInNavLocator = By.id("customer_menu_top");
        WebElement singInNavElement = driver.findElement(singInNavLocator);
        singInNavElement.click();
        driver.quit();
    }
}
