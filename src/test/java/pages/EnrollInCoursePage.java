package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class EnrollInCoursePage {
    private SelenideElement
            openJavaUniversity = $x("//*[contains(@class, 'sidebar-group-head--university')]//*[contains(@class, 'sidebar-group-head__link')]"),
            clickButtonEnrollToCourse = $x("//*[contains(@class, 'hero-section__c2a')]//button[text()='Записаться на курс']"),
            checkoutForm = $x("//div[text()='Записаться на курс']");

    public EnrollInCoursePage openJavaUniversity() {
        step("Открытие вкладки Java-университет", () -> {
            openJavaUniversity.click();
            Selenide.switchTo().window(1);
        });
        return this;
    }
    public EnrollInCoursePage clickButtonEnrollToCourse() {
        step("Нажатие на кнопку \"Записаться на курс\"", () -> {
            clickButtonEnrollToCourse.click();
        });
        return this;
    }
    public EnrollInCoursePage checkoutForm() {
        step("Проверка заголовка анкеты\"Записаться на курс\"", () -> {
           checkoutForm.shouldBe(text("Записаться на курс"));
           Selenide.closeWindow();
           Selenide.switchTo().window(0);
        });
        return this;
    }

}
