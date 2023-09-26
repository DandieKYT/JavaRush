package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.MobileConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackDriver implements WebDriverProvider {
    protected static final MobileConfig mobile = ConfigFactory.create(MobileConfig.class, System.getProperties());
    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        MutableCapabilities mutableCapabilities = new MutableCapabilities();

        mutableCapabilities.merge(capabilities);

        // Set your access credentials
        mutableCapabilities.setCapability("browserstack.user", mobile.username());
        mutableCapabilities.setCapability("browserstack.key", mobile.passwordKey());

        // Set URL of the application under test
        mutableCapabilities.setCapability("app", mobile.app());

        // Specify device and os_version for testing
        mutableCapabilities.setCapability("device", mobile.deviceName());
        mutableCapabilities.setCapability("os_version", mobile.PlatformVersion());

        // Set other BrowserStack capabilities
        mutableCapabilities.setCapability("project", "Java Rush");
        mutableCapabilities.setCapability("build", "browserstack-build-1");
        mutableCapabilities.setCapability("name", "Mobile");

        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        try {
            return new RemoteWebDriver(
                    new URL(mobile.remoteMobileUrl()), mutableCapabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
