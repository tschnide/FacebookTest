import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestRegistrationPageLogin
{

    public static void main(String[] args)
    {
        String emailAddress = System.getenv("FBEMAIL");
        String password = System.getenv("FBPASS");
        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://www.facebook.com");

        RegistrationPage registrationPage = new RegistrationPage(driver);

        registrationPage.setEmail(emailAddress);
        registrationPage.setPass(password);
        registrationPage.clickSubmit();

        driver.quit();
    }
}
