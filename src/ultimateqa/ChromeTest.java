package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) {
        String baseurl ="https://courses.ultimateqa.com/users/sign_in"; //storing base url
        System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe"); // setting webdriver
        WebDriver driver = new ChromeDriver(); //creating object of chrome driver
        driver.get(baseurl); //method to invoke base url
        driver.manage().window().maximize(); //maximizing window
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
