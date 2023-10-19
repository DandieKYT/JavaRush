package api;

import org.junit.jupiter.api.Test;

import static api.specs.Specification.*;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class ShemesResponseTest {

    @Test
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

