package tests.mobile;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Suka extends TestBaseMobileRemote {
    @Test
    public void blyad(){
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
