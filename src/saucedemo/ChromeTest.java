package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) {
        String baseurl = "https://www.saucedemo.com/"; //storing base url
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe"); //setting webdriver
        WebDriver driver = new ChromeDriver();//creating object of chrome driver
        driver.get(baseurl); //method to invoke url
        driver.manage().window().maximize(); //maximizind window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //timeout session
        String title = driver.getTitle(); //storing title
        System.out.println("Title of the page :" + title); //printing title of the website in console
        String url = driver.getCurrentUrl(); //current url
        System.out.println("Print the url :" + url); //printing url
        String source = driver.getPageSource(); //storing page source
        System.out.println("Page source :" + source); //printing the page source
        WebElement usernameField = driver.findElement(By.name("user-name")); //storing username field
        usernameField.sendKeys("locked_out_user"); //sendkeys to username field
        WebElement passwordFieldName = driver.findElement(By.name("password")); //storing password field
        passwordFieldName.sendKeys("secret_sauce"); //sendkeys to password field
        driver.close(); //closing browser

    }
}
