package tests.mobile;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static pagesMobile.Generations.generationRandomName;

public class AddLikeTest extends TestBaseMobileRemote {
    @Test
    @DisplayName("Добавление лайка на коментарий")
    public void likeTest() {
        stepsForApp();
        $(AppiumBy.id("com.hitechrush.jaxarush:id/commentsButton")).click();//нажимем на кнопку коментарии
        sleep(3000);
        $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentFab")).click(); // нажимаем добавить комент
        $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentText")).click();
        $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentText")).sendKeys("TEST_LIKE");
        $(AppiumBy.id("com.hitechrush.jaxarush:id/send")).click();
        $(AppiumBy.xpath("(//android.widget.ImageView[@content-desc=\"JavaRush\"])[2]")).click();
        $(AppiumBy.id("com.hitechrush.jaxarush:id/itemLikeDesc")).click();
        $(AppiumBy.id("com.hitechrush.jaxarush:id/likesCount")).shouldBe(Condition.text("1"));

        $(AppiumBy.xpath("(//android.widget.ImageView[@content-desc=\"JavaRush\"])[2]")).click();
        $(AppiumBy.id("com.hitechrush.jaxarush:id/deleteButton")).click();

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
