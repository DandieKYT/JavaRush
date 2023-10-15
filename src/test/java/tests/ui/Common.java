package tests.ui;

import ui.steps.StartLearningStep;

public class Common {
   static StartLearningStep createAccountStep = new StartLearningStep();
    public static void stepsForWebApp() {
        createAccountStep.startLearnButton();
        createAccountStep.beginLearnButton();
        createAccountStep.russianLanguageButton();
        createAccountStep.qaButton();
        createAccountStep.blackPictureClick();
        createAccountStep.notNowButton();
        createAccountStep.xpInProgrammingNo();
        createAccountStep.checkOutResult();
    }
}
