package api;

import api.models.Activities;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static api.specs.Specification.newsSpec;
import static api.specs.Specification.responseSpec;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

@Tag("API")
@Owner("Кудрявцев Даниил")
@Feature("Автотесты для API")
@Story("Активности пользователей")
public class NewsResponseTest {
    private final String expectedPartKey = "anonymous#341";
    private final String expectedPartUserId = "341";
    private final String expectedType = "TASK_IN_PROGRESS";
    private final String activityPartId = "33";
    private final String partDescription = "пробует решить задачу";

    @Test
    @DisplayName("Проверка по частичному соответствию ключа пользователя")
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
    @DisplayName("Проверка по частичному соответствию статуса решения задачи")
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
    @DisplayName("Проверка по частичному соответствию статуса решения задачи")
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
