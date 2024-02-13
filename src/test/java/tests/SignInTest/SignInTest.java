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

        LOG.info("Check 'Sign in' button");
        Assert.assertTrue(signInPage.isSignInButtonDisplayed(), "Button is not displayed");

        LOG.info("Click 'Sign in' button");
        signInPage.clickSignInButton();

        LOG.info("Verify if logo is displayed");
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");

    }
}