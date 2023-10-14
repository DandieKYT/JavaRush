package tests.mobile;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static tests.mobile.Common.stepsForApp;

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
}
