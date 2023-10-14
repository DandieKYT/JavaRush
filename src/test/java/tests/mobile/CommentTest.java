package tests.mobile;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Mobile")
public class CommentTest extends TestBaseMobile {
    @Test
    public void commTest() {
        stepsForApp();
        comment.commentButton();
        comment.addComment();
        comment.inputComment();
        comment.sendComment();
        comment.commentOptions();
        comment.editComment();
        comment.checkoutComment();
        comment.sendComment();
        comment.authorComment();
        comment.commentOptions();
        comment.deleteComment();
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
