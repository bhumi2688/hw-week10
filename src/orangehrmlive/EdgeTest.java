package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) {
        String baseurl = "https://opensource-demo.orangehrmlive.com/"; //storing base url
        System.setProperty("webdriver.edge.driver","src/drivers/msedgedriver.exe"); // setting webdriver
        WebDriver driver = new EdgeDriver(); //creating object of edge driver
        driver.get(baseurl); //method to invoke url
        driver.manage().window().maximize(); //maximizing the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //timeout session
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
