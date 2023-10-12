package tests.ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebConfig;
import help.Attach;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import ui.steps.*;

import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;


public class TestBase extends Attach {
    static WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());
    SocialGroupsStep groupsStep = new SocialGroupsStep();
    StartLearningStep learningStep = new StartLearningStep();
    ReviewsAndAboutUsStep reviewsAndAboutUsStep = new ReviewsAndAboutUsStep();
    EnrollInCourseStep enrollInCourseStep = new EnrollInCourseStep();
    SearchStep searchStep = new SearchStep();
    @BeforeAll
    static void setUp() {
        Configuration.browserSize = webConfig.browserSize();
        WebDriverManager.chromedriver().setup();
        Configuration.pageLoadStrategy = webConfig.pageLoadStrategy();
        Configuration.baseUrl = webConfig.BaseUrl();
        Configuration.browser = webConfig.browser();
        Configuration.browserVersion = webConfig.browserVersion();
//        Configuration.remote = webConfig.remoteUrl();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));

        Configuration.browserCapabilities = capabilities;
    }
    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(false)
                .savePageSource(true)
        );
        closeWebDriver();
    }


    @AfterEach
    void attachemts() {
        Attach.browserConsoleLogs();
        Attach.screenshotAs("Last screenshot");
        Attach.addVideo();
        Attach.pageSource();
    }

}

