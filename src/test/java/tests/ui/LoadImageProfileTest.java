package tests.ui;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.refresh;
import static tests.ui.Common.stepsForWebApp;


public class LoadImageProfileTest extends TestBase {
    @Test
    @DisplayName("Загрузка картинки в профиль")
    public void imageProfileTest(){
       stepsForWebApp();
        refresh();



    }
}

