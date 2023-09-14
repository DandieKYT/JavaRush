package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class StartLearningPage {
    private SelenideElement
            checkPageLoad = $x("//*[contains(@class, 'svelte-jm04sj')]"),
            startLearnButton = $x("//*[@id='button_menu_start_learning_unauthorized_user']"),
            beginLearnButton = $x("//*[@id='id_button_jr_welcome_start_learning_1']"),
            russianLanguageButton = $x("//*[@id='todo_add']"),
            qaButton = $x("//*[@id='id_button_jr_welcome_choose_qa']"),
            blackPictureClick = $x("//*[@id='id_button_jr_welcome_light_theme']/picture"),
            notNowButton = $x("//*[@id='id_button_jr_welcome_sign_up_not_now']"),
            testBeginButton = $x("//*[@id='id_button_jr_welcome_start_testing']"),
            xpInProgrammingYes = $x("//*[@id='id_button_jr_welcome_determine_my_level']"),
            xpInProgrammingNo = $x("//*[@id='id_button_jr_welcome_start_from_scratch']"),
            getButtonLearn = $x("//*[@id='id_button_jr_welcome_get_course']"),
            profileName = $(".my-profile-card__name"),
            checkOutResult = $x("//div[text()='Ваш персональный курс готов']");

    public StartLearningPage startLearnButton() {
        step("Нажатие на кнопку 'Начать обучение'", () -> {
            startLearnButton.click();
        });
        return this;
    }
    public StartLearningPage testBeginButton() {
        step("Нажатие на кнопку 'Начать'", () -> {
            testBeginButton.click();
        });
        return this;
    }

    public StartLearningPage beginLearnButton() {
        step("Нажатие на кнопку \"Начать\"", () -> {
            beginLearnButton.click();
        });
        return this;
    }

    public StartLearningPage russianLanguageButton() {
        step("Нажатие на кнопку \"Русский\"", () -> {
            russianLanguageButton.click();
        });
        return this;
    }

    public StartLearningPage qaButton() {
        step("Нажатие на кнопку \"Инженером Тестирования\"", () -> {
            qaButton.click();
        });
        return this;
    }

    public StartLearningPage blackPictureClick() {
        step("Выбор темной темы", () -> {
            blackPictureClick.click();
        });
        return this;
    }

    public StartLearningPage notNowButton() {
        step("Нажатие на кнопку 'Не сейчас' ", () -> {
            notNowButton.click();
        });
        return this;
    }

    public StartLearningPage xpInProgrammingNo() {
        step("Нажатие на кнопку \"Нет\"", () -> {
            xpInProgrammingNo.click();
            sleep(10000);
        });
        return this;
    }

    public StartLearningPage checkOutResult() {
        step("Проверка заголовка об успешном создании курса", () -> {
            checkOutResult.shouldBe(text("Ваш персональный курс готов"));
        });
        return this;
    }
    public StartLearningPage getButtonLearn() {
        step("Нажатие на кнопку Получить",  () -> {
            getButtonLearn.click();
        });
        return this;
    }
    public StartLearningPage profileName() {
        step("Проверка созданного профиля",  () -> {
            profileName.shouldBe(visible);
        });
        return this;
    }
    public StartLearningPage xpInProgrammingYes() {
        step("Нажатие на кнопку проверить уровень знаний", () -> {
            xpInProgrammingYes.click();
        });
        return this;
    }
    public StartLearningPage checkPageLoad() {
        step("Проверка видимости элемента JavaRush", () -> {
            checkPageLoad.shouldBe(visible);
        });
        return this;
    }
}
