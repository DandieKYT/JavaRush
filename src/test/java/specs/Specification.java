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
    private static final String BASE_URL = "https://javarush.com";
    private static final String BASE_PATCH = "/api/1.0";
    public static RequestSpecification requestSpec =
            with()
                    .header("javarush.user.id", "3320682")
                    .cookie("JSESSIONID" , "cb0b9f33-6278-4e1a-ba00-ad704596811a")
                    .baseUri(BASE_URL)
                    .basePath(BASE_PATCH)
                    .log().all()
                    .contentType(JSON);

    public static ResponseSpecification responseSpec = new ResponseSpecBuilder()
            .log(STATUS)
            .log(BODY)
            .build();



}
