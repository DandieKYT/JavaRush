package config;

import org.aeonbits.owner.Config;
@Config.Sources({
        "classpath:config/test.properties"
})
public interface MobileConfig extends Config {
    @Key("AppPackage")
    @DefaultValue("com.hitechrush.jaxarush")
    String AppPackage ();

    @Key("AppActivity")
    @DefaultValue("ru.javarush.android.ui.main.MainActivity")
    String AppActivity();

    @Key("deviceName")
    @DefaultValue("OnePlus 9")
    String deviceName();

    @Key("platformName")
    @DefaultValue("Android")
    String platformName();
    @Key("url")
    @DefaultValue("http://0.0.0.0:4723/wd/hub")
    String url();

    @Key("PlatformVersion")
    @DefaultValue("11.0")
    String PlatformVersion();

    @Key("username")
    @DefaultValue("dandiekyt_fmCgsX")
    String username();

    @Key("passwordKey")
    @DefaultValue("aUkbVXswGV3k2ybtE1Wr")
    String passwordKey();

    @Key("remoteMobileUrl")
    @DefaultValue("https://hub.browserstack.com/wd/hub")
    String remoteMobileUrl();

    @Key("app")
    @DefaultValue("bs://aeafb14cd38d3e07fe23e50468cf6bf41b0310a7")
    String app();
}
