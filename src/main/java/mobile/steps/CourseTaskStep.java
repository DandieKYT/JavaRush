package mobile.steps;

import io.qameta.allure.Step;
import mobile.pages.CourseTaskPage;

import static com.codeborne.selenide.Condition.text;


public class CourseTaskStep {

    CourseTaskPage courseTaskPage = new CourseTaskPage();

    @Step("Открытие вкладки")
    public void tag(String param) {
        courseTaskPage.tag.find(text(param)).click();
    }

    @Step("Проверка содержимого вкладки")
    public void checkTitle(String expectedText) {
        courseTaskPage.checkTitle.shouldBe(text(expectedText));
    }
}
