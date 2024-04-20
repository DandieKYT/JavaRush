package mobile.help;

import mobile.config.BrowserstackConfig;
import org.aeonbits.owner.ConfigFactory;

import static io.restassured.RestAssured.given;
import static java.lang.String.format;

public class BrowserStack {

    public static String videoUrl(String sessionId) {

        BrowserstackConfig config = ConfigFactory.create(BrowserstackConfig.class);
        String url = format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);
        return given()
                .log().all()
                .auth().basic(config.username(), config.passwordKey())
                .when()
                .get(url)
                .then()
                .log().all()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }
}
