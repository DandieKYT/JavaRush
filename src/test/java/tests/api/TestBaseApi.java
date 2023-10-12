package tests.api;

import com.codeborne.selenide.Configuration;
import config.WebConfig;
import io.restassured.RestAssured;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;


public class TestBaseApi {
    protected static final WebConfig webConfig = ConfigFactory.create(WebConfig.class);

    @BeforeAll
    static void setUp() {
        Configuration.browser = webConfig.browser();
        Configuration.browserVersion = webConfig.browserVersion();
        Configuration.browserSize = webConfig.browserSize();
//        Configuration.remote = webConfig.remoteUrl();
        Configuration.baseUrl = "https://javarush.com";
        RestAssured.baseURI = "https://javarush.com";

    }
}