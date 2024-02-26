package stepDefinition;

import io.cucumber.java.en.Given;
import pageObjects.LoginPage;
import utilities.BaseClass;

public class BackgroundSteps {

    @Given("user should be on demo Guru site")
    public void user_should_be_on_demo_guru_site() {
        BaseClass.getDriver().get("https://demo.guru99.com/");
    }



}
