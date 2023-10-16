package ui.steps;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
import static ui.pages.LoadImageProfilePage.*;

public class LoadImageProfileStep {

    @Step("Открытие вкладки 'Настройки'")
    public void openSettings(){
        sleep(2000);
        bookmarks.scrollTo();
        settings.click();
    }




}
