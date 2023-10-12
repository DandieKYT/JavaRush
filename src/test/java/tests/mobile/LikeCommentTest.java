package tests.mobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LikeCommentTest extends TestBaseMobile {
    @Test
    @DisplayName("Добавление лайка на коментарий")
    public void likeTest() {
        stepsForApp();
        likeCommentPage.commentButton()
                .addComment()
                .addSomeText()
                .sendComment()
                .checkOutLike()
                .addLike()
                .secondAddLike()
                .secondCheckoutLike();
    }

    private void stepsForApp() {
        auth.signInLink();
        auth.secretKeyLink();
        auth.loginKey();
        auth.loginButton();
        auth.closeBanner();
        auth.closeSecondBanner();
        auth.openLesson();
    }
}
