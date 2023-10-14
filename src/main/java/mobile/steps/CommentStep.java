package mobile.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import mobile.pages.CommentPage;
import mobile.pages.Generations;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;
import static mobile.pages.CommentPage.*;

public class CommentStep {
    String name, text;

    @Step("Открытие коментариев")
    public void commentButton() {
            commentButton.click();
            name = Generations.generationRandomName();
            sleep(3000);
    }

    @Step("Добавляем коментарий")
    public void addComment() {
            addComment.click();
    }

    @Step("Генерируем текст комментария")
    public void inputComment() {
            inputComment.click();
            inputComment.sendKeys(name);
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

    @Step("Проверка что коментарий соответсвует написанному ранее")
    public void checkoutComment() {
            text = checkoutText.getText();
            Assertions.assertEquals(text, name);
    }

    @Step("Проверка автора комментария")
    public void authorComment() {
            authorComment.shouldBe(Condition.text("KYT"));
    }

    @Step("Удаление комментария")
    public void deleteComment() {
            deleteComment.click();
    }
}
