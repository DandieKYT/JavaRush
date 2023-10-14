package tests.mobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LikeCommentTest extends TestBaseMobile {
    @Test
    @DisplayName("Добавление лайка на коментарий")
    public void likeTest() {
        stepsForApp();
        likeCommentStep.commentButton();
        likeCommentStep.addComment();
        likeCommentStep.addSomeText();
        likeCommentStep.sendComment();
        likeCommentStep.checkOutLike();
        likeCommentStep.addLike();
        likeCommentStep.secondAddLike();
        likeCommentStep.secondCheckoutLike();
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
