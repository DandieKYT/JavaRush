package ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CreateAccountPage {

    public final SelenideElement beginLearnButton = $x("//*[@id='id_button_jr_welcome_start_learning_1']");
    public final SelenideElement russianLanguageButton = $x("//*[@id='todo_add']");
    public final SelenideElement checkoutLoad = $x("//div[text() ='Создается ваш персональный курс']");
    public final SelenideElement loader = $x("//*[contains(@class, 'last-step-loading')]");
    public final SelenideElement qaButton = $x("//*[@id='id_button_jr_welcome_choose_qa']");
    public final SelenideElement blackPictureClick = $x("//*[@id='id_button_jr_welcome_light_theme']/picture");
    public final SelenideElement notNowButton = $x("//*[@id='id_button_jr_welcome_sign_up_not_now']");
    public final SelenideElement xpInProgrammingYes = $x("//*[@id='id_button_jr_welcome_determine_my_level']");
    public final SelenideElement xpInProgrammingNo = $x("//*[@id='id_button_jr_welcome_start_from_scratch']");
    public final SelenideElement checkOutResult = $x("//div[text()='Ваш персональный курс готов']");
    public final SelenideElement getCourseButton = $x("//*[@id='id_button_jr_welcome_get_course']");
    public final SelenideElement emailInput = $x("//input[@placeholder='Email']");
    public final SelenideElement passwordInput = $x("//input[@placeholder='Пароль']");
    public final SelenideElement createAccount = $x("//button[@id='id_button_jr_welcome_create_account']");
}
