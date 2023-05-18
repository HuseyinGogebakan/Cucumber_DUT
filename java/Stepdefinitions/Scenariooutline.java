package Stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Scenariooutline {
    int a ,b,sum;
    @Given("Number1 {int}")
    public void number1Number(int arg0) {
         a = arg0;
    }

    @And("Number2 {int}")
    public void number2Number(int arg0) {
        b = arg0;
    }

    @When("sum of the two number")
    public void sumOfTheTwoNumber() {
        sum = a+b;
    }

    @Then("result is {int}")
    public void resultIsSum(int arg0) {
        Assert.assertEquals(sum,arg0);
    }
}
