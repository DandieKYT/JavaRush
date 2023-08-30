package tests.ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Запись на курс по JAVA")
public class EnrollInCourseTest extends TestBase{
    @Test
    public void javaCourse(){
        basePage.openPage();
        coursePage.openJavaUniversity();
        coursePage.clickButtonEnrollToCourse();
        coursePage.checkoutForm();
    }
}
