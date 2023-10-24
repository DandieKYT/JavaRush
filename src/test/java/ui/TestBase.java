package ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebConfig;
import help.Attach;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.remote.DesiredCapabilities;
import ui.steps.*;

import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;

@Execution(ExecutionMode.CONCURRENT)
public class TestBase extends Attach {

    protected static WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());
    static String remoteUrl = System.getProperty("selenoid");
    static boolean isRemote = Boolean.parseBoolean(System.getProperty("isRemote", config.isRemote()));
    SideBarSteps sideBarSteps = new SideBarSteps();
    MainPageSteps mainPageSteps = new MainPageSteps();
    QuizStep quizStep = new QuizStep();
    ProfileSettingsStep profileSettingsStep = new ProfileSettingsStep();
    SocialGroupsStep socialGroupsStep = new SocialGroupsStep();
    CreateAccountStep createAccountStep = new CreateAccountStep();
    HeaderStep headerStep = new HeaderStep();
    EnrollInCourseJavaStep enrollInCourseJavaStep = new EnrollInCourseJavaStep();
    SearchUsersStep searchUsersStep = new SearchUsersStep();

    @BeforeAll
    static void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.baseUrl = System.getProperty("baseUrl", config.getBaseUrl());
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = System.getProperty("browserSize", config.getBrowserSize());
        Configuration.browser = System.getProperty("browser", config.getBrowser());
        Configuration.remote = System.getProperty("selenoid");
        Configuration.browserVersion = System.getProperty("browserVersion", config.getBrowserVersion());

        if (isRemote) {
            Configuration.remote = remoteUrl;
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                    "enableVNC", true,
                    "enableVideo", true
            ));
            Configuration.browserCapabilities = capabilities;
        }

    }

    @AfterAll
    static void addAttachments() {
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.screenshotAs("Last screenshot");
        if (isRemote) {
            Attach.addVideoSelenoid();
        }
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(false)
                .savePageSource(true)
        );
        closeWebDriver();
    }
}

