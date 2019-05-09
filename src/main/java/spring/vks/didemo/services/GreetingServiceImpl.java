package spring.vks.didemo.services;

import org.springframework.stereotype.Service;

/**
 * @author Vikas Singh
 * @Date Wed 08, May 2019
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_TECH = "Hello Tech Guys!!!";

    @Override
    public String sayGreeting(){
        return HELLO_TECH;
    }
}
