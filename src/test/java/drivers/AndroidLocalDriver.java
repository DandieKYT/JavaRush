package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.MobileConfig;
import config.WebConfig;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import javax.annotation.Nonnull;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.remote.AutomationName.ANDROID_UIAUTOMATOR2;
import static io.appium.java_client.remote.MobilePlatform.ANDROID;
import static org.apache.commons.io.FileUtils.copyInputStreamToFile;

public class AndroidLocalDriver implements WebDriverProvider {
    protected static final MobileConfig mobile = ConfigFactory.create(MobileConfig.class);
    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        UiAutomator2Options options = new UiAutomator2Options();
        options.merge(capabilities);

        options.setAutomationName(ANDROID_UIAUTOMATOR2)
                .setPlatformName(ANDROID)
                .setPlatformVersion(mobile.PlatformVersion())
                .setDeviceName(mobile.deviceName())
                .setAppPackage(mobile.AppPackage())
                .setAppActivity(mobile.AppActivity());

        return new AndroidDriver(getAppiumServerUrl(), options);
    }

    public static URL getAppiumServerUrl() {
        try {
            return new URL(mobile.url());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

//
}