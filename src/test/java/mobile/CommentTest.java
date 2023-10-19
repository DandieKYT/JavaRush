package mobile;

import help.Generations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Mobile")
public class CommentTest extends TestBaseMobile {

    @DisplayName("Добавление коментария и проверка его автора и текста")
    @Test
    public void addCommAndDelete() {
        Common.stepsForApp();
        commentStep.commentButton();
        String expectedComm = Generations.generationRandomText();
        commentStep.addComment();
        commentStep.inputComment(expectedComm);
        commentStep.sendComment();
        commentStep.commentOptions();
        commentStep.editComment();
        String actualComm = commentStep.getTexts();
        Assertions.assertEquals(actualComm, expectedComm);
        commentStep.sendComment();
        commentStep.authorComment();
        commentStep.commentOptions();
        commentStep.deleteComment();
    }
}
