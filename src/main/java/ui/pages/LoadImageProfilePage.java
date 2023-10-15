package ui.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoadImageProfilePage {
    public static final SelenideElement settings = $x("//*[contains(@class, 'sidebar-nav__sections')]/jr-sidebar-group[5]/div[2]/jr-sidebar-item[6]/div/a");
}
