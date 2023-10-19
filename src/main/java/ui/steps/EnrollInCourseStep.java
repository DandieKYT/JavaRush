package ui.steps;

import io.qameta.allure.Step;
import ui.pages.EnrollInCoursePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static ui.pages.EnrollInCoursePage.*;

public class EnrollInCourseStep {
    EnrollInCoursePage enrollInCoursePage = new EnrollInCoursePage();
    @Step("Открытие вкладки Java-университет")
    public void openJavaUniversity() {
        open("/");
        enrollInCoursePage.openJavaUniversity.click();
        switchTo().window(1);
    }

    @Step("Нажатие на кнопку 'Записаться на курс'")
    public void clickButtonEnrollToCourse() {
        enrollInCoursePage.clickButtonEnrollToCourse.click();
    }

    @Step("Проверка заголовка анкеты 'Записаться на курс'")
    public void checkoutForm() {
        enrollInCoursePage.checkoutForm.shouldBe(text("Записаться на курс"));
        closeWindow();
        switchTo().window(0);
    }
}
