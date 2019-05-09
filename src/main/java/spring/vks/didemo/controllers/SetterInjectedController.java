package spring.vks.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import spring.vks.didemo.services.GreetingService;

/**
 * @author Vikas Singh
 * @Date Wed 08, May 2019
 */
@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){

        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
