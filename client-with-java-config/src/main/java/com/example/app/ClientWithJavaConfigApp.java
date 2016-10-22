package com.example.app;

import com.example.service.GreetingService;
import com.example.service.GreetingServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Zoltan Altfatter
 */
@SpringBootApplication
@ImportResource(value = "classpath:/META-INF/spring/module-context.xml")
public class ClientWithJavaConfigApp implements CommandLineRunner {

    @Autowired
    private GreetingServiceClient greetingServiceClient;

    public static void main(String[] args) {
        SpringApplication.run(ClientWithJavaConfigApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(greetingServiceClient.greet("Zoltan"));
    }

    @Bean
    GreetingService greetingService() {
        return new HungarianGreetingService();
    }

}
