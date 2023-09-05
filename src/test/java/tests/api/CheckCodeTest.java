package tests.api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.http.ContentType.JSON;
import static specs.Specification.requestSpec;
import static specs.Specification.responseSpec;


public class CheckCodeTest {
    @Test
    void status() {
        String message = "{message: \"124\", parentCommentId: null, replyToUserId: null}";
        given(requestSpec)
                .body(message)
                .when()
                .post("/rest/discussions/discussion2332051/comments")
                .then()
                .spec(responseSpec)
                .statusCode(201);
    }

}
