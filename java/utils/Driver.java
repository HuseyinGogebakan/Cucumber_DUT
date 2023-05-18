package utils;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {


    private static WebDriver driver;
    private static Actions actions;


    public static WebDriver getDriver() {

        if (driver == null) {


            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();


            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        return driver;
    }



    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static String getTitle() {
        return driver.getTitle();
    }

    public static Actions getActions() {
        actions = new Actions(driver);
        return actions;
    }

}