package tests.mobile;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.AndroidLocalDriver;

import help.Attach;
import help.PhoneManagerHelper;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pagesMobile.*;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBaseMobile {
    QuizPage quizPage = new QuizPage();
    AddLikeCommentPage addLikeCommentPage = new AddLikeCommentPage();
    AuthenticationPage auth = new AuthenticationPage();
    CourseTaskPage courseTaskPage = new CourseTaskPage();
    FontPage font = new FontPage();
    PhoneManagerHelper managerHelper = new PhoneManagerHelper();
    AddLikeLessonPage addLikeLessonPage = new AddLikeLessonPage();
    Generations gen = new Generations();
    CommentPage comment = new CommentPage();
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
        closeWebDriver();
    }
}
