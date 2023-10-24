package mobile;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebConfig;
import io.qameta.allure.selenide.AllureSelenide;
import mobile.drivers.BrowserstackDriver;
import mobile.drivers.LocalDriver;
import mobile.steps.*;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;


public class TestBaseMobile {

    protected static WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());
    static boolean isRemote = Boolean.parseBoolean(System.getProperty("isRemote", config.isRemote()));

    QuizStep quizStep = new QuizStep();
    CreateAccountStep createAccountStep = new CreateAccountStep();
    AuthenticationStep authenticationStep = new AuthenticationStep();
    SideBarStep sideBarStep = new SideBarStep();
    LessonStep lessonStep = new LessonStep();
    CommentStep commentStep = new CommentStep();

    @BeforeAll
    static void beforeAll() {
        Configuration.browser = LocalDriver.class.getName();
        if (isRemote) {
            Configuration.browser = BrowserstackDriver.class.getName();
        }
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
