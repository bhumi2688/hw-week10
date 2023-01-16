package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowsing {
    static String browser ="Chrome";  //storing browser
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/"; //storing base url
    static WebDriver driver; //decalred webdriver as static

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.firefox.driver" ,"src/drivers/geckodriver.exe"); //storing webdriver
            driver = new FirefoxDriver(); //obj of driver
        }else if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe"); //storing webdriver
            driver = new ChromeDriver(); //object of chrome driver
        }else if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver" ,"src/drivers/msedgedriver.exe"); //storing webdriver
            driver = new EdgeDriver(); //object of edge driver
        }else {
            System.out.println("Not valid browser");
        }
        driver.get(baseUrl); //method to invoke url
        driver.manage().window().maximize(); //maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //timeout session
        String title = driver.getTitle(); //storing title
        System.out.println("Title of the page :" + title); //printing title of website in console
        String url = driver.getCurrentUrl(); //current url
        System.out.println("Print current url :" + url); //print url
        String source = driver.getPageSource(); //store the page source
        System.out.println("Page source : " + source); //printing the source
        WebElement userNameField = driver.findElement(By.name("username")); // storing username field
        userNameField.sendKeys("Admin"); //sendkeys to username field
        WebElement passwordField = driver.findElement(By.name("password")); //storing password field
        passwordField.sendKeys("admin123"); //sendkeys to password field
        driver.close(); //closing browser


    }
}
