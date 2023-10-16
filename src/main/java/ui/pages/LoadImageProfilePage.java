package ui.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoadImageProfilePage {
    public static final SelenideElement collapseMenu = $x("//button[@title='Свернуть']");
    public static final SelenideElement settings = $x("//a[@href='/settings']");
    public static final SelenideElement bookmarks =   $x("//div[contains(@class,'sidebar-nav-label') and contains(text(),'Закладки')]");
    public static final SelenideElement clickProfilePhoto = $x("//*[contains(@class, 'avatar-upload-button')]");
}
