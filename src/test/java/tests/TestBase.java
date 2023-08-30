package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.AndroidLocalDriver;
import help.Attachment;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;


public class TestBase extends Attachment {


    Attachment attachment = new Attachment();

//    @BeforeAll
//    static void setUp() {
//        Configuration.browserSize = "1920x1080";
//        Configuration.pageLoadStrategy = "eager";
//        Configuration.baseUrl = "https://www.ozon.ru";
//        Configuration.browser = "chrome";
//        Configuration.browserVersion = "100.0";
//        Configuration.remote = "https://user1:1234@" + System.getProperty("selenoid_url", "selenoid.autotests.cloud/wd/hub");
//
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
//                "enableVNC", true,
//                "enableVideo", true
//        ));
//
//        Configuration.browserCapabilities = capabilities;
//    }
//
//    @AfterEach
//    void attachemts() {
//        attachment.browserLogs();
//        attachment.attachScreenshot();
//        attachment.pageSource();
//        attachment.addVideo();
//    }
@BeforeAll
static void beforeAll() {
    Configuration.browser = AndroidLocalDriver.class.getName();
    Configuration.browserSize = null;
    Configuration.timeout = 5000;
}

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void afterEach() {
//        attachment.screenshotAs("Last screenshot");
        attachment.pageSource();

        closeWebDriver();
    }
}

