package mobile.help;

import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import java.io.File;
import java.io.IOException;

public class PhoneManagerHelper {

    @Step("Получить значение из буфера обмена")
    public static String getClipboardValue() {
        return ((AndroidDriver) WebDriverRunner.getWebDriver()).getClipboardText();
    }

    @Step("Загрузить медиафайл [{mediaClasspath}] на телефон")
    public static void uploadMedia(String mediaClasspath) {
        File file = new File("src/test/resources/media", mediaClasspath);
        if (!file.exists())
            throw new RuntimeException("File by path [" + file.getAbsoluteFile() + "] don't exist");
        try {
            ((AndroidDriver) WebDriverRunner.getWebDriver()).pushFile("/sdcard/Download/" + file.getName(), file);
        } catch (IOException e) {
            throw new RuntimeException("Error during upload media file");
        }
    }

    @Step("Свайп справа налево")
    public static void swipeFromRightToLeft() {
        AppiumDriver driver = (AppiumDriver) WebDriverRunner.getWebDriver();

        Dimension dimension = driver.manage().window().getSize();
        Point start = new Point((int) (dimension.width * 0.9), (int) (dimension.height * 0.9));
        Point end = new Point((int) (dimension.width * 0.2), (int) (dimension.height * 0.1));
        W3cActions.doSwipe(driver, start, end, 100);  //with duration 1s
    }

    @Step("Свайп слева направо")
    public static void swipeFromLeftToRight() {
        AppiumDriver driver = (AppiumDriver) WebDriverRunner.getWebDriver();

        Dimension dimension = driver.manage().window().getSize();
        Point start = new Point((int) (dimension.width * 0.2), (int) (dimension.height * 0.2));
        Point end = new Point((int) (dimension.width * 0.5), (int) (dimension.height * 0.8));
        W3cActions.doSwipe(driver, start, end, 1000); //with duration 1s
    }

    @Step("Долгое нажатие в центр экрана")
    public static void longTap() {
        AppiumDriver driver = (AppiumDriver) WebDriverRunner.getWebDriver();
        Dimension dimension = driver.manage().window().getSize();
        Point center = new Point((int) (dimension.width * 0.5), (int) (dimension.height * 0.5));
        W3cActions.doTap(driver, center, 4000);
    }

    @Step("Нажатие в правой части экрана")
    public static void rightTap() {
        AppiumDriver driver = (AppiumDriver) WebDriverRunner.getWebDriver();
        Dimension dimension = driver.manage().window().getSize();
        Point center = new Point((int) (dimension.width * 0.8), (int) (dimension.height * 0.5));
        W3cActions.doTap(driver, center, 0);
    }

    @Step("Нажатие в левой части экрана")
    public static void leftTap() {
        AppiumDriver driver = (AppiumDriver) WebDriverRunner.getWebDriver();
        Dimension dimension = driver.manage().window().getSize();
        Point center = new Point((int) (dimension.width * 0.2), (int) (dimension.height * 0.5));
        W3cActions.doTap(driver, center, 0);
    }

    @Step("Нажатие на рейтинге 5")
    public static void tapByCoordinates(int x, int y) {
        AppiumDriver driver = (AppiumDriver) WebDriverRunner.getWebDriver();
        Point center = new Point(x, y);
        W3cActions.doTap(driver, center, 0);
    }
}
