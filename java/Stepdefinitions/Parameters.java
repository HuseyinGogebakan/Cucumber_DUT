package Stepdefinitions;

import io.cucumber.java.en.Given;
import org.checkerframework.checker.lock.qual.GuardedBy;

public class Parameters {





    @Given("Class with parameter  {string}")
    public void classWithParameter(String arg0)
    {
        System.out.println(arg0+" ... ");
    }
}
