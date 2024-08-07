package ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class EnrollInCourseJavaPage {

    public final SelenideElement clickButtonEnrollToCourse = $x("//*[contains(@class, 'btn--dark')]//span[text()='Записаться на курс']");
    public final SelenideElement checkoutForm = $x("//div[text()='Записаться на курс']");
}
