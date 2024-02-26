package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {


    private static WebDriver driver;

    public BaseClass() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\conne\\IdeaProjects\\CucumberGuru99\\src\\test\\java\\config\\env.properties");

        Properties prop = new Properties();
        prop.load(fis);

        String myURL = prop.getProperty("url");
        System.out.println(myURL);
        String myBrowser = prop.getProperty("browser");
        System.out.println(myBrowser);

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\conne\\Downloads\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();

//        if(myBrowser.equalsIgnoreCase("chrome")){
//            //WebDriverManager.chromedriver().setup();
//            driver = new ChromeDriver();
//        } else if(myBrowser.equalsIgnoreCase("Edge")){
//            WebDriverManager.edgedriver().setup();
//            driver = new EdgeDriver();
//        } else if(myBrowser.equalsIgnoreCase("firefox")){
//            WebDriverManager.firefoxdriver().setup();
//            driver = new FirefoxDriver();
//        } else if(myBrowser.equalsIgnoreCase("safari")){
//            WebDriverManager.safaridriver().setup();
//            driver = new SafariDriver();
//        }

        driver.manage().window().maximize();
        driver.navigate().to(myURL);

        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


    }

    public static WebDriver getDriver() {
        return driver;
    }


    public static void setDriver() throws IOException, InterruptedException {
        BaseClass obj = new BaseClass();
    }



}
