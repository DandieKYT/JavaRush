package ui;

import ui.steps.StartLearningStep;

public class Common {

    static StartLearningStep learnStep = new StartLearningStep();

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
