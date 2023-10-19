package ui.pages;

import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;


public class ReviewsAndAboutUsPage {

    public final SelenideElement openTitle(String param) {
        return $(byTagAndText("a", (param)));
    }

    public final SelenideElement checkTitle(String expectedText) {
        return $((byTagAndText("h1", (expectedText))));

    }
}
