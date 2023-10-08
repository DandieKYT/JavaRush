package tests.api;

import models.Activities;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static specs.Specification.*;

public class SomeTest {
    private static final String expectedKey = "anonymous#3358758";
    private static final String expectedUserId = "3358758";
    private static final String expectedPartUserId = "336";

    @Test
    @DisplayName("Проверка по полному соответствию активности пользователя")
    void checkingUserActivity(){
        Activities[] data = given()
                .spec(newsSpec)
                .when()
                .get()
                .then()
                .spec(responseSpec)
                .extract().as(Activities[].class);
        Activities actualActivities = Arrays.stream(data)
                .filter(activities -> activities.getUser().getKey().equals(expectedKey)) //проверка по полному соответсвию ключа
                .findFirst()
                .orElseThrow(() -> new AssertionError(""));
        String actualUserid = String.valueOf(actualActivities.getUser().getUserId());

        assertThat(actualUserid).isEqualTo(expectedUserId); // проверка пр полному соотвествию id
    }

    @Test
    @DisplayName("Проверка по частичному соответствию активности пользователя")
    void checkingForPartialMatchingOfUser(){
        Activities[] data = given()
                .spec(newsSpec)
                .when()
                .get()
                .then()
                .spec(responseSpec)
                .extract().as(Activities[].class);
        Activities actualActivities = Arrays.stream(data)
                .filter(activities -> activities.getUser().getKey().contains(expectedPartUserId)) //проверка по частичному соответсвию ключа
                .findFirst()
                .orElseThrow(() -> new AssertionError(""));
        String foundUserId = String.valueOf(actualActivities.getUser().getUserId());

        assertThat(foundUserId).contains(expectedPartUserId); // проверка по частичному соответствию id

    }

}
