package tests.api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.is;
import static specs.Specification.requestSpec;
import static specs.Specification.responseSpec;

@Tag("API")
public class GamesApiTest {

    @Test
    @DisplayName("Сапер")
    void minesweeperTest() {
        given(requestSpec)
                .when()
                .get("/projects/projectcom.javarush.games.minesweeper")
                .then()
                .spec(responseSpec)
                .body("title", is ("Сапер"))
                .body("videoUrl", is ("https://www.youtube.com/embed/zF-xllunn2M"))
                .body("status", is("AVAILABLE"))
                .statusCode(200);

    }
    @Test
    @DisplayName("Змейка")
    void snakeTest() {
        given(requestSpec)
                .when()
                .get("/projects/projectcom.javarush.games.snake")
                .then()
                .spec(responseSpec)
                .body("videoUrl", is ("https://www.youtube.com/embed/4oykArMtDOI"))
                .body("title", is ("Змейка"))
                .body("status", is("AVAILABLE"))
                .statusCode(200);

    }
    @Test
    @DisplayName("2048")
    void twoThousandFortyEightTest() {
        given(requestSpec)
                .when()
                .get("/projects/projectcom.javarush.games.game2048")
                .then()
                .spec(responseSpec)
                .body("videoUrl", is ("https://www.youtube.com/embed/WbNfczSAiNc"))
                .body("title", is ("2048"))
                .body("status", is("AVAILABLE"))
                .statusCode(200);

    }


}
