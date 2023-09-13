package tests.ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
@Tag("UITest")
@DisplayName("Запись на курс по JAVA")
public class EnrollInCourseTest extends TestBase{
    @Test
    public void javaCourse(){
        basePage.openPage();
        coursePage.openJavaUniversity()
        .clickButtonEnrollToCourse()
        .checkoutForm();
    }
}
