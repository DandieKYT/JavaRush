package mobile.steps;

import io.qameta.allure.Step;

import static mobile.pages.LikeLessonPage.*;

public class LikeLessonStep {
    String countLike;
    int secondLikeInt, firstLike;
//    private final SelenideElement
//
//            likeCheck = $(AppiumBy.id("com.hitechrush.jaxarush:id/lectureLikesCount")),
//            likeButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/likesButton")),
//            clickOnLike = $(AppiumBy.id("com.hitechrush.jaxarush:id/itemLikeDesc"));

    @Step("Получение количества лайков")
    public void checkValue() {
            countLike = likeCheck.getText();
             firstLike = Integer.parseInt(countLike);
    }

    @Step("Нажатие на кнопку лайка")
    public void likeButton() {
            likeButton.click();
    }

    @Step("Подтверждение лайка")
    public void clickOnLike() {
            clickOnLike.click();
    }

    @Step("Подтверждение лайка")
    public void secondValueLike() {
            countLike = likeCheck.getText();
             secondLikeInt = Integer.parseInt(countLike);
    }

    @Step("Подтверждение лайка")
    public void checkoutLikes() {
            if (secondLikeInt - firstLike == 1) {
                likeButton.click();
            }
            else {
                System.out.println("Лайк не проставлен");
            }
    }
}
