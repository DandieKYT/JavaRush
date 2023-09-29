package pagesMobile;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CommentPage {
    public  SelenideElement
            checkoutText = $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentText"));
}
