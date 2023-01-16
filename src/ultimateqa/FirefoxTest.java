package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxTest {
    public static void main(String[] args) {
        String baseurl = "https://courses.ultimateqa.com/users/sign_in"; //storing base url
        System.setProperty("webdriver.firefox.driver","src/drivers/geckodriver.exe"); //setting webdriver
        WebDriver driver = new FirefoxDriver(); //creating object of firefox driver
        driver.get(baseurl); //method to invok url
        driver.manage().window().maximize(); //maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //timeout session
        String title = driver.getTitle(); //storing title
        System.out.println("Print the title of page :" + title); //printing title of website in console
        String url = driver.getCurrentUrl(); //storing current url
        System.out.println("Print current url :" + url); //print cutrrent url
        String source = driver.getPageSource(); //storing source
        System.out.println("Print source :" + source); //printing page source
        WebElement emailFieldName = driver.findElement(By.name("user[email]")); //storing email field
        emailFieldName.sendKeys("Angel.patel@gmail.com"); //sendkey to email field
        WebElement passwordFieldname = driver.findElement(By.name("user[password]")); //storing password field
        passwordFieldname.sendKeys("angel123456"); //sendkey to password field
        driver.close(); //closing browser
    }
}
