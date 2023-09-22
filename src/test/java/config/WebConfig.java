package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/test.properties"
})
public interface WebConfig extends Config {
    @Key("browser")
    @DefaultValue("chrome")
    String browser();

    @Key("browserVersion")
    @DefaultValue("100.0")
    String browserVersion();

    @Key("browserSize")
    @DefaultValue("1900x1080")
    String browserSize();

    @Key("remoteUrl")
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub")
    String remoteUrl();

    @Key("pageLoadStrategy")
    @DefaultValue("eager")
    String pageLoadStrategy();

    @Key("BaseUrl")
    @DefaultValue("https://javarush.com")
    String BaseUrl();
}