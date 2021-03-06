package configuration;

import org.aeonbits.owner.Config;

@Config.Sources({"file:\\C:\\Users\\User\\credentials.properties", "classpath:credentials.properties"})
@Config.LoadPolicy(Config.LoadType.MERGE)
public interface CredentialsConfig extends Config{

    @Key("username")
    String username();

    @Key("password")
    String password();
}
