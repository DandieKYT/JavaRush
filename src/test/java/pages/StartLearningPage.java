package pages;

import com.codeborne.selenide.*;

import java.util.Collections;
import java.util.Random;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class StartLearningPage {
    private SelenideElement
            startLearnButton = $x("//*[@id='button_menu_start_learning_unauthorized_user']"),
            beginLearnButton = $x("//*[@id='id_button_jr_welcome_start_learning_1']"),
            russianLanguageButton = $x("//*[@id='todo_add']"),
            checkoutLoad = $x("//div[text() ='Создается ваш персональный курс']"),
            loader = $x("//*[contains(@class, 'last-step-loading')]"),
            qaButton = $x("//*[@id='id_button_jr_welcome_choose_qa']"),
            blackPictureClick = $x("//*[@id='id_button_jr_welcome_light_theme']/picture"),
            notNowButton = $x("//*[@id='id_button_jr_welcome_sign_up_not_now']"),
            testBeginButton = $x("//*[@id='id_button_jr_welcome_start_testing']"),
            xpInProgrammingYes = $x("//*[@id='id_button_jr_welcome_determine_my_level']"),
            xpInProgrammingNo = $x("//*[@id='id_button_jr_welcome_start_from_scratch']"),
            getButtonLearn = $x("//*[@id='id_button_jr_welcome_get_course']"),
            profileName = $(".my-profile-card__name"),
            nextButton = $x("//button[text()='Далее']"),
            checkOutResult = $x("//div[text()='Ваш персональный курс готов']");

    private final ElementsCollection
            radioButton = $$x("//*[contains(@class,'radio-button radio-button--basic svelte')]"),
            pageElementQA = $$x("//*[contains(@class,'progress-bar__step')]");


    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(5);
    }


    public void randomCheck() {
        step("Цикл", () ->{
            nextButton.shouldBe((visible).because("Не видна кнопка 'Далее'"));
            if  (radioButton.size() > 1 && nextButton.has(visible)){
                int count = pageElementQA.size();
                for (int i = 0; i < count; i++) {
                    sleep(1000);
                    Configuration.pageLoadStrategy = "eager";
                    radioButton.get(getRandomNumber()).click();
                    nextButton.click();
                }

            }
        });
    }

    public StartLearningPage startLearnButton() {
        step("Нажатие на кнопку 'Начать обучение'", () -> {
            startLearnButton.click();
        });
        return this;
    }

    public StartLearningPage testBeginButton() {
        step("Нажатие на кнопку 'Начать'", () -> {
            testBeginButton.shouldBe((visible).because("Не получилось набрать")).click();
            refresh();
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
            checkoutLoad.shouldBe((visible).because("Прогресс не начался"));
        });
        step("Проверка заголовка об успешном создании курса", () -> {
            loader.shouldBe((visible).because("Прогресс не начался"));
            sleep(10000);
        });
        step("Проверка заголовка об успешном создании курса", () -> {
            checkOutResult.shouldBe(text("Ваш персональный курс готов"));
        });
        return this;
    }

    public StartLearningPage getButtonLearn() {
        step("Нажатие на кнопку Получить", () -> {
            getButtonLearn.click();
        });
        return this;
    }

    public StartLearningPage profileName() {
        step("Проверка созданного профиля", () -> {
            profileName.shouldBe(visible);
        });
        return this;
    }

    public StartLearningPage xpInProgrammingYes() {
        step("Нажатие на кнопку проверить уровень знаний", () -> {
            xpInProgrammingYes.click();
            Selenide.sleep(2000);
        });
        return this;
    }

}
