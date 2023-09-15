package tests.ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


@Tag("UITest")
public class StartLearningTest extends TestBase {
    public SelenideElement page = $x("(//div[contains(@class,'progress-bar progress-bar--basic svelte')])");
    @Test
    @DisplayName("Создание аккаунта в JAVA-Rush")
    public void startLearnJava() {
        basePage.openPage();
        learningPage.startLearnButton()
                .beginLearnButton()
                .russianLanguageButton()
                .qaButton()
                .blackPictureClick()
                .notNowButton()
                .xpInProgrammingNo()
                .checkOutResult();
    }

    @Test
    @DisplayName("Ответы на вопросы")
    public void someTest() {
        basePage.openPage();
        learningPage.startLearnButton()
                .beginLearnButton()
                .russianLanguageButton()
                .qaButton()
                .blackPictureClick()
                .notNowButton()
                .xpInProgrammingYes()
                .testBeginButton()
                .checkPageLoad();
                 {
                for (int i = 0; i <= page ; i++) {
                    $x("//*[contains(@class,'radio-button radio-button--basic svelte')]").click();
                    $(".btn").click();
                }
        }
    }
}
