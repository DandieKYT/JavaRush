package pagesMobile;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class AddLikeLessonPage {
    String count, countLike;
    int secondLikeInt, firstLike;
    public SelenideElement

            likeCheck = $(AppiumBy.id("com.hitechrush.jaxarush:id/lectureLikesCount")),
            likeButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/likesButton")),
            clickOnLike = $(AppiumBy.id("com.hitechrush.jaxarush:id/itemLikeDesc"));


    public AddLikeLessonPage checkValue() {
        step("Получение количества лайков", () -> {
            countLike = likeCheck.getText();
            int firstLike = Integer.parseInt(countLike);
        });
        return this;
    }

    public AddLikeLessonPage likeButton() {
        step("Нажатие на кнопку лайка", () -> {

            likeButton.click();
        });
        return this;
    }
    public AddLikeLessonPage clickOnLike() {
        step("Подтверждение лайка", () -> {
            clickOnLike.click();
        });
        return this;
    }
    public AddLikeLessonPage secondValueLike() {
        step("Подтверждение лайка", () -> {
            countLike = likeCheck.getText();
            int secondLikeInt = Integer.parseInt(countLike);
        });
        return this;
    }
    public AddLikeLessonPage checkoutLikes() {
        step("Подтверждение лайка", () -> {
            if (secondLikeInt - firstLike == 1) {
                likeButton.click();
            }
            else {
                System.out.println("Лайк не проставлен");
            }
        });
        return this;
    }

}
