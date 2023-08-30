package tests.ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StartLearningTest extends TestBase {
    @Test
    @DisplayName("Начать обучение")
    public void startLearnJava(){
        basePage.openPage();
        learningPage.startLearnButton();
        learningPage.beginLearnButton();
        learningPage.russianLanguageButton();
        learningPage.qaButton();
        learningPage.blackPictureClick();
        learningPage.notNowButton();
        learningPage.xpInProgrammingNo();
        learningPage.checkOutResult();
    }
}
