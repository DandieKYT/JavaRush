package tests.api;

import models.Tasks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static io.restassured.RestAssured.given;
import static specs.Specification.*;

public class PostsTest {
    private static final String idJavaSyntax = "857";
    private static final String adFollowingAnAd = "1132";
    private static final String lastDigitNumberId = "3920";
    private static final String levelTaskLastDigit = "2";
    private static final String expectJavaSyntax = "Java Syntax Pro";
    private static final String titleFollowingAnAd = "Я по объявлению…";
    @Test
    @DisplayName("Проверка соответсвия userID и ID")
    void checkingTitleByIdJavaSyntax() {
        Tasks[] data = given()
                .spec(requestSpec)
                .when()
                .get("tasks?filter=ALL")
                .then()
                .spec(responseSpec)
                .extract().as(Tasks[].class);
        Tasks actualTasks = Arrays.stream(data)
                .filter(tasks ->String.valueOf(tasks.getId()).contains(idJavaSyntax)) //проверка по частичному соответсвию ключа
                .findFirst()
                .orElseThrow(() -> new AssertionError(""));
        String actualTitle = String.valueOf(actualTasks.quest.getTitle());
        Assertions.assertEquals(expectJavaSyntax, actualTitle ); // проверка по частичному соответствию id

    }
    @Test
    @DisplayName("Проверка id по названию урока")
    void checkingIdByTittleLesson() {
        Tasks[] data = given()
                .spec(requestSpec)
                .when()
                .get("tasks?filter=ALL")
                .then()
                .spec(responseSpec)
                .extract().as(Tasks[].class);
        Tasks actualTasks = Arrays.stream(data)
                .filter(tasks ->tasks.getTitle().contains(titleFollowingAnAd)) //проверка по частичному соответсвию ключа
                .findFirst()
                .orElseThrow(() -> new AssertionError(""));
        String actualId = String.valueOf(actualTasks.getId());
        Assertions.assertEquals(adFollowingAnAd, actualId ); // проверка по частичному соответствию id

    }
    @Test
    @DisplayName("Проверка id по названию урока")
    void checkingLevel() {
        Tasks[] data = given()
                .spec(requestSpec)
                .when()
                .get("tasks?filter=ALL")
                .then()
                .spec(responseSpec)
                .extract().as(Tasks[].class);
        Tasks actualTasks = Arrays.stream(data)
                .filter(tasks ->String.valueOf(tasks.getId()).contains(lastDigitNumberId)) //проверка по частичному соответсвию ключа
                .findFirst()
                .orElseThrow(() -> new AssertionError(""));
        String actualLevel = String.valueOf(actualTasks.getQuest().getLevel());
        Assertions.assertEquals(levelTaskLastDigit, actualLevel ); // проверка по частичному соответствию id

    }
}
