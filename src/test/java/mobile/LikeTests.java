package mobile;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static helpMobile.Generations.generationRandomText;

@Tag("Mobile")
@Story("Лайк")
@Owner("Кудрявцев Даниил")
@Feature("Автотесты для Mobile")
public class LikeTests extends TestBaseMobile {

    @Test
    @DisplayName("Добавление лайка на коментарий")
    public void addLikeToComment() {
        Common.stepsForApp();
        commentStep.commentButton();
        commentStep.addComment();
        String actualComm = generationRandomText();
        commentStep.addSomeText(actualComm);
        commentStep.sendComment();
        int countFirst = likeStep.parse();
        likeStep.addLike();
        likeStep.secondAddLike();
        int countSecond = likeStep.parse();
        Assertions.assertEquals(1, countSecond - countFirst);
        likeStep.addLike();
        commentStep.deleteComment();
    }

    @Test
    @DisplayName("Добавление лайка на страницу лекции")
    public void addLikeToLesson() {
        Common.stepsForApp();
        int countFirst = likeStep.parse();
        likeStep.likeButton();
        likeStep.clickOnLike();
        int countSecond = likeStep.parse();
        Assertions.assertEquals(1, countSecond - countFirst);
        likeStep.likeButton();
    }
}
