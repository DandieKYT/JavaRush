package api.specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static api.help.CustomApiListener.withCustomTemplates;
import static io.restassured.RestAssured.with;
import static io.restassured.filter.log.LogDetail.BODY;
import static io.restassured.filter.log.LogDetail.STATUS;
import static io.restassured.http.ContentType.JSON;

public class Specification {

    private static final String BASE_URL = "https://javarush.com/api/1.0/rest";

    public static RequestSpecification requestSpec =
            with()
                    .baseUri(BASE_URL)
                    .filter(withCustomTemplates())
                    .log().all()
                    .contentType(JSON);

    public static ResponseSpecification responseSpec = new ResponseSpecBuilder()
            .log(STATUS)
            .log(BODY)
            .build();

    public static RequestSpecification projectSpec =
            with()
                    .baseUri(BASE_URL)
                    .filter(withCustomTemplates())
                    .basePath("/projects")
                    .log().all()
                    .contentType(JSON);

    public static RequestSpecification quizzesSpec =
            with()
                    .baseUri(BASE_URL)
                    .filter(withCustomTemplates())
                    .basePath("/quizzes")
                    .log().all()
                    .contentType(JSON);

    public static RequestSpecification newsSpec =
            with()
                    .baseUri(BASE_URL)
                    .filter(withCustomTemplates())
                    .basePath("/news")
                    .log().all()
                    .contentType(JSON);

    public static RequestSpecification gamesSpec =
            with()
                    .baseUri(BASE_URL)
                    .filter(withCustomTemplates())
                    .basePath("/projects")
                    .log().all()
                    .contentType(JSON);

    public static RequestSpecification discussionsSpec =
            with()
                    .baseUri(BASE_URL)
                    .filter(withCustomTemplates())
                    .basePath("/discussions")
                    .log().all()
                    .contentType(JSON);

    public static RequestSpecification intershipSpec =
            with()
                    .baseUri(BASE_URL)
                    .filter(withCustomTemplates())
                    .basePath("/articles")
                    .log().all()
                    .contentType(JSON);
}
