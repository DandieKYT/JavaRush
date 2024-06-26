package ui.steps;

import io.qameta.allure.Step;
import ui.pages.CreateAccountPage;

import static com.codeborne.selenide.Condition.text;

public class CreateAccountStep {

    CreateAccountPage createAccountPage = new CreateAccountPage();

    @Step("Нажатие на кнопку 'Начать'")
    public void beginLearnButton() {createAccountPage.beginLearnButton.click();}

    @Step("Нажатие на кнопку 'Русский'")
    public void russianLanguageButton() {
        createAccountPage.russianLanguageButton.click();
    }

    @Step("Проверка о успешном создании курса")
    public void checkOutResult() {
        createAccountPage.checkOutResult.shouldBe(text("Обучение Java программированию с нуля").because("Текст не найден"));}

    @Step("Ввод email")
    public void emailInput(String email) {
        createAccountPage.emailInput.setValue(email);
    }

    @Step("Ввод password")
    public void passwordInput(String password) {
        createAccountPage.passwordInput.setValue(password);
    }

    @Step("Нажатие на кнопку 'Создать аккаунт'")
    public void createAccount() {
        createAccountPage.createAccount.click();
    }
}
