package ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class EnrollInCoursePage {

    public static final SelenideElement openJavaUniversity = $x("//*[contains(@class, 'sidebar-group-head--university')]//*[contains(@class, 'sidebar-group-head__link')]");
    public static final SelenideElement clickButtonEnrollToCourse = $x("//*[contains(@class, 'hero-section__c2a')]//button[text()='Записаться на курс']");
    public static final SelenideElement checkoutForm = $x("//div[text()='Записаться на курс']");
}
