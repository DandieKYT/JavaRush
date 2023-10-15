package mobile.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;
import static mobile.pages.CommentPage.*;

public class CommentStep {

    @Step("Открытие коментариев")
    public void commentButton() {
        commentButton.click();
        sleep(3000);
    }

    @Step("Добавляем коментарий")
    public void addComment() {
        addComment.click();
    }

    @Step("Генерируем текст комментария")
    public void inputComment(String name) {
        inputComment.click();
        inputComment.sendKeys();
    }

    @Step("Нажатие на кнопку отправить")
    public void sendComment() {
        sendComment.click();
    }

    @Step("Открываем опции комментария")
    public void commentOptions() {
        commentOptions.click();
    }

    @Step("Нажатите на кнопку редактировать")
    public void editComment() {
        editComment.click();
    }

    @Step("Проверка автора комментария")
    public void authorComment() {
        authorComment.shouldBe(Condition.text("KYT"));
    }

    @Step("Удаление комментария")
    public void deleteComment() {
        deleteComment.click();
    }

    public static String getTexts() {
        checkoutText.getText();
        return checkoutText.getText();
    }
}

