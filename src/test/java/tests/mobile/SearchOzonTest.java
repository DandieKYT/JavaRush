package tests.mobile;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import help.PhoneManagerHelper;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


public class SearchOzonTest extends TestBaseMobileRemote{
    @Test
    void checkoutTest() {
        $$(AppiumBy.id("com.hitechrush.jaxarush:id/start")).get(0).click();
        $$(AppiumBy.id("com.hitechrush.jaxarush:id/startQuiz1")).get(0).click();
        $$(AppiumBy.className("android.widget.LinearLayout")).get(0).click();
        $(AppiumBy.id("com.hitechrush.jaxarush:id/qaEngineer")).click();
        $(AppiumBy.id("com.hitechrush.jaxarush:id/plotStyleCard")).click();
        $(AppiumBy.id("com.hitechrush.jaxarush:id/motivationNoCard")).click();
        $(AppiumBy.id("com.hitechrush.jaxarush:id/quizThemeLight")).click();
        $(AppiumBy.id("com.hitechrush.jaxarush:id/experienceNo")).click();
        Selenide.sleep(2000);
        $$(AppiumBy.id("com.hitechrush.jaxarush:id/authHeaderTitle")).get(1).shouldHave(Condition.text("Создание аккаунта"));

    }
}