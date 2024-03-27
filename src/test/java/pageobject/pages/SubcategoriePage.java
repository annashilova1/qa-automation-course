package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobject.BaseFunc;

public class SubcategoriePage {
    private final By SUBCATEGORIE_NAME = By.xpath(".//span[@class = 'cat-title']");
    private BaseFunc basefunc;


    public SubcategoriePage(BaseFunc baseFunc) {
        this.basefunc = baseFunc;
    }

    public  void selectSubcategory(String subcategoryName) {
        for (WebElement we : basefunc.findElements(SUBCATEGORIE_NAME)) {
            if (we.getText().equals(subcategoryName)) {
                basefunc.scrollToElement(we);
                basefunc.hardClick(we);
                break;
            }
        }
    }
}
