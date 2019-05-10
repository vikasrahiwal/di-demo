package spring.vks.didemo.controllers;

import org.springframework.stereotype.Controller;
import spring.vks.didemo.services.GreetingService;

/**
 * @author Vikas Singh
 * @Date Wed 08, May 2019
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String contextInit(){
        System.out.println("Context Init");
        return greetingService.sayGreeting();
    }
}
