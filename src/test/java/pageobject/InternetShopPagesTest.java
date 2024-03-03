package pageobject;

import org.junit.jupiter.api.Test;
import pageobject.pages.CatalogPage;
import pageobject.pages.HomePage;
import pageobject.pages.SubcategoriePage;

public class InternetShopPagesTest {
    @Test
    public void testOnPages() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openURL("1a.lv");

        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();
        homePage.selectMenuItem("Mēbeles");

        SubcategoriePage subcategoriePage = new SubcategoriePage(baseFunc);
        subcategoriePage.selectSubcategory( "Guļamistaba");
        subcategoriePage.selectSubcategory("Plaukti");

        CatalogPage catalogPage = new CatalogPage(baseFunc);
        catalogPage.setPriceFilter(25, 100);
    }

}
