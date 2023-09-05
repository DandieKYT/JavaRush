package authentication;

import config.AuthConfig;
import org.aeonbits.owner.ConfigFactory;

import static io.restassured.RestAssured.given;

public class Authentication {
    private static Authentication instance;
    private static String javaSession;
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
String JSESSIONID = "569249ab-f542-4e61-8a0e-0d6f0cf0fa2f",
        userId = "3348689";

        return javaSession = given()
                .when()
                .post("/api/login/system")
                .then()
                .statusCode(200)
                .extract().response()
                .getCookies().toString();
    }
}
