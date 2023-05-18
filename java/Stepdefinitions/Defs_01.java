package Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Defs_01 {
    int int1,int2 , sum;
    @Given("We have 3")
    public void weHave3() {
        int1 = 3;
    }
    @Given("We have 5")
    public void weHave5() {
        int2 = 5;
    }

    @When("to calculate those two values")
    public void toCalculateThoseTwoValues() {
        sum = int1+int2;
    }

    @Then("we get 8")
    public void weGet() {
        Assert.assertEquals(8,sum);
    }
}
