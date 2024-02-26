package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[contains(text(),'Bank Project')]")
    WebElement bankProject;

    @FindBy(xpath = "//input[@name='uid']")
    WebElement userIDPath;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordPath;

    @FindBy(xpath = "//input[@name='btnLogin']")
    WebElement loginButtonPath;

    @FindBy(xpath = "//marquee[@loop='slide']")
    WebElement welcomeTextSlide;

    public void navigateToBankProject(){
        bankProject.click();
    }

    public void enterValidUserName(){

        userIDPath.sendKeys("mng554366");
    }

    public void enterUserName(String userName){

        userIDPath.sendKeys(userName);
    }

    public void enterValidPassword(){

        passwordPath.sendKeys("gebUjur");
    }

    public void enterPassword(String password){

        passwordPath.sendKeys(password);
    }

    public void clickOnLogin(){

        loginButtonPath.click();
    }

    public void userOnManagersPage(){
        String welcomeText = welcomeTextSlide.getText();
        if(welcomeText.equalsIgnoreCase("Welcome To Manager's Page of GTPL Bank")){
            System.out.println("User successfully logged in");
        }
        else{
            System.out.println("Login failed");
        }
    }
}
