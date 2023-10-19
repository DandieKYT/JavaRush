package api;

import api.models.Activities;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static api.specs.Specification.newsSpec;
import static api.specs.Specification.responseSpec;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
@Tag("API")
public class NewsResponseTest {

    private static final String expectedKey = "anonymous#3358758";
    private static final String expectedUserId = "3358758";
    private static final String expectedPartKey = "anonymous#336";
    private static final String expectedPartUserId = "336";
    private static final String expectedPartId = "336";
    private static final String expectedType = "TASK_IN_PROGRESS";
    private static final String activityPartId = "310";
    private static final String partDescription = "пробует решить задачу";
    private static final String expectedCountry = "Russian Federation";
    private static final String partTitle = "quest";
    private static final long expectedTime = Long.parseLong("1696865323000");


    @Test
    @DisplayName("Проверка по частичному соответствию активности пользователя")
    void checkingForPartialMatchingOfUser() {
        Activities[] data = given()
                .spec(newsSpec)
                .when()
                .get()
                .then()
                .spec(responseSpec)
                .extract().as(Activities[].class);
        Activities actualActivities = Arrays.stream(data)
                .filter(activities -> activities.getUser().getKey().contains(expectedPartKey))
                .findFirst()
                .orElseThrow(() -> new AssertionError(""));

        String foundUserId = String.valueOf(actualActivities.getUser().getUserId());

        assertThat(foundUserId).contains(expectedPartUserId);

    }

    @Test
    @DisplayName("Проверка по частичному соответствию активности пользователя")
    void checkingForExpectedType() {
        Activities[] data = given()
                .spec(newsSpec)
                .when()
                .get()
                .then()
                .spec(responseSpec)
                .extract().as(Activities[].class);
        Activities actualActivities = Arrays.stream(data)
                .filter(activities -> activities.getType().contains(expectedType))
                .findFirst()
                .orElseThrow(() -> new AssertionError(""));
        String activityId = String.valueOf(actualActivities.getId());

        assertThat(activityId).contains(activityPartId);
    }

    @Test
    @DisplayName("Проверка по частичному соответствию активности пользователя")
    void checkingForPartDescription() {
        Activities[] data = given()
                .spec(newsSpec)
                .when()
                .get()
                .then()
                .spec(responseSpec)
                .extract().as(Activities[].class);
        Activities actualActivities = Arrays.stream(data)
                .filter(activities -> activities.getType().equals(expectedType))
                .findFirst()
                .orElseThrow(() -> new AssertionError(""));
        String actualDescription = String.valueOf(actualActivities.getDescription());

        assertThat(actualDescription).contains(partDescription);
    }
}
