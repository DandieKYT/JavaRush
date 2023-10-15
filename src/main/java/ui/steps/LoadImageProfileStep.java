package ui.steps;

import io.qameta.allure.Step;

import static ui.pages.LoadImageProfilePage.settings;

public class LoadImageProfileStep {
    @Step("Открытие вкладки 'Настройки'")
    public void openSettings(){
        settings.scrollIntoView(true).click();
    }
}
