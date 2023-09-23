package tests.mobile;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CourseTask extends TestBaseMobileRemote {
    @CsvSource(value = {
            "course,      Java course",
            "tasks,             Tasks",
    })
    @ParameterizedTest
    @DisplayName("Открытие разделов Course/Java и проверка их содержимого")
    public void checkCourseTask(String param, String expectedText){
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
        $$(AppiumBy.className("android.widget.ImageButton")).get(0).click();//Нажимаеи назад

        $$(AppiumBy.className("android.widget.ImageButton")).get(0).click();//Нажимаем на разделы
        courseTaskPage.tag.find(Condition.text(param)).click();
//        $$(AppiumBy.id(String.format("com.hitechrush.jaxarush:id/%s", param))).get(2).click();
        $(AppiumBy.id("com.hitechrush.jaxarush:id/toolbarTitle")).shouldBe(Condition.text(expectedText));

    }
}
