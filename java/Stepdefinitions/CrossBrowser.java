package Stepdefinitions;

import Hooks.Hooks;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import utils.Driver;

import java.util.Scanner;

public class CrossBrowser extends Hooks {




    @Given("start firefox browser according to annot")
    public void startFirefoxBrowserAccordingToAnnot() {
        driver.get("https://www.linkedin.com/");
    }

    @Given("start chrome browser according to annot")
    public void startChromeBrowserAccordingToAnnot() {
        driver.get("https://www.linkedin.com/");
    }
}
