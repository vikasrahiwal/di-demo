package spring.vks.didemo.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.vks.didemo.services.GreetingService;

/**
 * @author Vikas Singh
 * @Date Wed 08, May 2019
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    /* 01. Do not need to used @Autowired here
     * because around Spring 4.2, they enable automatic
     * wiring of constructor based DI. But it will not throw any error
     * if we use @Autowired over here.
     *
     * 02. If we have multiple bean in ApplicationContext then
     * we used @Qualifier(BeanName) annotation to define which Bean will be going to use.
     * We can use @Qualifier annotation with method argument ( see below method signature)
     * or we can use it above the method signature.
     *
     * Example:
     * (A)
     * @Qualifier(BeanName)
     * public String foo(){}
     *
     * (B)
     * public String foo(@Qualifier(BeanName) args){}
     */

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {

        this.greetingService = greetingService;
    }

    public String sayHello(){

        return  greetingService.sayGreeting();
    }
}
