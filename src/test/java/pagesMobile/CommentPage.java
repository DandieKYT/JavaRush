package pagesMobile;

import com.codeborne.selenide.ElementsCollection;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$$;

public class CommentPage {
    public ElementsCollection
            checkoutText = $$(AppiumBy.className("android.view.View"));
}
