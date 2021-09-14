import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private WebDriver driver;

    public MainPage (WebDriver driver){
        this.driver = driver;
    }

    private By userName = By.xpath("//input[@aria-label=\"Имя пользователя\"]");
    private By password = By.xpath("//input[@aria-label=\"Пароль\"]");
    private By signUp = By.xpath("//button[text()=\"Регистрация\"]");
    private By fullName = By.xpath("//input[@aria-label=\"Имя и фамилия\"]");
    private By email = By.xpath("//input[@aria-label=\"Моб. телефон или эл. адрес\"]");


    public  LogInPage signUp () {
        driver.findElement(signUp).click();
        return new LogInPage(driver);
    }

    public  MainPage logIn () {
        driver.findElement(signUp).click();
        return  new MainPage(driver);
    }

    public MainPage TypeUserName (String username){
        driver.findElement(userName).sendKeys(username);
        return  this;
    }

    public MainPage TypePassword (String Password){
        driver.findElement(password).sendKeys(Password);
        return  this;
    }

    public MainPage TypeFullName (String Fullname){
        driver.findElement(fullName).sendKeys(Fullname);
        return  this;
    }

    public MainPage TypeEmail (String e_mail){
        driver.findElement(email).sendKeys(e_mail);
        return  this;
    }

    public LogInPage register (String username, String Password, String Fullname, String e_mail){
        this.TypeUserName(username);
        this.TypePassword (Password);
        this.TypeFullName(Fullname);
        this.TypeEmail (e_mail);
        this.signUp();
        return new LogInPage (driver);
    }
}
