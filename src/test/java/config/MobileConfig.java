package config;

import org.aeonbits.owner.Config;
@Config.Sources({
        "classpath:config/test.properties"
})
public interface MobileConfig extends Config {
    @Key("AppPackage")
    @DefaultValue("chrome")
    String AppPackage ();

    @Key("AppActivity")
    @DefaultValue("ru.ozon.app.android.ui.start.PreStartActivity")
    String AppActivity();

    @Key("deviceName")
    @DefaultValue("Pixel 4 API 30")
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

}
