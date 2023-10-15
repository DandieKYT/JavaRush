package tests.mobile;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebConfig;
import help.PhoneManagerHelper;
import io.qameta.allure.selenide.AllureSelenide;
import mobile.drivers.BrowserstackDriver;
import mobile.drivers.LocalDriver;
import mobile.pages.*;
import mobile.steps.*;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;


public class TestBaseMobile {

    QuizStep quizStep = new QuizStep();
    LikeCommentStep likeCommentStep = new LikeCommentStep();
    AuthenticationStep auth = new AuthenticationStep();
    CourseTaskStep courseTask = new CourseTaskStep();
    PhoneManagerHelper managerHelper = new PhoneManagerHelper();
    LikeLessonStep likeLessonStep = new LikeLessonStep();
    Generations gen = new Generations();
    CommentStep comment = new CommentStep();
    @BeforeAll
    static void beforeAll() {
        Configuration.browser = LocalDriver.class.getName();
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
