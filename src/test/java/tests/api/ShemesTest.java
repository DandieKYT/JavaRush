package tests.api;

import io.restassured.module.jsv.JsonSchemaValidator;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static specs.Specification.discussionsSpec;
import static specs.Specification.intershipSpec;

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
}

