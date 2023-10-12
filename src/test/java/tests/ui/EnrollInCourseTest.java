package tests.ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
@Tag("UITest")
public class EnrollInCourseTest extends TestBase{
    @Test
    @DisplayName("Запись на курс по JAVA")
    public void javaCourse(){
        enrollInCourseStep.openJavaUniversity();
        enrollInCourseStep.clickButtonEnrollToCourse();
        enrollInCourseStep.checkoutForm();
    }
}
