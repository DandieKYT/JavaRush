package tests.mobile;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CourseTask extends TestBaseMobileRemote {
    @Test
    @CsvSource(value = {
            "Course ,      Java course",
            "Tasks,             You don't have any new tasks yet",
    })
    @DisplayName("Открытие вкладок Course/Java и проверка их содержимого")
    public void checkCourseTask(){
        auth.loginBySecretKey();
        $(AppiumBy.id("com.hitechrush.jaxarush:id/bannerCloseButton")).click();

        $$(AppiumBy.className("android.widget.RelativeLayout")).get(0).click();
        $$(AppiumBy.className("android.widget.RelativeLayout")).get(0).click();
        $$(AppiumBy.className("android.widget.RelativeLayout")).get(0).click();
        $$(AppiumBy.className("android.widget.RelativeLayout")).get(0).click();
        $$(AppiumBy.className("android.widget.RelativeLayout")).get(0).click();

        $(AppiumBy.id("com.hitechrush.jaxarush:id/levelPicture")).click();
        $(AppiumBy.id("com.hitechrush.jaxarush:id/questContainer")).click();

        $$(AppiumBy.className("android.widget.ImageButton")).get(0).click();
        $$(AppiumBy.className("android.widget.ImageButton")).get(0).click();

    }
}
