package mobile.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SideBarMenuPage {

    public final ElementsCollection tag = $$(AppiumBy.className("android.widget.CheckedTextView"));

    public final SelenideElement checkTitle = $(AppiumBy.id("com.hitechrush.jaxarush:id/toolbarTitle"));
}
