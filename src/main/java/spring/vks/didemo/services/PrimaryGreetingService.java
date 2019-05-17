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
@Profile("en")
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - from PrimaryGreetingService";
    }
}
