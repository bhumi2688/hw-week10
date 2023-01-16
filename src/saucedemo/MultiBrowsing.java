package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowsing {
    static String browser = "edge"; //
    static String baseurl = "https://www.saucedemo.com/"; //storing base url
    static WebDriver driver; //declaring webdriver as static

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome,driver" , "src/drivers/chromedriver.exe"); //storing webdriver
            driver = new ChromeDriver(); //object of chrome driver
        }else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.firefox.driver", "src/drivers/geckodriver.exe"); //storing webdriver
            driver = new FirefoxDriver(); //object of firefox webdriver
        }else if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver" ,"src/drivers/msedgedriver.exe"); //storing webdriver
            driver = new EdgeDriver(); //object of edge driver
        }else{
            System.out.println("Not valid browser");
        }
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
