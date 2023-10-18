package ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoadImageProfilePage {
    public static final SelenideElement settings = $("a.sidebar-nav-link[href='/settings']");
    public static final SelenideElement clickImage = $x("//jr-icon[@class='sidebar-nav__toggle-icon']//*[name()='svg']");
    public static final SelenideElement bookmarks = $x("//div[contains(text(),'Поддержка')]");
    public static final SelenideElement clickProfilePhoto = $x("//*[contains(@class, 'avatar-upload-button')]");
    public static final SelenideElement uploadPhoto = $x("//*[@id='me-profile-upload-ava']");
    public static final SelenideElement savePhoto = $x("//*[contains(@class, 'button--success')]");
    public static final SelenideElement checkUploadPhoto = $x("//*[contains(@class, 'loader__label ng-star-inserted')]");
    public static final SelenideElement saveChanges = $x("//*[contains(@class, 'button--schedule')]");
    public static final SelenideElement checkSuccesfullChanges = $x("//div[@class='alert-notification__text']");

}
