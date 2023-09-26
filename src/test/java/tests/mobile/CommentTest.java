package tests.mobile;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CommentTest extends TestBaseMobileRemote {
@Test
    public void commTest(){
    $(AppiumBy.id("com.hitechrush.jaxarush:id/commentsButton")).click(); //нажимем на кнопку коментарии
    $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentFab")).click(); // нажимаем добавить комент
    $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentText")).click();
    $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentText")).sendKeys(gen.toString());
    $(AppiumBy.id("com.hitechrush.jaxarush:id/send")).click();
    $$(AppiumBy.className("android.view.View"))
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
