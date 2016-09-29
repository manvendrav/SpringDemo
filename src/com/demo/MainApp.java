package com.demo;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Created by mave0216 on 9/23/2016.
 */
public class MainApp {

    static Logger log = Logger.getLogger(MainApp.class.getName());
    public static void main(String[] args) {
        String log4jConfPath = "D:/log4j.properties";
        PropertyConfigurator.configure(log4jConfPath);
        log.info("Inside main method");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        testDemo tsd = (testDemo) ctx.getBean("test");
        System.out.println(tsd.getMessage());
        System.out.print(tsd.toString());


    }

}
