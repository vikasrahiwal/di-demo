package spring.vks.didemo.controllers;

import spring.vks.didemo.services.GreetingService;

/**
 * @author Vikas Singh
 * @Date Wed 08, May 2019
 */
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){

        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
