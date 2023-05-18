package Hooks;

import io.cucumber.java.Scenario;
import io.cucumber.java.sl.In;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.input.BOMInputStream;
import org.checkerframework.framework.qual.AnnotatedFor;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.Driver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Hooks {

   public  WebDriver driver;

    @Before
    public void setup(Scenario scenario){
     if (scenario.getSourceTagNames().contains("@chrome")){
         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
     }else {
         WebDriverManager.firefoxdriver().setup();
         driver = new FirefoxDriver();
     }

    }
    @After
    public void  teardown() throws IOException {
        System.out.println("After has started");
        //close driver
        TakesScreenshot ss = (TakesScreenshot) Driver.getDriver();
        File screenshot = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,new File("src/test/java/Screenshots"));
        //ss
        Driver.closeDriver();

    }
}
