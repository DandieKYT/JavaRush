package ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class UploadImageToProfilePage {

    public final SelenideElement settings = $("a.sidebar-nav-link[href='/settings']");
    public final SelenideElement clickImage = $x("//jr-icon[@class='sidebar-nav__toggle-icon']//*[name()='svg']");
    public final SelenideElement bookmarks = $x("//div[contains(text(),'Поддержка')]");
    public final SelenideElement clickProfilePhoto = $x("//*[contains(@class, 'avatar-upload-button')]");
    public final SelenideElement uploadPhoto = $x("//*[@id='me-profile-upload-ava']");
    public final SelenideElement savePhoto = $x("//*[contains(@class, 'button--success')]");
    public final SelenideElement checkUploadPhoto = $x("//img[@src='/api/1.0/rest/me/pictures-private/avatar-source?cache=1']");
    public final SelenideElement saveChanges = $x("//*[contains(@class, 'button--schedule')]");
    public final SelenideElement checkSuccessFullChanges = $x("//div[@class='alert-notification__text']");
}
