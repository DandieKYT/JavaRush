package tests.mobile;

import com.codeborne.selenide.Condition;
import help.PhoneManagerHelper;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;


public class SearchOzonTest extends TestBaseMobileRemote{
    @Test
    void checkoutTest() {
        $$(AppiumBy.className("android.widget.LinearLayout")).get(3).shouldBe(Condition.visible);
//        PhoneManagerHelper.swipeFromLeftToRight();
        sleep(2000);
        $(AppiumBy.className("android.widget.TextView")).click();
        $(AppiumBy.className("android.widget.EditText")).sendKeys("Трусы");
        $x("//android.view.ViewGroup[@content-desc=\"Трусы женские\"]/android.widget.TextView[1]").shouldBe(Condition.text("Трусы женские"));
    }
}