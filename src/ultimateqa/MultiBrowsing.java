package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowsing {
    static String browser = "Edge"; //declared browser static
    static String baseUrl ="https://courses.ultimateqa.com/users/sign_in"; //storing webdriver
    static WebDriver driver; //declared webdriver as static

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe"); //setting webdriver
            driver = new ChromeDriver(); //object of chrome driver
        }else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.firefox.driver","src/drivers/geckodriver.exe"); //setting webdriver
            driver = new FirefoxDriver(); //object of firefox driver
        }else if(browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver", "src/drivers/msedgedriver.exe"); //setting edge driver
            driver = new EdgeDriver(); //object of edge driver
        }else {
            System.out.println("Not valid browser");
        }
        driver.get(baseUrl);//method to invoke baseurl
        driver.manage().window().maximize(); //maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //timeout session
        String title = driver.getTitle(); //storing title
        System.out.println("Title of the page :" + title);//printing title of website in console
        String url = driver.getCurrentUrl(); //store url
        System.out.println("Print url :" + url); //printing current url
        String source = driver.getPageSource(); //storing source
        System.out.println("Print page source :" + source); //printing page source
        WebElement emailIdField = driver.findElement(By.id("user[email]")); //storing emailId field
        emailIdField.sendKeys("angel.patel@gmail.com"); //sendkey to email field
        WebElement passwordField = driver.findElement(By.name("user[password]"));//storing password field
        passwordField.sendKeys("angel123456"); //sendkey to password field
        driver.close(); //closing browser

    }
}
