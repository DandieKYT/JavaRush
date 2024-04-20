package mobile.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import mobile.pages.CommentPage;

import static com.codeborne.selenide.Selenide.sleep;

public class CommentStep {

    CommentPage commentPage = new CommentPage();

    @Step("Открытие коментариев")
    public void commentButton() {
        commentPage.commentButton.click();
        sleep(3000);
    }

    @Step("Добавляем коментарий")
    public void addComment() {
        commentPage.addComment.click();
    }

    @Step("Генерируем текст комментария")
    public void inputComment(String actual) {
        commentPage.inputComment.click();
        commentPage.inputComment.sendKeys(actual);
    }

    @Step("Нажатие на кнопку отправить")
    public void sendComment() {
        commentPage.sendComment.click();
    }

    @Step("Открываем опции комментария")
    public void commentOptions() {
        commentPage.commentOptions.click();
    }

    @Step("Нажатите на кнопку редактировать")
    public void editComment() {
        commentPage.editComment.click();
    }

    @Step("Проверка автора комментария")
    public void authorComment() {
        commentPage.authorComment.shouldBe(Condition.text("KYT"));
    }

    @Step("Удаление комментария")
    public void deleteComment() {
        commentPage.deleteComment.click();
    }

    public String getTexts() {
        return commentPage.checkoutText.getText();
    }

    @Step("Написание текста коментария")
    public void addSomeText(String textComm) {
        commentPage.addSomeText.click();
        commentPage.addSomeText.sendKeys(textComm);
    }
}

