package tests.ui;

import com.codeborne.selenide.Configuration;
import help.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.*;

import java.util.Map;


public class TestBase extends Attach {
    SocialGroupsPage groupsPage = new SocialGroupsPage();
    StartLearningPage learningPage = new StartLearningPage();
    BasePage basePage = new BasePage();
    ReviewsAndAboutUsPage reviewsAndAboutUsPage = new ReviewsAndAboutUsPage();
    EnrollInCoursePage coursePage = new EnrollInCoursePage();
    Attach attach = new Attach();

    @BeforeAll
    static void setUp() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://javarush.com";
//        Configuration.browser = "chrome";
//        Configuration.browserVersion = "100.0";
//        Configuration.remote = "https://user1:1234@" + System.getProperty("selenoid_url", "selenoid.autotests.cloud/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));

        Configuration.browserCapabilities = capabilities;
    }

    @AfterEach
    void attachemts() {
        attach.browserLogs();
        attach.attachScreenshot();
        attach.pageSource();
        attach.addVideo();
    }

}

