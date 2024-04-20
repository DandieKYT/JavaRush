package api;

import api.models.Tasks;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static api.specs.Specification.requestSpec;
import static api.specs.Specification.responseSpec;
import static io.restassured.RestAssured.given;

@Tag("API")
@Story("Занятия")
@Owner("Кудрявцев Даниил")
@Feature("Автотесты для API")
public class TasksResponseTest {

    private final String idJavaSyntax = "857";
    private final String expectIdAdFollowingAnAd = "1132";
    private final String lastDigitNumberId = "3920";
    private final String levelTaskLastDigit = "1";
    private final String expectTitleJavaSyntax = "Модуль 1. Java Syntax";
    private final String titleFollowingAnAd = "Я по объявлению…";

    @Test
    @DisplayName("Проверка названия урока 'Java Syntax Pro' по id")
    void checkingTitleByIdJavaSyntax() {
        Tasks[] data = given()
                .spec(requestSpec)
                .when()
                .get("tasks?filter=ALL")
                .then()
                .spec(responseSpec)
                .extract().as(Tasks[].class);
        Tasks actualTasks = Arrays.stream(data)
                .filter(tasks -> String.valueOf(tasks.getId()).contains(idJavaSyntax))
                .findFirst()
                .orElseThrow(() -> new AssertionError(""));
        String actualTitle = String.valueOf(actualTasks.quest.getTitle());
        Assertions.assertEquals(expectTitleJavaSyntax, actualTitle);
    }

    @Test
    @DisplayName("Проверка id урока по названию 'Я по объявлению…'")
    void checkingIdByTittleLesson() {
        Tasks[] data = given()
                .spec(requestSpec)
                .when()
                .get("tasks?filter=ALL")
                .then()
                .spec(responseSpec)
                .extract().as(Tasks[].class);
        Tasks actualTasks = Arrays.stream(data)
                .filter(tasks -> tasks.getTitle().contains(titleFollowingAnAd))
                .findFirst()
                .orElseThrow(() -> new AssertionError(""));
        String actualId = String.valueOf(actualTasks.getId());
        Assertions.assertEquals(expectIdAdFollowingAnAd, actualId);
    }

    @Test
    @DisplayName("Проверка уровня урока 'Последняя цифра числа' по id")
    void checkingLevel() {
        Tasks[] data = given()
                .spec(requestSpec)
                .when()
                .get("tasks?filter=ALL")
                .then()
                .spec(responseSpec)
                .extract().as(Tasks[].class);
        Tasks actualTasks = Arrays.stream(data)
                .filter(tasks -> String.valueOf(tasks.getId()).contains(lastDigitNumberId))
                .findFirst()
                .orElseThrow(() -> new AssertionError(""));
        String actualLevel = String.valueOf(actualTasks.getQuest().getLevel());
        Assertions.assertEquals(levelTaskLastDigit, actualLevel);
    }
}
