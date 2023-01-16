package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) {
        String baseurl = "https://demo.nopcommerce.com/";  //storing base url
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe"); //setting web driver
        WebDriver driver = new ChromeDriver(); //creating object of chrome driver
        driver.get(baseurl); //method to invoke url
        driver.manage().window().maximize(); //maximixing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //timeout session
        String title = driver.getTitle(); //storing title
        System.out.println("Title of page :" + title); //printing title of website in console
        String url = driver.getCurrentUrl(); //current url
        String source = driver.getPageSource(); //storing source
        System.out.println("page source :" + source); //printing source
        driver.findElement(By.className("ico-login")).click(); //clicking login link
        WebElement emailIdField = driver.findElement(By.id("Email")); //storing email field
        emailIdField.sendKeys("angel.patel@gmail.com"); //sendkeys to email field
        WebElement passwordField = driver.findElement(By.id("Password")); //storing password field
        passwordField.sendKeys("angel123456"); //sendkeys to password field
        driver.close(); //closing browser






    }

    }
