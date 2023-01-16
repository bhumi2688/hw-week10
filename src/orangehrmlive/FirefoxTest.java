package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxTest {
    public static void main(String[] args) {
        String baseurl = "https://opensource-demo.orangehrmlive.com/"; // storing base url
        System.setProperty("webdriver.firefox.driver","src/drivers/geckodriver.exe"); //setting webdriver
        WebDriver driver = new FirefoxDriver(); //creating object of firefox driver
        driver.get(baseurl); //method to invoke url
        driver.manage().window().maximize(); //maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //timeout session
        String title = driver.getTitle(); //storing title
        System.out.println("Title of the page :" + title); //printing title of website in console
        String url = driver.getCurrentUrl(); //current url
        String source = driver.getPageSource(); //store the page source
        System.out.println("Page source : " + source); //printing the source
        WebElement userNameField = driver.findElement(By.name("username")); //storing username field
        userNameField.sendKeys("Admin"); //sendkeys to email field
        WebElement passwordField = driver.findElement(By.name("password")); //storing password name field
        passwordField.sendKeys("admin123"); //sendkeys to password field
        driver.close(); //closing browser
    }
}
