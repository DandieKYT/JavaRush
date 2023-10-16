package ui.steps;

import io.qameta.allure.Step;

import static ui.pages.LoadImageProfilePage.collapseMenu;
import static ui.pages.LoadImageProfilePage.settings;

public class LoadImageProfileStep {

    @Step("Нажатие на кнопку свернуть меню")
    public void collapseMenu(){
        collapseMenu.click();
    }
    @Step("Открытие вкладки 'Настройки'")
    public void openSettings(){
        settings.scrollIntoView(true).click();
    }




}
