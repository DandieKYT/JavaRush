package tests.ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("UITest")
public class CreateAccountWithQuizTest extends TestBase {
    @Test
    @DisplayName("Создание аккаунта с прохождением теста")
    public void someTest() {
        basePage.openPage();
        learningPage.startLearnButton()
                .beginLearnButton()
                .russianLanguageButton()
                .qaButton()
                .blackPictureClick()
                .notNowButton()
                .xpInProgrammingYes()
                .testBeginButton();
        learningPage.randomCheck();
        learningPage.checkOutResult();
                }
            }



