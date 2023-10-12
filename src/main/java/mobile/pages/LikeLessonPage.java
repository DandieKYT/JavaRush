package mobile.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class LikeLessonPage {

    public final static SelenideElement likeCheck = $(AppiumBy.id("com.hitechrush.jaxarush:id/lectureLikesCount"));
    public final static SelenideElement likeButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/likesButton"));
    public final static SelenideElement clickOnLike = $(AppiumBy.id("com.hitechrush.jaxarush:id/itemLikeDesc"));


//    public LikeLessonPage checkValue() {
//        step("Получение количества лайков", () -> {
//            countLike = likeCheck.getText();
//             firstLike = Integer.parseInt(countLike);
//        });
//        return this;
//    }
//
//    public LikeLessonPage likeButton() {
//        step("Нажатие на кнопку лайка", () -> {
//
//            likeButton.click();
//        });
//        return this;
//    }
//    public LikeLessonPage clickOnLike() {
//        step("Подтверждение лайка", () -> {
//            clickOnLike.click();
//        });
//        return this;
//    }
//    public LikeLessonPage secondValueLike() {
//        step("Подтверждение лайка", () -> {
//            countLike = likeCheck.getText();
//             secondLikeInt = Integer.parseInt(countLike);
//        });
//        return this;
//    }
//    public LikeLessonPage checkoutLikes() {
//        step("Подтверждение лайка", () -> {
//            if (secondLikeInt - firstLike == 1) {
//                likeButton.click();
//            }
//            else {
//                System.out.println("Лайк не проставлен");
//            }
//        });
//        return this;
//    }

}
