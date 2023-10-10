package tests.api;

import models.Activities;
import models.Games;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static specs.Specification.*;

public class SomeTest {
    private static final String expectedKey = "anonymous#3358758";
    private static final String expectedUserId = "3358758";
    private static final String expectedPartKey = "anonymous#336";
    private static final String expectedPartUserId = "336";
    private static final String expectedPartId = "336";
    private static final String expectedType = "TASK_IN_PROGRESS";
    private static final String activityPartId = "31043";
    private static final String partDescription = "пробует решить задачу";
    private static final String expectedCountry = "Russian Federation";
    private static final String partTitle = "quest";
    private static long expectedTime = Long.parseLong("1696865323000");


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
                .filter(activities -> activities.getUser().getKey().contains(expectedPartKey)) //проверка по частичному соответсвию ключа
                .findFirst()
                .orElseThrow(() -> new AssertionError(""));

        String foundUserId = String.valueOf(actualActivities.getUser().getUserId());

        assertThat(foundUserId).contains(expectedPartUserId); // проверка по частичному соответствию id

    }
    @Test
    @DisplayName("Проверка по частичному соответствию активности пользователя")
    void checkingForExpectedType(){
        Activities[] data = given()
                .spec(newsSpec)
                .when()
                .get()
                .then()
                .spec(responseSpec)
                .extract().as(Activities[].class);
        Activities actualActivities = Arrays.stream(data)
                .filter(activities -> activities.getType().contains(expectedType)) //проверка по частичному соответсвию ключа
                .findFirst()
                .orElseThrow(() -> new AssertionError(""));
        String activityId = String.valueOf(actualActivities.getId());

        assertThat(activityId).contains(activityPartId); // проверка по частичному соответствию id
    }
    @Test
    @DisplayName("Проверка по частичному соответствию активности пользователя")
    void checkingForPartDescription(){
        Activities[] data = given()
                .spec(newsSpec)
                .when()
                .get()
                .then()
                .spec(responseSpec)
                .extract().as(Activities[].class);
        Activities actualActivities = Arrays.stream(data)
                .filter(activities -> activities.getType().equals(expectedType)) //проверка по частичному соответсвию ключа
                .findFirst()
                .orElseThrow(() -> new AssertionError(""));
        String actualDescription = String.valueOf(actualActivities.getDescription());

        assertThat(actualDescription).contains(partDescription); // проверка по частичному соответствию id
    }
}
