package tests.mobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AddLikeLessonTest extends TestBaseMobileRemote {
    @Test
    @DisplayName("Добавление лайка на страницу лекции")
    public void addLikeLesson(){
        stepsForApp();

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
