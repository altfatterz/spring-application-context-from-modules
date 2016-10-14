package com.example.app1;

import com.example.service.ClientGreetingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Zoltan Altfatter
 */
public class Client2App {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath*:/META-INF/spring/module-context.xml",
                "classpath:/client-context.xml");

        ClientGreetingService clientGreetingService = applicationContext.getBean("clientGreetingService",
                ClientGreetingService.class);

        System.out.println(clientGreetingService.greet("Zoltan"));
    }
}
