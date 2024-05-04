package ui.steps;

import static help.GenerationData.generationRandomText;

public class Common {

    static CreateAccountStep learnStep = new CreateAccountStep();
    static MainPageSteps mainPageSteps = new MainPageSteps();
    static SideBarSteps sideBarSteps = new SideBarSteps();
    static UserSettingsStep userSettingsStep = new UserSettingsStep();

    String email = "@mail.ru";
    String password = "1235";

    public void stepsForWebApp() {
        mainPageSteps.startLearnButton();
        learnStep.beginLearnButton();
        learnStep.russianLanguageButton();
        learnStep.emailInput(generationRandomText() + email);
        learnStep.passwordInput(generationRandomText() + password);
        learnStep.createAccount();
    }
    public void stepsForDeleteAccount(){
        sideBarSteps.openSettings();
        userSettingsStep.openSafetyAndEntry();
        userSettingsStep.scrollPageDown();
        userSettingsStep.clickTextForDeletingAccount();
        userSettingsStep.inputTextConfirmAndDeleteAccount();
        userSettingsStep.checkDeleteAccount();
    }
}
