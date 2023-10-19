package ui.steps;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import ui.pages.CreateAccountPage;

import java.util.Random;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static help.Generations.generationRandomText;

public class CreateAccountStep {

    CreateAccountPage createAccountPage = new CreateAccountPage();

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(5);
    }

    @Step("Цикл")
    public void randomCheck() {
        createAccountPage.nextButton.shouldBe((visible).because("Не видна кнопка 'Далее'"));
        if (createAccountPage.radioButton.size() > 1 && createAccountPage.nextButton.has(visible)) {
            int count = createAccountPage.pageElementQA.size();
            for (int i = 0; i < count; i++) {
                sleep(1000);
                Configuration.pageLoadStrategy = "eager";
                createAccountPage.radioButton.get(getRandomNumber()).click();
                createAccountPage.nextButton.click();
            }
        }
    }

    @Step("Нажатие на кнопку 'Начать обучение'")
    public void startLearnButton() {
        open("/");
        createAccountPage.startLearnButton.click();
    }

    @Step("Нажатие на кнопку 'Начать'")
    public void testBeginButton() {
        createAccountPage.testBeginButton.shouldBe((visible).because("Не получилось набрать")).click();
        refresh();
    }

    @Step("Нажатие на кнопку 'Начать'")
    public void beginLearnButton() {
        createAccountPage.beginLearnButton.click();
    }

    @Step("Нажатие на кнопку 'Русский'")
    public void russianLanguageButton() {
        createAccountPage.russianLanguageButton.click();
    }

    @Step("Нажатие на кнопку 'Инженером Тестирования")
    public void qaButton() {
        createAccountPage.qaButton.click();
    }

    @Step("Выбор темной темы")
    public void blackPictureClick() {
        createAccountPage.blackPictureClick.click();
    }

    @Step("Нажатие на кнопку 'Не сейчас'")
    public void notNowButton() {
        createAccountPage.notNowButton.click();
    }

    @Step("Нажатие на кнопку 'Нет'")
    public void xpInProgrammingNo() {
        createAccountPage.xpInProgrammingNo.click();
    }

    @Step("Проверка о успешном создании курса")
    public void checkOutResult() {
        createAccountPage.checkoutLoad.shouldBe((visible).because("Прогресс не начался"));
        createAccountPage.loader.shouldBe((visible).because("Прогресс не продолжился"));
        sleep(10000);
        createAccountPage.checkOutResult.shouldBe(text("Ваш персональный курс готов"));
    }

    @Step("Нажатие на кнопку проверить уровень знаний")
    public void xpInProgrammingYes() {
        createAccountPage.xpInProgrammingYes.click();
        sleep(2000);
    }

    @Step("Нажатие на кнопку 'Получить'")
    public void getCourseButton() {
        createAccountPage.getCourseButton.click();
        sleep(4000);
    }

    @Step("Ввод email")
    public void emailInput() {
        createAccountPage.emailInput.setValue(generationRandomText() + "@mail.ru");
    }

    @Step("Ввод password")
    public void passwordInput() {
        createAccountPage.passwordInput.setValue(generationRandomText() + "1245");
    }

    @Step("Нажатие на кнопку 'Создать аккаунт''")
    public void createAccount() {
        createAccountPage.createAccount.click();
    }
}
