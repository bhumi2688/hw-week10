package ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) {
        String baseurl = "https://courses.ultimateqa.com/users/sign_in";//storing base url
        System.setProperty("webdriver.edge.driver","src/drivers/msedgedriver.exe"); //setting webdriver
        WebDriver driver = new EdgeDriver(); //creating object of edge driver
        driver.get(baseurl);//method to invoke url
        driver.manage().window().maximize(); //maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //timeout session
        String title = driver.getTitle();  //storing title
        System.out.println("Ttitle of the page :" + title); //printing title of the website in console
        String url = driver.getCurrentUrl(); //storing url
        System.out.println("Print the current url :" + url); //print the current url
        String source = driver.getPageSource(); //storing page source
        System.out.println("Page source :" + source); //printing the page source
        WebElement emailFieldname = driver.findElement(By.name("user[email]")); //storing email field
        emailFieldname.sendKeys("Angel.patel@gmail.com"); //sendkey to email field
        WebElement passwordFieldname = driver.findElement(By.name("user[password]")); //storing password field
        passwordFieldname.sendKeys("angel123456");  //sendkey to password field
        driver.close(); //closing browser

    }
}
