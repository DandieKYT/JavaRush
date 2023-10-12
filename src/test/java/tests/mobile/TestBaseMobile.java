package tests.mobile;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebConfig;
import help.PhoneManagerHelper;
import io.qameta.allure.selenide.AllureSelenide;
import mobile.drivers.BrowserstackDriver;
import mobile.drivers.LocalDriver;
import mobile.pages.*;
import mobile.steps.AuthenticationStep;
import mobile.steps.LikeLessonStep;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBaseMobile {

    protected static WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());
    static boolean isRemote = Boolean.parseBoolean(System.getProperty("isRemote", config.isRemote()));
    QuizPage quizPage = new QuizPage();
    LikeCommentPage likeCommentPage = new LikeCommentPage();
    AuthenticationStep auth = new AuthenticationStep();
    CourseTaskPage courseTaskPage = new CourseTaskPage();
    FontPage font = new FontPage();
    PhoneManagerHelper managerHelper = new PhoneManagerHelper();
    LikeLessonStep likeLessonStep = new LikeLessonStep();
    Generations gen = new Generations();
    CommentPage comment = new CommentPage();
    @BeforeAll
    static void beforeAll() {
        Configuration.browser = LocalDriver.class.getName();
//        if (isRemote){
//            Configuration.browser = BrowserstackDriver.class.getName();
//        }
        Configuration.pageLoadStrategy = "eager";
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
        closeWebDriver();
    }
}
