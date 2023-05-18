package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/FeatureTasks/Assignment6.feature"},
        glue = {"Stepdefinitions","Hooks"},
        plugin = {"pretty","html:reports/reports_12.html"}
)
public class RunnerRahul {
}
