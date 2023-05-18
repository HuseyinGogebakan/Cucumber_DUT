package Stepdefinitions;

import Pages.OrangePage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.Driver;

public class Orange {
    @Given("orange website")
    public void orangeWebsite() {
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @When("enter username {string}")
    public void enterUsername(String arg0) {
        Driver.getDriver().findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(arg0);
    }

    @And("enter password {string}")
    public void enterPassword(String arg0) {
        Driver.getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(arg0);
        Driver.getDriver().findElement(By.xpath("//input[@placeholder='Password']")).submit();
    }

    @Then("verify the title")
    public void verifyTheTitle() {
        Assert.assertFalse(Driver.getDriver().getCurrentUrl().contains("login"));
    }


}
