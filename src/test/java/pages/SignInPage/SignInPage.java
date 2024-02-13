package pages.SignInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    private SignInPage() {
    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();

        }
        return instance;
    }

    private By signInButton = By.id("btn1");
    private By logo = By.id("logo");
    private By emailField = By.xpath("//input[@ng-model='Email']");
    private By passwordField = By.xpath("//input[@ng-model='Password']");

    public void clickSignInButton() {
        LOG.info("Click 'Sign in' button");
        driver.findElement(signInButton).click();
    }

    public boolean isSignInButtonDisplayed() {
        LOG.info("Verify if 'Sign in' button is displayed");
        return driver.findElement(signInButton).isDisplayed();
    }

    public boolean isLogoDisplayed() {
        LOG.info("Verify if 'Logo' button is displayed");
        return driver.findElement(logo).isDisplayed();
    }
    public void clickemailField() {
        LOG.info("input 'Email address' in field" );
        driver.findElement(emailField).sendKeys();
    }

}