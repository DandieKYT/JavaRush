package ui;

import ui.steps.CreateAccountStep;

public class Common {

    static CreateAccountStep learnStep = new CreateAccountStep();

    public static void stepsForWebApp() {
        learnStep.startLearnButton();
        learnStep.beginLearnButton();
        learnStep.russianLanguageButton();
        learnStep.qaButton();
        learnStep.blackPictureClick();
        learnStep.notNowButton();
        learnStep.xpInProgrammingNo();
        learnStep.checkOutResult();
        learnStep.getCourseButton();
        learnStep.emailInput();
        learnStep.passwordInput();
        learnStep.createAccount();
    }
}
