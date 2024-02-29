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
    String language = "English";
    String skill = "Java";
    String country = "Japan";
    String year = "1991";
    String month = "February";
    String day = "29";
    String password = "P@ssw0rd";
    String confirmPassword = "P@ssw0rd";



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
        registerPage.insertPhoneNumber(phone);

        LOG.info("Select Gender");
        registerPage.setMaleGender();
        registerPage.setFemaleGender();

        LOG.info("Select Hobbies");
        registerPage.clickCricket();
        registerPage.clickMovies();
        registerPage.clickHockey();

        LOG.info("Select language");
        registerPage.selectLanguage(language);

        LOG.info("Select skill");
        registerPage.selectSkills(skill);

        LOG.info("Select country");
        registerPage.selectCountry(country);

        LOG.info("Select date of birth");
        registerPage.setDateOfBirth(year, month, day);

        LOG.info("Insert password");
        registerPage.insertPassword(password);

        LOG.info("Insert confirm password");
        registerPage.insertConfirmPassword(confirmPassword);

        LOG.info("press submit button");
        registerPage.pressSubmit();

        LOG.info("press refresh button");
        registerPage.pressRefresh();

        sleep(5000L);

    }
}
