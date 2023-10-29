package mobile;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import mobile.steps.Common;
import mobile.steps.GenerationStep;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Mobile")
@Owner("Кудрявцев Даниил")
@Feature("Автотесты для Mobile")
@Story("Страница комментариев")
public class CommentTest extends TestBaseMobile {

    @DisplayName("Добавление коментария и проверка его автора и текста")
    @Test
    public void addCommentAndCheckoutAuthorAndText() {
        Common.stepsForApp();
        commentStep.commentButton();
        String expectedComm = GenerationStep.generationRandomText();
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
