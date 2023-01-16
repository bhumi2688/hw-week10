package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowsing {
    static String browser = "edge"; //storing browser
    static String baseurl = "http://the-internet.herokuapp.com/login"; //storing baseurl
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver" , "src/drivers/chromedriver.exe"); //setting webdriver
            driver = new ChromeDriver(); //obj of chrome driver
        }else if(browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.firefox.driver" ,"src/drivers/geckodriver.exe"); //setting webdriver
            driver = new FirefoxDriver(); //obj of firefox webdriver
        }else if(browser.equalsIgnoreCase("Edge")){
            System.setProperty("webdriver.edge.driver", "src/drivers/msedgedriver.exe"); //setting webdriver
            driver = new EdgeDriver(); //obj of edge driver
        }else{
            System.out.println("Not valid browser");
        }
        driver.get(baseurl); //method to invoke baseurl
        driver.manage().window().maximize(); //maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //timeout session
        String title = driver.getTitle(); //String title
        System.out.println("Title of the page :" + title); //printing title of the website in console
        String url = driver.getCurrentUrl(); //current url
        String source = driver.getPageSource(); //storing source
        System.out.println("Page source :" + source); //printing source
        WebElement userNameField = driver.findElement(By.id("username")); //storing username field
        userNameField.sendKeys("tomsmith"); //sendkeys to username field
        WebElement passwordField = driver.findElement(By.id("password")); //storing password field
        passwordField.sendKeys("SuperSecretPassword!"); //sendkeys to password field
        driver.close(); //closing browser
    }

}
