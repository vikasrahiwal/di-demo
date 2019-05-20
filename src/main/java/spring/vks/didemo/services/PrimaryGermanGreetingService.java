package spring.vks.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Vikas Singh
 * @Date Fri 17, May 2019
 */
@Service
@Primary
@Profile("eg")
public class PrimaryGermanGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hallo - vom deutschen Erstgrußdienst";
    }
}
