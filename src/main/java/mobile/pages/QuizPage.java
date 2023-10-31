package mobile.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class QuizPage {

    public final SelenideElement nextButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/nextQuestionButton"));
    public final SelenideElement startQuiz = $(AppiumBy.id("com.hitechrush.jaxarush:id/startQuiz2"));

    public final ElementsCollection radioButton = $$(AppiumBy.id("com.hitechrush.jaxarush:id/answerContainer"));
    public final ElementsCollection pageElementQA = $$(AppiumBy.className("android.widget.ImageView"));
}
