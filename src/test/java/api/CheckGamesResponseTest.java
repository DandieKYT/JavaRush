package api;

import api.models.Games;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static api.specs.Specification.*;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

@Tag("API")
@Story("Игры")
@Owner("Кудрявцев Даниил")
@Feature("Автотесты для API")
public class CheckGamesResponseTest {

    private final String keyMinesweeper = "com.javarush.games.minesweeper";
    private final String expectedDescriptionMinesweeper = "Сапер";

    @Test
    @DisplayName("Открытие страницы игры 'Сапер'")
    void checkMinesweeperTest() {
        Games data = given()
                .spec(gamesSpec)
                .when()
                .get("/projectcom.javarush.games.minesweeper")
                .then()
                .spec(responseSpec)
                .extract().as(Games.class);
        Assertions.assertEquals("https://www.youtube.com/embed/M2Sz18mI1sU", data.videoUrl);
        Assertions.assertEquals("Сапер", data.title);
        Assertions.assertEquals("AVAILABLE", data.status);
    }

    @Test
    @DisplayName("Открытие страницы игры 'Змейка'")
    void checkSnakeTest() {
        Games data = given()
                .spec(gamesSpec)
                .when()
                .get("/projectcom.javarush.games.snake")
                .then()
                .spec(responseSpec)
                .extract().as(Games.class);
        Assertions.assertEquals("https://www.youtube.com/embed/Wjb5_7C3d4w", data.videoUrl);
        Assertions.assertEquals("Змейка", data.title);
        Assertions.assertEquals("AVAILABLE", data.status);
    }

    @Test
    @DisplayName("Открытие страницы игры '2048'")
    void checkTwoThousandFortyEightTest() {
        Games data = given()
                .spec(gamesSpec)
                .when()
                .get("/projectcom.javarush.games.game2048")
                .then()
                .spec(responseSpec)
                .extract().as(Games.class);
        Assertions.assertEquals("https://www.youtube.com/embed/XlBxKE4cibo", data.videoUrl);
        Assertions.assertEquals("2048", data.title);
        Assertions.assertEquals("AVAILABLE", data.status);
    }

    @Test
    @DisplayName("Проверка по id названия игры 'Сапер'")
    void checkingForIdGame() {
        Games[] data = given()
                .spec(projectSpec)
                .when()
                .get()
                .then()
                .spec(responseSpec)
                .extract().as(Games[].class);
        Games actualGames = Arrays.stream(data)
                .filter(games -> games.getKey().contains(keyMinesweeper))
                .findFirst()
                .orElseThrow(() -> new AssertionError(""));
        String actualDescription = String.valueOf(actualGames.getDescription());
        assertThat(actualDescription).contains(expectedDescriptionMinesweeper);
    }
}
