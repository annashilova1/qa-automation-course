package pageobject.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

import java.util.List;

public class HomePage {
    private final By ACCEPT_COOKIES_BTN = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private final By MENU_ITEM = By.xpath(".//li[contains(@class, 'submenu-lvl1__list-item--has-child')]");
    private final By MENU = By.xpath(".//div[contains(@class, 'submenu-lvl2 submenu-lvl2--index')]");
    private BaseFunc baseFunc;


    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void acceptCookies() {
        baseFunc.click(ACCEPT_COOKIES_BTN);
    }

    public void selectMenuItem(String menuItemName) {
        WebElement menuBlock = baseFunc.findElement(MENU);
        List<WebElement> items = menuBlock.findElements(MENU_ITEM); // Must be refactored

        boolean isSectionFound = false;
        for (WebElement we : items) {
            if (we.getText().equals(menuItemName)) {
                isSectionFound = true;
                we.click();
                break;
            }
        }

        Assertions.assertTrue(isSectionFound,  "Cant find menu Item " + menuItemName);
    }


}
