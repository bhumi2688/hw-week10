package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxTest {
    public static void main(String[] args) {
        String baseurl = "http://the-internet.herokuapp.com/login"; //storing base url
        System.setProperty("webdriver.firefox.driver", "src/drivers/geckodriver.exe"); //setting webdriver
        WebDriver driver = new FirefoxDriver(); //creating object of firefox driver
        driver.get(baseurl); //method to invoke url
        driver.manage().window().maximize(); //maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //timeout session
        String title = driver.getTitle(); //storing title
        System.out.println("Title of the page :" + title); //printing title of website in console
        String url = driver.getCurrentUrl(); //current url
        System.out.println("Print current url :" + url); //printing url
        String source = driver.getPageSource(); //storing the source
        System.out.println("page source :" + source); //printing source
        WebElement userNameField = driver.findElement(By.id("username")); //storing email field
        userNameField.sendKeys("tomsmith"); //sendkeys to username field
        WebElement passwordNameField = driver.findElement(By.id("password")); //storing password field
        passwordNameField.sendKeys("SuperSecretPassword!"); //sendkeys to password field
        driver.close(); //closing browser
    }
}
