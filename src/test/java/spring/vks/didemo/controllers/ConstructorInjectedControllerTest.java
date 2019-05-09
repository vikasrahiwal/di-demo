package spring.vks.didemo.controllers;

import org.junit.Before;
import org.junit.Test;
import spring.vks.didemo.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

/**
 * @author Vikas Singh
 * @Date Thu 09, May 2019
 *
 */
public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception{
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_TECH, constructorInjectedController.sayHello());
    }
}
