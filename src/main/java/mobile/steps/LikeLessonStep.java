package mobile.steps;

import io.qameta.allure.Step;
import mobile.pages.LikePage;


public class LikeLessonStep {

    LikePage likePage = new LikePage();

    @Step("Нажатие на кнопку лайка")
    public void likeButton() {
        likePage.likeButton.click();
    }

    @Step("Подтверждение лайка")
    public void clickOnLike() {
        likePage.clickOnLike.click();
    }

    @Step("Получение количества лайков")
    public int parse() {
        String getParse = likePage.checkLikeValue.getText();
        Integer.parseInt(getParse);
        return Integer.parseInt(getParse);
    }
}
