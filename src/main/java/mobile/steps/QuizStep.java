package mobile.steps;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import mobile.pages.QuizPage;

import java.util.Random;

import static com.codeborne.selenide.Selenide.sleep;

public class QuizStep {
    QuizPage quizPage = new QuizPage();
    @Step("Проверка заголовка страницы")
    public void startQuiz() {
        quizPage.startQuiz.click();
        Selenide.sleep(2000);
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(5);
    }

    @Step("Цикл")
    public void randomCheck() {
        int count = quizPage.pageElementQA.size();
        for (int i = 0; i < count; i++) {
            sleep(1000);
            Configuration.pageLoadStrategy = "eager";
            quizPage.radioButton.get(getRandomNumber()).click();
            quizPage.nextButton.click();
        }
    }
}
