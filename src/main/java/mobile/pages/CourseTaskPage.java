package mobile.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.qameta.allure.Allure.step;

public class CourseTaskPage {
private final ElementsCollection
        tag = $$(AppiumBy.className("android.widget.CheckedTextView"));
private final SelenideElement
        checkTitle = $(AppiumBy.id("com.hitechrush.jaxarush:id/toolbarTitle"));

    public CourseTaskPage tag(String param) {
        step("Открытие вкладки", () -> {
            tag.find(text(param)).click();
        });
        return this;
    }
    public CourseTaskPage checkTitle(String expectedText) {
        step("Проверка содержимого вкладки", () -> {
            checkTitle.shouldBe(text(expectedText));
        });
        return this;
    }
}
