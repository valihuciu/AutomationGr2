package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignInTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);

    @Test
    public void signIn() {
        String email = "abc@email.com";
        String password = "Parola1";

        LOG.info("Check 'Sign in' button");
        Assert.assertTrue(signInPage.isSignInButtonDisplayed(), "Button is not displayed");

        LOG.info("Click 'Sign in' button");
        signInPage.clickSignInButton();

        LOG.info("Verify if logo is displayed");
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");

        LOG.info("insert 'Email' ");
        signInPage.insertEmail(email);

        LOG.info("insert 'Password' ");
        signInPage.insertPassword(password);

        LOG.info("Click 'Enter' button");
        signInPage.clickEnterButton();

        LOG.info("Check if 'Error Message' displayed");
        Assert.assertTrue(signInPage.isErrorMessageDisplayed(), "Error message is not displayed");

        LOG.info ("navigate back");
        signInPage.clickBack();

        LOG.info ("click 'Skip Sign In' Button");
        signInPage.clickSkipSignInButton();

    }
}