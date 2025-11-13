package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _05_DataTableOrnekSteps {

    @When("write username {string}")
    public void writeUsername(String username) {
        System.out.println(username);
    }

    @And("write username and password {string} and {string}")
    public void writeUsernameAndPasswordAnd(String username, String password) {

        System.out.println(username+" "+password);
    }


    @And("write username as Datatable")
    public void writeUsernameAsDatatable(DataTable userlar) {
        List<String> listUsers= userlar.asList();
        for (String u: listUsers)
            System.out.println(u);
    }

    @And("write username and password  as Datatable")
    public void writeUsernameAndPasswordAsDatatable(DataTable userPass) {
        List<List<String>> listUserPass= userPass.asLists();

        for (List<String> li: listUserPass)
            System.out.println(li.get(0)+" "+li.get(1));

    }
}
