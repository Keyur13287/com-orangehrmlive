package Project_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTestComOrangeHrm {
    static String baseUrl="https://opensource-demo.orangehrmlive.com/";

    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        //Open the url
        driver.get(baseUrl);
        //Maximize the browser automatically
        driver.manage().window().maximize();
        // waiting time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Title of the page
        System.out.println("Title of the page  : " + driver.getTitle());//driver.getTitle();
        //Print the page source
        System.out.println("The page source : " + driver.getPageSource());
        //click on the forgot password link
        driver.findElement(By.className("orangehrm-login-forgot-header")).click();
        //Print current url
        System.out.println("The current url : " + driver.getCurrentUrl());
        //Navigate back to page


        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        //Refresh page
        driver.navigate().refresh();

        //Enter the email and password
        WebElement username=driver.findElement(By.name("username"));
        username.sendKeys("Admin");
        WebElement pass= driver.findElement(By.name("password"));
        pass.sendKeys("admin123" );
        //login
        driver.findElement(By.className("orangehrm-login-button")).click();
        //close the browser
        driver.quit();
    }

}
