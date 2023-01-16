package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) {
        String baseurl = "http://the-internet.herokuapp.com/login"; //storing base url
        System.setProperty("webdriver.edge.driver", "src/drivers/msedgedriver.exe"); //setting webdriver
        WebDriver driver = new EdgeDriver(); //creating object of edge driver
        driver.get(baseurl); //method to invoke url
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
