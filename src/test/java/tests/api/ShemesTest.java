package tests.api;

import io.restassured.module.jsv.JsonSchemaValidator;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static specs.Specification.*;

public class ShemesTest {
    @Test
    public void intershipTest() {
        given()
                .spec(intershipSpec)
                .when()
                .get("/articlecom.javarush.article.about.internship")
                .then()
                .body(matchesJsonSchemaInClasspath("schemes/article.json"));
    }

    @Test
    public void project1Test() {
        given()
                .spec(discussionsSpec)
                .when()
                .get("/project1")
                .then()
                .body(matchesJsonSchemaInClasspath("schemes/project1.json"));
    }
    @Test
    public void newsTest() {
        given()
                .spec(newsSpec)
                .when()
                .get()
                .then()
                .body(matchesJsonSchemaInClasspath("schemes/news.json"));
    }
    @Test
    public void quizzesTest() {
        given()
                .spec(quizzesSpec)
                .when()
                .get()
                .then()
                .body(matchesJsonSchemaInClasspath("schemes/quizzes.json"));
    }
    @Test
    public void projectsTest() {
        given()
                .spec(projectSpec)
                .when()
                .get()
                .then()
                .body(matchesJsonSchemaInClasspath("schemes/projects.json"));
    }
}

