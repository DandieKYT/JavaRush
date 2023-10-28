package api;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static api.specs.Specification.*;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

@Tag("API")
@Owner("Кудрявцев Даниил")
@Story("Открытие json-scheme")
@Feature("Автотесты для API")
public class ShemeResponseTest {

    @Test
    @DisplayName("Открытие страницы 'Стажировка в Java-Rush'")
    public void checkIntershipShemesTest() {
        given()
                .spec(intershipSpec)
                .when()
                .get("/articlecom.javarush.article.about.internship")
                .then()
                .spec(responseSpec)
                .body(matchesJsonSchemaInClasspath("schemes/article.json"));
    }

    @Test
    @DisplayName("Открытие страницы Project1")
    public void checkProject1ShemesTest() {
        given()
                .spec(discussionsSpec)
                .when()
                .get("/project1")
                .then()
                .spec(responseSpec)
                .body(matchesJsonSchemaInClasspath("schemes/project1.json"));
    }

    @Test
    @DisplayName("Открытие страницы активностей")
    public void checkNewsShemesTest() {
        given()
                .spec(newsSpec)
                .when()
                .get()
                .then()
                .spec(responseSpec)
                .body(matchesJsonSchemaInClasspath("schemes/news.json"));
    }

    @Test
    @DisplayName("Открытие страницы лекций")
    public void checkQuizzesShemesTest() {
        given()
                .spec(quizzesSpec)
                .when()
                .get()
                .then()
                .spec(responseSpec)
                .body(matchesJsonSchemaInClasspath("schemes/quizzes.json"));
    }

    @Test
    @DisplayName("Открытие страницы 'Игры'")
    public void checkProjectsShemesTest() {
        given()
                .spec(projectSpec)
                .when()
                .get()
                .then()
                .spec(responseSpec)
                .body(matchesJsonSchemaInClasspath("schemes/projects.json"));
    }
}

