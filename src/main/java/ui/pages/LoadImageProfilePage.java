package ui.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoadImageProfilePage {
    public static final SelenideElement collapseMenu = $x("//button[@title='Свернуть']");
    public static final SelenideElement settings = $x("//a[@class='sidebar-nav-link ng-star-inserted']");
    public static final SelenideElement clickProfilePhoto = $x("//*[contains(@class, 'avatar-upload-button')]");
}
