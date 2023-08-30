package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import drivers.W3cActions;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.driver;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;
import static java.time.temporal.ChronoUnit.MILLIS;


public class SearchOzonTest extends TestBase {


    @Test
    void checkoutTest() {
        swipeUp(10);
        $$(AppiumBy.className("android.widget.LinearLayout")).get(3).click();
        sleep(2000);
        $$(AppiumBy.className("android.widget.ImageButton")).get(0).click();
        $(AppiumBy.className("android.widget.TextView")).click();
        $(AppiumBy.className("android.widget.EditText")).sendKeys("Трусы");
        $x("//android.view.ViewGroup[@content-desc=\"Трусы женские\"]/android.widget.TextView[1]").shouldBe(Condition.text("Трусы женские"));
    }


    public static void swipeFromRightToLeft() {
        AppiumDriver driver = (AppiumDriver) WebDriverRunner.getWebDriver();

        Dimension dimension = driver.manage().window().getSize();
        Point start = new Point((int) (dimension.width * 0.5), (int) (dimension.height * 0.9));
        Point end = new Point((int) (dimension.width * 0.2), (int) (dimension.height * 0.1));
        W3cActions.doSwipe(driver, start, end, 1000);  //with duration 1s
    }
    public void swipeUp(int timeOfSwipeMs) {
        TouchAction action = new TouchAction((PerformsTouchActions) getWebDriver());
        Dimension size = getWebDriver().manage().window().getSize();
        int x = size.width / 2;
        int start_y = (int) (size.height * 0.8);
        int end_y = (int) (size.height * 0.2);


        action
                .press(point(x, start_y))
                .waitAction(WaitOptions.waitOptions(Duration.of(timeOfSwipeMs, MILLIS)))
                .moveTo(point(x, end_y))
                .release()
                .perform();
    }


    public void swipeUpQuick(int i) {
        swipeUp(2000);
    }


//    @Step("Получить значение из буфера обмена")
//    public static String getClipboardValue() {
//         ToDo добавить обработку: android or ios
//        return ((AndroidDriver) WebDriverRunner.getWebDriver()).getClipboardText();
//    }
//
//    @Step("Загрузить медиафайл [{mediaClasspath}] на телефон")
//    // https://www.browserstack.com/docs/app-automate/appium/advanced-features/test-with-sample-data#use-pre-loaded-media-files
//    public static void uploadMedia(String mediaClasspath) {
//        File file = new File("src/test/resources/media", mediaClasspath);
//        if (!file.exists())
//            throw new RuntimeException("File by path [" + file.getAbsoluteFile() + "] don't exist");
//
//         ToDo добавить обработку: android or ios
//        try {
//            ((AndroidDriver) WebDriverRunner.getWebDriver()).pushFile("/sdcard/Download/" + file.getName(), file);
//        } catch (IOException e) {
//            throw new RuntimeException("Error during upload media file");
//        }
//    }
//
//    @Step("Добавить заглушку: во время съемки на камеру отдавать заглушку")
//    // https://www.browserstack.com/docs/app-automate/appium/advanced-features/camera-image-injection#1-how-browserstack-enables-camera-testing
//    public static void addCameraImageInject(String imagePath) {
//        String mediaId = BrowserstackApi.uploadImage(imagePath);
//
//        AppiumDriver driver = (AppiumDriver) WebDriverRunner.getWebDriver();
//        String script = String.format("browserstack_executor: " +
//                "{\"action\":\"cameraImageInjection\", " +
//                "\"arguments\": {\"imageUrl\" : \"%s\"}}", mediaId);
//        driver.executeScript(script);
//    }
//
//    @Step("Свайп справа налево")
//    public static void swipeFromRightToLeft() {
//        AppiumDriver driver = (AppiumDriver) WebDriverRunner.getWebDriver();
//
//        Dimension dimension = driver.manage().window().getSize();
//        Point start = new Point((int) (dimension.width * 0.5), (int) (dimension.height * 0.9));
//        Point end = new Point((int) (dimension.width * 0.2), (int) (dimension.height * 0.1));
//        W3cActions.doSwipe(driver, start, end, 1000);  //with duration 1s
//    }
//
//    @Step("Свайп слева направо")
//    public static void swipeFromLeftToRight() {
//        AppiumDriver driver = (AppiumDriver) WebDriverRunner.getWebDriver();
//
//        Dimension dimension = driver.manage().window().getSize();
//        Point start = new Point((int) (dimension.width * 0.2), (int) (dimension.height * 0.2));
//        Point end = new Point((int) (dimension.width * 0.5), (int) (dimension.height * 0.8));
//        W3cActions.doSwipe(driver, start, end, 1000); //with duration 1s
//    }
    public static void swipeVniz() {
        AppiumDriver driver = (AppiumDriver) WebDriverRunner.getWebDriver();
        Dimension dimension = driver.manage().window().getSize();
        Point start = new Point((int) (dimension.width * 0.5), (int) (dimension.height * 0.9));
        Point end = new Point((int) (dimension.width * 0.2), (int) (dimension.height * 0.1));
        W3cActions.doSwipe(driver, start, end, 1000);  //with duration 1s

        sleep(3000);

        start = new Point((int) (dimension.width * 0.2), (int) (dimension.height * 0.2));
        end = new Point((int) (dimension.width * 0.5), (int) (dimension.height * 0.8));
        W3cActions.doSwipe(driver, start, end, 1000); //with duration 1s
//
    }
    @Step("Долгое нажатие в центр экрана")
    public static void longTap() {
        AppiumDriver driver = (AppiumDriver) WebDriverRunner.getWebDriver();
        Dimension dimension = driver.manage().window().getSize();
        Point center = new Point((int) (dimension.width * 0.5), (int) (dimension.height * 0.5));
        W3cActions.doTap(driver, center, 4000);
    }

//
//    @Step("Нажатие в правой части экрана")
//    public static void rightTap() {
//        AppiumDriver driver = (AppiumDriver) WebDriverRunner.getWebDriver();
//        Dimension dimension = driver.manage().window().getSize();
//        Point center = new Point((int) (dimension.width * 0.8), (int) (dimension.height * 0.5));
//        W3cActions.doTap(driver, center, 0);
//    }
//
//    @Step("Нажатие в левой части экрана")
//    public static void leftTap() {
//        AppiumDriver driver = (AppiumDriver) WebDriverRunner.getWebDriver();
//        Dimension dimension = driver.manage().window().getSize();
//        Point center = new Point((int) (dimension.width * 0.2), (int) (dimension.height * 0.5));
//        W3cActions.doTap(driver, center, 0);
//    }
//
//    @Step("Нажатие на рейтинге 5")
//    public static void tapByCoordinates(int x, int y) {
//        AppiumDriver driver = (AppiumDriver) WebDriverRunner.getWebDriver();
//        Point center = new Point(x,y);
//        W3cActions.doTap(driver, center, 0);
//    }
}