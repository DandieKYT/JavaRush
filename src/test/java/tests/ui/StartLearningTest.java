package tests.ui;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StartLearningTest extends TestBase {
    @Test
    @DisplayName("Создание аккаунта в JAVA-Rush")
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
        learningPage.getButtonLearn();
        basePage.openPage();
        learningPage.profileName();
    }
}
