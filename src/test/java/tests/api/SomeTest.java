package tests.api;

import models.Activities;
import models.Users;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static specs.Specification.*;

public class SomeTest {
    private static final String expectedKey = "anonymous#2982282";
    private static final String expectedUserId = "2982282";
    @Test
    @DisplayName("Проверка активности пользователя")
    void сheckingUserActivityy(){
        Activities[] data = given()
                .spec(newsSpec)
                .when()
                .get()
                .then()
                .spec(responseSpec)
                .extract().as(Activities[].class);
        Activities actualActivities = Arrays.stream(data)
                .filter(activities -> activities.getUsers().getKey().equals(expectedKey))
                .findFirst()
                .orElseThrow(() -> new AssertionError(""));
        String actualUserid = String.valueOf(actualActivities.getUsers().getUserId());


        assertThat(actualUserid).isEqualTo(expectedUserId);

    }

}
