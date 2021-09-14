import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ololo\\IdeaProjects\\ProjectMaven1\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/accounts/login/?source=auth_switcher");

       // MainPage mainPage = new MainPage(driver);
       //mainPage.register("ssemenuck", "12345679w", "Svetlana Semenyuk", "Semenyuk189@gmail.com");
        LogInPage logInPage = new LogInPage(driver);
        logInPage.logInProfil ("svsemenuck", "*********");


    }
}
