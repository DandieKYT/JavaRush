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
//                    .header("javarush.user.id", "3348689")
//                    .cookies("JSESSIONID" , "569249ab-f542-4e61-8a0e-0d6f0cf0fa2f",
//                            "javarush.user.id", "3348689")
                    .cookies(
                            "_gcl_au","1.1.787769479.1693512988",
                           "_ga_cid", "1139280727.1693512988",
                            "intercom-session-mqlef7yz", "",
                            "intercom-device-id-mqlef7yz", "53b03e36-5e47-44df-8282-2cf23848b3c7",
                            "jr-sidebar-mode", "FULL",
                            "jr-cookie-consent", "passed",
                            "_fbp","fb.1.1693516593620.1822412960",
                            "_gid","GA1.2.1869032332.1693849308",
                            "javarush.user.id","3348689",
                            "JSESSIONID","569249ab-f542-4e61-8a0e-0d6f0cf0fa2f",
                            "javarush.daynight","dark",
                           " jr-welcome-last-page","last-step",
                           " _ga","GA1.2.1139280727.1693512988",
                           " intercom-id-mqlef7yz","3348689",
                            "_gat_UA-35679269-1","1",
                            "_ga_H48XN71483","GS1.2.1693942265.5.1.1693944251.60.0.0",
                            "_ga_G0F5YPM3KY","GS1.1.1693942265.7.1.1693944252.60.0.0"
                    )
                    .baseUri(BASE_URL)
                    .basePath(BASE_PATCH)
                    .log().all()
                    .contentType(JSON);

    public static ResponseSpecification responseSpec = new ResponseSpecBuilder()
            .log(STATUS)
            .log(BODY)
            .build();
}
