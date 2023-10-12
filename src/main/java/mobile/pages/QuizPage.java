package mobile.pages;

import com.codeborne.selenide.*;
import io.appium.java_client.AppiumBy;

import java.util.Random;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class QuizPage {
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
            checkoutCourse = $(AppiumBy.className("android.widget.TextView")),
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

    public QuizPage checkoutCourse() {
        step("Проверка создания курса", () -> {
            Selenide.sleep(11000);
            checkoutCourse.shouldBe(text("Ваш персональный курс готов"));
        });
        return this;
    }

    public QuizPage startButton() {
        step("Нажатие кнопки старт", () -> {
            startButton.get(0).click();
        });
        return this;
    }

    public QuizPage secondStartButton() {
        step("Нажатие кнопки старт", () -> {
            secondStartButton.get(0).click();
        });
        return this;
    }

    public QuizPage languageRussian() {
        step("Выбор русского языка", () -> {
            languageRussian.get(0).click();
        });
        return this;
    }

    public QuizPage qaButton() {
        step("Выбор направления QA", () -> {
            qaButton.click();
        });
        return this;
    }

    public QuizPage literaryStyle() {
        step("Выбор литературного стиля повествования", () -> {
            literaryStyle.click();
        });
        return this;
    }

    public QuizPage motivationNo() {
        step("Нажатие на кнопку 'Нет'", () -> {
            motivationNo.click();
        });
        return this;
    }

    public QuizPage lightTheme() {
        step("Выбор светлой темы", () -> {
            lightTheme.click();
        });
        return this;
    }

    public QuizPage experienceNo() {
        step("Нажатие на кнопку 'Нет'", () -> {
            experienceNo.click();
            sleep(2000);
        });
        return this;
    }

    public QuizPage checkoutTitle() {
        step("Проверка заголовка страницы", () -> {
            checkoutTitle.get(1).shouldHave(Condition.text("Создание аккаунта"));
        });
        return this;
    }

    public QuizPage experienceYes() {
        step("Проверка заголовка страницы", () -> {
            experienceYes.click();
        });
        return this;
    }

    public QuizPage startQuiz() {
        step("Проверка заголовка страницы", () -> {
            startQuiz.click();
            Selenide.sleep(2000);
        });
        return this;
    }
}
