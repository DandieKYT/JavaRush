package tests.mobile;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Mobile")
public class CommentTest extends TestBaseMobile {
    @Test
    public void commTest() {
        stepsForApp();
        comment.commentButton()
                .addComment()
                .inputComment()
                .sendComment()
                .commentOptions()
                .editComment()
                .checkoutComment()
                .sendComment()
                .authorComment()
                .commentOptions()
                .deleteComment();
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
