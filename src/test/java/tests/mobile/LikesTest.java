package tests.mobile;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static tests.mobile.Common.stepsForApp;

public class LikesTest extends TestBaseMobile {
    @Test
    @DisplayName("Добавление лайка на коментарий")
    public void likeTest() {
        stepsForApp();
        likeCommentStep.commentButton();
        likeCommentStep.addComment();
        likeCommentStep.addSomeText();
        likeCommentStep.sendComment();
        int countFirst = likeCommentStep.checkOutLike();
        likeCommentStep.addLike();
        likeCommentStep.secondAddLike();
        int countSecond = likeCommentStep.secondCheckoutLike();
        Assertions.assertEquals(1, countSecond - countFirst);
        likeCommentStep.deleteComm();
    }

    @Test
    @DisplayName("Добавление лайка на страницу лекции")
    public void addLikeLesson() {
        stepsForApp();
        int countFirst = likeLessonStep.checkValue();
        likeLessonStep.likeButton();
        likeLessonStep.clickOnLike();
        int countSecond = likeLessonStep.secondValueLike();
        Assertions.assertEquals(1, countSecond - countFirst);
        likeLessonStep.likeButton();
    }
}
