package mobile.steps;


import io.qameta.allure.Step;
import mobile.pages.LikeCommentPage;
import org.junit.jupiter.api.Assertions;


import static com.codeborne.selenide.Selenide.sleep;

import static mobile.pages.LikeCommentPage.*;

public class LikeCommentStep {

    LikeCommentPage likeCommentPage = new LikeCommentPage();

    @Step("Нажатие на кнопку коментария")
    public void commentButton() {
        likeCommentPage.commentButton.click();
        sleep(3000);
    }


    @Step("Добавление комментария")
    public void addComment() {
        likeCommentPage.addComment.click();
    }

    @Step("Написание текста коментария")
    public void addSomeText(String textComm) {
        likeCommentPage.addSomeText.click();
        likeCommentPage.addSomeText.sendKeys(textComm);
    }

    @Step("Отправка коментария")
    public void sendComment() {
        likeCommentPage.sendComment.click();
    }

    @Step("Нажатие на кнопку лайка")
    public void addLike() {
        likeCommentPage.addLike.click();
    }

    @Step("Добавление лайка коментарию")
    public void secondAddLike() {
        likeCommentPage.secondAddLike.click();
    }

    @Step("Удаление комментария")
    public void deleteComm () {
        likeCommentPage.deleteComment.click();
    }
    @Step("Получение количества лайков")
        public  int parse () {
            String getParse = likeCommentPage.checkLikeValue.getText();
            Integer.parseInt(getParse);
            return Integer.parseInt(getParse);
        }
    }

