package ui.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class QuizPage {

    public final SelenideElement testBeginButton = $x("//*[@id='id_button_jr_welcome_start_testing']");
    public final SelenideElement nextButton = $x("//button[text()='Далее']");
    public final ElementsCollection radioButton = $$x("//*[contains(@class,'radio-button') and contains(@class,'radio-button--basic') and contains(@class,'svelte')]");
    public final ElementsCollection pageElementQA = $$x("//*[contains(@class,'progress-bar__step')]");
}
