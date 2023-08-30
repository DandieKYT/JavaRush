package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;

public class StartLearningPage {
    private SelenideElement
            startLearnButton = $x("//*[@id='button_menu_start_learning_unauthorized_user']"),
            beginLearnButton = $x("//*[@id='id_button_jr_welcome_start_learning_1']"),
            russianLanguageButton = $x("//*[@id='todo_add']"),
            qaButton = $x("//*[@id='id_button_jr_welcome_choose_qa']"),
            blackPictureClick = $x("//*[@id='id_button_jr_welcome_light_theme']/picture"),
            notNowButton = $x("//*[@id='id_button_jr_welcome_sign_up_not_now']"),
            xpInProgrammingNo = $x("//*[@id='id_button_jr_welcome_start_from_scratch']"),
            checkOutResult =$x("//div[text()='Ваш персональный курс готов']");

    public ReviewsAndAboutUsPage startLearnButton() {
        step("Нажатие на кнопку \"Начать обучение\"", () -> {
            startLearnButton.click();
        });
        return null;
    }
    public ReviewsAndAboutUsPage beginLearnButton() {
        step("Нажатие на кнопку \"Начать\"", () -> {
            beginLearnButton.click();
        });
        return null;
    }public ReviewsAndAboutUsPage russianLanguageButton() {
        step("Нажатие на кнопку \"Русский\"", () -> {
            russianLanguageButton.click();
        });
        return null;
    }public ReviewsAndAboutUsPage qaButton() {
        step("Нажатие на кнопку \"Инженером Тестирования\"", () -> {
            qaButton.click();
        });
        return null;
    }public ReviewsAndAboutUsPage blackPictureClick() {
        step("Выбор темной темы", () -> {
            blackPictureClick.click();
        });
        return null;
    }public ReviewsAndAboutUsPage notNowButton() {
        step("Нажатие на кнопку \"Не сейчас\"", () -> {
            notNowButton.click();
        });
        return null;
    }public ReviewsAndAboutUsPage xpInProgrammingNo() {
        step("Нажатие на кнопку \"Нет\"", () -> {
            xpInProgrammingNo.click();
            sleep(10000);
        });
        return null;
    }public ReviewsAndAboutUsPage checkOutResult() {
        step("Проверка заголовка об успешном создании курса", () -> {
            checkOutResult.shouldBe(text("Ваш персональный курс готов"));
        });
        return null;
    }
}