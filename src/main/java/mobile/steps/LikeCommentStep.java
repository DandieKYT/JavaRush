package mobile.steps;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;
import static mobile.pages.LikeCommentPage.*;

public class LikeCommentStep {
    String countLike;
    int firstLike, secondCheckoutLike;


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
    public void checkOutLike() {
            countLike = checkLikeValue.getText();
            firstLike = Integer.parseInt(countLike);
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
    public void secondCheckoutLike() {
            countLike = checkLikeValue.getText();
            secondCheckoutLike = Integer.parseInt(countLike);
            if (secondCheckoutLike - firstLike == 1){
                addLike.click();
                deleteComment.click();
            }
            else {
                System.out.println("Лайк не проставлен");
            }
    }
}
