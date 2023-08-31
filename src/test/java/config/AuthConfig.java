package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/test.properties"
})
public interface AuthConfig extends Config {

    @Key("token")
    @DefaultValue("8d645433-e236-4f9b-86eb-696f7bdeae94")
    String token();

    @Key("username")
    @DefaultValue("allure8")
    String username();

    @Key("password")
    @DefaultValue("allure8")
    String password();

    @Key("projectId")
    @DefaultValue("3488")
    String projectId();


}
