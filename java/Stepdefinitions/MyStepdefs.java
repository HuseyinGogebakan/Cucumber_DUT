package Stepdefinitions;

import Pages.GoogleHomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import utils.Driver;

public class MyStepdefs {

    @Given("user at google.com")
    public void userAtGoogleCom() throws InterruptedException {

        Driver.getDriver().get("https://www.google.com/");
        Thread.sleep(2000);

    }
    @When("Enters amazon on search tab")
    public void entersAmazonOnSearchTab() {
        GoogleHomePage gl = new GoogleHomePage();
        gl.searchfor("amazon");
    }

    @And("execute to search")
    public void executeToSearch() {
        GoogleHomePage gl = new GoogleHomePage();
        gl.click();
    }

    @Then("titel amazon")
    public void titelAmazon() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("amazon"));
        Driver.closeDriver();
    }

    @When("Enters linkedin on search tab")
    public void entersLinkedinOnSearchTab() {
        GoogleHomePage gl = new GoogleHomePage();
        gl.searchfor("linkedin");
    }

    @And("execute search")
    public void executeSearch() {
        GoogleHomePage gl = new GoogleHomePage();
        gl.click();

    }

    @Then("titel linkedin")
    public void titelLinkedin() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("linkedin"));
        Driver.closeDriver();
    }


}
