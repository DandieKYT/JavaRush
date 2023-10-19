package ui.steps;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import ui.pages.StartLearningPage;

import java.util.Random;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static help.Generations.generationRandomText;

public class StartLearningStep {

    StartLearningPage startLearningPage = new StartLearningPage();

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(5);
    }

    @Step("Цикл")
    public void randomCheck() {
        startLearningPage.nextButton.shouldBe((visible).because("Не видна кнопка 'Далее'"));
        if (startLearningPage.radioButton.size() > 1 && startLearningPage.nextButton.has(visible)) {
            int count = startLearningPage.pageElementQA.size();
            for (int i = 0; i < count; i++) {
                sleep(1000);
                Configuration.pageLoadStrategy = "eager";
                startLearningPage.radioButton.get(getRandomNumber()).click();
                startLearningPage.nextButton.click();
            }
        }
    }

    @Step("Нажатие на кнопку 'Начать обучение'")
    public void startLearnButton() {
        open("/");
        startLearningPage.startLearnButton.click();
    }

    @Step("Нажатие на кнопку 'Начать'")
    public void testBeginButton() {
        startLearningPage.testBeginButton.shouldBe((visible).because("Не получилось набрать")).click();
        refresh();
    }

    @Step("Нажатие на кнопку 'Начать'")
    public void beginLearnButton() {
        startLearningPage.beginLearnButton.click();
    }

    @Step("Нажатие на кнопку 'Русский'")
    public void russianLanguageButton() {
        startLearningPage.russianLanguageButton.click();
    }

    @Step("Нажатие на кнопку 'Инженером Тестирования")
    public void qaButton() {
        startLearningPage.qaButton.click();
    }

    @Step("Выбор темной темы")
    public void blackPictureClick() {
        startLearningPage.blackPictureClick.click();
    }

    @Step("Нажатие на кнопку 'Не сейчас'")
    public void notNowButton() {
        startLearningPage.notNowButton.click();
    }

    @Step("Нажатие на кнопку 'Нет'")
    public void xpInProgrammingNo() {
        startLearningPage.xpInProgrammingNo.click();
    }

    @Step("Проверка о успешном создании курса")
    public void checkOutResult() {
        startLearningPage.checkoutLoad.shouldBe((visible).because("Прогресс не начался"));
        startLearningPage.loader.shouldBe((visible).because("Прогресс не продолжился"));
        sleep(10000);
        startLearningPage.checkOutResult.shouldBe(text("Ваш персональный курс готов"));
    }

    @Step("Нажатие на кнопку проверить уровень знаний")
    public void xpInProgrammingYes() {
        startLearningPage.xpInProgrammingYes.click();
        sleep(2000);
    }

    @Step("Нажатие на кнопку 'Получить'")
    public void getCourseButton() {
        startLearningPage.getCourseButton.click();
        sleep(4000);
    }

    @Step("Ввод email")
    public void emailInput() {
        startLearningPage.emailInput.setValue(generationRandomText() + "@mail.ru");
    }

    @Step("Ввод password")
    public void passwordInput() {
        startLearningPage.passwordInput.setValue(generationRandomText() + "1245");
    }

    @Step("Нажатие на кнопку 'Создать аккаунт''")
    public void createAccount() {
        startLearningPage.createAccount.click();
    }
}
