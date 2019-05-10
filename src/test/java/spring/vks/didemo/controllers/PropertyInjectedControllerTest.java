package spring.vks.didemo.controllers;
import org.junit.Test;
import spring.vks.didemo.services.GreetingServiceImpl;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
/**
 * @author Vikas Singh
 * @Date Wed 08, May 2019
 */
public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception{
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_TECH, propertyInjectedController.sayHello());
    }
}
