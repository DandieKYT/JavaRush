package api;

import api.models.Commentary;
import api.models.SomeUser;
import api.models.Users;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static api.specs.Specification.*;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

@Tag("API")
@Owner("Кудрявцев Даниил")
@Story("Пользователи")
@Feature("Автотесты для API")
public class UsersResponseTest {

    private final String expectedUserId = "332";

    @Test
    @DisplayName("Проверка id пользователя")
    void checkUserById() {
        Users data = given()
                .spec(requestSpec)
                .when()
                .get("users/user3320682")
                .then()
                .spec(responseSpec)
                .extract().as(Users.class);
        assertThat(data.id).isEqualTo(3320682);
    }

    @Test
    @DisplayName("Проверка города, профессии и id пользователя")
    void searchUserMaria() {
        Users data = given()
                .spec(requestSpec)
                .when()
                .get("users/user2209041")
                .then()
                .spec(responseSpec)
                .extract().as(Users.class);
        assertThat(2209041).isEqualTo(data.getId());
        Assertions.assertEquals("Йошкар-Ола", data.getCity());
        Assertions.assertEquals("QA Automation Engineer", data.getPosition());
    }

    @Test
    @DisplayName("Проверка id, лайков, владельца комментария, ответов на комментарий и ключа пользователя")
    void checkCommentary() {
        Commentary data = given()
                .spec(discussionsSpec)
                .when()
                .get("/discussion8/comments/932598")
                .then()
                .spec(responseSpec)
                .extract().as(Commentary.class);
        assertThat(932598).isEqualTo(data.id);
        Assertions.assertEquals(0, data.likes.count);
        Assertions.assertEquals(4, data.owner.level);
        Assertions.assertFalse(data.attributes.answer);
        Assertions.assertEquals("anonymous#2167660", data.getOwner().key);
    }

    @Test
    @DisplayName("Проверка id, ключа, места работы и языка в профиле пользователя")
    void checkUserProfile() {
        SomeUser data = given()
                .spec(requestSpec)
                .when()
                .get("articles/articlecom.javarush.article.about.internship")
                .then()
                .spec(responseSpec)
                .extract().as(SomeUser.class);
        Assertions.assertEquals(30, data.getId());
        Assertions.assertEquals("com.javarush.article.about.internship", data.getKey());
        Assertions.assertEquals("Admin", data.getUser().getPosition());
        Assertions.assertEquals("RUSSIAN", data.getLanguage());
    }

    @Test
    @DisplayName("Проверка пользователей из России и их частичного ключа")
    void checkingForPartCountry() {
        Users[] data = given()
                .spec(requestSpec)
                .when()
                .get("users?filter=ALL")
                .then()
                .spec(responseSpec)
                .extract().as(Users[].class);
        Users actualUsers = Arrays.stream(data)
                .filter(users -> users.getCountry().contains("Россия"))
                .findFirst()
                .orElseThrow(() -> new AssertionError(""));
        String actualKey = String.valueOf(actualUsers.getKey());
        assertThat(actualKey).contains("anonymous#");
    }

    @Test
    @DisplayName("Проверка соответствия userID и ID")
    void checkingForPartDescription() {
        Users[] data = given()
                .spec(requestSpec)
                .when()
                .get("/users?filter=ALL")
                .then()
                .spec(responseSpec)
                .extract().as(Users[].class);
        Users actualUsers = Arrays.stream(data)
                .filter(users -> String.valueOf(users.getUserId()).contains(expectedUserId))
                .findFirst()
                .orElseThrow(() -> new AssertionError(""));
        Integer actualId = Integer.valueOf(actualUsers.getId());
        Assertions.assertEquals(actualUsers.getUserId(), actualId);
    }
}

