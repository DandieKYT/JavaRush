package mobile;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static help.Generations.generationRandomText;
@Tag("Mobile")
@Owner("Кудрявцев Даниил")
@Feature("Автотесты для Mobile")
@Story("Добавление лайка")
public class AddLikeTests extends TestBaseMobile {

    @Test
    @DisplayName("Добавление лайка на коментарий")
    public void addLikeToComment() {
        Common.stepsForApp();
        commentStep.commentButton();
        commentStep.addComment();
        String actualComm = generationRandomText();
        commentStep.addSomeText(actualComm);
        commentStep.sendComment();
        int countFirst = commentStep.parse();
        commentStep.addLike();
        commentStep.secondAddLike();
        int countSecond = commentStep.parse();
        Assertions.assertEquals(1, countSecond - countFirst);
        commentStep.addLike();
        commentStep.deleteComment();
    }

    @Test
    @DisplayName("Добавление лайка на страницу лекции")
    public void addLikeToLesson() {
        Common.stepsForApp();
        int countFirst = lessonStep.parse();
        lessonStep.likeButton();
        lessonStep.clickOnLike();
        int countSecond = lessonStep.parse();
        Assertions.assertEquals(1, countSecond - countFirst);
        lessonStep.likeButton();
    }
}
