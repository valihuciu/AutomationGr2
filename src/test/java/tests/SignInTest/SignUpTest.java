package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;


public class SignUpTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);


    @Test
    public void signIn() {
        String email = "abc@email.com";

        LOG.info("insert 'SignUp Email' ");
        signInPage.insertSignUpEmail(email);

        LOG.info ("click 'Register' Button");
        signInPage.clickEnterRegister();

    }

}