package ui.steps;

import static help.GenerationData.generationRandomText;

public class Common {

    static CreateAccountStep learnStep = new CreateAccountStep();
    static MainPageSteps mainPageSteps = new MainPageSteps();

    String email = "@mail.ru";
    String password = "1235";

    public void stepsForWebApp() {
        mainPageSteps.startLearnButton();
        learnStep.beginLearnButton();
        learnStep.russianLanguageButton();
        learnStep.qaButton();
        learnStep.blackPictureClick();
        learnStep.notNowButton();
        learnStep.xpInProgrammingNo();
        learnStep.checkOutResult();
        learnStep.getCourseButton();
        learnStep.emailInput(generationRandomText() + email);
        learnStep.passwordInput(generationRandomText() + password);
        learnStep.createAccount();
    }
}
