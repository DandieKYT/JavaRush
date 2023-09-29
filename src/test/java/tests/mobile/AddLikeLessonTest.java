package tests.mobile;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class AddLikeLessonTest extends TestBaseMobileRemote {
   String countLike;
    @Test
    @DisplayName("Добавление лайка на страницу лекции")
    public void addLikeLesson(){
        stepsForApp();
        countLike = addLikeLessonPage.count.getText();
        $(AppiumBy.id("com.hitechrush.jaxarush:id/likesButton")).click();
        $(AppiumBy.id("com.hitechrush.jaxarush:id/itemLikeDesc")).click();
        addLikeLessonPage.count.shouldNotBe(Condition.text(countLike));
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
