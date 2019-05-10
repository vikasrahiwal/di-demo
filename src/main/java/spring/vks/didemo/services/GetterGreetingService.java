package spring.vks.didemo.services;

import org.springframework.stereotype.Service;

/**
 * @author Vikas Singh
 * @Date Thu 09, May 2019
 */
@Service
public class GetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting(){
        return "Hello - I was injected by the GetterGreetingService.";
    }
}
