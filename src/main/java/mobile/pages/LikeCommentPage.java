package mobile.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;

public class LikeCommentPage {
    String countLike;
    int firstLike, secondCheckoutLike;
    private final SelenideElement
            commentButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/commentsButton")),
            addComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentFab")),
            addSomeText = $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentText")),
            sendComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/send")),
            checkLikeValue = $(AppiumBy.id("com.hitechrush.jaxarush:id/likesCount")),
            addLike = $(AppiumBy.id("com.hitechrush.jaxarush:id/commentLike")),
            secondAddLike = $(AppiumBy.id("com.hitechrush.jaxarush:id/itemLikeDesc")),
            deleteComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/deleteButton"));




    public LikeCommentPage commentButton() {
        step("Нажатие на кнопку коментария", () -> {
            commentButton.click();
            sleep(3000);
        });
        return this;
    }

    public LikeCommentPage addComment() {
        step("Добавление комментария", () -> {
            addComment.click();
        });
        return this;
    }

    public LikeCommentPage addSomeText() {
        step("Написание текста коментария", () -> {
            addSomeText.click();
            addSomeText.sendKeys("TEST_LIKE");
        });
        return this;
    }

    public LikeCommentPage sendComment() {
        step("Отправка коментария", () -> {
            sendComment.click();
        });
        return this;
    }
    public LikeCommentPage checkOutLike() {
        step("Получение количества лайков", () -> {
            countLike = checkLikeValue.getText();
            firstLike = Integer.parseInt(countLike);
        });
        return this;
    }
    public LikeCommentPage addLike() {
        step("Нажатие на кнопку лайка", () -> {
            addLike.click();
        });
        return this;
    }
    public LikeCommentPage secondAddLike() {
        step("Добавление лайка коментарию", () -> {
            secondAddLike.click();
        });
        return this;
    }
    public LikeCommentPage secondCheckoutLike() {
        step("Проверка что количество лайков прибавилось на 1", () -> {
            countLike = checkLikeValue.getText();
            secondCheckoutLike = Integer.parseInt(countLike);
            if (secondCheckoutLike - firstLike == 1){
                addLike.click();
                deleteComment.click();
            }
            else {
                System.out.println("Лайк не проставлен");
            }
        });
        return this;
    }
}
