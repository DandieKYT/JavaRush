package tests.mobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Mobile")
public class LikeLessonTest extends TestBaseMobile {

    @Test
    @DisplayName("Добавление лайка на страницу лекции")
    public void addLikeLesson() {
        stepsForApp();
        likeLessonStep.checkValue();
        likeLessonStep.likeButton();
        likeLessonStep.clickOnLike();
        likeLessonStep.secondValueLike();
        likeLessonStep.checkoutLikes();
    }


    private void stepsForApp() {
        auth.signInLink();
        auth.secretKeyLink();
        auth.loginKey();
        auth.loginButton();
        auth.closeBanner();
        auth.closeSecondBanner();
        auth.openLesson();
    }
}
