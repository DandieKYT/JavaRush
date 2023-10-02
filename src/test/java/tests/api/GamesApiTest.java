package tests.api;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.is;
import static specs.Specification.requestSpec;
import static specs.Specification.responseSpec;

@Tag("API")
public class GamesApiTest {

    @Test
    void minesweeperTest() {
        given(requestSpec)
                .when()
                .get("/rest/projects/projectcom.javarush.games.minesweeper")
                .then()
                .spec(responseSpec)
                .body("title", is ("Сапер"))
                .body("videoUrl", is ("https://www.youtube.com/embed/zF-xllunn2M"))
                .body("status", is("AVAILABLE"))
                .statusCode(200);

    }
    @Test
    void snakeTest() {
        given(requestSpec)
                .when()
                .get("/rest/projects/projectcom.javarush.games.snake")
                .then()
                .spec(responseSpec)
                .body("videoUrl", is ("https://www.youtube.com/embed/4oykArMtDOI"))
                .body("title", is ("Змейка"))
                .body("status", is("AVAILABLE"))
                .statusCode(200);

    }

}
