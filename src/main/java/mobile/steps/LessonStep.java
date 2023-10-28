package mobile.steps;

import io.qameta.allure.Step;
import mobile.pages.LessonPage;

public class LessonStep {

    LessonPage lessonPage = new LessonPage();

    @Step("Нажатие на кнопку лайка")
    public void likeButton() {
        lessonPage.likeButton.click();
    }

    @Step("Подтверждение лайка")
    public void clickOnLike() {
        lessonPage.clickOnLike.click();
    }

    @Step("Получение количества лайков")
    public int parse() {
        String getParse = lessonPage.checkLikeValue.getText();
        Integer.parseInt(getParse);
        return Integer.parseInt(getParse);
    }
}
