package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) {
        String baseurl = "https://opensource-demo.orangehrmlive.com/";  //storing base url
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe"); //setting webdriver
        WebDriver driver = new ChromeDriver(); //creating object of chrome driver
        driver.get(baseurl); //method to invoke url
        driver.manage().window().maximize(); //maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //timeout session
        String title = driver.getTitle(); //storing title
        System.out.println("Title of the page :" + title); //printing the title of the website in console
        String url = driver.getCurrentUrl();  //current url
        System.out.println("Print current url :" + url); //printing current url
        String source = driver.getPageSource(); //storing source
        System.out.println("Print source :" + source); //printing the sourcepage
        WebElement userNameField = driver.findElement(By.name("username")); // storing username field
        userNameField.sendKeys("Admin"); //sendkeys to username field
        WebElement passwordField = driver.findElement(By.name("password")); //storing password field
        passwordField.sendKeys("admin123"); //sendkeys to password field
        driver.close(); //closing browser





    }
}
