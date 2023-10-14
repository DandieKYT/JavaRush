package mobile.pages;

import com.codeborne.selenide.*;
import io.appium.java_client.AppiumBy;

import java.util.Random;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class QuizPage {
    public static final ElementsCollection startButton = $$(AppiumBy.id("com.hitechrush.jaxarush:id/start"));
    public static final ElementsCollection secondStartButton = $$(AppiumBy.id("com.hitechrush.jaxarush:id/startQuiz1"));
    public static final ElementsCollection languageRussian = $$(AppiumBy.className("android.widget.LinearLayout"));
    public static final ElementsCollection checkoutTitle = $$(AppiumBy.id("com.hitechrush.jaxarush:id/authHeaderTitle"));
    public static final ElementsCollection radioButton = $$(AppiumBy.id("com.hitechrush.jaxarush:id/answerContainer"));
    public static final ElementsCollection pageElementQA = $$(AppiumBy.className("android.widget.ImageView"));
    public static final SelenideElement qaButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/qaEngineer"));
    public static final SelenideElement literaryStyle = $(AppiumBy.id("com.hitechrush.jaxarush:id/plotStyleCard"));
    public static final SelenideElement motivationNo = $(AppiumBy.id("com.hitechrush.jaxarush:id/motivationNoCard"));
    public static final SelenideElement lightTheme = $(AppiumBy.id("com.hitechrush.jaxarush:id/quizThemeLight"));
    public static final SelenideElement experienceNo = $(AppiumBy.id("com.hitechrush.jaxarush:id/experienceNo"));
    public static final SelenideElement experienceYes = $(AppiumBy.id("com.hitechrush.jaxarush:id/experienceYes"));
    public static final SelenideElement nextButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/nextQuestionButton"));
    public static final SelenideElement checkoutCourse = $(AppiumBy.className("android.widget.TextView"));
    public static final SelenideElement startQuiz = $(AppiumBy.id("com.hitechrush.jaxarush:id/startQuiz2"));

}
