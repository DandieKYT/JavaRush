package mobile.steps;

import io.qameta.allure.Step;

import static mobile.pages.LikeCommentPage.checkLikeValue;
import static mobile.pages.LikeLessonPage.*;

public class LikeLessonStep {

    @Step("Получение количества лайков")
    public  static int checkValue() {
            return parse();
    }

    @Step("Нажатие на кнопку лайка")
    public void likeButton() {
            likeButton.click();
    }

    @Step("Подтверждение лайка")
    public void clickOnLike() {
            clickOnLike.click();
    }

    @Step("Подтверждение лайка")
    public static int secondValueLike() {
            return parse();
    }

    public static int parse () {
        String getParse = checkLikeValue.getText();
        Integer.parseInt(getParse);
        return Integer.parseInt(getParse);
    }
}
