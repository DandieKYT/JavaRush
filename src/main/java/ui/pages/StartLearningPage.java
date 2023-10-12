package ui.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class StartLearningPage {
    public static final SelenideElement startLearnButton = $x("//*[@id='button_menu_start_learning_unauthorized_user']");
    public static final SelenideElement beginLearnButton = $x("//*[@id='id_button_jr_welcome_start_learning_1']");
    public static final SelenideElement russianLanguageButton = $x("//*[@id='todo_add']");
    public static final SelenideElement checkoutLoad = $x("//div[text() ='Создается ваш персональный курс']");
    public static final SelenideElement loader = $x("//*[contains(@class, 'last-step-loading')]");
    public static final SelenideElement qaButton = $x("//*[@id='id_button_jr_welcome_choose_qa']");
    public static final SelenideElement blackPictureClick = $x("//*[@id='id_button_jr_welcome_light_theme']/picture");
    public static final SelenideElement notNowButton = $x("//*[@id='id_button_jr_welcome_sign_up_not_now']");
    public static final SelenideElement testBeginButton = $x("//*[@id='id_button_jr_welcome_start_testing']");
    public static final SelenideElement xpInProgrammingYes = $x("//*[@id='id_button_jr_welcome_determine_my_level']");
    public static final SelenideElement xpInProgrammingNo = $x("//*[@id='id_button_jr_welcome_start_from_scratch']");
    public static final SelenideElement getButtonLearn = $x("//*[@id='id_button_jr_welcome_get_course']");
    public static final SelenideElement profileName = $(".my-profile-card__name");
    public static final SelenideElement nextButton = $x("//button[text()='Далее']");
    public static final SelenideElement checkOutResult = $x("//div[text()='Ваш персональный курс готов']");

    public static final ElementsCollection radioButton = $$x("//*[contains(@class,'radio-button radio-button--basic svelte')]");
    public static final ElementsCollection pageElementQA = $$x("//*[contains(@class,'progress-bar__step')]");


}
