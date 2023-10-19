package ui.steps;

import io.qameta.allure.Step;
import ui.pages.ReviewsAndAboutUsPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;


public class ReviewsAndAboutUsStep {

    ReviewsAndAboutUsPage reviewsAndAboutUsPage = new ReviewsAndAboutUsPage();

    @Step("Открытие вкладки")
    public void opensTitle(String param) {
        open("/");
        reviewsAndAboutUsPage.openTitle(param).click();
    }

    @Step("Проверка содержимого вкладки")
    public void checksTitle(String expectedText) {
        reviewsAndAboutUsPage.checkTitle(expectedText).shouldBe(text(expectedText));
    }
}
