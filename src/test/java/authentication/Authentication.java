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

        return allureTestOpsSession = given()
                .header("javarush.user.id", "3320682")
                .cookie("JSESSIONID" , "cb0b9f33-6278-4e1a-ba00-ad704596811a")
                .formParam("username", authConfig.username())
                .formParam("password", authConfig.password())
                .when()
                .post("/api/login/system")
                .then()
                .statusCode(200)
                .extract().response()
                .getCookie("ALLURE_TESTOPS_SESSION");
    }
}
