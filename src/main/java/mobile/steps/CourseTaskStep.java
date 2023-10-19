package mobile.steps;

import io.qameta.allure.Step;
import mobile.pages.OpenCourseTaskPage;

import static com.codeborne.selenide.Condition.text;


public class CourseTaskStep {

    OpenCourseTaskPage openCourseTaskPage = new OpenCourseTaskPage();

    @Step("Открытие вкладки")
    public void tag(String param) {
        openCourseTaskPage.tag.find(text(param)).click();
    }

    @Step("Проверка содержимого вкладки")
    public void checkTitle(String expectedText) {
        openCourseTaskPage.checkTitle.shouldBe(text(expectedText));
    }
}
