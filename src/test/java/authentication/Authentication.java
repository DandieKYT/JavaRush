package authentication;

import config.AuthConfig;
import org.aeonbits.owner.ConfigFactory;

import static io.restassured.RestAssured.given;

public class Authentication {
    private static Authentication instance;
    private static String allureTestOpsSession;
    private static final AuthConfig authConfig = ConfigFactory.create(AuthConfig.class);

    private Authentication() {
    }

    public static Authentication getInstance() {
        if (instance == null) {
            instance = new Authentication();
        }
        return instance;
    }

    public String authenticate() {
String sessionID = "JSESSIONID",
        userId = "javarush.user.id";

        return allureTestOpsSession = given()
                .when()
                .post("/api/login/system")
                .then()
                .statusCode(200)
                .extract().response()
                .getCookies().toString();
    }
}
