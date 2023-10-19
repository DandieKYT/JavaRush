package mobile.steps;

import io.qameta.allure.Step;
import mobile.pages.LikeCommentPage;
import mobile.pages.LikeLessonPage;

import static mobile.pages.LikeLessonPage.*;

public class LikeLessonStep {
    LikeLessonPage likeLessonPage = new LikeLessonPage();
    LikeCommentPage likeCommentPage = new LikeCommentPage();

    @Step("Нажатие на кнопку лайка")
    public void likeButton() {
        likeLessonPage.likeButton.click();
    }

    @Step("Подтверждение лайка")
    public void clickOnLike() {
        likeLessonPage.clickOnLike.click();
    }

    @Step("Получение количества лайков")
    public int parse () {
        String getParse = likeCommentPage.checkLikeValue.getText();
        Integer.parseInt(getParse);
        return Integer.parseInt(getParse);
    }
}
