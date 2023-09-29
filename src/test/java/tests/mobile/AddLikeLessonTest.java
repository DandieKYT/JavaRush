package tests.mobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AddLikeLessonTest extends TestBaseMobile {

    @Test
    @DisplayName("Добавление лайка на страницу лекции")
    public void addLikeLesson() {
        stepsForApp();
        addLikeLessonPage.checkValue()
                .likeButton()
                .clickOnLike()
                .secondValueLike()
                .checkoutLikes();
    }


    private void stepsForApp() {
        auth.signInLink()
                .secretKeyLink()
                .loginKey()
                .loginButton()
                .closeBanner()
                .closeSecondBanner()
                .openLesson();
    }
}
