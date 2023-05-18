package Stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import utils.Driver;

import java.util.List;

public class OrangeDatatable {
    @Given("Orange page")
    public void orangePage() {
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("enter credentials")
    public void enterCredentials(DataTable table) {
        List<List<String>> list = table.asLists();
      String username =  list.get(0).get(0);
      String password =  list.get(0).get(1);
        Driver.getDriver().findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
        Driver.getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
        Driver.getDriver().findElement(By.xpath("//input[@placeholder='Password']")).submit();
    }

    @When("user credentials with errors verify")
    public void userCredentialsWithErrorsVerify(DataTable table) {


    }
}
