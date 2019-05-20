package spring.vks.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Vikas Singh
 * @Date Thu 09, May 2019
 */
@Service
@Primary
/*
01. @Profile can takes an array as an arg. for different type of Profiles.
02. "default" Profile mark this bean as DEFAULT BEAN so whenever there will be no active profile
then this profile will be invoke by default.
Note: To check the active profile, look for "spring.profiles.active" property in application.properties file. Its value
should be blank to invoke the default profile bean. Otherwise the mentioned profile will be invoke.
example:
01. Invoke default profile
    spring.profiles.active=
02. Invoke other profile (invoking German profile)
    spring.profiles.active=eg
 */
@Profile({"en","default"})
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - from PrimaryGreetingService";
    }
}
