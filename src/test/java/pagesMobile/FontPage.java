package pagesMobile;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class FontPage {
    private final ElementsCollection
            tag = $$(AppiumBy.className("android.widget.CheckedTextView"));

    private final SelenideElement
            fontButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/fontSizeContainer"));

    public FontPage tag() {
        step("Открытие вкладки", () -> {
            tag.find(text("Settings")).click();
        });
        return this;
    }
    public FontPage fontButton() {
        step("Нажатие на кнопку font", () -> {
            fontButton.click();
        });
        return this;
    }

}
