package ui.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    public final SelenideElement startLearnButton = $x("//*[@id='button_menu_start_learning_unauthorized_user']");

    public final SelenideElement users = $x("//div[text()='Пользователи']");

}
