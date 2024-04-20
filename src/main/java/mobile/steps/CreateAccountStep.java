package mobile.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import mobile.pages.CreateAccountPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.sleep;

public class CreateAccountStep {

    CreateAccountPage createAccountPage = new CreateAccountPage();

    @Step("Проверка создания курса")
    public void checkoutCourse() {
        Selenide.sleep(11000);
        createAccountPage.checkoutCourse.shouldBe(text("Ваш персональный курс готов"));
    }

    @Step("Нажатие кнопки старт")
    public void startButton() {
        createAccountPage.startButton.get(0).click();
    }

    @Step("Нажатие кнопки старт")
    public void secondStartButton() {
        createAccountPage.secondStartButton.get(0).click();
    }

    @Step("Выбор русского языка")
    public void languageRussian() {
        createAccountPage.languageRussian.get(0).click();
    }

    @Step("Выбор направления QA")
    public void qaButton() {
        createAccountPage.qaButton.click();
    }

    @Step("Выбор литературного стиля повествования")
    public void literaryStyle() {
        createAccountPage.literaryStyle.click();
    }

    @Step("Нажатие на кнопку 'Нет'")
    public void motivationNo() {
        createAccountPage.motivationNo.click();
    }

    @Step("Выбор светлой темы")
    public void lightTheme() {
        createAccountPage.lightTheme.click();
    }

    @Step("Нажатие на кнопку 'Нет'")
    public void experienceNo() {
        createAccountPage.experienceNo.click();
        sleep(2000);
    }

    @Step("Проверка заголовка страницы")
    public void checkoutTitle() {
        createAccountPage.checkoutTitle.get(1).shouldHave(Condition.text("Создание аккаунта"));
    }

    @Step("Проверка заголовка страницы")
    public void experienceYes() {
        createAccountPage.experienceYes.click();
    }
}
