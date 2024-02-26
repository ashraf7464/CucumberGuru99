package utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;

public class CommonUtility extends BaseClass{

    static JavascriptExecutor js;
    static TakesScreenshot ss;

    public CommonUtility() throws InterruptedException, IOException {
    }


    public static void screenshot(String fileName) throws IOException{
        //String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(Calendar.getInstance().getTime());
        ss=(TakesScreenshot) BaseClass.getDriver();
        File memoryLocation = ss.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(memoryLocation, new File("C:\\Users\\conne\\IdeaProjects\\CucumberGuru99\\src\\test\\" +
                "screenshot"+fileName+".png"));

    }

    public void scrollHeight() {
        js = (JavascriptExecutor) BaseClass.getDriver();
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

    }

    public void scrollByNumber(int horizontalScroll, int verticalScroll){
        js.executeScript("window.scrollBy("+horizontalScroll+","+verticalScroll+")");

    }

    public void scrollHeight(WebElement element){
        js.executeScript("arguments[0].scrollIntoView();",element);

    }

    public void elementToBeClickable(WebDriver driver, int waitTime, WebElement element){
        WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), waitTime);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


}
