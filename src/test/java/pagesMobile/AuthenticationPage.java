package pagesMobile;

import com.codeborne.selenide.*;
import io.appium.java_client.AppiumBy;
import pages.EnrollInCoursePage;

import java.util.Random;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class AuthenticationPage {
    private ElementsCollection
            startButton = $$(AppiumBy.id("com.hitechrush.jaxarush:id/start")),
            secondStartButton = $$(AppiumBy.id("com.hitechrush.jaxarush:id/startQuiz1")),
            languageRussian = $$(AppiumBy.className("android.widget.LinearLayout")),
            checkoutTitle = $$(AppiumBy.id("com.hitechrush.jaxarush:id/authHeaderTitle")),
            radioButton = $$(AppiumBy.id("com.hitechrush.jaxarush:id/answerContainer")),
            pageElementQA = $$(AppiumBy.className("android.widget.ImageView"));
    private SelenideElement
            qaButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/qaEngineer")),
            literaryStyle = $(AppiumBy.id("com.hitechrush.jaxarush:id/plotStyleCard")),
            motivationNo = $(AppiumBy.id("com.hitechrush.jaxarush:id/motivationNoCard")),
            lightTheme = $(AppiumBy.id("com.hitechrush.jaxarush:id/quizThemeLight")),
            experienceNo = $(AppiumBy.id("com.hitechrush.jaxarush:id/experienceNo")),
            experienceYes = $(AppiumBy.id("com.hitechrush.jaxarush:id/experienceYes")),
            nextButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/nextQuestionButton")),
            startQuiz = $(AppiumBy.id("com.hitechrush.jaxarush:id/startQuiz2"));


    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(5);
    }

    public void randomCheck() {
            int count = pageElementQA.size();
            for (int i = 0; i < count; i++) {
                sleep(1000);
                Configuration.pageLoadStrategy = "eager";
                radioButton.get(getRandomNumber()).click();
                nextButton.click();
            }
        }



    public AuthenticationPage startButton() {
        step("Нажатие кнопки старт", () -> {
            startButton.get(0).click();
        });
        return this;
    }

    public AuthenticationPage secondStartButton() {
        step("Нажатие кнопки старт", () -> {
            secondStartButton.get(0).click();
        });
        return this;
    }

    public AuthenticationPage languageRussian() {
        step("Выбор русского языка", () -> {
            languageRussian.get(0).click();
        });
        return this;
    }

    public AuthenticationPage qaButton() {
        step("Выбор направления QA", () -> {
            qaButton.click();
        });
        return this;
    }

    public AuthenticationPage literaryStyle() {
        step("Выбор литературного стиля повествования", () -> {
            literaryStyle.click();
        });
        return this;
    }

    public AuthenticationPage motivationNo() {
        step("Нажатие на кнопку 'Нет'", () -> {
            motivationNo.click();
        });
        return this;
    }

    public AuthenticationPage lightTheme() {
        step("Выбор светлой темы", () -> {
            lightTheme.click();
        });
        return this;
    }

    public AuthenticationPage experienceNo() {
        step("Нажатие на кнопку 'Нет'", () -> {
            experienceNo.click();
            sleep(2000);
        });
        return this;
    }

    public AuthenticationPage checkoutTitle() {
        step("Проверка заголовка страницы", () -> {
            checkoutTitle.get(1).shouldHave(Condition.text("Создание аккаунта"));
        });
        return this;
    }

    public AuthenticationPage experienceYes() {
        step("Проверка заголовка страницы", () -> {
            experienceYes.click();
        });
        return this;
    }

    public AuthenticationPage startQuiz() {
        step("Проверка заголовка страницы", () -> {
            startQuiz.click();
        });
        return this;
    }
}
