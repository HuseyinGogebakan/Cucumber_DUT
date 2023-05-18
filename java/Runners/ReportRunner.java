package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = "Stepdefinitions",
        plugin = {
                "html:reports/report.html",
                "json:reports/report.json",
                "junit:reports/report.xml"
        }
)
public class ReportRunner {


}
