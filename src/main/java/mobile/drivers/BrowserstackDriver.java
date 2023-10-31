package mobile.drivers;

import com.codeborne.selenide.WebDriverProvider;
import mobile.config.BrowserstackConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackDriver implements WebDriverProvider {

    static BrowserstackConfig config = ConfigFactory.create(BrowserstackConfig.class, System.getProperties());

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        MutableCapabilities mutableCapabilities = new MutableCapabilities();

        mutableCapabilities.merge(capabilities);

        mutableCapabilities.setCapability("browserstack.user", config.username());
        mutableCapabilities.setCapability("browserstack.key", config.passwordKey());

        mutableCapabilities.setCapability("app", config.app());

        mutableCapabilities.setCapability("device", config.deviceName());
        mutableCapabilities.setCapability("os_version", config.osVersion());

        mutableCapabilities.setCapability("project", "Java Rush");
        mutableCapabilities.setCapability("build", "browserstack-Java Rush-1");
        mutableCapabilities.setCapability("name", "Mobile");

        try {
            return new RemoteWebDriver(
                    new URL(config.remoteMobileUrl()), mutableCapabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
