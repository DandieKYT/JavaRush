package ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    public final SelenideElement openJavaUniversity = $x("//a[text()='Java‑университет']");
    public final SelenideElement startLearnButton = $x("//*[@id='button_menu_start_learning_unauthorized_user']");
    public final SelenideElement users = $x("//div[text()='Пользователи']");
}
