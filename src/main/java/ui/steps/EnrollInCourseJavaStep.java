package ui.steps;

import io.qameta.allure.Step;
import ui.pages.EnrollInCourseJavaPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.switchTo;

public class EnrollInCourseJavaStep {

    EnrollInCourseJavaPage enrollInCourseJavaPage = new EnrollInCourseJavaPage();

    @Step("Нажатие на кнопку 'Записаться на курс'")
    public void clickButtonEnrollToCourse() {
        enrollInCourseJavaPage.clickButtonEnrollToCourse.click();
    }

    @Step("Проверка заголовка анкеты 'Записаться на курс'")
    public void checkoutForm() {
        enrollInCourseJavaPage.checkoutForm.shouldBe(text("Записаться на курс"));
    }
}
