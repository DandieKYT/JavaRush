package mobile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static help.Generations.generationRandomText;

public class AddLikeTests extends TestBaseMobile {

    @Test
    @DisplayName("Добавление лайка на коментарий")
    public void addLikeToComment() {
        Common.stepsForApp();
        likeCommentStep.commentButton();
        likeCommentStep.addComment();
        String actualComm = generationRandomText();
        likeCommentStep.addSomeText(actualComm);
        likeCommentStep.sendComment();
        int countFirst = likeCommentStep.parse();
        likeCommentStep.addLike();
        likeCommentStep.secondAddLike();
        int countSecond = likeCommentStep.parse();
        Assertions.assertEquals(1, countSecond - countFirst);
        likeCommentStep.addLike();
        likeCommentStep.deleteComm();
    }

    @Test
    @DisplayName("Добавление лайка на страницу лекции")
    public void addLikeToLesson() {
        Common.stepsForApp();
        int countFirst = likeLessonStep.parse();
        likeLessonStep.likeButton();
        likeLessonStep.clickOnLike();
        int countSecond = likeLessonStep.parse();
        Assertions.assertEquals(1, countSecond - countFirst);
        likeLessonStep.likeButton();
    }
}
