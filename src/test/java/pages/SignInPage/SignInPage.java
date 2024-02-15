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
    private By enterButton = By.id("enterbtn");
    private By errorMessage = By.id("errormsg");
    private By skipSignInButton = By.id("btn2");
    private By emailSignUp = By.id("email");
    private By enterRegisterButton = By.id("enterimg");


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

    public void insertEmail(String Email) {
        LOG.info("input 'Email address' in field");
        driver.findElement(emailField).sendKeys(Email);

    }

    public void insertPassword(String Password) {
        LOG.info("input 'Password' in field");
        driver.findElement(passwordField).sendKeys(Password);
    }

    public void clickEnterButton() {
        LOG.info("Click 'Enter' button");
        driver.findElement(enterButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        LOG.info("Verify if 'Error Message' is displayed");
        return driver.findElement(errorMessage).isDisplayed();

    }

    public void clickBack() {
        LOG.info("click back in browser");
        driver.navigate().back();
    }

    public void clickSkipSignInButton() {
        LOG.info("Click 'Skip Sign In' button");
        driver.findElement(skipSignInButton).click();
    }

    public void insertSignUpEmail(String Email) {
        LOG.info("input 'Email address' in field Sign In");
        driver.findElement(emailSignUp).sendKeys(Email);
    }
    public void clickEnterRegister() {
        LOG.info("Click 'Enter Register' Button");
        driver.findElement(enterRegisterButton).click();

    }
}