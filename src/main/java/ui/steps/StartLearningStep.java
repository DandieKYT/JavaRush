package ui.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;

import java.util.Random;

import static com.codeborne.selenide.Selenide.*;
import static ui.pages.StartLearningPage.*;

public class StartLearningStep {

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(5);
    }

    @Step("Цикл")
    public void randomCheck() {
        nextButton.shouldBe((Condition.visible).because("Не видна кнопка 'Далее'"));
        if (radioButton.size() > 1 && nextButton.has(Condition.visible)) {
            int count = pageElementQA.size();
            for (int i = 0; i < count; i++) {
                sleep(1000);
                Configuration.pageLoadStrategy = "eager";
                radioButton.get(getRandomNumber()).click();
                nextButton.click();
            }
        }
    }

    @Step("Нажатие на кнопку 'Начать обучение'")
    public void startLearnButton() {
        open("/");
        startLearnButton.click();
    }

    @Step("Нажатие на кнопку 'Начать'")
    public void testBeginButton() {
        testBeginButton.shouldBe((Condition.visible).because("Не получилось набрать")).click();
        refresh();
    }

    @Step("Нажатие на кнопку 'Начать'")
    public void beginLearnButton() {
        beginLearnButton.click();
    }

    @Step("Нажатие на кнопку 'Русский'")
    public void russianLanguageButton() {
        russianLanguageButton.click();
    }

    @Step("Нажатие на кнопку 'Инженером Тестирования")
    public void qaButton() {
        qaButton.click();
    }

    @Step("Выбор темной темы")
    public void blackPictureClick() {
        blackPictureClick.click();
    }

    @Step("Нажатие на кнопку 'Не сейчас'")
    public void notNowButton() {
        notNowButton.click();
    }

    @Step("Нажатие на кнопку 'Нет'")
    public void xpInProgrammingNo() {
        xpInProgrammingNo.click();
        sleep(10000);
    }

    @Step("Проверка о успешном создании курса")
    public void checkOutResult() {
        checkoutLoad.shouldBe((Condition.visible).because("Прогресс не начался"));
        loader.shouldBe((Condition.visible).because("Прогресс не начался"));
        sleep(10000);
        checkOutResult.shouldBe(Condition.text("Ваш персональный курс готов"));
    }

    @Step("Нажатие на кнопку Получить")
    public void getButtonLearn() {
        getButtonLearn.click();
    }

    @Step("Проверка созданного профиля")
    public void profileName() {
        profileName.shouldBe(Condition.visible);
    }

    @Step("Нажатие на кнопку проверить уровень знаний")
    public void xpInProgrammingYes() {
        xpInProgrammingYes.click();
        sleep(2000);
    }
}
