package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) {
        String baseurl = "https://www.saucedemo.com/"; //storing base url
        System.setProperty("webdriver.edge.driver" ,"src/drivers/msedgedriver.exe"); // setting webdriver
        WebDriver driver = new EdgeDriver(); //creating object of chrome driver
        driver.get(baseurl); //method to invoke url
        driver.manage().window().maximize(); //maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //timeout session
        String title = driver.getTitle(); //stroing title
        System.out.println("Title of he page :" + title); //printing the title of website in console
        String source = driver.getPageSource(); //storing source
        System.out.println("print source :" + source);
        WebElement usernameField = driver.findElement(By.name("user-name")); //storing username field value
        usernameField.sendKeys("locked_out_user"); //sendkeys to email field
        WebElement passwordField = driver.findElement(By.name("password")); //storing password name field
        passwordField.sendKeys("secret_sauce"); //sendkeys to password field
        driver.close(); //closing browser
    }
}
