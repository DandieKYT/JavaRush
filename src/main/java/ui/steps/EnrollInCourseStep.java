package ui.steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static ui.pages.EnrollInCoursePage.*;

public class EnrollInCourseStep {

    @Step("Открытие вкладки Java-университет")
    public void openJavaUniversity() {
        open("/");
        openJavaUniversity.click();
        switchTo().window(1);
    }

    @Step("Нажатие на кнопку 'Записаться на курс'")
    public void clickButtonEnrollToCourse() {
        clickButtonEnrollToCourse.click();
    }

    @Step("Проверка заголовка анкеты 'Записаться на курс'")
    public void checkoutForm() {
        checkoutForm.shouldBe(text("Записаться на курс"));
        closeWindow();
        switchTo().window(0);
    }
}
