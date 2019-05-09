package spring.vks.didemo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import spring.vks.didemo.services.GreetingServiceImpl;

/**
 * @author Vikas Singh
 * @Date Wed 08, May 2019
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
