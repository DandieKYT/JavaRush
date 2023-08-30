package tests.ui;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tests.mobile.TestBaseMobile;

public class BuyHowCompanyAndGiftSertificates extends TestBase {

    @CsvSource(value = {
            "Адреса ,      Доставка",
            "Корзина,     В корзине пока пусто",
    })
    @Owner("Kudryavtsev")
    @Feature("Открытие страниц Продукты/Компания")
    @Story("Открытие страниц Продукты/Компания и проверка их содержимого")
    @ParameterizedTest
    @DisplayName("Открытие страниц Адреса/Корзина")
    public void productsAndCompany(String param, String expectedText) {
        basePage.openPage();
        productsAndCompanyPage.openTitle(param);
        productsAndCompanyPage.checkTitle(expectedText);
    }

}
