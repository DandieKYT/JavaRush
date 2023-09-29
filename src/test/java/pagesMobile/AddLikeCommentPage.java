package pagesMobile;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;

public class AddLikeCommentPage {
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




    public AddLikeCommentPage commentButton() {
        step("Нажатие на кнопку коментария", () -> {
            commentButton.click();
            sleep(3000);
        });
        return this;
    }

    public AddLikeCommentPage addComment() {
        step("Добавление комментария", () -> {
            addComment.click();
        });
        return this;
    }

    public AddLikeCommentPage addSomeText() {
        step("Написание текста коментария", () -> {
            addSomeText.click();
            addSomeText.sendKeys("TEST_LIKE");
        });
        return this;
    }

    public AddLikeCommentPage sendComment() {
        step("Отправка коментария", () -> {
            sendComment.click();
        });
        return this;
    }
    public AddLikeCommentPage checkOutLike() {
        step("Получение количества лайков", () -> {
            countLike = checkLikeValue.getText();
            firstLike = Integer.parseInt(countLike);
        });
        return this;
    }
    public AddLikeCommentPage addLike() {
        step("Нажатие на кнопку лайка", () -> {
            addLike.click();
        });
        return this;
    }
    public AddLikeCommentPage secondAddLike() {
        step("Добавление лайка коментарию", () -> {
            secondAddLike.click();
        });
        return this;
    }
    public AddLikeCommentPage secondCheckoutLike() {
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
