package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:test.properties"
})
public interface MobileConfig extends Config {
    @Key("AppPackage")
    String AppPackage ();

    @Key("AppActivity")
    String AppActivity();

    @Key("deviceName")
    String deviceName();

    @Key("platformName")
    String platformName();

    @Key("url")
    String url();

    @Key("PlatformVersion")
    String PlatformVersion();

    @Key("username")
    String username();

    @Key("passwordKey")
    String passwordKey();

    @Key("remoteMobileUrl")
    String remoteMobileUrl();

    @Key("app")
    String app();
}
