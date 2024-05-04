package ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CreateAccountPage {

    public final SelenideElement beginLearnButton = $x("//*[@id='id_button_jr_welcome_start_learning_1']");
    public final SelenideElement russianLanguageButton = $x("//div[text()='Русский']");
    public final SelenideElement checkOutResult = $x("//h1[contains(text(), 'Обучение Java программированию с нуля')]");
    public final SelenideElement emailInput = $x("//input[@placeholder='Email']");
    public final SelenideElement passwordInput = $x("//input[@placeholder='Пароль']");
    public final SelenideElement createAccount = $x("//button[@id='id_button_jr_welcome_create_account']");
}
