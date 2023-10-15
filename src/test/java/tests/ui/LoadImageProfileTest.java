package tests.ui;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.refresh;


public class LoadImageProfileTest extends TestBase {
    @Test
    @DisplayName("Загрузка картинки в профиль")
    public void imageProfileTest(){
        learnStep.startLearnButton();
        learnStep.beginLearnButton();
        learnStep.russianLanguageButton();
        learnStep.qaButton();
        learnStep.blackPictureClick();
        learnStep.notNowButton();
        learnStep.xpInProgrammingNo();
        learnStep.checkOutResult();
        refresh();



    }
}

