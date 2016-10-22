package com.example.app;

import com.example.service.GreetingServiceClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Zoltan Altfatter
 */
public class ClientWithXMLConfigApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath:/META-INF/spring/module-context.xml",
                "classpath:/client-context.xml"
        );

        GreetingServiceClient clientGreetingService = applicationContext.getBean("greetingServiceClient",
                GreetingServiceClient.class);

        System.out.println(clientGreetingService.greet("Zoltan"));
    }
}

