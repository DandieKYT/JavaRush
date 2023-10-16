package ui.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoadImageProfilePage {
    public static final SelenideElement collapseMenu = $x("//button[@title='Свернуть']");
    public static final SelenideElement settings = $x("//a[@href='/settings']");
    public final static SelenideElement closeCookie = $x("//button[@class='button button--sm-wide button--apply']");
    public static final SelenideElement clickProfilePhoto = $x("//*[contains(@class, 'avatar-upload-button')]");
}
