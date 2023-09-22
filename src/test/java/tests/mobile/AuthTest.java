package tests.mobile;

import com.codeborne.selenide.Selenide;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class AuthTest extends TestBaseMobileRemote {
    @Test
    void checkoutTest() {
        auth.startButton()
                .secondStartButton()
                .languageRussian()
                .qaButton()
                .literaryStyle()
                .motivationNo()
                .lightTheme()
                .experienceNo()
                .checkoutTitle();
    }

    @Test
    void testWithTest() {
        auth.startButton()
                .secondStartButton()
                .languageRussian()
                .qaButton()
                .literaryStyle()
                .motivationNo()
                .lightTheme()
                .experienceYes()
                .startQuiz();
        Selenide.sleep(2000);
            auth.randomCheck();


//        com.hitechrush.jaxarush:id/questionsProgressContainer кол во вопросов
        //        com.hitechrush.jaxarush:id/answerContainer ответы
        // com.hitechrush.jaxarush:id/nextQuestionButton нажать на кнопку далее
    }

}