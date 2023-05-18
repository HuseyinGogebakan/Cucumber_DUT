package Stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.List;

public class DataTabelstep {
    @Given("look below")
    public void lookBelow(DataTable table) {
        List<List<String>> data = table.asLists();

        for (List<String> eachrow : data) {
            for (String each : eachrow) {
                System.out.print(each+" : ");

            }
            System.out.println();
        }
    }
}

