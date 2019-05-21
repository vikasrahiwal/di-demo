package spring.vks.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Vikas Singh
 * @Date Mon 20, May 2019
 */
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("#1# I am in the LifeCycleBean Constructor");//1
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("#2# My Bean Name is: "+name);//2
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("#3# Bean Factory has been set."); //3
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("#4# Application context has been set"); //4
    }

    public void beforeInit(){
        System.out.println("#5# Before Init: called by bean Post Processor");//5
    }

    @PostConstruct
    public void postConstruct()throws BeansException{
        System.out.println("#6# The POST CONSTRUCT annotated method has been called. ");//6
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("#7# The LifeCycleBean has its properties set.");//7
    }

    public void afterInit(){
        System.out.println("#8# After Init: called by bean Post Processor ");//8
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("#9# The PRE DESTROY annotated method has been called. ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("#10# The LifeCycleBean has been terminated");
    }

}
