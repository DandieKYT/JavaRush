package ui.steps;
import ui.pages.CreateAccountPage;
import ui.steps.CreateAccountStep;
import ui.steps.MainPageSteps;

import static ui.steps.GenerationStep.generationRandomText;

public class Common {

    static CreateAccountStep learnStep = new CreateAccountStep();
    static MainPageSteps mainPageSteps = new MainPageSteps();
    static CreateAccountPage createAccountPage = new CreateAccountPage();

    public static void stepsForWebApp() {
        mainPageSteps.startLearnButton();
        learnStep.beginLearnButton();
        learnStep.russianLanguageButton();
        learnStep.qaButton();
        learnStep.blackPictureClick();
        learnStep.notNowButton();
        learnStep.xpInProgrammingNo();
        learnStep.checkOutResult();
        learnStep.getCourseButton();
        String email = String.valueOf(createAccountPage.emailInput.setValue(generationRandomText() + "@mail.ru"));
        String password = String.valueOf(createAccountPage.passwordInput.setValue(generationRandomText() + "1245"));
        learnStep.createAccount();
    }
}
