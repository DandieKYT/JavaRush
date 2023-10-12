package tests.api;


import models.Commentary;
import models.SomeUser;
import models.Users;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static io.restassured.RestAssured.given;


import static org.assertj.core.api.InstanceOfAssertFactories.INTEGER;
import static specs.Specification.*;
import static org.assertj.core.api.Assertions.assertThat;

public class UsersApiTest {
    private static final String expectedUserId = "332";

    @Test
    @DisplayName("Проверка id пользователя")
    void searchUser() {
        Users data = given()
                .spec(usersSpec)
                .when()
                .get("users/user3320682")
                .then()
                .spec(responseSpec)
                .extract().as(Users.class);
        assertThat(data.id).isEqualTo(3320682);

    }

    @Test
    @DisplayName("Проверка города и профессии пользователя")
    void searchUserMaria() {
        Users data = given()
                .spec(usersSpec)
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
    @DisplayName("Проверка коментария")
    void searchUr() {
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
        Assertions.assertEquals(false, data.attributes.answer);
        Assertions.assertEquals("anonymous#2167660", data.getOwner().key);
    }

    @Test
    @DisplayName("Проверка профиля пользователя")
    void searchUrsdg() {
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
    @DisplayName("Проверка по частичному соответствию активности пользователя")
    void checkingForPartCountry() {
        Users[] data = given()
                .spec(usersSpec)
                .when()
                .get("users?filter=ALL")
                .then()
                .spec(responseSpec)
                .extract().as(Users[].class);
        Users actualUsers = Arrays.stream(data)
                .filter(users -> users.getCountry().contains("Россия")) //проверка по частичному соответсвию ключа
                .findFirst()
                .orElseThrow(() -> new AssertionError(""));
        String actualKey = String.valueOf(actualUsers.getKey());

        assertThat(actualKey).contains("anonymous#"); // проверка по частичному соответствию id
    }

    @Test
    @DisplayName("Проверка соответсвия userID и ID")
    void checkingForPartDescription() {
        Users[] data = given()
                .spec(usersSpec)
                .when()
                .get("/users?filter=ALL")
                .then()
                .spec(responseSpec)
                .extract().as(Users[].class);
        Users actualUsers = Arrays.stream(data)
                .filter(users ->String.valueOf(users.getUserId()).contains(expectedUserId)) //проверка по частичному соответсвию ключа
                .findFirst()
                .orElseThrow(() -> new AssertionError(""));
        Integer actualId = Integer.valueOf(actualUsers.getId());
        Assertions.assertEquals(actualUsers.getUserId(),actualId ); // проверка по частичному соответствию id

    }
}

