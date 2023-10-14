package mobile.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import mobile.pages.QuizPage;

import java.util.Random;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;
import static mobile.pages.QuizPage.*;

public class QuizStep {
    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(5);
    }

    @Step("Цикл")
    public void randomCheck() {
        int count = pageElementQA.size();
        for (int i = 0; i < count; i++) {
            sleep(1000);
            Configuration.pageLoadStrategy = "eager";
            radioButton.get(getRandomNumber()).click();
            nextButton.click();
        }
    }

    @Step("Проверка создания курса")
    public void checkoutCourse() {
            Selenide.sleep(11000);
            checkoutCourse.shouldBe(text("Ваш персональный курс готов"));
    }

    @Step("Нажатие кнопки старт")
    public void startButton() {
            startButton.get(0).click();
    }

    @Step("Нажатие кнопки старт")
    public void secondStartButton() {
            secondStartButton.get(0).click();
    }

    @Step("Выбор русского языка")
    public void languageRussian() {
            languageRussian.get(0).click();
    }

    @Step("Выбор направления QA")
    public void qaButton() {
            qaButton.click();
    }

    @Step("Выбор литературного стиля повествования")
    public void literaryStyle() {
            literaryStyle.click();
    }

    @Step("Нажатие на кнопку 'Нет'")
    public void motivationNo() {
            motivationNo.click();
    }

    @Step("Выбор светлой темы")
    public void lightTheme() {
            lightTheme.click();
    }

    @Step("Нажатие на кнопку 'Нет'")
    public void experienceNo() {
            experienceNo.click();
            sleep(2000);
    }

    @Step("Проверка заголовка страницы")
    public void checkoutTitle() {
            checkoutTitle.get(1).shouldHave(Condition.text("Создание аккаунта"));
    }

    @Step("Проверка заголовка страницы")
    public void experienceYes() {
            experienceYes.click();
    }

    @Step("Проверка заголовка страницы")
    public void startQuiz() {
            startQuiz.click();
            Selenide.sleep(2000);
    }
}
