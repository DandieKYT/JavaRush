package ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class EnrollInCoursePage {

    public final SelenideElement openJavaUniversity = $x("//a[contains(text(),'Java‑университет')]");
    public final SelenideElement clickButtonEnrollToCourse = $x("//*[contains(@class, 'hero-section')]//button[text()='Записаться на курс']");
    public final SelenideElement checkoutForm = $x("//div[text()='Записаться на курс']");
}
