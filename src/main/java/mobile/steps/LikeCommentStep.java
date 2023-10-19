package mobile.steps;


import io.qameta.allure.Step;
import mobile.pages.LikePage;

import static com.codeborne.selenide.Selenide.sleep;

public class LikeCommentStep {

    LikePage likePage = new LikePage();

    @Step("Нажатие на кнопку коментария")
    public void commentButton() {
        likePage.commentButton.click();
        sleep(3000);
    }

    @Step("Добавление комментария")
    public void addComment() {
        likePage.addComment.click();
    }

    @Step("Написание текста коментария")
    public void addSomeText(String textComm) {
        likePage.addSomeText.click();
        likePage.addSomeText.sendKeys(textComm);
    }

    @Step("Отправка коментария")
    public void sendComment() {
        likePage.sendComment.click();
    }

    @Step("Нажатие на кнопку лайка")
    public void addLike() {
        likePage.addLike.click();
    }

    @Step("Добавление лайка коментарию")
    public void secondAddLike() {
        likePage.secondAddLike.click();
    }

    @Step("Удаление комментария")
    public void deleteComm() {
        likePage.deleteComment.click();
    }

    @Step("Получение количества лайков")
    public int parse() {
        String getParse = likePage.checkLikeValue.getText();
        Integer.parseInt(getParse);
        return Integer.parseInt(getParse);
    }
}

