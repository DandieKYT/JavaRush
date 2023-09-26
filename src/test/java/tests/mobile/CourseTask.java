package tests.mobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CourseTask extends TestBaseMobileRemote {
    @CsvSource(value = {
            "course,      Java course",
            "tasks,             Tasks",
    })
    @ParameterizedTest
    @DisplayName("Открытие разделов Course/Java и проверка их содержимого")
    public void checkCourseTask(String param, String expectedText) {
        stepsForApp();
        auth.navigateMenu();//Нажимаем на разделы
        courseTaskPage.tag(param)
                .checkTitle(expectedText);


    }

    private void stepsForApp() {
        auth.signInLink()
                .secretKeyLink()
                .loginKey()
                .loginButton()
                .closeBanner()
                .closeSecondBanner()
                .openLesson()
                .goBackButton();
    }
}
