package tests.ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("UITest")
public class CreateAccountWithQuizTest extends TestBase {
    @Test
    @DisplayName("Создание аккаунта с прохождением теста")
    public void someTest() {
        learningStep.startLearnButton();
        learningStep.beginLearnButton();
        learningStep.russianLanguageButton();
        learningStep.qaButton();
        learningStep.blackPictureClick();
        learningStep.notNowButton();
        learningStep.xpInProgrammingYes();
        learningStep.testBeginButton();
        learningStep.randomCheck();
        learningStep.checkOutResult();
    }
}



