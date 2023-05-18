package Stepdefinitions.Tasks;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.Driver;

import java.util.List;

public class Assigment6step {

String value ,selected;
    @When("check the option")
    public void checkTheOption() {
        Driver.getDriver().findElement(By.xpath("//input[@value='"+value+"']")).click();
        List<WebElement> elements_Checkbox = Driver.getDriver().findElements(By.xpath("//div[@id='checkbox-example']//input"));
        for (WebElement each: elements_Checkbox){
            if (each.isSelected()) {
                selected =each.getText();
                break;
            }
        }

    }



    @And("dropdown")
    public void dropdown() {

        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='dropdown-class-example']")));
        select.selectByIndex(1);
    }

    @And("Alert function")
    public void alertFunction() throws InterruptedException {
        Driver.getDriver().findElement(By.id("name")).sendKeys(selected);
        Driver.getDriver().findElement(By.id("alertbtn")).click();
        Thread.sleep(1000);
    }


    @Given("go to  qaclickacademy")
    public void goToQaclickacademy() {
        Driver.closeDriver();
        Driver.getDriver().get("https://rahulshettyacademy.com/AutomationPractice/");
    }

    @Given("Option is given as {string}")
    public void optionIsGivenAsOption(String option) {
        value = option.toLowerCase();
    }

    @Then("option is the selected one {string}")
    public void optionIsTheSelectedOneOption(String option) {
        Assert.assertEquals(option, selected,"something is wrong here!");
    }
}
