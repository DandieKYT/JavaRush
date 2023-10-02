package tests.mobile;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.MobileConfig;
import drivers.AndroidLocalDriver;
import drivers.BrowserstackDriver;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pagesMobile.*;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBaseMobileRemote {
    QuizPage quizPage = new QuizPage();
    AddLikeCommentPage addLikeCommentPage = new AddLikeCommentPage();
    AuthenticationPage auth = new AuthenticationPage();
    CourseTaskPage courseTaskPage = new CourseTaskPage();
    AddLikeLessonPage addLikeLessonPage = new AddLikeLessonPage();
    Generations gen = new Generations();
    FontPage font = new FontPage();
    CommentPage comment = new CommentPage();
    static MobileConfig mobile = ConfigFactory.create(MobileConfig.class, System.getProperties());
    @BeforeAll
    static void beforeAll() {
        Configuration.browser = BrowserstackDriver.class.getName();
        Configuration.browserSize = null;
        Configuration.baseUrl = mobile.remoteMobileUrl();
        Configuration.timeout = 5000;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void afterEach() {
        closeWebDriver();
    }
}
