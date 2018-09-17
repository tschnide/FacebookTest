import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestRegistrationPageLogin
{

    public static void main(String[] args)
    {
        String emailAddress = System.getenv("fbemail");
        String password = System.getenv("fbpass");
        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://www.facebook.com");

        RegistrationPage_Old registrationPage = new RegistrationPage_Old(driver);

        registrationPage.setEmail(emailAddress);
        registrationPage.setPass(password);
        registrationPage.clickSubmit();

        driver.quit();

    }
}
