package tests.ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("UITest")
public class CreateAccountTest extends TestBase {
    @Test
    @DisplayName("Создание аккаунта в JAVA-Rush")
    public void startLearnJava() {

        learningStep.startLearnButton();
        learningStep.beginLearnButton();
        learningStep.russianLanguageButton();
        learningStep.qaButton();
        learningStep.blackPictureClick();
        learningStep.notNowButton();
        learningStep.xpInProgrammingNo();
        learningStep.checkOutResult();
    }
}
