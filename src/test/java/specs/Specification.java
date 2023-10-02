package specs;

import authentication.Authentication;
import config.AuthConfig;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.aeonbits.owner.ConfigFactory;

import static io.restassured.RestAssured.with;
import static io.restassured.filter.log.LogDetail.BODY;
import static io.restassured.filter.log.LogDetail.STATUS;
import static io.restassured.http.ContentType.JSON;

public class Specification {
    private static final AuthConfig authConfig = ConfigFactory.create(AuthConfig.class);
    private static final String BASE_URL = "https://javarush.com/api/1.0/rest";
    private static final String BASE_PATCH = "/api/1.0/rest";
    public static RequestSpecification requestSpec =
            with()
                    .baseUri(BASE_URL)
                    .log().all()
                    .contentType(JSON);

    public static ResponseSpecification responseSpec = new ResponseSpecBuilder()
            .log(STATUS)
            .log(BODY)
            .build();
    public static RequestSpecification usersSpec =
            with()
                    .baseUri(BASE_URL)
                    .basePath("/users")
                    .log().all()
                    .contentType(JSON);
    public static RequestSpecification discussionsSpec =
            with()
                    .baseUri(BASE_URL)
                    .basePath("/discussions")
                    .log().all()
                    .contentType(JSON);
}
