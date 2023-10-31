package ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SideBarPage {

    public final SelenideElement openJavaUniversity = $x("//a[text()='Java‑университет']");
    public final SelenideElement users = $x("//div[text()='Пользователи']");
    public final SelenideElement settings = $("a.sidebar-nav-link[href='/settings']");
    public final SelenideElement clickImage = $x("//jr-icon[@class='sidebar-nav__toggle-icon']//*[name()='svg']");
    public final SelenideElement bookmarks = $x("//div[contains(text(),'Поддержка')]");
}
