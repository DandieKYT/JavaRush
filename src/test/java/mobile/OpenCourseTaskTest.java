package mobile;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@Tag("Mobile")
@Story("Боковое меню")
@Owner("Кудрявцев Даниил")
@Feature("Автотесты для Mobile")
public class OpenCourseTaskTest extends TestBaseMobile {

    @CsvSource(value = {
            "course,      Java course",
            "tasks,             Tasks",
    })
    @ParameterizedTest
    @DisplayName("Открытие разделов Course/Java и проверка их содержимого")
    public void checkoutCourseTaskPages(String param, String expectedText) {
        mobileCommonStep.stepsForApp();
        authorizationStep.goBackButton();
        authorizationStep.navigateMenu();
        sideBarStep.tag(param);
        sideBarStep.checkTitle(expectedText);
    }
}
