package ui;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("UITest")
@Owner("Кудрявцев Даниил")
@Feature("Автотесты для UI")
@Story("Раздел курс по Java")
public class EnrollInCourseToJavaTest extends TestBase {

    @Test
    @DisplayName("Запись на курс по JAVA")
    public void enrollInCourseToJava() {
        enrollInCourseJavaStep.openJavaUniversity();
        enrollInCourseJavaStep.clickButtonEnrollToCourse();
        enrollInCourseJavaStep.checkoutForm();
    }
}
