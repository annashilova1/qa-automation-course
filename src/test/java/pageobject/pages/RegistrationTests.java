package pageobject.pages;

import org.junit.jupiter.api.Test;
import pageobject.BaseFunc;

public class RegistrationTests {
    @Test
    public void registrationFormCheck() {
        BaseFunc basefunc = new BaseFunc();
        basefunc.openURL("1a.lv");

        HomePage homePage = new HomePage(basefunc);
        homePage.acceptCookies();
        homePage.openLoginPage();

        LoginPage loginPage = new LoginPage(basefunc);
        loginPage.openRegistrationPage();

        RegistrationPage registrationPage = new RegistrationPage(basefunc);
        registrationPage.fillInRegistrationForm("Anna", "Silova", "ann@ko");
    }

}
