package tests.ui;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
@Tag("UITest")
public class ReviewsAndAboutUsTest extends TestBase {

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
        reviewsAndAboutUsPage.openTitle(param);
        reviewsAndAboutUsPage.checkTitle(expectedText);
    }

}
