package spring.vks.didemo.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author Vikas Singh
 * @Date Wed 08, May 2019
 */
@Controller
public class MyController {

    public String contextInit(){
        System.out.println("Context Init");
        return "foo";
    }
}
