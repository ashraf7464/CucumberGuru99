package utilities;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;


import java.io.IOException;

public class Hooks {

    @Before
    public void driverInitialization() throws IOException, InterruptedException {
        BaseClass.setDriver();
    }

//    @AfterMethod
//    public static void takeScreenshotOnFailure(ITestResult result) throws IOException {
//        if(result.getStatus()==ITestResult.FAILURE){
//            try{
//                CommonUtility.screenshot(result.getName()+"Failed");
//            }
//            catch(Exception e){
//                e.printStackTrace();
//
//            }
//        }
//
//    }

    @After
    public void tearDown(){

        BaseClass.getDriver().close();
    }
}
