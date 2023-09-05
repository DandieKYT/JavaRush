package tests.api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.is;

public class CheckCodeTest {
@Test
void status() {
    given()
            .log().uri()
            .contentType(JSON)
            .when()
            .get("https://javarush.com/api/1.0/rest/me")
            .then()
            .log().status()
            .log().body()
            .statusCode(200);
//            .body("message", is("test"));

}
}
