package mobile;

import help.Generations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Mobile")
public class CommentTest extends TestBaseMobile {

    @Test
    public void commTest() {
        Common.stepsForApp();
        comment.commentButton();
        String expectedComm = Generations.generationRandomText();
        comment.addComment();
        comment.inputComment(expectedComm);
        comment.sendComment();
        comment.commentOptions();
        comment.editComment();
        String actualComm = comment.getTexts();
        Assertions.assertEquals(actualComm, expectedComm);
        comment.sendComment();
        comment.authorComment();
        comment.commentOptions();
        comment.deleteComment();
    }
}
