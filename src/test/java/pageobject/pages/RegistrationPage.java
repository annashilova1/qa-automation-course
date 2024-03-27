package pageobject.pages;

import org.openqa.selenium.By;
import pageobject.BaseFunc;

public class RegistrationPage {
    private final By FIRST_NAME_INPUT = By.id("user_first_name");
    private final By LAST_NAME_INPUT = By.id("user_last_name");
    private final By EMAIL_INPUT = By.id("user_email");
    private BaseFunc baseFunc;


    public RegistrationPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
    public void fillInRegistrationForm(String firstname, String lastname, String email) {
        baseFunc.typeText(FIRST_NAME_INPUT, firstname);
        baseFunc.typeText(LAST_NAME_INPUT, lastname);
        baseFunc.typeText(EMAIL_INPUT, email);
    }
}
