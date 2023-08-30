package tests.ui;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ReviewsAndAboutUs extends TestBase {

    @CsvSource(value = {
            "Отзывы,      Отзывы",
            "О нас,     О JavaRush",
    })
    @Owner("Kudryavtsev")
    @Feature("Открытие страниц Отзывы/О нас")
    @Story("Открытие страниц Отзывы/О нас и проверка их содержимого")
    @ParameterizedTest
    @DisplayName("Открытие страниц Отзывы/О нас")
    public void productsAndCompany(String param, String expectedText) {
        basePage.openPage();
        productsAndCompanyPage.openTitle(param);
        productsAndCompanyPage.checkTitle(expectedText);
    }

}
