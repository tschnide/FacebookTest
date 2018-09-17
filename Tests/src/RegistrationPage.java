import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage
{
    private final WebDriver driver;
    private final By email = By.id("email");
    private final By pass = By.id("pass");
    private final By submit = By.id("u_0_2");

    public RegistrationPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void setEmail(String value)
    {
        WebElement element = driver.findElement(email);
        element.clear();
        element.sendKeys(value);
    }

    public void setPass(String value)
    {
        WebElement element = driver.findElement(pass);
        element.clear();
        element.sendKeys(value);
    }

    public void clickSubmit()
    {
        driver.findElement(submit).click();
    }




}
