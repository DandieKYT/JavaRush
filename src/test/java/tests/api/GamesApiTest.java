package tests.api;

import models.Games;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.is;
import static specs.Specification.*;

@Tag("API")
public class GamesApiTest {

    @Test
    @DisplayName("Проверка названия, урла, статуса на странице игры 'Сапер'")
    void minesweeperTest() {
        Games data = given()
                .spec(gamesSpec)
                .when()
                .get("/projectcom.javarush.games.minesweeper")
                .then()
                .spec(responseSpec)
                .extract().as(Games.class);
        Assertions.assertEquals("https://www.youtube.com/embed/zF-xllunn2M", data.videoUrl);
        Assertions.assertEquals("Сапер", data.title);
        Assertions.assertEquals("AVAILABLE", data.status);

    }
    @Test
    @DisplayName("Проверка названия, урла, статуса на странице игры 'Змейка'")
    void snakeTest() {
        Games data = given()
                .spec(gamesSpec)
                .when()
                .get("/projectcom.javarush.games.snake")
                .then()
                .spec(responseSpec)
                .extract().as(Games.class);
        Assertions.assertEquals("https://www.youtube.com/embed/4oykArMtDOI", data.videoUrl);
        Assertions.assertEquals("Змейка", data.title);
        Assertions.assertEquals("AVAILABLE", data.status);

    }
    @Test
    @DisplayName("Проверка названия, урла, статуса на странице '2048'")
    void twoThousandFortyEightTest() {
        Games data = given()
                .spec(gamesSpec)
                .when()
                .get("/projectcom.javarush.games.game2048")
                .then()
                .spec(responseSpec)
                .extract().as(Games.class);
        Assertions.assertEquals("https://www.youtube.com/embed/WbNfczSAiNc", data.videoUrl);
        Assertions.assertEquals("2048", data.title);
        Assertions.assertEquals("AVAILABLE", data.status);
    }


}
