package mobile.pages;

import com.codeborne.selenide.*;
import io.appium.java_client.AppiumBy;

import java.util.Random;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class QuizPage {

    public final ElementsCollection startButton = $$(AppiumBy.id("com.hitechrush.jaxarush:id/start"));
    public final ElementsCollection secondStartButton = $$(AppiumBy.id("com.hitechrush.jaxarush:id/startQuiz1"));
    public final ElementsCollection languageRussian = $$(AppiumBy.className("android.widget.LinearLayout"));
    public final ElementsCollection checkoutTitle = $$(AppiumBy.id("com.hitechrush.jaxarush:id/authHeaderTitle"));
    public final ElementsCollection radioButton = $$(AppiumBy.id("com.hitechrush.jaxarush:id/answerContainer"));
    public final ElementsCollection pageElementQA = $$(AppiumBy.className("android.widget.ImageView"));


    public final SelenideElement qaButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/qaEngineer"));
    public final SelenideElement literaryStyle = $(AppiumBy.id("com.hitechrush.jaxarush:id/plotStyleCard"));
    public final SelenideElement motivationNo = $(AppiumBy.id("com.hitechrush.jaxarush:id/motivationNoCard"));
    public final SelenideElement lightTheme = $(AppiumBy.id("com.hitechrush.jaxarush:id/quizThemeLight"));
    public final SelenideElement experienceNo = $(AppiumBy.id("com.hitechrush.jaxarush:id/experienceNo"));
    public final SelenideElement experienceYes = $(AppiumBy.id("com.hitechrush.jaxarush:id/experienceYes"));
    public final SelenideElement nextButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/nextQuestionButton"));
    public final SelenideElement checkoutCourse = $(AppiumBy.className("android.widget.TextView"));
    public final SelenideElement startQuiz = $(AppiumBy.id("com.hitechrush.jaxarush:id/startQuiz2"));
}
