package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxTest {
    public static void main(String[] args) {
        String baseurl = "https://www.saucedemo.com/"; //storing base url
        System.setProperty("webdriver.firefox.driver","src/drivers/geckodriver.exe"); //setting webdriver
        WebDriver driver = new FirefoxDriver(); //creating object of firefox driver
        driver.get(baseurl); //method to invoke base url
        driver.manage().window().maximize(); //maximizing windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //timeout session
        String title = driver.getTitle(); //storing title
        System.out.println("Title of the page :" + title); //print title of website in console
        String url = driver.getCurrentUrl(); //storing url
        System.out.println("Print current url :" + url); //print current url
        String source = driver.getPageSource(); // storing source
        System.out.println("page source :" + source); //print page source
        WebElement usernameField = driver.findElement(By.name("user-name")); //storing username field
        usernameField.sendKeys("locked_out_user"); //sendkeys to username field
        WebElement passwordNameField = driver.findElement(By.name("password")); //storing password field
        passwordNameField.sendKeys("secret_sauce"); //sendkeys to password field
        driver.close(); //closing browser
    }
}
