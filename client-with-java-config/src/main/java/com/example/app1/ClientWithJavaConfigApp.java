package com.example.app1;

import com.example.service.ClientGreetingService;
import com.example.service.GreetingService;
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
@ImportResource(value = "classpath*:/META-INF/spring/module-context.xml")
public class ClientWithJavaConfigApp implements CommandLineRunner {

    @Autowired
    private ClientGreetingService clientGreetingService;

    public static void main(String[] args) {
        SpringApplication.run(ClientWithJavaConfigApp.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println(clientGreetingService.greet("Zoltan"));
    }

    @Bean
    GreetingService greetingService() {
        return new HungarianGreetingService();
    }

}
