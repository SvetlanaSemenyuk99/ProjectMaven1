import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResetPasswordPage {
    private WebDriver driver;

    public void ResetPasswordPage (WebDriver driver) {
        this.driver = driver;
    }

    public ResetPasswordPage (WebDriver driver){
        this.driver = driver;
    }

    private By e_mail = By.xpath("//input [@id=\"f2ddc782dd4ad5\"]");
    private By buttonSendLogIn = By.xpath("//button [text()=\"Send Login Link\"]");
    private By createNewAccount = By.xpath("//a[text()=\"Create New Account\"]");


    public ResetPasswordPage TypeEmail  (String email){
        driver.findElement(e_mail).sendKeys(email);
        return this;
    }

    public ResetPasswordPage clickButtonSendLogIn  (String email){
        driver.findElement(e_mail).sendKeys(email);
        driver.findElement(buttonSendLogIn).click();
        return  this;
    }

    public LogInPage CreateNewAccount (){
        driver.findElement(createNewAccount).click();
        return new LogInPage(driver);
    }



}
