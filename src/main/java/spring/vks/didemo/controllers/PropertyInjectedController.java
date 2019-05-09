package spring.vks.didemo.controllers;


import spring.vks.didemo.services.GreetingServiceImpl;

/**
 * @author Vikas Singh
 * @Date Wed 08, May 2019
 */
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
