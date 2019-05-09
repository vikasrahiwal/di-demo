package spring.vks.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spring.vks.didemo.controllers.ConstructorInjectedController;
import spring.vks.didemo.controllers.MyController;
import spring.vks.didemo.controllers.PropertyInjectedController;
import spring.vks.didemo.controllers.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext actx = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController) actx.getBean("myController");
        myController.contextInit();

        System.out.println(actx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(actx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(actx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
