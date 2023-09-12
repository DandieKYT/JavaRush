package tests.ui;

import com.codeborne.selenide.Configuration;
import config.WebConfig;
import help.Attach;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.*;

import java.util.Map;


public class TestBase extends Attach {
    static WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());
    SocialGroupsPage groupsPage = new SocialGroupsPage();
    StartLearningPage learningPage = new StartLearningPage();
    BasePage basePage = new BasePage();
    ReviewsAndAboutUsPage reviewsAndAboutUsPage = new ReviewsAndAboutUsPage();
    EnrollInCoursePage coursePage = new EnrollInCoursePage();
    Attach attach = new Attach();
int a = 2;
String f = "2";
    @BeforeAll
    static void setUp() {
        Configuration.browserSize = webConfig.browserSize();
        Configuration.pageLoadStrategy = webConfig.pageLoadStrategy();
        Configuration.baseUrl = webConfig.BaseUrl();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Configuration.browser = webConfig.browser();
        Configuration.browserVersion = webConfig.browserVersion();
        Configuration.remote = webConfig.remoteUrl();

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

