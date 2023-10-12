package ui.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;

public class SearchPage {

    public final static SelenideElement users = $x("//*[contains(@class, 'sidebar-nav__sections')]/div[4]/div[2]/div/a");
    public final static SelenideElement searchUser = $x("//*[contains(@class, 'filter__container')]/div/jr-section-search-panel/div/div/div/input");
    public final static SelenideElement checkoutResult = $x("//div[text()='Dandie KYT']");

}
