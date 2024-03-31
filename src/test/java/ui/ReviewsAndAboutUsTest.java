package ui;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@Tag("UI")
@Owner("Кудрявцев Даниил")
@Feature("Автотесты для UI")
@Story("Разделы 'Отзывы/О нас'")
public class ReviewsAndAboutUsTest extends TestBase {
    @CsvSource(value = {
            "Отзывы,      Отзывы",
            "О нас,     О JavaRush",
    })
    @ParameterizedTest
    @DisplayName("Открытие страниц Отзывы/О нас")
    public void openReviewsAndAboutUsPages(String param, String expectedText) {
        mainPageSteps.openPage();
        mainPageSteps.opensTitle(param);
        mainPageSteps.checksTitle(expectedText);
    }
}
