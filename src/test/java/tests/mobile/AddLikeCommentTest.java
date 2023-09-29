package tests.mobile;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class AddLikeCommentTest extends TestBaseMobile {
    @Test
    @DisplayName("Добавление лайка на коментарий")
    public void likeTest() {
        stepsForApp();
        addLikeCommentPage.commentButton()
                .addComment()
                .addSomeText()
                .sendComment()
                .checkOutLike()
                .addLike()
                .secondAddLike()
                .secondCheckoutLike();



    }


    private void stepsForApp() {
        auth.signInLink()
                .secretKeyLink()
                .loginKey()
                .loginButton()
                .closeBanner()
                .closeSecondBanner()
                .openLesson();
    }
}
