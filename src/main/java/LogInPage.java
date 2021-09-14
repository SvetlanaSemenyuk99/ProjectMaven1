import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
    private WebDriver driver;

    public LogInPage (WebDriver driver){
        this.driver = driver;
    }

    private By userName = By.xpath("//input [@aria-label= \"Телефон, имя пользователя или эл. адрес\"]");
    private By password  = By.xpath("//input [@aria-label= \"Пароль\"]");
    private By buttonSignIn = By.xpath("//div[text()=\"Войти\"]");
    private By heading = By.xpath("//h1[text()='Instagram']");
    private By error = By.xpath("//p[@data-testid=\"login-error-message\"]");
    private By forgotPassword = By.xpath("//a [text()=\"Forgotten your password?\"]");
    private By dontSavePassw = By.xpath("//button[text()=\"Не сейчас\"]");
    private By switchOff = By.xpath("//button[text()=\"Не сейчас\"]");

    public LogInPage typeUser (String username){
        driver.findElement(userName).sendKeys(username);
        return  this;
    }

    public LogInPage typePassword (String Password){
        driver.findElement(password).sendKeys(Password);
        return  this;
    }

    public LogInPage incorrectLogIn(String username, String Password){
        this.typeUser(username);
        this.typePassword(Password);
        driver.findElement(buttonSignIn).click();
        return new LogInPage(driver);
    }

    public String getHeadingText (){
        return driver.findElement(heading).getText();
    }

    public String getErrorText (){
        return driver.findElement(error).getText();
    }

    public ResetPasswordPage resetPassword (String email){
       driver.findElement(forgotPassword).click();
        return  new ResetPasswordPage(driver);

    }

    public MyProfilePage logInProfil(String username, String passWord){
        driver.findElement(userName).sendKeys(username);
        driver.findElement(password).sendKeys(passWord);
        driver.findElement(buttonSignIn).click();
        driver.findElement(dontSavePassw).click();
        driver.findElement(switchOff).click();
        return new MyProfilePage(driver);
    }

}
