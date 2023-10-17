package ui.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static ui.pages.LoadImageProfilePage.*;

public class LoadImageProfileStep {

    @Step("Открытие вкладки 'Настройки'")
    public void openSettings(){
        WebDriverRunner.getWebDriver().manage().window().fullscreen();
        sleep(4000);
        clickImage.click();
        sleep(3000);
        bookmarks.scrollTo();
        settings.click();
    }
    @Step("Нажатие на фотографию профиля")
    public void clickAvatarImage(){
        clickProfilePhoto.click();
    }
    @Step("Загрузка фотографии")
    public void uploadPhoto(){
        uploadPhoto.uploadFromClasspath("testFilePhoto.jpg");
    }
    @Step("Сохранение фотографии профиля")
    public void savePhoto(){
        savePhoto.click();
    }
    @Step("Проверка загрузки фотографии")
    public void checkResult(){
        checkResult.shouldNot(visible);
    }
}
