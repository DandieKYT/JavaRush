package mobile.steps;

import io.qameta.allure.Step;
import mobile.pages.LikePage;

public class LikeStep {

    LikePage likePage = new LikePage();

    @Step("Нажатие на кнопку лайка комментария")
    public void addLike() {
        likePage.addLike.click();
    }

    @Step("Добавление лайка комментарию")
    public void secondAddLike() {
        likePage.secondAddLike.click();
    }

    @Step("Получение количества лайков")
    public int parse() {
        String getParse = likePage.checkLikeValue.getText();
        Integer.parseInt(getParse);
        return Integer.parseInt(getParse);
    }

    @Step("Нажатие на кнопку лайка на странице лекции")
    public void likeButton() {
        likePage.likeButton.click();
    }

    @Step("Подтверждение лайка на странице лекции")
    public void clickOnLike() {
        likePage.clickOnLike.click();
    }
}
