package ui.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:test.properties"
})
public interface WebConfig extends Config {

    @Key("browser")
    String getBrowser();
    @Key("browserVersion")
    String getBrowserVersion();

    @Key("browserSize")
    String getBrowserSize();

    @Key("videoUrl")
    String videoUrl();

    @Key("baseUrl")
    @DefaultValue("https://javarush.com")
    String getBaseUrl();

    @Key("false")
    @DefaultValue("isRemote")
    String isRemote();
}