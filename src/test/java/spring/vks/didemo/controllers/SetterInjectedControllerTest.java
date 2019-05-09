package spring.vks.didemo.controllers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import spring.vks.didemo.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;
/**
 * @author Vikas Singh
 * @Date Thu 09, May 2019
 */
public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception{
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_TECH, setterInjectedController.sayHello());
    }
}
