package mobile.steps;

import io.qameta.allure.Step;
import mobile.pages.CourseTaskPage;

import static com.codeborne.selenide.Condition.text;
import static io.qameta.allure.Allure.step;
import static mobile.pages.CourseTaskPage.checkTitle;
import static mobile.pages.CourseTaskPage.tag;

public class CourseTaskStep {

    @Step("Открытие вкладки")
    public void tag(String param) {
            tag.find(text(param)).click();
    }

    @Step("Проверка содержимого вкладки")
    public void checkTitle(String expectedText) {
            checkTitle.shouldBe(text(expectedText));
    }
}
