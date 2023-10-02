package tests.api;

import models.Commentary;
import models.SomeUser;
import models.Users;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
//import org.junit.jupiter.api.Assertions;

import static specs.Specification.*;
import static org.assertj.core.api.Assertions.assertThat;

public class UsersApiTest {
    @Test
    @DisplayName("Поиск пользователя по имени")
    void searchUser() {
        Users data = given()
                .spec(usersSpec)
                .when()
                .get("/user3320682")
                .then()
                .spec(responseSpec)
                .extract().as(Users.class);
        assertThat(3320682).isEqualTo(data.id);

    }

    @Test
    @DisplayName("Поиск пользователя по имени")
    void searchUserMaria() {
        Users data = given()
                .spec(usersSpec)
                .when()
                .get("/user2209041")
                .then()
                .spec(responseSpec)
                .extract().as(Users.class);
        assertThat(2209041).isEqualTo(data.id);
        Assertions.assertEquals("Йошкар-ола", data.city);
        Assertions.assertEquals("QA Automation Engineer", data.position);
//        Assertions.assertEquals
//        users/2209041
    }

    //   /discussion8/comments/932598
    @Test
    @DisplayName("Поиск пользователя по имени")
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
    @DisplayName("Поиск пользователя по имени")
    void searchUrsdg() {
        SomeUser data = given()
                .spec(requestSpec)
                .when()
                .get("articles/articlecom.javarush.article.about.internship")
                .then()
                .spec(responseSpec)
                .extract().as(SomeUser.class);
        Assertions.assertEquals(30, data.id);
        Assertions.assertEquals("com.javarush.article.about.internship", data.key);
        Assertions.assertEquals("Admin", data.user.position);
        Assertions.assertEquals("RUSSIAN", data.language);
    }
}
