package tests.mobile;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static pagesMobile.Generations.generationRandomName;
@Tag("Mobile")
public class CommentTest extends TestBaseMobileRemote {
@Test
    public void commTest(){
    String name = generationRandomName();
    stepsForApp();
    $(AppiumBy.id("com.hitechrush.jaxarush:id/commentsButton")).click();//нажимем на кнопку коментарии
    sleep(3000);
    $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentFab")).click(); // нажимаем добавить комент
    $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentText")).click();
    $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentText")).sendKeys("12314");
    $(AppiumBy.id("com.hitechrush.jaxarush:id/send")).click();
    $$(AppiumBy.className("android.view.View")).get(0).equals("1112314");


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
