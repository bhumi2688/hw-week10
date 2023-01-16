package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowsing {
    static String browser = "firefox";  //browser
    static String baseurl = "https://demo.nopcommerce.com/"; //storing baseurl
    static WebDriver driver ; //declared webdriver as static

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver" ,"src/drivers/chromedriver.exe"); //setting webdriver
            driver = new ChromeDriver(); //obj of chrome driver
        }else if(browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.firefox.driver" ,"src/drivers/geckodriver.exe"); //setting webdriver
            driver = new FirefoxDriver(); //obj of firefox driver
        }else if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","src/drivers/msedgedriver.exe"); //setting webdriver
            driver = new EdgeDriver(); //creating obj of msedge driver
        }else{
            System.out.println("Not valid browser");  //print if any else if condition are not true
        }
        driver.get(baseurl); //method to invoke baseurl
        driver.manage().window().maximize(); //maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //timeout session
        String title = driver.getTitle(); //storing title
        System.out.println("Title of the page :" + title); //printing title of website in console
        String url = driver.getCurrentUrl(); //storing current url
        System.out.println("Print url :" + url); //printing current url
        String source = driver.getPageSource(); //storing pagesource
        System.out.println("Print source :" + source); //print page source
        driver.findElement(By.className("ico-login")).click(); //clicking login link
        WebElement emailIdField = driver.findElement(By.id("Email")); //storing email field
        emailIdField.sendKeys("angel.patel@gmail.com"); //sendkeys to email field
        WebElement passwordField = driver.findElement(By.id("Password")); //storing password field
        passwordField.sendKeys("angel123456"); //sendkeys to password field
        driver.close(); //closing browser
    }

}
