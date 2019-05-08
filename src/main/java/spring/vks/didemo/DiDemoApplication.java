package spring.vks.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spring.vks.didemo.controllers.MyController;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext actx = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController) actx.getBean("myController");
        myController.contextInit();
    }

}
