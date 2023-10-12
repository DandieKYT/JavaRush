package tests.ui;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("UITest")
public class YouTubeTest extends TestBase {
    @Test
    public void youTubeTest() {
        groupsStep.closeCookie();
        groupsStep.youtubeButton();
        groupsStep.acceptCookieYT();
        groupsStep.checkOutYoutubeTitle();
    }
}
