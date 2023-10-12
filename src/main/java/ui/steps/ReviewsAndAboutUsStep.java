package ui.steps;

import io.qameta.allure.Step;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;
import static ui.pages.ReviewsAndAboutUsPage.checkTitle;
import static ui.pages.ReviewsAndAboutUsPage.openTitle;

public class ReviewsAndAboutUsStep {
    @Step("Открытие вкладки")
    public void opensTitle(String param) {
        open("/");
        openTitle(param).click();
    }

    @Step("Проверка содержимого вкладки")
    public void checksTitle(String expectedText) {
        checkTitle(expectedText).shouldBe(text(expectedText));
    }
}
