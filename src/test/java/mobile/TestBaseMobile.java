package mobile;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import mobile.drivers.BrowserstackDriver;
import mobile.drivers.LocalDriver;
import mobile.steps.*;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import ui.config.WebConfig;

import static com.codeborne.selenide.Selenide.*;

public class TestBaseMobile {

    protected static WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());
    static boolean isRemote = Boolean.parseBoolean(System.getProperty("isRemote", config.isRemote()));
    QuizStep quizStep = new QuizStep();
    CreateAccountStep createAccountStep = new CreateAccountStep();
    AuthorizationStep authorizationStep = new AuthorizationStep();
    SideBarStep sideBarStep = new SideBarStep();
    CommentStep commentStep = new CommentStep();
    LikeStep likeStep = new LikeStep();
    MobileCommonStep mobileCommonStep = new MobileCommonStep();

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
    public void afterEach() {
        String sessionId = sessionId().toString();
        closeWebDriver();
        help.Attach.addVideo(sessionId);
    }
}
