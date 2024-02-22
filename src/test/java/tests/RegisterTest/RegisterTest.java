package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;


public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private String newUrl = getBaseUrl() + "Register.html";
    String firstName = "Ion";
    String lastName = "Popescu";
    String address = "Cluj, Str. Ion Barbu Nr.456";
    String email = "tralala@domain.com";
    String phone = "0121477582";


    @Test
    public void fillRegister() {
        driver.get(newUrl);
        sleep(3000L);

        LOG.info("Press consent");
        registerPage.pressConsent();

        LOG.info("Typing Full Name");
        registerPage.insertFullName(firstName, lastName);

        LOG.info("Type in Address");
        registerPage.insertAddress(address);

        LOG.info("Type in email");
        registerPage.insertEmail(email);

        LOG.info("Type in Phone Number");
        registerPage.insertPhoneNaumber(phone);


    }
}
