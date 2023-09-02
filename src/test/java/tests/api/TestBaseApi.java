package tests.api;

import com.codeborne.selenide.Configuration;
import config.WebConfig;
import io.restassured.RestAssured;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.BasePage;
import pages.StartLearningPage;


public class TestBaseApi {
    protected static final WebConfig webConfig = ConfigFactory.create(WebConfig.class);
    BasePage basePage = new BasePage();

    StartLearningPage learningPage = new StartLearningPage();

    @BeforeAll
    static void setUp() {
        Configuration.browser = webConfig.browser();
        Configuration.browserVersion = webConfig.browserVersion();
        Configuration.browserSize = webConfig.browserSize();
//        Configuration.remote = webConfig.remoteUrl();
        Configuration.baseUrl = "https://javarush.com";
        RestAssured.baseURI = "https://javarush.com";

    }
    @BeforeEach
    void startTest(){
        basePage.openPage();
        learningPage.startLearnButton();
        learningPage.beginLearnButton();
        learningPage.russianLanguageButton();
        learningPage.qaButton();
        learningPage.blackPictureClick();
        learningPage.notNowButton();
        learningPage.xpInProgrammingNo();
        learningPage.checkOutResult();
        learningPage.getButtonLearn();
        basePage.openPage();
        learningPage.profileName();
    }
}