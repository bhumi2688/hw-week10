package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) {
        String baseurl = "http://the-internet.herokuapp.com/login"; // storing base url
        System.setProperty("webdriver.chrome.drive","src/drivers/chromedriver.exe"); //settng webdriver
        WebDriver driver = new ChromeDriver(); //creating object of chrome driver
        driver.get(baseurl);
        driver.manage().window().maximize(); //maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //timeout session
        String title = driver.getTitle(); //storing title
        System.out.println("Title of page : " + title); //printing the title of website in console
        String url = driver.getCurrentUrl(); //current url
        System.out.println("Print the url :" + url); //printing the url
        String source = driver.getPageSource(); //storing source
        System.out.println("Page source :" + source); //printing source page
        WebElement userNameField = driver.findElement(By.id("username")); //storing username field
        userNameField.sendKeys("tomsmith"); //sendkeys to username field
        WebElement passwordField = driver.findElement(By.id("password")); //storing password field
        passwordField.sendKeys("SuperSecretPassword!"); //sendkeys to password field
        driver.close(); //closing browser
    }
}
