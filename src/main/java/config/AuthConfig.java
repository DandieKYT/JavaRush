package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:test.properties"
})
public interface AuthConfig extends Config {

    @Key("token")
    String token();
}
