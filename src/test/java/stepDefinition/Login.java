package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utilities.BaseClass;

public class Login {

    LoginPage loginPage;


    @Given("user navigates to Bank Project")
    public void user_navigates_to_bank_project() {
        loginPage = new LoginPage(BaseClass.getDriver());
        loginPage.navigateToBankProject();

    }
    @When("user enters valid userName")
    public void user_enters_valid_username() {

        loginPage.enterValidUserName();
    }
    @And("user enters valid password")
    public void user_enters_valid_password() {

        loginPage.enterValidPassword();
    }
    @And("user click on login button")
    public void user_click_on_login_button() {

        loginPage.clickOnLogin();
    }
    @Then("user successfully logged in")
    public void user_successfully_logged_in() {

        loginPage.userOnManagersPage();
    }

    @When("user enters {string}")
    public void user_enters_username(String userName) {

        loginPage.enterUserName(userName);
    }

    @And("user enter {string}")
    public void user_enter_password(String password) {

        loginPage.enterPassword(password);
    }

    @Then("user fails to log in")
    public void user_fails_to_log_in() {

        loginPage.userOnManagersPage();
    }
}
