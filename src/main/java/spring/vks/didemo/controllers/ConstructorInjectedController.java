package spring.vks.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import spring.vks.didemo.services.GreetingService;

/**
 * @author Vikas Singh
 * @Date Wed 08, May 2019
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    /* Do not need to used @Autowired here
     * because around Spring 4.2, they enable automatic
     * wiring of constructor based DI. But it will not generate any error
     * if we use @Autowired over here
     */
    @Autowired
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return  greetingService.sayGreeting();
    }
}
