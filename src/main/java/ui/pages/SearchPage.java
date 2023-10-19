package ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;

public class SearchPage {

    public final SelenideElement users = $x("//div[text()='Пользователи']");
    public final SelenideElement searchUser = $x("//input[@formcontrolname='query']");
    public final SelenideElement checkoutResult = $x("//div[text()='Dandie KYT']");
}
