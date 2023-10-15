package mobile.steps;


import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;


import static com.codeborne.selenide.Selenide.sleep;

import static mobile.pages.LikeCommentPage.*;

public class LikeCommentStep {

    @Step("Нажатие на кнопку коментария")
    public void commentButton() {
        commentButton.click();
        sleep(3000);
    }


    @Step("Добавление комментария")
    public void addComment() {
        addComment.click();
    }

    @Step("Написание текста коментария")
    public void addSomeText() {
        addSomeText.click();
        addSomeText.sendKeys("TEST_LIKE");
    }

    @Step("Отправка коментария")
    public void sendComment() {
        sendComment.click();
    }

    @Step("Получение количества лайков")
    public static int checkOutLike() {
        return parse();
    }

    @Step("Нажатие на кнопку лайка")
    public void addLike() {
        addLike.click();
    }

    @Step("Добавление лайка коментарию")
    public void secondAddLike() {
        secondAddLike.click();
    }

    @Step("Проверка что количество лайков прибавилось на 1")
    public static int secondCheckoutLike() {
        return parse();
    }
    public void deleteComm () {
        addLike.click();
        deleteComment.click();
    }

        public static int parse () {
            String getParse = checkLikeValue.getText();
            Integer.parseInt(getParse);
            return Integer.parseInt(getParse);
        }
    }

