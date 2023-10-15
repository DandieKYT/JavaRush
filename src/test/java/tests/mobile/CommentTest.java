package tests.mobile;

import help.Generations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


import static tests.mobile.Common.stepsForApp;

@Tag("Mobile")
public class CommentTest extends TestBaseMobile {
    @Test
    public void commTest() {
        stepsForApp();
        comment.commentButton();
        String name = Generations.generationRandomText();
        comment.addComment();
        comment.inputComment(name);
        comment.sendComment();
        comment.commentOptions();
        comment.editComment();
        String text = comment.getTexts();
        Assertions.assertEquals(text, name);
        comment.sendComment();
        comment.authorComment();
        comment.commentOptions();
        comment.deleteComment();
    }
}
