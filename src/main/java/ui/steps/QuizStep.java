package ui.steps;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import ui.pages.QuizPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.refresh;
import static com.codeborne.selenide.Selenide.sleep;
import static help.GenerationData.getRandomNumber;

public class QuizStep {

    QuizPage quizPage = new QuizPage();

    @Step("Цикл")
    public void randomCheck() {
        quizPage.nextButton.shouldBe((visible).because("Не видна кнопка 'Далее'"));
        if (quizPage.radioButton.size() > 1 && quizPage.nextButton.has(visible)) {
            int count = quizPage.pageElementQA.size();
            for (int i = 0; i < count; i++) {
                sleep(1000);
                Configuration.pageLoadStrategy = "eager";
                quizPage.radioButton.get(getRandomNumber()).click();
                quizPage.nextButton.click();
            }
        }
    }

    @Step("Нажатие на кнопку 'Начать'")
    public void testBeginButton() {
        quizPage.testBeginButton.shouldBe((visible).because("Не получилось набрать")).click();
        refresh();
    }
}
