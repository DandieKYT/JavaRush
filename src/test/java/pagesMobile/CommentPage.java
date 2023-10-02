package pagesMobile;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Assertions;


import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static pagesMobile.Generations.generationRandomName;

public class CommentPage {
    String name, text;
    private final   SelenideElement
            checkoutText = $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentText")),
            commentButton =$(AppiumBy.id("com.hitechrush.jaxarush:id/commentsButton")),
            addComment =  $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentFab")),
            inputComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentText")),
            sendComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/send")),
            commentOptions = $(AppiumBy.xpath("(//android.widget.ImageView[@content-desc=\"JavaRush\"])[2]")),
            editComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/editButton")),
            authorComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/userDisplayName")),
            deleteComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/deleteButton"));

    public CommentPage commentButton() {
        step("Открытие коментариев", () -> {
            commentButton.click();
            name = generationRandomName();
            sleep(3000);
        });
        return this;
    }
    public CommentPage addComment() {
        step("Добавляем коментарий", () -> {
           addComment.click();
        });
        return this;
    }
    public CommentPage inputComment() {
        step("Генерируем текст комментария", () -> {
            inputComment.click();
            inputComment.sendKeys(name);
        });
        return this;
    }
    public CommentPage sendComment() {
        step("Нажатие на кнопку отправить", () -> {
            sendComment.click();
        });
        return this;
    }
    public CommentPage commentOptions() {
        step("Открываем опции комментария", () -> {
            commentOptions.click();
        });
        return this;
    }
    public CommentPage editComment() {
        step("Нажатите на кнопку редактировать", () -> {
            editComment.click();
        });
        return this;
    }
    public CommentPage checkoutComment() {
        step("Проверка что коментарий соответсвует написанному ранее", () -> {
            text = checkoutText.getText();
            Assertions.assertEquals(text, name);
        });
        return this;
    }
    public CommentPage authorComment() {
        step("Проверка автора комментария", () -> {
            authorComment.shouldBe(Condition.text("KYT"));
        });
        return this;
    }
    public CommentPage deleteComment() {
        step("Удаление комментария", () -> {
            deleteComment.click();
        });
        return this;
    }

}
